/*
 * Tree Grammar specification file for PHP 5.3
 * 
 * Copyright (C) 2008 Sidharth Kuruvila
 * Copyright (C) 2010 Ibéria Medeiros
 *
 */

/*
 * This tree grammar was builded, in October of 2008, by Sidharth Kuruvila for PHP 4.3 
 * Ibéria Medeiros corrected and completed this tree grammar for PHP 5.3 or higther
 * 
 * The java code included is the entire authory of Ibéria Medeiros
 */

/* Scanner to XSS */


tree grammar XSS; 
options { 
	tokenVocab=Php;
	backtrack=true;
	memoize = true;
	k=2;
	output=AST;
	ASTLabelType=CommonTree;    
}

@header{
    package org.homeunix.wap.php.parser;
    import org.homeunix.wap.table.symbol.*;
    import org.homeunix.wap.table.tainted.*;
    import org.homeunix.wap.XSS.*;
    import org.homeunix.wap.utils.*;
    import org.antlr.runtime.*;
    import java.util.Iterator;
    import java.util.Arrays;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import java.util.Set;    
    import java.io.*;
}

@members {
	/** Override this method to change where error messages go */
	@Override
	public void emitErrorMessage(String msg) {
	}
	
	@Override
	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		RecognitionException e = null;
		try{
		// if next token is what we are looking for then "delete" this token
		if ( mismatchIsUnwantedToken(input, ttype) ) {
			e = new UnwantedTokenException(ttype, input);
			beginResync();
			input.consume(); // simply delete extra token
			endResync();
			reportError(e); // report after consuming so AW sees the token in the exception
			// we want to return the token we're actually matching
			Object matchedSymbol = getCurrentInputSymbol(input);
			input.consume(); // move past ttype token as if all were ok
			return matchedSymbol;
		}
		// can't recover with single token deletion, try insertion
		if ( mismatchIsMissingToken(input, follow) ) {
			Object inserted = getMissingSymbol(input, e, ttype, follow);
			e = new MissingTokenException(ttype, input, inserted);
			reportError(e); // report after inserting so AW sees the token in the exception
			return inserted;
		}
		} catch (Exception ee){}
			// even that didn't work; must throw the exception
			e = new MismatchedTokenException(ttype, input);
			throw e;
	}
	
	@Override
	public void reportError(RecognitionException e) {
		try{
		// if we've already reported an error and have not matched a token
		// yet successfully, don't report any errors.
		if ( state.errorRecovery ) {
			return;
		}
		state.syntaxErrors++; // don't count spurious
		state.errorRecovery = true;

		//displayRecognitionError(this.getTokenNames(), e);
		} catch (Exception ee){}
	}	
	
	
    SymbolTable symtab, currentSymbolTable, st_BeforeDefFunction;
    MethodTable methtab_functions;
    ClassTable class_table;
    ClassSymbol currentClass;
    InstanceTable instances_table;
    Instance currentInstance;    
    MethodSymbol currentMethod, progenitorMethod, mss_final;
    Scope currentScope, scp_BeforeDefFunction, scp_array_left;
    String currentFile, mss_final_file = "";
    Boolean xssfunc;
    TaintedTable mts;
    UntaintedTable mus;
    List list_files;
    Map mst, mift, mft, mftt, mtt, mlct, mct, mobjt;
    
    String type_increq;							// identifica se foi static ou uma variavel o file a incluir
    int linha;								// numero da linha em analise
    String texto;								// texto (token) em analise
    String instanceName = "";					// objecto que esta a ser acedido ou criado
    int posParmDefFunc;							// posicao do parametro na definicao de funcoes pelo utilizador (primeiro, segundo, ...)
    List<Integer> indexArrayAccess = new ArrayList<Integer>();		// posicao no scope do inicio do acesso a um elemento de array
    int nVul;									// numero de vulnerabilidades encontradas na analise
    List<Integer> numElemIfBegin = new ArrayList<Integer>();		// Numero de elementos do scope antes da expressao do if,
    										// para depois eliminar os elementos do scope da experessao
    int indexIf = 0, ind_scope = -1;
    int isLeftMemberArray = 0;    
    int isAloneMemberArray = 0;
    //int echo_print;
    int ind_keyValuePair = 0;
    int accessInstance = 0;
    String attribName;    
    
	/*
	** Flags to scan what is need 
	** index 0: assign_flag			// flag de atribuicao
	** index 1: callFunction_flag		// flag de chamada de funcao
	** index 2: call_xssinj_flag		// flag de chamada da funcao XSS Injection functions (echo, print, printf, file_put_contents, file_get_contents, ...)
	** index 3: call_xsssec_flag		// flag de chamada da funcao XSSSecFunctions (htmlentities, htmlspecialchars ou ...)
	** index 4: increq_flag			// flag de include, includeonce, require, requireonce
	** index 5: return_flag	 		// flag da presenca da instrucao de return em include ou function
	** index 6: defFunction_flag		// flag de definicao de funcao pelo programador
	** index 7: defArgFunction_flag		// flag de dedinição de um argumento de uma funcao definida pelo programador
	** index 8: concatenation_flag		// flag de operador de concatenacao
	** index 9: globalVarFunction_flag		// flag de presenca de var globais em funcoes definidas pelo programador
	** index 10: call_UserFunction_flag	// flag de chamada de funcao previamente definida pelo programador
	** index 11: N/A
	** index 12: arrayAccess_flag		// flag de acesso a um array
	** index 13: N/A
	** index 14: if_presence_flag		// flag que indica quye estamos num if ou elseif
	** index 16: list_flag			// flag de definicao de list
	** index 17: case_flag			// flag de definicao de um case de um switch	
	** index 18: defFunction_class	// flag de definicao de uma classe
	** index 19: defAttribute_class	// flag de definicao de um atributo da classe
	** index 20: createObject_class	// flag de criacao de um obj da classe
	** index 21: call_MethodClass_flag	// flag de chamada de metodo da class para o objecto
	** index 22: createClone_flag		// flag de criacao de um clone de um objecto
	** index 23: workOnInstance_flag	// flag de trabalho sobre uma instancia (alterar attributos, chamar metodo)
	** index 24: attribOnInstance_flag	// flag de atribuicao de um valor a um atributo de uma instancia
	** index 25: instanceMember_flag	// flag de instance member operator
	** index 26: noClass_instMember_flag	// flag de instance member operator, mas que nao e' de classe
	** index 27: obj_func_return_flag	// flag de presenca de obj de retorno de um metodo	
	** index 28: obj_array_param_flag	// flag de passagem de array em param de func em obj	
	** index 29: defArrayEntry_flag		// flag de definicao de emenentos num array
	**
	** Flag to scan what isn't needs
	** index 15: garbage_flag		// flag de presenca de instrucao que nao interessa analisar
	*/
    int Flags[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public XSS(TreeNodeStream input, Map mst, Map mift, Map mft, Map mftt, Map mtt, UntaintedTable mus, Map mlct, Map mct, Map mobjt, String file, List files){
	this(input);
	SymbolTable st = new SymbolTable(file);
     mst.put(file, st);		
	this.currentSymbolTable = st;
	this.currentScope = st;
		
	TaintedTable mts_aux = new TaintedTable(file);
    mtt.put(file, mts_aux);
	this.mts = mts_aux;
		
	mus.getUntaintedMembers().clear();
	this.mus = mus;
	this.currentFile = file;
	this.list_files = files;
	this.mst = mst;
	this.mift = mift;
	this.mft = mft;
	this.mftt = mftt;	
	this.mtt = mtt;
	this.mlct = mlct;
	this.mct = mct;
	this.mobjt = mobjt;
    }
    
	private void initInstanceOperations(){
		try{
		if (Flags[18] == 0 && Flags[6] == 0 && Flags[27] == 0){
			if (instanceName.equals(currentScope.getScopeName()) == true){
				// ver se a instancia e' um clone
				if (currentSymbolTable.getAliases().containsKey(instanceName) == true){
					String instanceNameClone = instanceName;
					instanceName = currentSymbolTable.getInstanceNameFromAliases(instanceName, instances_table);
				}
			}		
		
			if (instances_table != null && instances_table.containsInstance(instanceName) == true){			
				Flags[26] = 0;
				// obter instancia
				if (instanceName.equals("this") == false && currentScope.getScopeSymbol().getIsClassMethod() == false){	
					// obter instancia
					currentInstance = (Instance) instances_table.getInstanceOfListInstances(instanceName);

					// obter classe
					String s = currentInstance.getFileOfClass();
					class_table = (ClassTable) mct.get(s);
					s = currentInstance.getInstanceClass();
					currentClass = (ClassSymbol) class_table.getClassOfListClasses(s);
				}
			}
			else{
				Flags[26] = 1; //noClass_instMember_flag
				currentScope.getScopeSymbol().setIsClassInstruction(false);					
			}	
		}
	 	
	 	if (Flags[6] == 1 || Flags[18] == 1){
			Flags[26] = 1;
		}
		} catch (Exception e){}
    }    
}


prog
    : statement*;

statement
@init{Flags[14] = 0;}
    : ignoreStatement
    | BodyString  
    | ^(Block statement*)
    | classDefinition
    | complexStatement
    | simpleStatement
    ;

classDefinition
	@init{
	  try{
	     Flags[18] = 1;
		currentClass = new ClassSymbol("class", currentFile, null);
		st_BeforeDefFunction = currentSymbolTable;
		scp_BeforeDefFunction = currentScope;
		
		if (currentSymbolTable.getHaveClasses() == false){
			currentSymbolTable.setHaveClasses();
			class_table = new ClassTable(currentFile);
			mct.put(currentFile, class_table);
		}
		else {
			class_table = (ClassTable)mct.get(currentFile);
		}
		} catch (Exception e){
			
		}
	}
	
	@after{
	  try{
		class_table.define(currentClass);
		currentSymbolTable = st_BeforeDefFunction;
		currentScope = scp_BeforeDefFunction;
		Flags[18] = 0;
				
		} catch (Exception e){
			
		}		
	}
    : ^(CLASS ^(Modifiers classModifier?) className extendsclass? classImplements? classMember*)
    ;

className
    : UnquotedString
      {
		try{
      	currentClass.setClassName($UnquotedString.text);
		} catch (Exception e){}
      }
    ; 

extendsclass
    : ^(Extends UnquotedString)
      {
		try{
      	currentClass.setExtendedNameClass($UnquotedString.text, currentFile, mct);
		} catch (Exception e){}
      }
    ; 
    
classImplements
    : ignoreStatement
    ;

classMember
	: {
		try{
		Flags[6] = 1; /*defFunction_flag = 1;*/
		methtab_functions = currentClass.getMembersMethods();

		// o nome da funcao e o id da linha somente sao inseridos no fim da def da funcao
		currentMethod = new MethodSymbol("MethodClass", -1, 0, null, currentFile);
		currentScope = (Scope)currentMethod;
		posParmDefFunc = 1;
	  	} catch (Exception e){
			
		}
	}  
     ^(Method ^(Modifiers fieldModifier*) UnquotedString ^(Params paramDef*) (^(Block statement*))?)
	{
	  try{	
		currentMethod.setFunctionName($UnquotedString.text);
		currentMethod.setCodeLine($UnquotedString.line);
		methtab_functions.define(currentMethod, currentMethod, false);

		Flags[6] = 0; /*defFunction_flag = 0;*/	
		} catch (Exception e){
			
		}
	}
    | definitionAttribute
    ;
    
definitionAttribute
	@init{
	  try{
		Flags[19] = 1; //defAttribute_class
		currentScope = currentClass.getAttributes();
     	CallSymbol ms = new CallSymbol("attrib", -1, currentScope, 0, currentFile);
     	currentScope.define(ms, ms, false);
     	currentScope = ms;
     	attribName = null;
		} catch (Exception e){
			
		}
	}
	
	@after{
	  try{
		Flags[19] = 0;
		currentScope.getScopeSymbol().setCodeLine(linha);
		currentScope.getScopeSymbol().setName(attribName);
		currentScope = currentScope.getEnclosingScope();	
		} catch (Exception e){
			
		}	
	}
    : ^(VAR ^(DOLLAR UnquotedString) value?)
    		{ try{ attribName =  $UnquotedString.text; linha = $UnquotedString.line; } catch (Exception e){}}
    | ^(CONST UnquotedString value?)
    		{ try{ attribName =  $UnquotedString.text; linha = $UnquotedString.line; } catch (Exception e){}}
    | ^(Field ^(Modifiers fieldModifier*) ^(DOLLAR UnquotedString) value?)
    		{ try{ attribName =  $UnquotedString.text; linha = $UnquotedString.line; } catch (Exception e){}}
    ;

classModifier
    : 'abstract';
    
fieldModifier
    : AccessModifier | 'abstract' | 'static' | 'final'
    ;

value
    : 'null'
      {
		try{
		VariableSymbol vs = new VariableSymbol("null", 0, linha, true, currentFile);
   		currentScope.define(vs, null, true);      
		} catch (Exception e){}
      }
	| UnquotedString
	 {
	   try{
	    if (Flags[15] == 0 && Flags[17] == 0){
		texto = $UnquotedString.text;
		linha = $UnquotedString.line;
		if (Flags[7] == 0 ){
			VariableSymbol vs = new VariableSymbol(texto, 0, linha, true, currentFile);
	   		currentScope.define(vs, null, true);
		}
	    }
	    else
	    	Flags[17] = 0;
		} catch (Exception e){
			
		}
	 }
    | atom
    ;

complexStatement
    : ifStatement     
    | ^(FOR forHeader statement)
    | ^(FOR_EACH forHeader statement)
    | ^(WHILE whileCondition statement)
    | ^(DO statement whileCondition)
    | ^(SWITCH expression cases)
    |	{
	  try{
	   if (Flags[15] == 0){
		int subfunc = 0;
		String s = "";
		// Se for verdadeiro estamos na presenca de uma definicao de uma UserSubFunction
		if (Flags[6] == 1){ /*defFunction_flag = 1;*/
			currentMethod.setHaveSubFunctions();
			subfunc = 1;
			s = currentMethod.getFunctionName();
			progenitorMethod = currentMethod;
		}
		else{
			Flags[6] = 1; /*defFunction_flag = 1;*/
			st_BeforeDefFunction = currentSymbolTable;
			scp_BeforeDefFunction = currentScope;
		}

		if (currentSymbolTable.getHaveFunctions() == false){
			currentSymbolTable.setHaveFunctions();
			methtab_functions = new MethodTable(currentFile);
			mft.put(currentFile, methtab_functions);
		}
		else {
			methtab_functions = (MethodTable)mft.get(currentFile);
		}
		// o nome da funcao e o id da linha somente sao inseridos no fim da def da funcao
		currentMethod = new MethodSymbol("UserFunction", -1, 0, null, currentFile);
		if (subfunc == 1)
			currentMethod.setProgenitorFunction(s);
		currentScope = (Scope)currentMethod;
		posParmDefFunc = 1;
	   }
	  	} catch (Exception e){
			
		}
	}
	functionDefinition // Definicao de uma funcao -------------------------------------
	| ^(TRY statement catchStatement)
    ;

catchStatement
	: ^(CATCH whileCondition statement)
	;

simpleStatement
    :{
		Flags[9] = 1; /*globalVarFunction_flag = 1;*/
	}
      ^(GLOBAL name+)	//function definition -----------------
	{
	   try{
		Flags[9] = 0; /*globalVarFunction_flag = 0;*/
				Iterator <Symbol> it;
				if (Flags[6] == 1)
					it = currentMethod.getGlobalVarsOfFunction().values().iterator();
				else
					it = currentSymbolTable.getGlobalVarsOfSymbolTable().values().iterator();
				Symbol sym1;
				for(; it.hasNext();){
		   			sym1 = it.next();	
				}
	  	} catch (Exception e){
			
		}
	 	
	}
    | 	{
	  try{
	   if (Flags[15] == 0){
		// o id da linha somente e' inserido no fim do return
		CallSymbol ms = new CallSymbol("return", -1, currentScope, 0, currentFile);
		currentScope.define(ms, ms, false);
		currentScope = ms;
		
		// se o return somente retorna avaliacao de condicoes estamos perante a avaliacao de condicoes do if 
		Flags[14] = 1; /*if_presence_flag=1 */
		indexIf++;
		numElemIfBegin.add(currentScope.getMembers().size());
	   }
		} catch (Exception e){
			
		}
	}
	 ^(RETURN expression?) // para funcao e include ou require
	 {
	  try{
	   if (Flags[15] == 0){
		currentScope.getScopeSymbol().setCodeLine(linha); // atribuicao da linha ao symbol do return
	
		// Ver se o return e' uma instrucao de classe
		// Primeiro ve se e' um acesso, senao ve se e' um resultado de uma operacao de classe
		if (Flags[25] == 1){ // instanceMember_flag = 1
			Flags[25] = 0;
			currentScope.getScopeSymbol().setIsClassInstruction(true);
		}
		else{
			if (Flags[18] == 1){ // defFunction_class = 1
				Scope sc = currentScope.getEnclosingScope();			
				Symbol sy = (Symbol) currentScope.getMembers().get(0);
				
				Iterator <Symbol> it = sc.getMembers().iterator();
		   		Symbol sym1;
		   		Boolean is = false;
		  		for(; it.hasNext();){
					sym1 = it.next();
					if (sym1.getName().equals(sy.getName()) == true){
						if (sym1.getIsClassInstruction() == true)
							is = true;
						else
							is = false;
					}
		   		}
				currentScope.getScopeSymbol().setIsClassInstruction(is);				
			}
		}
		// Fim
		
		currentScope = currentScope.getEnclosingScope();	
		
		// se o return somente retorna avaliacao de condicoes estamos perante a avaliacao de condicoes do if 
		Flags[14] = 0;
		numElemIfBegin.remove(indexIf-1);
		indexIf--; 
	   }
	  	} catch (Exception e){
			
		}
	 }
    | simpleRequire
    | outputFunctions    
    | expression //AQUI--Uma expressao qualquer-------------------------------------------------
    | ignoreOthers
    ;

simpleRequire
    : {
	   try{
	    if (Flags[15] == 0){
		// o id da linha somente e' inserido no fim do include, require
		Flags[4] = 1; /*increq_flag = 1;*/
		CallSymbol ms = new CallSymbol("include", -1, currentScope, 0, currentFile);
		currentScope.define(ms, ms, false);
		currentScope = ms;
	    }
		} catch (Exception e){
			
		}
	 }
      ^(RequireOperator expression) // --include e require para instrucao simples sem atribuicao
	 {
	   try{
	    if (Flags[15] == 0){
	   	currentScope.getScopeSymbol().setCodeLine(linha); // atribuicao da linha ao symbol do include
	   	Scope scp_aux, scp_aux1;
	   	SymbolTable st_aux, st_aux1;
	   	String ss, f;

 	   	// ver se "var texto" existe no currentScope, para resolver o conteudo da "var texto"
	   	// se assim acontecer "var texto" passa a ser igual ao conteudo da var encontrada e type_increq passa a static
	   	scp_aux = currentScope;
		f = scp_aux.resolveVarInclude(scp_aux, currentSymbolTable);
	   	type_increq = "static";
	   	texto = "\"" +f+ "\"";

	   	//Verificar se f tem _GET. Se sim entao não pode analisar fich
		int t = 0;
		for (String aux : GlobalDataXSS.UserInput){
			if (f.contains(aux) == true){
				t = 1;
				break;
			}
		}
		
		if(t == 0){
			st_aux = currentSymbolTable; // para precaver que apos analise do file include volta ao mesmo symbolTable
			scp_aux = scp_aux.getEnclosingScope(); // para precaver que apos analise do file include volta ao scope antes do scope include
			f = currentFile; // para precaver que apos analise do file include volta ao mesmo file
			if (type_increq.equals("static")){
				String x = "";
				if (texto.startsWith("\"") || texto.startsWith("\'"))
					x = texto.substring(1,texto.length()-1);
				else
					x = texto;
				ManageFiles ff = new ManageFiles(x);
				ManageFiles fff = new ManageFiles(f);
				String xx = "";
				try{
					xx = ff.composePathFile(x, fff.getBaseDir());				
				} catch (Exception e){}
				
				if (xx.equals("") == false){
					 if (xx.contains(".") == true){
						if (ff.validExtension(xx, 0) == true){
							Symbol sym = (Symbol) currentScope.getMembers().get(0);
							sym.setName(xx);
												   
							if (st_aux.getIncludeFiles().contains(xx) == false)
								st_aux.getIncludeFiles().add(xx);
							try{
								st_aux.mvIncludeFiles(list_files, xx);
							} catch (Exception e) {}
						}
					 }			
				}
			}
			currentSymbolTable = st_aux;
			currentScope = scp_aux;			
			currentFile = f;
		}
		else{
			int k = currentSymbolTable.getMembers().size();
			currentScope = currentScope.getEnclosingScope();
		   	currentScope.getMembers().remove(k-1);
		}
		Flags[4] = 0;
	    }
	  	} catch (Exception e){
			
		}
	}
    ;


ifStatement
options { backtrack = true; }
    : {
		try{
    	  Flags[14] = 1; /*if_presence_flag=1 */
    	  indexIf++;
    	  numElemIfBegin.add(currentScope.getMembers().size());  
		} catch (Exception e){
			
		}  	  
      }
     ^(IF expression statement conditional?)
      {
		try{
         Flags[14] = 0;
         numElemIfBegin.remove(indexIf-1);
         indexIf--;  
		} catch (Exception e){
			
		}       
      }   
  ;

conditional
    : ^(ELSE statement)
    | {
		try{
    	  Flags[14] = 1;
    	  indexIf++;
    	  numElemIfBegin.add(currentScope.getMembers().size());
		} catch (Exception e){
			
		}   	  
      }
       ^(IF expression statement conditional?)
      {
		try{
         Flags[14] = 0;
         numElemIfBegin.remove(indexIf-1);
         indexIf--;
		} catch (Exception e){
			
		}         
      }
    ;

forHeader
    : ignoreStatement
    ;

whileCondition
    : ignoreStatement
    ;

ignoreOthers
    : ignoreStatement
    ;

cases 
    : casestatement* defaultcase?
    ;

casestatement
    : {
	  Flags[17] = 1; /*case_flag = 1;*/
      }
     ^(CASE expression statement*)
    ;

defaultcase 
    : ^(DEFAULT statement*)
    ;

functionDefinition 
    : ^(FUNCTION UnquotedString ^(Params paramDef*) ^(Block statement*))
	{
	  try{	
	   if (Flags[15] == 0){
		currentMethod.setFunctionName($UnquotedString.text);
		currentMethod.setCodeLine($UnquotedString.line);
		methtab_functions.define(currentMethod, currentMethod, false);

		/* Para ver se e' o final da definicao de uma subfunction, se sim entao sera falso */
		if (currentMethod.getProgenitorFunction().equals("") == true){
			Flags[6] = 0; /*defFunction_flag = 0;*/	
			currentSymbolTable = st_BeforeDefFunction;
			currentScope = scp_BeforeDefFunction;
		}
		else{ //estou em subFunction
			currentMethod = progenitorMethod;
			currentScope = (Scope)currentMethod;
		}

	   }
	  	} catch (Exception e){
			
		}
	}

    ;
     
paramDef 
    :	{
		Flags[7] = 1; /*defArgFunction_flag = 1;*/
	}
	^(EQUALS (UnquotedString | ArrayWord)? paramName atomOrReference)
	{
	  try{
	    if (Flags[15] == 0){
		ArgFunctionSymbol afs = (ArgFunctionSymbol)((currentMethod.getArgsFunction()).get($paramName.nomeArg));
		afs.setType("equal");
		afs.setEqual(texto);
	    }
		Flags[7] = 0; /*defArgFunction_flag = 0;*/
	  	} catch (Exception e){
			
		}
	} 
    | (UnquotedString | ArrayWord)? paramName
    ;

paramName returns [String nomeArg]
    : ^(DOLLAR UnquotedString)
	{
	  try{
	    if (Flags[15] == 0){
		$nomeArg = $UnquotedString.text;
		ArgFunctionSymbol afs = new ArgFunctionSymbol($UnquotedString.text, $UnquotedString.line, "var", null, posParmDefFunc);
		currentMethod.setArgFunction($UnquotedString.text, afs);
		posParmDefFunc++;
	    }
		} catch (Exception e){
			
		}
	}
    | ^(AMPERSAND ^(DOLLAR UnquotedString))
	{
	  try{
	    if (Flags[15] == 0){
		$nomeArg = $UnquotedString.text;
		ArgFunctionSymbol afs = new ArgFunctionSymbol($UnquotedString.text, $UnquotedString.line, "pointer", null, posParmDefFunc);
		currentMethod.setArgFunction($UnquotedString.text, afs);
		posParmDefFunc++;
	    }
		} catch (Exception e){
			
		}
	}
    ;

outputFunctions
	@after{
		try{
	    if (Flags[15] == 0){
	    	currentScope.getScopeSymbol().setCodeLine(linha); // atribuicao da linha ao symbol do echo, print...
		//call_xssInj_flag = 1; call_xsssec_flag = 0; defFunction_flag = 0 para somente na definicao da funcao e nao na sua chamada
		if (Flags[2] == 1 && Flags[6] == 0 && Flags[3] == 0){
	   	}
	   	if (GlobalDataXSS.XSSFunctions.contains(currentScope.getScopeName()) == true){
			currentScope.getScopeSymbol().setIsTaintedFunction(true);
			Flags[2] = 0; //call_xssInj_flag = 0;
		}
			
	   	if (GlobalDataXSS.XSSSecFunctions.contains(currentScope.getScopeName()) == true)
			Flags[3] = 0; //call_xsssec_flag = 0;

	   	currentScope = currentScope.getEnclosingScope();
	    } 
	    } catch (Exception e){
			
		}
	}
    : 
	 {
	   try{
		CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
		currentScope.define(ms, ms, false);	
		currentScope = ms;
		} catch (Exception e){
			
		}
	 }      
     ^(ECHO expression+)
      { try{ currentScope.getScopeSymbol().setName("echo"); } catch (Exception e){}}
      
    |
	 {
	   try{
		CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
		currentScope.define(ms, ms, false);	
		currentScope = ms;
		} catch (Exception e){
			
		}
	 }    
     ^(PRINT expression+)
      { try{ currentScope.getScopeSymbol().setName("print"); } catch (Exception e){}}

    |
	 {
	   try{
		CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
		currentScope.define(ms, ms, false);
		currentScope = ms;
		} catch (Exception e){
			
		}
	 }    
      ^(PRINTF expression+)
       { try{ currentScope.getScopeSymbol().setName("printf"); } catch (Exception e){}}

    |
	 {
	   try{
		CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
		currentScope.define(ms, ms, false);
		currentScope = ms;
		} catch (Exception e){
			
		}
	}    
     ^(DIE expression+)
      { try{ currentScope.getScopeSymbol().setName("die"); } catch (Exception e){}}

    |
	{
	   try{
		CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
		currentScope.define(ms, ms, false);	
		currentScope = ms;
		} catch (Exception e){
			
		}
	}    
     ^(ERROR expression+)
      { try{ currentScope.getScopeSymbol().setName("error"); } catch (Exception e){}} 	
    ;
 
   
expression
    : ^('or' expression expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	}
    | ^('OR' expression expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	}	
    | ^('xor' expression expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	}
    | ^('XOR' expression expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	}   
    | ^('and' expression expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	}
    | ^('AND' expression expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	} 	
    | ^(EQUALS expression simpleRequire) // --Atribuicao--------------
    	{
	  try{
	    if (Flags[15] == 0){
		if (Flags[6] == 0){ /*defFunction_flag = 0 para somente na definicao da funcao e nao na sua chamada*/
			// colocar os return tainteds como symbols do currentScope. Caso nao haja colocar symbol vazio
			Iterator <Symbol> it = currentScope.getMembers().iterator();
		   	Boolean encontrei = false;
		   	Symbol sym1;
		     for(; it.hasNext();){
				sym1 = it.next();
				if (sym1.getName().equals("return") && sym1.getTainted() == 1){
					currentScope.define(sym1, null, false);
					encontrei = true;
				}
			}
			if (encontrei == false){
				VariableSymbol vs = new VariableSymbol("", 0, -1, "");
				currentScope.define(vs, null, false);
			}	   	
		}
	   	
	    }
		} catch (Exception e){
			
		}    	
    	}
    | {Flags[0] = 1; /*assign_flag = 1;*/} ^(EQUALS expression expression)       
        {
		 try{       
	    if (Flags[15] == 0){
     	if (Flags[20] == 1){ // createInstance_flag = 1
			Flags[20] = 0;
			currentScope.getScopeSymbol().setIsInstance(true);
			currentScope.getScopeSymbol().setIsClassInstruction(true);
		}
		if (Flags[22] == 1){ // createClone_flag = 1
			Flags[22] = 0;
			currentScope.getScopeSymbol().setIsClone(true);
			currentScope.getScopeSymbol().setIsClassInstruction(true);
		}
		if (Flags[25] == 1){ // instanceMember_flag = 1
			Flags[25] = 0;
			currentScope.getScopeSymbol().setIsClassInstruction(true);
		}
		
		// instrucao attrib = var
		if (Flags[18] == 1 && Flags[6] == 1){
			SymbolTable t = currentClass.getAttributes();
			if (t.containsSymbol(currentScope.getScopeName()) == true)
				currentScope.getScopeSymbol().setIsClassInstruction(true);
		}
		
		Iterator <Symbol> it;
		Symbol sym1 = null, sym2 = null;
		Boolean isAliase = false;
		// Caso em que o lado direito da atribuicao é um obj
		if (currentScope.getMembers().size() > 0){

			sym1 = (Symbol) currentScope.getMembers().get(0);
			if (sym1.getRootScope() == null){
				it = currentSymbolTable.getMembers().iterator();
				for(; it.hasNext();){
			   		sym2 = it.next();
		 			if (sym1.getName().equals(sym2.getName()) == true && sym2.getIsClassInstruction() == true){
		 				currentScope.getScopeSymbol().setIsClassInstruction(true);
		 				currentScope.getScopeSymbol().setIsClone(true);
		 				isAliase = true;
		 				break;
		 			}
			   	}
		   	}
	   	}
	    

     		currentScope = currentScope.getEnclosingScope();     		
     	
     	if (ind_keyValuePair == 1 && currentScope.getMembers().size() > ind_scope){
     		currentScope.getMembers().remove(ind_scope);
			ind_scope = -1;
			ind_keyValuePair = 0;
     	}     	
    		
	    } 
		} catch (Exception e){
			
		}  	    	    
        }
    | {Flags[0] = 1; /*assign_flag = 1;*/} ^(ConcatAssigmentOperator expression expression) // --Atribuicao--------------
	{
	  try{
	    if (Flags[15] == 0){		
		if (Flags[6] == 0){ /*defFunction_flag = 0 para somente na chamada da funcao e nao na sua definicao*/
			Symbol sy = currentScope.getScopeSymbol();
			VariableSymbol vs = new VariableSymbol(sy.getName(), sy.getTainted(), sy.getCodeLine(), currentFile);
			currentScope.define(vs, null, true);
			
			CallSymbol ms_aux = new CallSymbol("concatenation", linha, currentScope, 0, currentFile);	
			for(int i=0; i<currentScope.getMembers().size(); i++){
				sy = (Symbol) currentScope.getMembers().get(i);		
				ms_aux.define(sy, null, true);
				currentScope.getMembers().remove(i);
				i--;
			}
			currentScope.define(ms_aux, ms_aux, false);
		}
	   	currentScope = currentScope.getEnclosingScope();	   	
	    }
		} catch (Exception e){
			
		}
	}
    | ^(AssignmentOperator expression expression) {Flags[15] = 0;}    
    | {
		try{
    	  Flags[14] = 1; /*if_presence_flag=1 */
    	  indexIf++;
    	  numElemIfBegin.add(currentScope.getMembers().size()); 
		} catch (Exception e){
			
		}   	  
      }      
     ^(IfExpression expression expression expression)
      {
		try{
         Flags[14] = 0;
         numElemIfBegin.remove(indexIf-1);
         indexIf--;
		} catch (Exception e){
			
		}         
      } 
    | ^(LOGICAL_OR expression expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	}    
    | ^(LOGICAL_AND expression expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	}    
    | {Flags[15] = 0;} ^(PIPE expression expression)
    	{
	  try{ 
  	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
	   else{
		if (Flags[1] == 0){
			Scope aux = currentScope.getEnclosingScope();
			aux.getMembers().remove(currentScope);
			currentScope = aux;	
		}
	   }

		} catch (Exception e){
			
		}
	}     
    | {Flags[15] = 1;} ^(AMPERSAND expression expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	}     
    | ^(EqualityOperator expression expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	}   
    | ^(ComparisionOperator expression expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	}    
    | {Flags[15] = 1;} ^(ShiftOperator expression expression) {Flags[15] = 0;}
    | ^(PLUS expression expression)
    | ^(MINUS expression expression)
    |	{
		 try{
	    if (Flags[15] == 0){
			Flags[8] = 1; /*concatenation_flag = 1;*/
			// o id da linha somente e' inserido no fim da concatenation
			CallSymbol ms = new CallSymbol("concatenation", -1, currentScope, 0, currentFile);
			currentScope.define(ms, ms, false);
			currentScope = ms;
	    }
		} catch (Exception e){
			
		}
	}
	 ^(DOT expression expression) // -- concatenacao
	{
	  try{
	    if (Flags[15] == 0){	    
		currentScope.getScopeSymbol().setCodeLine(linha); // atribuicao da linha ao symbol da concatenacao
		Symbol sym;
		if(Flags[4] == 1){
			Scope scp_aux = currentScope;
			String f = scp_aux.resolveVarInclude(scp_aux, currentSymbolTable);
			f = "\"" +f+ "\"";
		   	sym = scp_aux.getScopeSymbol();
		   	sym.setName(f);
			sym.setAlfanumeric(true);
		}
		currentScope = currentScope.getEnclosingScope();		
		Flags[8] = 0;
	    }
		} catch (Exception e){
			
		}
	}
    | ^(ASTERISK expression expression)
    | ^(FORWARD_SLASH expression expression)
    | ^(PERCENT expression expression)
    | ^(BANG expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	}   	    	
    | ^(INSTANCE_OF expression expression)
    | {Flags[15] = 1;} ^(TILDE expression)
    	{
		  try{   	
    	   if (indexIf != 0){
		   int i = currentScope.getMembers().size() - numElemIfBegin.get(indexIf-1);
		   for (int j=0; j<i;j++){
		   	int k = currentScope.getMembers().size();
		   	currentScope.getMembers().remove(k-1);
		   }
	   }
		} catch (Exception e){
			
		}
	}      
    | {Flags[15] = 1;} ^(MINUS expression) {Flags[15] = 0;}
    | ^(SUPPRESS_WARNINGS expression)
    | ^(Cast UnquotedString expression)    
    | {Flags[15] = 1;} ^(Prefix IncrementOperator name) {Flags[15] = 0;}
    | {Flags[15] = 1;} ^(Postfix IncrementOperator name) {Flags[15] = 0;}
    | {Flags[20] = 1; /* createObject_class = 1 */} ^(NEW nameOrFunctionCall)
      {
		try{
		
		if (Flags[21] == 2){ //call_MethodClass_flag = 2, se construtor encontrado	
			Flags[21] = 0; //call_UserFunction_flag = 0;
		}
		Flags[20] = 1;
		} catch (Exception e){}
      }
    | {Flags[22] = 1; /* createClone_flag = 1 */} ^(CLONE name)
      {
		  try{
    	  	if (Flags[18] == 0 && Flags[6] == 0){ //defMethodClass_flag = 1
    	  		Symbol sy_ali = currentScope.getScopeSymbol();
    	  		Symbol sy_obj = (Symbol) currentScope.getMembers().get(0);
    	  		currentSymbolTable.getAliases().put(sy_ali.getName(), sy_obj); 
    	  	}
		} catch (Exception e){
			
		}
    	  }
    
    | atomOrReference 
    | outputFunctions
    ;


atomOrReference 
    : atom
    | reference
    ;

arrayDeclaration
    : {
	    try{
			Flags[29] = 1;    		
			ind_keyValuePair = 0;
    		Scope aux = currentScope.getEnclosingScope();    		
    		ind_scope = aux.getMembers().size()-1;
		} catch (Exception e){
			
		}
    	}
    ^(Array arrayEntry*)
       {
		try{
       	if (currentScope.getScopeSymbol().getIsFunction() == false){      	
      		if (ind_scope > 0)
       			ind_keyValuePair = 1;
       	}
       	Flags[29] = 0;
		} catch (Exception e){
			
		}
       }
    ;

arrayEntry
    : keyValuePair
    | expression
    ;

keyValuePair
//    : ^(ARRAY_ASSIGN expression+)
    : ^(ARRAY_ASSIGN expression*)
    	 {
		  try{ 
    	 if(currentScope.getScopeSymbol().getIsFunction() == false){
		Scope aux = currentScope.getEnclosingScope();		
		Symbol sym0 = (Symbol) currentScope.getMembers().get(ind_keyValuePair);
		if(ind_keyValuePair > 0){
		Symbol sym00 = (Symbol) currentScope.getMembers().get(ind_keyValuePair-1);
}
		Symbol sym1=null;	
		if (currentScope.getMembers().size() > ind_keyValuePair){
			sym1 = (Symbol) currentScope.getMembers().get(ind_keyValuePair+1);
			ind_keyValuePair ++;
		}
		ind_keyValuePair ++;
				
		String aa = sym0.getName();
		if (aa.startsWith("\"") || aa.startsWith("\'"))
			aa = aa.substring(1,aa.length()-1);	
		
		String scpName = currentScope.getScopeName();
		String s = "$" + scpName + "[\'" + aa +"\']";

		CallSymbol ms = new CallSymbol(s, sym0.getCodeLine(), aux, 0, currentFile);
		if (sym1.getTainted() == 1)
          	ms.getScopeSymbol().setTainted(1);
          ms.define(sym1, null, true);
		aux.define(ms, ms, false);
		}
		} catch (Exception e){
			
		}
    	 }
    ;

listDefinition
	@init{
		Scope scp_main = currentScope;
		Flags[16] = 1; /*list_flag = 1;*/
	}
    : ^(List atomOrReference* (^(EQUALS listEntry))?)
     	{
		  try{    	
    	   if (Flags[15] == 0){
    		while(currentScope.getScopeName().equals("AssignList") == false)
    			currentScope = currentScope.getEnclosingScope();

    		Scope scp_list = currentScope.getEnclosingScope();    		
    		int num_varList = scp_list.getMembers().size();
		if (num_varList - 1 == currentScope.getMembers().size()){
			Boolean b = currentScope.verifyNumberVarList(num_varList);				                  
			if(b == true)
			   scp_list.populateList(scp_main, currentScope, num_varList, mts, mus, currentFile);
		}
		else{
			try{					
				Symbol sym1 = (Symbol) currentScope.getMembers().get(0);
				if(currentScope.getMembers().size() == 1 && sym1.getIsVariableSymbol() == true){
					Scope ss = null;
					for(int i = scp_main.getMembers().size(); i > 0; i--){
						ss = (Scope) scp_main.getMembers().get(i-1);
						if (ss.getScopeName().equals(sym1.getName()) == true)
							break;
					}
					if (ss != null)
						scp_list.populateList(scp_main, ss, num_varList, mts, mus, currentFile);
				}
			} catch (Exception e) {}
		}
		
		currentScope = scp_main;		
		Flags[16] = 0;
    	   }
		} catch (Exception e){
			
		}
    	}
    ;
    
listEntry
	@init{
		CallSymbol ms_aux = new CallSymbol("AssignList", linha, currentScope, 0, currentFile);
		currentScope.define(ms_aux, ms_aux, false);
		currentScope = ms_aux;
	}
    : expression
    | ^(ListAssign expression*)
    ;

atom
    : SingleQuotedString 
	{
	  try{
	    if (Flags[15] == 0 && Flags[17] == 0){
		texto = $SingleQuotedString.text;
		linha = $SingleQuotedString.line;

		if (Flags[7] == 0 ){ /*defArgFunction_flag;*/
			int t = 0;
			if (Flags[19] == 0){ /*defAttributeClass_flag;*/
			  	for (String aux : GlobalDataXSS.UserInput){
					if (texto.contains(aux) == true){
			  			t = 1;
						break;
			  		}
				}
			}
			VariableSymbol vs = new VariableSymbol(texto, t, linha, true, currentFile);
	   		currentScope.define(vs, null, true);
		}
	    }
	    else
	    	Flags[17] = 0;
		} catch (Exception e){
			
		}
	}
    | DoubleQuotedString 
	{
	  try{
	    if (Flags[15] == 0 && Flags[17] == 0){
		texto = $DoubleQuotedString.text;
		linha = $DoubleQuotedString.line;
		if (Flags[7] == 0 ){
			int t = 0;
			if (Flags[19] == 0){ /*defAttributeClass_flag;*/
			  	for (String aux : GlobalDataXSS.UserInput){
					if (texto.contains(aux) == true){
			  			t = 1;
						break;
			  		}
				}
			}
			VariableSymbol vs = new VariableSymbol(texto, t, linha, true, currentFile);
	   		currentScope.define(vs, null, true);
		}
	    }
	    else
	    	Flags[17] = 0;
		} catch (Exception e){
			
		}
	}
    | Integer
	{
	  try{
	    if (Flags[15] == 0 && Flags[17] == 0){
		texto = $Integer.text;
		linha = $Integer.line;
		if (Flags[7] == 0 ){
			VariableSymbol vs = new VariableSymbol(texto, 0, linha, true, currentFile);
	   		currentScope.define(vs, null, true);
		}
	    }
	    else
	    	Flags[17] = 0;
		} catch (Exception e){
			
		}
	}
    | Real
	{
	  try{
	    if (Flags[15] == 0 && Flags[17] == 0){
		texto = $Real.text;
		linha = $Real.line;
		if (Flags[7] == 0 ){
			VariableSymbol vs = new VariableSymbol(texto, 0, linha, true, currentFile);
	   		currentScope.define(vs, null, true);
		}
	    }
	    else
	    	Flags[17] = 0;
		} catch (Exception e){
			
		}
	}
    | Boolean 
	{
	  try{
	    if (Flags[15] == 0 && Flags[17] == 0){
		texto = $Boolean.text;
		linha = $Boolean.line;
		if (Flags[7] == 0 ){
			VariableSymbol vs = new VariableSymbol(texto, 0, linha, true, currentFile);
	   		currentScope.define(vs, null, true);
		}
	    }
	    else
	    	Flags[17] = 0;
		} catch (Exception e){
			
		}
	}
    | 'null' // this->var=null
	{
	  try{
	    if (Flags[15] == 0 && Flags[17] == 0){
		if (Flags[7] == 0 ){
			VariableSymbol vs = new VariableSymbol("null", 0, linha, true, currentFile);
	   		currentScope.define(vs, null, true);
		}
	    }
	    else
	    	Flags[17] = 0;
		} catch (Exception e){
			
		}
	}
    | HereDoc | arrayDeclaration | listDefinition
    ;

reference
    : ^(AMPERSAND nameOrFunctionCall)
    | nameOrFunctionCall
    ;

nameOrFunctionCall 
   : {Flags[1] = 1; /*callFunction_flag = 1;*/} ^(Apply name expression*)
	{
	  try{
	    if (Flags[15] == 0){
		int dirnameFunction = 0;
		//call_xssInj_flag = 1; call_xsssec_flag = 0; defFunction_flag = 0 para somente na definicao da funcao e nao na sua chamada
		// Somente executar na chamada de file_put_contents e file_put_contents

	   	if (GlobalDataXSS.XSSFunctions.contains(currentScope.getScopeName()) == true && currentScope.getScopeSymbol().getIsClassMethod() == false)
			Flags[2] = 0; //call_xssInj_flag = 0;
			
	   	if (GlobalDataXSS.XSSSecFunctions.contains(currentScope.getScopeName()) == true && currentScope.getScopeSymbol().getIsClassMethod() == false)
			Flags[3] = 0; //call_xsssec_flag = 0;

		if (Flags[10] == 1){ //call_UserFunction_flag = 1;)
			// Se a funcao chamada e' uma UserFunction... estamos em definicao de uma UserFunction
	   		if (Flags[6] == 1) //defFunction_flag = 1
				Flags[10] = 0; //call_UserFunction_flag = 0;

			Iterator <Symbol> it = currentScope.getMembers().iterator();
			for(;it.hasNext();){
				Symbol sy = it.next();
				sy.setIsParamUserFunction(true);
			}
	
			Flags[10] = 0; //call_UserFunction_flag = 0;
		}

	     if (currentScope.getScopeSymbol().getName().equals("dirname") == true){
			Scope aux = currentScope.getEnclosingScope();
			Symbol sym = (Symbol) currentScope.getMembers().get(0);		
			if (sym.getAlfanumeric() == true){
				if (sym.getName().startsWith("\"") || sym.getName().startsWith("\"")){
					String aa = sym.getName();
					String aaa = aa.substring(1,aa.length()-1);
					sym.setName(aaa);
				}
				if (sym.getName().equals("__FILE__") || sym.getName().equals("__DIR__"))
					sym.setName(sym.getFileSymbol());				           	
               	File f = new File(sym.getName());
               	String s = f.getParent();
               	sym.setName(s.toString());               	
            	}            	
			aux.define(sym, null, true);
			aux.getMembers().remove(currentScope);
			currentScope = aux;
			dirnameFunction = 1;
	     }
	     
		if (currentScope.getScopeSymbol().getName().equals("define") == true){
			Scope aux = currentScope.getEnclosingScope();
			if (currentScope.getMembers().size() < 2){
				aux.getMembers().remove(currentScope);
				currentScope = aux;
				dirnameFunction = 1;				
			}
			else{	
				Symbol sym0 = (Symbol) currentScope.getMembers().get(0);					
				Symbol sym1 = (Symbol) currentScope.getMembers().get(1);						
				aux.getMembers().remove(currentScope);

				if (sym1.getTainted() == 1)
					sym0.setTainted(1);
				if (sym0.getAlfanumeric() == true && (sym0.getName().startsWith("\"") || sym0.getName().startsWith("\'"))){
					String aa = sym0.getName();
					String aaa = aa.substring(1,aa.length()-1);
					sym0.setName(aaa);
				}

				CallSymbol ms = new CallSymbol(sym0.getName(), sym0.getCodeLine(), aux, 0, currentFile);
				aux.define(ms, ms, false);
				currentScope = ms;		
				if (sym1.getAlfanumeric() == true){
					String aa = sym1.getName();
					String aaa = aa.substring(1,aa.length()-1);
					sym1.setName(aaa);
					if (sym1.getName().equals("__FILE__"))
						sym1.setName(sym1.getFileSymbol());
				      
					if (sym1.getName().equals("__DIR__")){
						File f = new File(sym1.getFileSymbol());
				          String s = f.getParent();
				          sym1.setName(s.toString());
				     }
				}	     
				currentScope.define(sym1, null, true);
		     }
		 }

		if (dirnameFunction == 0)
		   	currentScope = currentScope.getEnclosingScope();
	    }
		} catch (Exception e){
			
		}
	}

    | name
    ;

name
    : staticMemberAccess
    | memberAccess 
    | variable
    ;
    
staticMemberAccess
    : {
		try{
		Flags[21] = 1;
     	CallSymbol ms = new CallSymbol("staticMemberAccess", -1, currentScope, 0, currentFile);
     	currentScope.define(ms, ms, false);
     	currentScope = ms;  
		} catch (Exception e){
			
		} 	
	 }    
      ^('::' UnquotedString nameOrFunctionCall)
       {
		try{
		Flags[21] = 0;
		currentScope.getScopeSymbol().setCodeLine(linha);
		currentScope.getScopeSymbol().setIsStaticMember(true);
		currentScope.getScopeSymbol().setIsClassInstruction(true);
		String cname = $UnquotedString.text;
		currentScope.getScopeSymbol().setName(cname);

		//Symbol symm = (Symbol) currentScope.getMembers().get(0);		
		
		
		currentScope = currentScope.getEnclosingScope();		
       
		} catch (Exception e){
			
		}
	}
    ;

memberAccess
    : {Flags[12] = 1;} arrayAccess (INSTANCE_MEMBER UnquotedString)?
      {
	try{	  
        if (Flags[15] == 0){
	// membro esquerdo da atribuicao e' um array
	if (isLeftMemberArray == 1){
		int i = currentScope.getMembers().size();
		Symbol sym1 = (Symbol)currentScope.getMembers().get(i-1);
		scp_array_left.getScopeSymbol().setName(sym1.getName());
		currentScope = scp_array_left;
		isLeftMemberArray = 0;
	}

	if ($UnquotedString.text != null){
		CallSymbol ms = new CallSymbol($UnquotedString.text, linha, null, 0, currentFile);
		int i = currentScope.getMembers().size();
		Symbol sym1 = (Symbol)currentScope.getMembers().get(i-1);
		ms.define(sym1, null, true);
		currentScope.getMembers().remove(i-1);
		currentScope.define(ms, ms, false);
	}
	}
		} catch (Exception e){
			
		}
      }
  
    | {
		try{
    		Flags[0] = 1; // assign_flag = 1
    		Flags[25] = 1; // instanceMember_flag = 1
    		instanceName = "";
    		accessInstance++;  
		} catch (Exception e){}
      }
      ^(INSTANCE_MEMBER variable arrayOrUnquotedStringOrFunctionCall)
       {
		try{
       	
       	accessInstance--;
		if (Flags[26] == 0)
			currentScope.getScopeSymbol().setIsClassInstruction(true);
		else
			currentScope.getScopeSymbol().setIsClassInstruction(false);
		
		if (accessInstance == 0){
			Flags[12] = 0;
		   	Flags[21] = 0;
		   	Flags[24] = 0;
		   	Flags[26] = 0;
	   	}
       	currentScope = currentScope.getEnclosingScope(); 
		} catch (Exception e){
			
		}
       } 
    ;

arrayOrUnquotedStringOrFunctionCall
	@after{
		Flags[23] = 0;
	}
    :
     {
	   try{
		Flags[23] = 1;   			
		Flags[12] = 1;
		Flags[28] = 1;
		Flags[24] = 1; /*assign_flag = 1;*/
		
		initInstanceOperations();
    		
    		if (Flags[26] == 0) /*noClass_instMember_flag e callMethodClass ou access*/
    			Flags[21] = 1;
		} catch (Exception e){
			
		}      	
     }
     ^(EQUALS arrayAccess expression)
	{
	  try{
     	currentScope = currentScope.getEnclosingScope();
		} catch (Exception e){
			
		}
	
	}	
	
    |
	{
	  try{
		Flags[23] = 1;   			
		Flags[12] = 1;
		Flags[28] = 1;
		
		initInstanceOperations();
		} catch (Exception e){
			
		}
    }
  arrayAccess
      {
	   try{
      if (Flags[26] == 0){
       	Symbol sym = null;
 		if(Flags[27] == 0){
 			sym = (Symbol) currentScope.getMembers().get(0);
 		}
 		else{
 			Iterator <Symbol> it = currentScope.getMembers().iterator();
			for(; it.hasNext();){
		   		sym = it.next();
	 			if (sym.getRootScope() != null)
	 				break;
		   	}
 		}
      
	   	String s = sym.getName(); 	
	     if (s.startsWith("$") == true){
     		sym.setName(s.substring(1));
     		s = sym.getName();
     	}    	
      }
		} catch (Exception e){
			
		}    	
      }
    |
	{
	  try{
		Flags[23] = 1;
		Flags[24] = 1; /*assign_flag = 1;*/
    
		initInstanceOperations();
    		if (Flags[26] == 0) /*noClass_instMember_flag e callMethodClass ou access*/
    			Flags[21] = 1;
		} catch (Exception e){
			
		}
    }
    
    	^(EQUALS expression expression)
      {
		try{
		if (Flags[26] == 1){
			Flags[24] = 1;	   	
		}
     	currentScope = currentScope.getEnclosingScope();
		} catch (Exception e){
			
		}     	
      }     

    | ^(AssignmentOperator expression expression)
    | 
	{
	  try{
		Flags[23] = 1;
		Flags[24] = 1; /*assign_flag = 1;*/
    
		initInstanceOperations();
		} catch (Exception e){
			
		}
    }
	^(ConcatAssigmentOperator expression expression)
	{
	  try{
		if (Flags[18] == 0 && Flags[6] == 0){ /*defFunction_flag = 0 ou defClass_flag = 0 para somente na chamada da funcao/class e nao na sua definicao*/
			Symbol sy = currentScope.getScopeSymbol();
			VariableSymbol vs = new VariableSymbol(sy.getName(), sy.getTainted(), sy.getCodeLine(), currentFile);
			currentScope.define(vs, null, true);	   	
		}

     	currentScope = currentScope.getEnclosingScope();
		} catch (Exception e){
			
		}    	
	}    
 
    | ^(INSTANCE_MEMBER objectNameOrMethod arrayOrUnquotedStringOrFunctionCall)       
      {
		try{
      	/* Chamada de metodo fora de um obj
      	 * a -> metodo -> metodo
      	 *
      	 * Chamada dentro do metodo
      	 * this -> metodo -> metodo
      	 * this -> attrib obj -> metodo
      	 */
      	
      	if (Flags[26] == 0){ 
		 	if (currentScope.getScopeSymbol().getIsClassMethod() == false)
		 		instanceName = $objectNameOrMethod.instanceName_aux;
		 	else
		 		currentInstance = $objectNameOrMethod.inst_aux;
		 		
			currentScope = currentScope.getEnclosingScope();
		}
		Flags[27] = 0;
		} catch (Exception e){
			
		}
      }
       
    | {
		try{  		
		initInstanceOperations();
		if (Flags[26] == 1) /*noClass_instMember_flag e callMethodClass ou access*/
			currentScope.getScopeSymbol().setIsClassInstruction(false);
		else{
			Flags[21] = 1;
			Flags[23] = 1;
		}
		} catch (Exception e){
			
		}
    }
    nameOrFunctionCall
      {
	   try{   
      	Flags[21] = 0;
      	if (Flags[26] == 0){
      		currentScope.getScopeSymbol().setIsClassInstruction(true);
		 	if (currentScope.getMembers().size() == 0){    	
				VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
				currentScope.define(vs, null, true);
			
				if (Flags[18] == 0 && Flags[6] == 0){
					SymbolTable t = currentInstance.getInstanceAttributes();

					if (t.containsSymbol(texto)){
						Flags[21] = 3; // acede a um attributo normal var -> att 
					}	
				}
		 	}
		 	else{ // chama metodo para o obj var -> func
		 		if (Flags[2] == 1 || Flags[3] == 1){
		 			Flags[2] = 0; // SQLI_function
		 			Flags[3] = 0; // SecSQL_function
		 		}
		 		else{
	 		
		 			Scope scp = null;			 		
			 		if(Flags[27] == 0){
			 			Iterator <Symbol> it = currentScope.getMembers().iterator();
						Symbol sym1;
						for(; it.hasNext();){
					   		sym1 = it.next();
				 			if (sym1.getRootScope() != null){
				 				scp = (Scope) sym1;
				 				break;
				 			}
					   	}

						// Marcar os simbolos parametros do metodo
			 			it = scp.getMembers().iterator();
						for(; it.hasNext();){
					   		sym1 = it.next();
					   		sym1.setIsParamUserFunction(true);
					   	}
			 		}
			  }
		  
		 	}
      }
      else{
		if (currentScope.getMembers().size() == 0){     	
			VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
			currentScope.define(vs, null, true);
		}
	}
		} catch (Exception e){
			
		}	
      }
    ;
    
    
objectNameOrMethod returns [String instanceName_aux, Instance inst_aux]
    : {
		try{
		Flags[23] = 1;
    
		initInstanceOperations();
    		if (Flags[26] == 0) /*noClass_instMember_flag e callMethodClass ou access*/
    			Flags[21] = 1; /*callMethodClass or access attribute*/
		} catch (Exception e){
			
		}
    }      
    nameOrFunctionCall
    {
	  try{
      	Flags[21] = 0;
      	if (Flags[26] == 0){
      	currentScope.getScopeSymbol().setIsClassInstruction(true);
      	if (currentScope.getMembers().size() == 0){
			CallSymbol ms = new CallSymbol(texto, linha, currentScope, 0, currentFile);
		   	currentScope.define(ms, ms, false);
		   	currentScope = ms;
		   	$instanceName_aux = instanceName;
		   	instanceName = texto;
      	}
      	else{
      	     currentScope = (Scope) currentScope.getMembers().get(0);
      	     currentScope.getScopeSymbol().setIsClassMethod(true);
			if (Flags[18] == 0 && Flags[6] == 0){
				// obter metodo
				mss_final = null;
				mss_final_file = "";
			   	String s = currentScope.getScopeSymbol().getName();
				MethodClass mc = currentClass.getMethodClass(s, "", mct);
				mss_final = mc.getMeth();
				mss_final_file = mc.getClassMeth().getFileClass();
			   			
				if (mss_final != null){
					// obter instancia do return do metodo
					Instance ci = currentInstance.getInstanceOfReturn(s, currentScope.getScopeSymbol().getCodeLine(), null, null, false);
					if (ci != null){
						$inst_aux = currentInstance;
						currentInstance = ci;
					
						// obter classe
						s = currentInstance.getFileOfClass();
						class_table = (ClassTable) mct.get(s);
						s = currentInstance.getInstanceClass();
						currentClass = (ClassSymbol) class_table.getClassOfListClasses(s);
						
						Flags[27] = 1;
					}
				}
				
				// Marcar os simbolos como parametros do metodo
	 			Iterator <Symbol> it = currentScope.getMembers().iterator();
				for(; it.hasNext();){
			   		Symbol sym1 = it.next();
			   		sym1.setIsParamUserFunction(true);
			   	}
			}
      	}
      	}
      else{
		if (currentScope.getMembers().size() == 0){      	
			VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
			currentScope.define(vs, null, true);
		}
	}	
		} catch (Exception e){
			
		}	  		
    }
    ;

arrayAccess
    : ^(OPEN_SQUARE_BRACE variable expression*)
	{
	  try{
	   if (Flags[15] == 0){   
		Symbol sym1 = null, sym2 = null;
		int indice = indexArrayAccess.get(indexArrayAccess.size()-1);
		indexArrayAccess.remove(indexArrayAccess.size()-1);

		int j = currentScope.getMembers().size() - indice - 1;

		if(j > 0){
			sym1 = (Symbol)currentScope.getMembers().get(indice);
			
			if (sym1.getName().equals("GLOBALS") && Flags[6] == 1){			
				sym2 = (Symbol)currentScope.getMembers().get(indice + 1);
				sym1.setName(sym2.getName().substring(1,sym2.getName().length()-1));
				VariableSymbol vs = new VariableSymbol(sym1.getName(), 0, -1, currentFile);
				currentMethod.setGlobalVarFunction(sym1.getName(), vs);
				currentScope.getMembers().remove(indice + 1);
			}
			else{
				String sss = "$" + sym1.getName() + "[";
				for (int i = 1; i <= j; i++){
					sym1 = (Symbol)currentScope.getMembers().get(indice + i);
					if (!sym1.getIsVariableSymbol())
						sss = sss + sym1.getName() + "]";
					else{
						if(!sym1.getName().contains("$"))
							if(!sym1.getAlfanumeric())
								sss = sss + "$" + sym1.getName() + "]";
							else
								sss = sss + sym1.getName() + "]";
						else
							sss = sss + sym1.getName() + "]";
					}
					if(j > i){
						sss = sss + "[";
					}			
				}
				sym1 = (Symbol)currentScope.getMembers().get(indice);
				sym1.setName(sss);
				for (int i = 1; i <= j; i++)
					currentScope.getMembers().remove(indice + 1);
				
				if (indice > 0 && Flags[29] == 0){
					Symbol sym11 = (Symbol)currentScope.getMembers().get(indice - 1);
				 	if (sym1.getName().contains(sym11.getName()))
						currentScope.getMembers().remove(indice - 1);
				}
			}	
		}
		
		// acesso array sem atribuicao 
		if (isAloneMemberArray == 1)
			isAloneMemberArray = 0;


		// elemento de array como variavel global na definicao de uma UserFunction ou SymbolTable
		if (Flags[9] == 1){ //globalVar_flag = 1;
			VariableSymbol vs = new VariableSymbol(sym1.getName(), 0, linha, currentFile);
			if (Flags[6] == 1)
				currentMethod.setGlobalVarFunction(sym1.getName(), vs);
			else
				currentSymbolTable.setGlobalVarSymbolTable(sym1.getName(), vs);		
			currentScope.getMembers().remove(indice);
		}
	   }
		} catch (Exception e){
			
		}	   
	}
    ;

variable 
    : ^(DOLLAR variable)
	{
	  try{
	    if (Flags[15] == 0){
		if (Flags[9] == 1 && Flags[12] == 0){ /*globalVarFunction_flag = 1 && arrayAccess_flag = 0*/
			VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
			if (Flags[6] == 1)
				currentMethod.setGlobalVarFunction(texto, vs);
			else
				currentSymbolTable.setGlobalVarSymbolTable(texto, vs);
		}
		else{
		   	if (Flags[0] == 1){ //assign_flag = 1
			   	CallSymbol ms = new CallSymbol(texto, linha, currentScope, 0, currentFile);
			   	currentScope.define(ms, ms, false); // def method in current scope
			   	currentScope = ms;       // set current scope to method scope
			   	instanceName = texto;
				Flags[0] = 0; //assign_flag = 0;

				// membro esquerdo da atribuicao e' um array				
				if (Flags[12] == 1){ //arrayAccess_flag = 1
					scp_array_left = currentScope;
					CallSymbol ms_aux = new CallSymbol(texto, linha, null, 0, currentFile);
			   		currentScope = ms_aux;
	       			VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
					currentScope.define(vs, null, true);
					indexArrayAccess.add(currentScope.getMembers().lastIndexOf(vs));
					isLeftMemberArray = 1;
					Flags[12] = 0; //arrayAccess_flag = 0
				}
			}
		   	else{
				int t = 0;
				if (GlobalDataXSS.UserInput.contains(texto) == true)
			    		t=1;

				//membro direito da atribuicao, por exemplo
				if (currentScope.getScopeName().equals(currentSymbolTable.getScopeName()) == false){				
	       			VariableSymbol vs = new VariableSymbol(texto, t, linha, currentFile);
	       							
					currentScope.define(vs, null, true);
					if (Flags[12] == 1){ //arrayAccess_flag = 1
						indexArrayAccess.add(currentScope.getMembers().lastIndexOf(vs));
						Flags[12] = 0; //arrayAccess_flag = 0
					}

				}
				else{
					// acesso array sem atribuicao
					if (Flags[12] == 1){ //arrayAccess_flag = 1
						VariableSymbol vs = new VariableSymbol(texto, t, linha, currentFile);
						currentScope.define(vs, null, true);
						//if (indexArrayAccess.size() == 0)
							indexArrayAccess.add(currentScope.getMembers().lastIndexOf(vs));
						isAloneMemberArray = 1;
						Flags[12] = 0; //arrayAccess_flag = 0
					}
					else{
						if (isAloneMemberArray == 1){
							VariableSymbol vs = new VariableSymbol(texto, t, linha, currentFile);
							currentScope.define(vs, null, true);
						}
					}
				}
				
				if (Flags[16] == 1){ //list_flag = 1
					CallSymbol ms_aux = new CallSymbol("list", linha, null, 0, currentFile);
			   		currentScope = ms_aux;
	       			VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
					currentScope.define(vs, null, true);
					Flags[16] = 0; //list_flag = 0					
				}
			}
		}
	    }
	  	} catch (Exception e){
			
		}
	}
    | UnquotedString
	{
	  try{
	    if (Flags[15] == 0){
	     if (Flags[20] == 1 || Flags[22] == 1)
	     	instanceName = texto;
	    
		texto=$UnquotedString.text;
	   	linha=$UnquotedString.line;

		// handle with constants
		if (GlobalDataXSS.UserInput.contains(texto) == false){
			String texto_aux = texto.toUpperCase();
			if (texto_aux.equals(texto) == true){
				VariableSymbol vs = new VariableSymbol(texto, 0, linha, true, currentFile);
				currentScope.define(vs, null, true);	
			}
		}
	   	
	   	if (Flags[1] == 1){ //callFunction_flag = 1

	     	CallSymbol ms = new CallSymbol(texto, linha, currentScope, 0, currentFile);
			ms.setIsFunction(true);
	     	currentScope.define(ms, ms, false); // def method in current scope
	     	currentScope = ms;       // set current scope to method scope
	     	
			if (Flags[20] == 1){ //createObjClass_flag = 1
				/* 1. criar instania da classe e inserir na tabela de objs do file em analise*/
				if (Flags[18] == 0 && Flags[6] == 0){ //defMethodClass_flag = 1
				 if (texto.equals("mysqli") == true)
				 	Flags[11] = 1;
				 else{
					// obter class
					mss_final = null;
					mss_final_file = "";
					int i;
					ClassTable class_table = null;
					for (Iterator <ClassTable> it = mct.values().iterator(); it.hasNext();){
						class_table = it.next();
						for (Iterator <ClassSymbol> it1 = class_table.getMembers().iterator(); it1.hasNext();){
						ClassSymbol csss = it1.next();
						}

						if (class_table.containsClass(texto) == true){
							currentClass = (ClassSymbol) class_table.getClassOfListClasses(texto);
							mss_final_file = class_table.getScopeName();
							break;
						}
					}
					if (currentClass != null && class_table.containsClass(texto) == true){
					// inserir instancia na tabela de objs do file em analise
					if ((GlobalDataXSS.MainInstancesTable).containsKey(currentFile) == false){
						instances_table = new InstanceTable(currentFile);
						mobjt.put(currentFile, instances_table);
					}
					else {
						instances_table = (InstanceTable) mobjt.get(currentFile);
					}

					if (currentClass.getExtendsClassName() != null && currentClass.getExtendsClassName().equals("mysqli") == true){
						Flags[11] = 1;
						currentInstance = new Instance(instanceName, linha, currentFile, texto, class_table.getScopeName(), currentClass, true);
						instances_table.define(currentInstance);
					}
					else{
					// criar instancia com copia dos atrbutos da classe
					currentInstance = new Instance(instanceName, linha, currentFile, texto, class_table.getScopeName(), currentClass, false);
					instances_table.define(currentInstance);

					/* 2. procurar metodo construtor*/
					MethodClass mc = currentClass.getMethodClass(texto, "construct", mct);
					if (mc != null){
						mss_final = mc.getMeth();
						Flags[21] = 2; //call_MethodClass_flag = 1; Se 2 entao o metodo e' construtor. Se 1 e' um metodo normal
					}
								
					}
				}
				}
				}
				Flags[20] = 0;
			}
			else{	     	
	     	
	     	
	   		if (GlobalDataXSS.XSSFunctions.contains(currentScope.getScopeName()) == true) {
				Flags[2] = 1; //call_xssInj_flag = 1;
				currentScope.getScopeSymbol().setIsTaintedFunction(true);
			}
			else{
				if (GlobalDataXSS.XSSSecFunctions.contains(texto) == true){
					Flags[3] = 1; //call_xsssec_flag = 1;
					currentScope.getScopeSymbol().setIsSecureFunction(true);
					currentScope.getScopeSymbol().setTainted(0);
				}
				else{			
				// Verifica se a funcao e' das definidas pelo programador.
				// Primeiro verifica no proprio file. Caso nao exista, ira verificar nos includes files do file em analise
				MethodTable mt;
				MethodSymbol mss = null;
				mss_final = null;
				if (currentSymbolTable.getHaveFunctions() == true){
					mt = (MethodTable) mft.get(currentFile);
		    			for(Iterator <MethodSymbol> it = mt.getMembers().iterator(); it.hasNext();){
						mss = it.next();
						if(mss.getFunctionName().equals(texto) == true){
							Flags[10] = 1; //call_UserFunction_flag = 1;
							currentScope.getScopeSymbol().setIsUserFunction(true);
							mss_final = mss;
							mss_final_file = currentFile;
							break;
						}
					}
				}
				if (mss_final == null){
					String s;
					SymbolTable st;
		    			for(Iterator <String> it = currentSymbolTable.getIncludeFiles().iterator(); it.hasNext();){
						s = it.next();
						st = (SymbolTable) mift.get(s);
						if(st.getHaveFunctions() == true){
							mt = (MethodTable) mft.get(s);
				    			for(Iterator <MethodSymbol> it1 = mt.getMembers().iterator(); it1.hasNext();){
								mss = it1.next();
								if(mss.getFunctionName().equals(texto) == true){
									Flags[10] = 1; //call_UserFunction_flag = 1;
									currentScope.getScopeSymbol().setIsUserFunction(true);
									mss_final = mss;
									mss_final_file = s;
									break;
								}
							}
						}
					}				
				}
			    }
			}
			}
		
			if (Flags[21] == 1) //call_MethodClass_flag = 1
				currentScope.getScopeSymbol().setIsClassMethod(true);		
		Flags[1] = 0; //callFunction_flag = 0;
   	}

			if (Flags[20] == 1){ //createObjClass_flag = 1
				CallSymbol ms = new CallSymbol(texto, linha, currentScope, 0, currentFile);
				ms.setIsFunction(true);
				currentScope.define(ms, ms, false); // def method in current scope
				//currentScope = ms;       // set current scope to method scope			

				/* 1. criar instania da classe e inserir na tabela de objs do file em analise*/
				if (Flags[18] == 0 && Flags[6] == 0){ //defMethodClass_flag = 1
				 if (texto.equals("mysqli") == true)
				 	Flags[11] = 1;
				 else{
					// obter class
					mss_final = null;
					mss_final_file = "";
					int i;
					ClassTable class_table = null;
					for (Iterator <ClassTable> it = mct.values().iterator(); it.hasNext();){
						class_table = it.next();
						for (Iterator <ClassSymbol> it1 = class_table.getMembers().iterator(); it1.hasNext();){
						ClassSymbol csss = it1.next();
						}
						
						
						
						if (class_table.containsClass(texto) == true){
							currentClass = (ClassSymbol) class_table.getClassOfListClasses(texto);
							mss_final_file = class_table.getScopeName();
							break;
						}
					}
					if (currentClass != null && class_table.containsClass(texto) == true){
					// inserir instancia na tabela de objs do file em analise
					if ((GlobalDataXSS.MainInstancesTable).containsKey(currentFile) == false){
						instances_table = new InstanceTable(currentFile);
						mobjt.put(currentFile, instances_table);
					}
					else {
						instances_table = (InstanceTable) mobjt.get(currentFile);
					}

					if (currentClass.getExtendsClassName() != null && currentClass.getExtendsClassName().equals("mysqli") == true){
						Flags[11] = 1;
						currentInstance = new Instance(instanceName, linha, currentFile, texto, class_table.getScopeName(), currentClass, true);
						instances_table.define(currentInstance);
					}
					else{
					// criar instancia com copia dos atributos da classe
					currentInstance = new Instance(instanceName, linha, currentFile, texto, class_table.getScopeName(), currentClass, false);
					instances_table.define(currentInstance);

					/* 2. procurar metodo construtor*/
					MethodClass mc = currentClass.getMethodClass(texto, "construct", mct);
					if (mc != null){
						mss_final = mc.getMeth();
						Flags[21] = 2; //call_MethodClass_flag = 1; Se 2 entao o metodo e' construtor. Se 1 e' um metodo normal
					}								
					}
				}
				}
				}
				Flags[20] = 0;
			}
	   		   	
	   	if (Flags[23] == 1 && ((Flags[12] == 1 && Flags[28] == 1) || Flags[24] == 1)){ //workOnInstance_flag arrayAccess_flag attributionOnInstance_flag	   	
	   	     if (Flags[26] == 0 )
		   	     currentScope.getScopeSymbol().setIsClassInstruction(true);
		   	
	   		if (Flags[12] == 1){
				//membro direito do acesso ao objecto e' um elemento de um array
	  			VariableSymbol vs = new VariableSymbol(texto, 0, linha, currentFile);
				currentScope.define(vs, null, true);
				indexArrayAccess.add(currentScope.getMembers().lastIndexOf(vs));
				Flags[12] = 0; //arrayAccess_flag = 0
				Flags[28] = 0;
			}
			
	   		if (Flags[24] == 1){

	     	CallSymbol ms = new CallSymbol(texto, linha, currentScope, 0, currentFile);
	     	currentScope.define(ms, ms, false);
	     	currentScope = ms;
			Flags[24] = 0; //attributionOnInstance_flag = 0
			}
	   	}
	   	
	    }
else Flags[1] = 0; //callFunction_flag = 0; 
	  	} catch (Exception e){
			
		}
	}
    ;

instanceMember
   : ^(INSTANCE_MEMBER arrayOrUnquotedStringOrFunctionCall)
   ;

ignoreStatement
    : PhpStatement
    ;

