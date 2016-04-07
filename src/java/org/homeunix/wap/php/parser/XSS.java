// $ANTLR 3.4 XSS.g 2015-10-03 23:49:52

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


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class XSS extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMPERSAND", "ARRAY_ASSIGN", "ASTERISK", "AccessModifier", "Apply", "Array", "ArrayWord", "AssignmentOperator", "BANG", "BREAK", "Block", "BodyString", "Boolean", "CASE", "CATCH", "CLASS", "CLASS_MEMBER", "CLONE", "CLOSE_BRACE", "CLOSE_CURLY_BRACE", "CLOSE_SQUARE_BRACE", "COLON", "COMMA", "COMMENT", "CONST", "CONTINUE", "Cast", "ComparisionOperator", "ConcatAssigmentOperator", "DEFAULT", "DIE", "DNum", "DO", "DOLLAR", "DOT", "Decimal", "Digits", "DoubleQuotedString", "ECHO", "ELSE", "ELSE_IF", "EQUALS", "EqualityOperator", "EscapeCharector", "Exponent_DNum", "Extends", "FOR", "FORWARD_SLASH", "FOR_EACH", "FUNCTION", "Field", "FirstBodyString", "ForeachVar", "GLOBAL", "HEX_DIGIT", "HereDoc", "HereDocContents", "Hexadecimal", "IF", "INSTANCE_MEMBER", "INSTANCE_OF", "IfExpression", "IgnoreConditions", "IgnoreStmContents", "IgnoreStmDeclare", "IgnoreStmImplements", "IgnoreStmInterface", "IncrementOperator", "Integer", "LOGICAL_AND", "LOGICAL_OR", "List", "ListAssign", "MINUS", "Method", "Modifiers", "NEW", "OCTAL_ESC", "OPEN_BRACE", "OPEN_CURLY_BRACE", "OPEN_SQUARE_BRACE", "Octal", "PERCENT", "PIPE", "PLUS", "PRINT", "PRINTF", "Params", "PhpStatement", "Postfix", "Prefix", "QUESTION_MARK", "RETURN", "Real", "RequireOperator", "SEMICOLON", "SUPPRESS_WARNINGS", "SWITCH", "ShiftOperator", "SingleQuotedString", "THROW", "TILDE", "TRY", "UNICODE_ESC", "USE", "UnquotedString", "VAR", "WHILE", "WhiteSpace", "'AND'", "'OR'", "'XOR'", "'and'", "'final'", "'list'", "'null'", "'or'", "'static'", "'xor'", "ERROR"
    };

    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int ABSTRACT=4;
    public static final int AMPERSAND=5;
    public static final int ARRAY_ASSIGN=6;
    public static final int ASTERISK=7;
    public static final int AccessModifier=8;
    public static final int Apply=9;
    public static final int Array=10;
    public static final int ArrayWord=11;
    public static final int AssignmentOperator=12;
    public static final int BANG=13;
    public static final int BREAK=14;
    public static final int Block=15;
    public static final int BodyString=16;
    public static final int Boolean=17;
    public static final int CASE=18;
    public static final int CATCH=19;
    public static final int CLASS=20;
    public static final int CLASS_MEMBER=21;
    public static final int CLONE=22;
    public static final int CLOSE_BRACE=23;
    public static final int CLOSE_CURLY_BRACE=24;
    public static final int CLOSE_SQUARE_BRACE=25;
    public static final int COLON=26;
    public static final int COMMA=27;
    public static final int COMMENT=28;
    public static final int CONST=29;
    public static final int CONTINUE=30;
    public static final int Cast=31;
    public static final int ComparisionOperator=32;
    public static final int ConcatAssigmentOperator=33;
    public static final int DEFAULT=34;
    public static final int DIE=35;
    public static final int DNum=36;
    public static final int DO=37;
    public static final int DOLLAR=38;
    public static final int DOT=39;
    public static final int Decimal=40;
    public static final int Digits=41;
    public static final int DoubleQuotedString=42;
    public static final int ECHO=43;
    public static final int ELSE=44;
    public static final int ELSE_IF=45;
    public static final int EQUALS=46;
    public static final int EqualityOperator=47;
    public static final int EscapeCharector=48;
    public static final int Exponent_DNum=49;
    public static final int Extends=50;
    public static final int FOR=51;
    public static final int FORWARD_SLASH=52;
    public static final int FOR_EACH=53;
    public static final int FUNCTION=54;
    public static final int Field=55;
    public static final int FirstBodyString=56;
    public static final int ForeachVar=57;
    public static final int GLOBAL=58;
    public static final int HEX_DIGIT=59;
    public static final int HereDoc=60;
    public static final int HereDocContents=61;
    public static final int Hexadecimal=62;
    public static final int IF=63;
    public static final int INSTANCE_MEMBER=64;
    public static final int INSTANCE_OF=65;
    public static final int IfExpression=66;
    public static final int IgnoreConditions=67;
    public static final int IgnoreStmContents=68;
    public static final int IgnoreStmDeclare=69;
    public static final int IgnoreStmImplements=70;
    public static final int IgnoreStmInterface=71;
    public static final int IncrementOperator=72;
    public static final int Integer=73;
    public static final int LOGICAL_AND=74;
    public static final int LOGICAL_OR=75;
    public static final int List=76;
    public static final int ListAssign=77;
    public static final int MINUS=78;
    public static final int Method=79;
    public static final int Modifiers=80;
    public static final int NEW=81;
    public static final int OCTAL_ESC=82;
    public static final int OPEN_BRACE=83;
    public static final int OPEN_CURLY_BRACE=84;
    public static final int OPEN_SQUARE_BRACE=85;
    public static final int Octal=86;
    public static final int PERCENT=87;
    public static final int PIPE=88;
    public static final int PLUS=89;
    public static final int PRINT=90;
    public static final int PRINTF=91;
    public static final int Params=92;
    public static final int PhpStatement=93;
    public static final int Postfix=94;
    public static final int Prefix=95;
    public static final int QUESTION_MARK=96;
    public static final int RETURN=97;
    public static final int Real=98;
    public static final int RequireOperator=99;
    public static final int SEMICOLON=100;
    public static final int SUPPRESS_WARNINGS=101;
    public static final int SWITCH=102;
    public static final int ShiftOperator=103;
    public static final int SingleQuotedString=104;
    public static final int THROW=105;
    public static final int TILDE=106;
    public static final int TRY=107;
    public static final int UNICODE_ESC=108;
    public static final int USE=109;
    public static final int UnquotedString=110;
    public static final int VAR=111;
    public static final int WHILE=112;
    public static final int WhiteSpace=113;
    public static final int ERROR=124;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public XSS(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public XSS(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[177+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return XSS.tokenNames; }
    public String getGrammarFileName() { return "XSS.g"; }


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


    public static class prog_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // XSS.g:228:1: prog : ( statement )* ;
    public final XSS.prog_return prog() throws RecognitionException {
        XSS.prog_return retval = new XSS.prog_return();
        retval.start = input.LT(1);

        int prog_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        XSS.statement_return statement1 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // XSS.g:229:5: ( ( statement )* )
            // XSS.g:229:7: ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // XSS.g:229:7: ( statement )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // XSS.g:229:7: statement
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_statement_in_prog86);
            	    statement1=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_0, statement1.getTree());


            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // XSS.g:231:1: statement : ( ignoreStatement | BodyString | ^( Block ( statement )* ) | classDefinition | complexStatement | simpleStatement );
    public final XSS.statement_return statement() throws RecognitionException {
        XSS.statement_return retval = new XSS.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BodyString3=null;
        CommonTree Block4=null;
        XSS.ignoreStatement_return ignoreStatement2 =null;

        XSS.statement_return statement5 =null;

        XSS.classDefinition_return classDefinition6 =null;

        XSS.complexStatement_return complexStatement7 =null;

        XSS.simpleStatement_return simpleStatement8 =null;


        CommonTree BodyString3_tree=null;
        CommonTree Block4_tree=null;

        Flags[14] = 0;
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // XSS.g:233:5: ( ignoreStatement | BodyString | ^( Block ( statement )* ) | classDefinition | complexStatement | simpleStatement )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // XSS.g:233:7: ignoreStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ignoreStatement_in_statement103);
                    ignoreStatement2=ignoreStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ignoreStatement2.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:234:7: BodyString
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BodyString3=(CommonTree)match(input,BodyString,FOLLOW_BodyString_in_statement111); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BodyString3_tree = (CommonTree)adaptor.dupNode(BodyString3);


                    adaptor.addChild(root_0, BodyString3_tree);
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // XSS.g:235:7: ^( Block ( statement )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Block4=(CommonTree)match(input,Block,FOLLOW_Block_in_statement122); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Block4_tree = (CommonTree)adaptor.dupNode(Block4);


                    root_1 = (CommonTree)adaptor.becomeRoot(Block4_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // XSS.g:235:15: ( statement )*
                        loop2:
                        do {
                            int alt2=2;
                            alt2 = dfa2.predict(input);
                            switch (alt2) {
                        	case 1 :
                        	    // XSS.g:235:15: statement
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_statement_in_statement124);
                        	    statement5=statement();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_1, statement5.getTree());


                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop2;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // XSS.g:236:7: classDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_classDefinition_in_statement134);
                    classDefinition6=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, classDefinition6.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // XSS.g:237:7: complexStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_complexStatement_in_statement142);
                    complexStatement7=complexStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, complexStatement7.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // XSS.g:238:7: simpleStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_simpleStatement_in_statement150);
                    simpleStatement8=simpleStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, simpleStatement8.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class classDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDefinition"
    // XSS.g:241:1: classDefinition : ^( CLASS ^( Modifiers ( classModifier )? ) className ( extendsclass )? ( classImplements )? ( classMember )* ) ;
    public final XSS.classDefinition_return classDefinition() throws RecognitionException {
        XSS.classDefinition_return retval = new XSS.classDefinition_return();
        retval.start = input.LT(1);

        int classDefinition_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS9=null;
        CommonTree Modifiers10=null;
        XSS.classModifier_return classModifier11 =null;

        XSS.className_return className12 =null;

        XSS.extendsclass_return extendsclass13 =null;

        XSS.classImplements_return classImplements14 =null;

        XSS.classMember_return classMember15 =null;


        CommonTree CLASS9_tree=null;
        CommonTree Modifiers10_tree=null;


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
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // XSS.g:273:5: ( ^( CLASS ^( Modifiers ( classModifier )? ) className ( extendsclass )? ( classImplements )? ( classMember )* ) )
            // XSS.g:273:7: ^( CLASS ^( Modifiers ( classModifier )? ) className ( extendsclass )? ( classImplements )? ( classMember )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CLASS9=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_classDefinition180); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS9_tree = (CommonTree)adaptor.dupNode(CLASS9);


            root_1 = (CommonTree)adaptor.becomeRoot(CLASS9_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Modifiers10=(CommonTree)match(input,Modifiers,FOLLOW_Modifiers_in_classDefinition183); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Modifiers10_tree = (CommonTree)adaptor.dupNode(Modifiers10);


            root_2 = (CommonTree)adaptor.becomeRoot(Modifiers10_tree, root_2);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // XSS.g:273:27: ( classModifier )?
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ABSTRACT) ) {
                    alt4=1;
                }
                switch (alt4) {
                    case 1 :
                        // XSS.g:273:27: classModifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_classModifier_in_classDefinition185);
                        classModifier11=classModifier();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_2, classModifier11.getTree());


                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_className_in_classDefinition189);
            className12=className();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, className12.getTree());


            // XSS.g:273:53: ( extendsclass )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Extends) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // XSS.g:273:53: extendsclass
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_extendsclass_in_classDefinition191);
                    extendsclass13=extendsclass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, extendsclass13.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            // XSS.g:273:67: ( classImplements )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==PhpStatement) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // XSS.g:273:67: classImplements
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_classImplements_in_classDefinition194);
                    classImplements14=classImplements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, classImplements14.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            // XSS.g:273:84: ( classMember )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==CONST||LA7_0==Field||LA7_0==Method||LA7_0==VAR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // XSS.g:273:84: classMember
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_classMember_in_classDefinition197);
            	    classMember15=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, classMember15.getTree());


            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

            if ( state.backtracking==0 ) {
            	  try{
            		class_table.define(currentClass);
            		currentSymbolTable = st_BeforeDefFunction;
            		currentScope = scp_BeforeDefFunction;
            		Flags[18] = 0;
            				
            		} catch (Exception e){
            			
            		}		
            	}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, classDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDefinition"


    public static class className_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "className"
    // XSS.g:276:1: className : UnquotedString ;
    public final XSS.className_return className() throws RecognitionException {
        XSS.className_return retval = new XSS.className_return();
        retval.start = input.LT(1);

        int className_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UnquotedString16=null;

        CommonTree UnquotedString16_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // XSS.g:277:5: ( UnquotedString )
            // XSS.g:277:7: UnquotedString
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            UnquotedString16=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_className216); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString16_tree = (CommonTree)adaptor.dupNode(UnquotedString16);


            adaptor.addChild(root_0, UnquotedString16_tree);
            }


            if ( state.backtracking==0 ) {
            		try{
                  	currentClass.setClassName((UnquotedString16!=null?UnquotedString16.getText():null));
            		} catch (Exception e){}
                  }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, className_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "className"


    public static class extendsclass_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extendsclass"
    // XSS.g:285:1: extendsclass : ^( Extends UnquotedString ) ;
    public final XSS.extendsclass_return extendsclass() throws RecognitionException {
        XSS.extendsclass_return retval = new XSS.extendsclass_return();
        retval.start = input.LT(1);

        int extendsclass_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Extends17=null;
        CommonTree UnquotedString18=null;

        CommonTree Extends17_tree=null;
        CommonTree UnquotedString18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // XSS.g:286:5: ( ^( Extends UnquotedString ) )
            // XSS.g:286:7: ^( Extends UnquotedString )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Extends17=(CommonTree)match(input,Extends,FOLLOW_Extends_in_extendsclass243); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Extends17_tree = (CommonTree)adaptor.dupNode(Extends17);


            root_1 = (CommonTree)adaptor.becomeRoot(Extends17_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            UnquotedString18=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_extendsclass245); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString18_tree = (CommonTree)adaptor.dupNode(UnquotedString18);


            adaptor.addChild(root_1, UnquotedString18_tree);
            }


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            		try{
                  	currentClass.setExtendedNameClass((UnquotedString18!=null?UnquotedString18.getText():null), currentFile, mct);
            		} catch (Exception e){}
                  }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, extendsclass_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "extendsclass"


    public static class classImplements_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classImplements"
    // XSS.g:294:1: classImplements : ignoreStatement ;
    public final XSS.classImplements_return classImplements() throws RecognitionException {
        XSS.classImplements_return retval = new XSS.classImplements_return();
        retval.start = input.LT(1);

        int classImplements_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        XSS.ignoreStatement_return ignoreStatement19 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // XSS.g:295:5: ( ignoreStatement )
            // XSS.g:295:7: ignoreStatement
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_ignoreStatement_in_classImplements276);
            ignoreStatement19=ignoreStatement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, ignoreStatement19.getTree());


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, classImplements_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classImplements"


    public static class classMember_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classMember"
    // XSS.g:298:1: classMember : ( ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString ^( Params ( paramDef )* ) ( ^( Block ( statement )* ) )? ) | definitionAttribute );
    public final XSS.classMember_return classMember() throws RecognitionException {
        XSS.classMember_return retval = new XSS.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Method20=null;
        CommonTree Modifiers21=null;
        CommonTree UnquotedString23=null;
        CommonTree Params24=null;
        CommonTree Block26=null;
        XSS.fieldModifier_return fieldModifier22 =null;

        XSS.paramDef_return paramDef25 =null;

        XSS.statement_return statement27 =null;

        XSS.definitionAttribute_return definitionAttribute28 =null;


        CommonTree Method20_tree=null;
        CommonTree Modifiers21_tree=null;
        CommonTree UnquotedString23_tree=null;
        CommonTree Params24_tree=null;
        CommonTree Block26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // XSS.g:299:2: ( ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString ^( Params ( paramDef )* ) ( ^( Block ( statement )* ) )? ) | definitionAttribute )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Method) ) {
                alt12=1;
            }
            else if ( (LA12_0==CONST||LA12_0==Field||LA12_0==VAR) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // XSS.g:299:4: ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString ^( Params ( paramDef )* ) ( ^( Block ( statement )* ) )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
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

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Method20=(CommonTree)match(input,Method,FOLLOW_Method_in_classMember300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Method20_tree = (CommonTree)adaptor.dupNode(Method20);


                    root_1 = (CommonTree)adaptor.becomeRoot(Method20_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Modifiers21=(CommonTree)match(input,Modifiers,FOLLOW_Modifiers_in_classMember303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Modifiers21_tree = (CommonTree)adaptor.dupNode(Modifiers21);


                    root_2 = (CommonTree)adaptor.becomeRoot(Modifiers21_tree, root_2);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // XSS.g:312:27: ( fieldModifier )*
                        loop8:
                        do {
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==ABSTRACT||LA8_0==AccessModifier||LA8_0==118||LA8_0==122) ) {
                                alt8=1;
                            }


                            switch (alt8) {
                        	case 1 :
                        	    // XSS.g:312:27: fieldModifier
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_fieldModifier_in_classMember305);
                        	    fieldModifier22=fieldModifier();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_2, fieldModifier22.getTree());


                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop8;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    UnquotedString23=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember309); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString23_tree = (CommonTree)adaptor.dupNode(UnquotedString23);


                    adaptor.addChild(root_1, UnquotedString23_tree);
                    }


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Params24=(CommonTree)match(input,Params,FOLLOW_Params_in_classMember312); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Params24_tree = (CommonTree)adaptor.dupNode(Params24);


                    root_2 = (CommonTree)adaptor.becomeRoot(Params24_tree, root_2);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // XSS.g:312:67: ( paramDef )*
                        loop9:
                        do {
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==AMPERSAND||LA9_0==ArrayWord||LA9_0==DOLLAR||LA9_0==EQUALS||LA9_0==UnquotedString) ) {
                                alt9=1;
                            }


                            switch (alt9) {
                        	case 1 :
                        	    // XSS.g:312:67: paramDef
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_paramDef_in_classMember314);
                        	    paramDef25=paramDef();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_2, paramDef25.getTree());


                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop9;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    // XSS.g:312:78: ( ^( Block ( statement )* ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==Block) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // XSS.g:312:79: ^( Block ( statement )* )
                            {
                            _last = (CommonTree)input.LT(1);
                            {
                            CommonTree _save_last_2 = _last;
                            CommonTree _first_2 = null;
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            _last = (CommonTree)input.LT(1);
                            Block26=(CommonTree)match(input,Block,FOLLOW_Block_in_classMember320); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Block26_tree = (CommonTree)adaptor.dupNode(Block26);


                            root_2 = (CommonTree)adaptor.becomeRoot(Block26_tree, root_2);
                            }


                            if ( input.LA(1)==Token.DOWN ) {
                                match(input, Token.DOWN, null); if (state.failed) return retval;
                                // XSS.g:312:87: ( statement )*
                                loop10:
                                do {
                                    int alt10=2;
                                    alt10 = dfa10.predict(input);
                                    switch (alt10) {
                                	case 1 :
                                	    // XSS.g:312:87: statement
                                	    {
                                	    _last = (CommonTree)input.LT(1);
                                	    pushFollow(FOLLOW_statement_in_classMember322);
                                	    statement27=statement();

                                	    state._fsp--;
                                	    if (state.failed) return retval;
                                	    if ( state.backtracking==0 ) 
                                	    adaptor.addChild(root_2, statement27.getTree());


                                	    if ( state.backtracking==0 ) {
                                	    }
                                	    }
                                	    break;

                                	default :
                                	    break loop10;
                                    }
                                } while (true);


                                match(input, Token.UP, null); if (state.failed) return retval;
                            }
                            adaptor.addChild(root_1, root_2);
                            _last = _save_last_2;
                            }


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    	  try{	
                    		currentMethod.setFunctionName((UnquotedString23!=null?UnquotedString23.getText():null));
                    		currentMethod.setCodeLine((UnquotedString23!=null?UnquotedString23.getLine():0));
                    		methtab_functions.define(currentMethod, currentMethod, false);

                    		Flags[6] = 0; /*defFunction_flag = 0;*/	
                    		} catch (Exception e){
                    			
                    		}
                    	}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:324:7: definitionAttribute
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_definitionAttribute_in_classMember338);
                    definitionAttribute28=definitionAttribute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, definitionAttribute28.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, classMember_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classMember"


    public static class definitionAttribute_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definitionAttribute"
    // XSS.g:327:1: definitionAttribute : ( ^( VAR ^( DOLLAR UnquotedString ) ( value )? ) | ^( CONST UnquotedString ( value )? ) | ^( Field ^( Modifiers ( fieldModifier )* ) ^( DOLLAR UnquotedString ) ( value )? ) );
    public final XSS.definitionAttribute_return definitionAttribute() throws RecognitionException {
        XSS.definitionAttribute_return retval = new XSS.definitionAttribute_return();
        retval.start = input.LT(1);

        int definitionAttribute_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VAR29=null;
        CommonTree DOLLAR30=null;
        CommonTree UnquotedString31=null;
        CommonTree CONST33=null;
        CommonTree UnquotedString34=null;
        CommonTree Field36=null;
        CommonTree Modifiers37=null;
        CommonTree DOLLAR39=null;
        CommonTree UnquotedString40=null;
        XSS.value_return value32 =null;

        XSS.value_return value35 =null;

        XSS.fieldModifier_return fieldModifier38 =null;

        XSS.value_return value41 =null;


        CommonTree VAR29_tree=null;
        CommonTree DOLLAR30_tree=null;
        CommonTree UnquotedString31_tree=null;
        CommonTree CONST33_tree=null;
        CommonTree UnquotedString34_tree=null;
        CommonTree Field36_tree=null;
        CommonTree Modifiers37_tree=null;
        CommonTree DOLLAR39_tree=null;
        CommonTree UnquotedString40_tree=null;


        	  try{
        		Flags[19] = 1; //defAttribute_class
        		currentScope = currentClass.getAttributes();
             	CallSymbol ms = new CallSymbol("attrib", -1, currentScope, 0, currentFile);
             	currentScope.define(ms, ms, false);
             	currentScope = ms;
             	attribName = null;
        		} catch (Exception e){
        			
        		}
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // XSS.g:351:5: ( ^( VAR ^( DOLLAR UnquotedString ) ( value )? ) | ^( CONST UnquotedString ( value )? ) | ^( Field ^( Modifiers ( fieldModifier )* ) ^( DOLLAR UnquotedString ) ( value )? ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt17=1;
                }
                break;
            case CONST:
                {
                alt17=2;
                }
                break;
            case Field:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // XSS.g:351:7: ^( VAR ^( DOLLAR UnquotedString ) ( value )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    VAR29=(CommonTree)match(input,VAR,FOLLOW_VAR_in_definitionAttribute372); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR29_tree = (CommonTree)adaptor.dupNode(VAR29);


                    root_1 = (CommonTree)adaptor.becomeRoot(VAR29_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DOLLAR30=(CommonTree)match(input,DOLLAR,FOLLOW_DOLLAR_in_definitionAttribute375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOLLAR30_tree = (CommonTree)adaptor.dupNode(DOLLAR30);


                    root_2 = (CommonTree)adaptor.becomeRoot(DOLLAR30_tree, root_2);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString31=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_definitionAttribute377); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString31_tree = (CommonTree)adaptor.dupNode(UnquotedString31);


                    adaptor.addChild(root_2, UnquotedString31_tree);
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    // XSS.g:351:38: ( value )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==Array||LA13_0==Boolean||LA13_0==DoubleQuotedString||LA13_0==HereDoc||LA13_0==Integer||LA13_0==List||LA13_0==Real||LA13_0==SingleQuotedString||LA13_0==UnquotedString||LA13_0==120) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // XSS.g:351:38: value
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_value_in_definitionAttribute380);
                            value32=value();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, value32.getTree());


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { try{ attribName =  (UnquotedString31!=null?UnquotedString31.getText():null); linha = (UnquotedString31!=null?UnquotedString31.getLine():0); } catch (Exception e){}}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:353:7: ^( CONST UnquotedString ( value )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONST33=(CommonTree)match(input,CONST,FOLLOW_CONST_in_definitionAttribute399); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONST33_tree = (CommonTree)adaptor.dupNode(CONST33);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONST33_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString34=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_definitionAttribute401); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString34_tree = (CommonTree)adaptor.dupNode(UnquotedString34);


                    adaptor.addChild(root_1, UnquotedString34_tree);
                    }


                    // XSS.g:353:30: ( value )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==Array||LA14_0==Boolean||LA14_0==DoubleQuotedString||LA14_0==HereDoc||LA14_0==Integer||LA14_0==List||LA14_0==Real||LA14_0==SingleQuotedString||LA14_0==UnquotedString||LA14_0==120) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // XSS.g:353:30: value
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_value_in_definitionAttribute403);
                            value35=value();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, value35.getTree());


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { try{ attribName =  (UnquotedString34!=null?UnquotedString34.getText():null); linha = (UnquotedString34!=null?UnquotedString34.getLine():0); } catch (Exception e){}}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // XSS.g:355:7: ^( Field ^( Modifiers ( fieldModifier )* ) ^( DOLLAR UnquotedString ) ( value )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Field36=(CommonTree)match(input,Field,FOLLOW_Field_in_definitionAttribute422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Field36_tree = (CommonTree)adaptor.dupNode(Field36);


                    root_1 = (CommonTree)adaptor.becomeRoot(Field36_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Modifiers37=(CommonTree)match(input,Modifiers,FOLLOW_Modifiers_in_definitionAttribute425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Modifiers37_tree = (CommonTree)adaptor.dupNode(Modifiers37);


                    root_2 = (CommonTree)adaptor.becomeRoot(Modifiers37_tree, root_2);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // XSS.g:355:27: ( fieldModifier )*
                        loop15:
                        do {
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==ABSTRACT||LA15_0==AccessModifier||LA15_0==118||LA15_0==122) ) {
                                alt15=1;
                            }


                            switch (alt15) {
                        	case 1 :
                        	    // XSS.g:355:27: fieldModifier
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_fieldModifier_in_definitionAttribute427);
                        	    fieldModifier38=fieldModifier();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_2, fieldModifier38.getTree());


                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop15;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DOLLAR39=(CommonTree)match(input,DOLLAR,FOLLOW_DOLLAR_in_definitionAttribute432); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOLLAR39_tree = (CommonTree)adaptor.dupNode(DOLLAR39);


                    root_2 = (CommonTree)adaptor.becomeRoot(DOLLAR39_tree, root_2);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString40=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_definitionAttribute434); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString40_tree = (CommonTree)adaptor.dupNode(UnquotedString40);


                    adaptor.addChild(root_2, UnquotedString40_tree);
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    // XSS.g:355:68: ( value )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==Array||LA16_0==Boolean||LA16_0==DoubleQuotedString||LA16_0==HereDoc||LA16_0==Integer||LA16_0==List||LA16_0==Real||LA16_0==SingleQuotedString||LA16_0==UnquotedString||LA16_0==120) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // XSS.g:355:68: value
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_value_in_definitionAttribute437);
                            value41=value();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, value41.getTree());


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { try{ attribName =  (UnquotedString40!=null?UnquotedString40.getText():null); linha = (UnquotedString40!=null?UnquotedString40.getLine():0); } catch (Exception e){}}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

            if ( state.backtracking==0 ) {
            	  try{
            		Flags[19] = 0;
            		currentScope.getScopeSymbol().setCodeLine(linha);
            		currentScope.getScopeSymbol().setName(attribName);
            		currentScope = currentScope.getEnclosingScope();	
            		} catch (Exception e){
            			
            		}	
            	}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, definitionAttribute_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "definitionAttribute"


    public static class classModifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classModifier"
    // XSS.g:359:1: classModifier : 'abstract' ;
    public final XSS.classModifier_return classModifier() throws RecognitionException {
        XSS.classModifier_return retval = new XSS.classModifier_return();
        retval.start = input.LT(1);

        int classModifier_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal42=null;

        CommonTree string_literal42_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // XSS.g:360:5: ( 'abstract' )
            // XSS.g:360:7: 'abstract'
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            string_literal42=(CommonTree)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_classModifier464); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal42_tree = (CommonTree)adaptor.dupNode(string_literal42);


            adaptor.addChild(root_0, string_literal42_tree);
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, classModifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classModifier"


    public static class fieldModifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldModifier"
    // XSS.g:362:1: fieldModifier : ( AccessModifier | 'abstract' | 'static' | 'final' );
    public final XSS.fieldModifier_return fieldModifier() throws RecognitionException {
        XSS.fieldModifier_return retval = new XSS.fieldModifier_return();
        retval.start = input.LT(1);

        int fieldModifier_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set43=null;

        CommonTree set43_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // XSS.g:363:5: ( AccessModifier | 'abstract' | 'static' | 'final' )
            // XSS.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set43=(CommonTree)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==AccessModifier||input.LA(1)==118||input.LA(1)==122 ) {
                input.consume();
                if ( state.backtracking==0 ) {
                set43_tree = (CommonTree)adaptor.dupNode(set43);


                adaptor.addChild(root_0, set43_tree);
                }

                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
            } 

            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, fieldModifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fieldModifier"


    public static class value_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // XSS.g:366:1: value : ( 'null' | UnquotedString | atom );
    public final XSS.value_return value() throws RecognitionException {
        XSS.value_return retval = new XSS.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal44=null;
        CommonTree UnquotedString45=null;
        XSS.atom_return atom46 =null;


        CommonTree string_literal44_tree=null;
        CommonTree UnquotedString45_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // XSS.g:367:5: ( 'null' | UnquotedString | atom )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 120:
                {
                int LA18_1 = input.LA(2);

                if ( (synpred26_XSS()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
                }
                break;
            case UnquotedString:
                {
                alt18=2;
                }
                break;
            case Array:
            case Boolean:
            case DoubleQuotedString:
            case HereDoc:
            case Integer:
            case List:
            case Real:
            case SingleQuotedString:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // XSS.g:367:7: 'null'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    string_literal44=(CommonTree)match(input,120,FOLLOW_120_in_value509); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal44_tree = (CommonTree)adaptor.dupNode(string_literal44);


                    adaptor.addChild(root_0, string_literal44_tree);
                    }


                    if ( state.backtracking==0 ) {
                    		try{
                    		VariableSymbol vs = new VariableSymbol("null", 0, linha, true, currentFile);
                       		currentScope.define(vs, null, true);      
                    		} catch (Exception e){}
                          }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:374:4: UnquotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    UnquotedString45=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_value522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString45_tree = (CommonTree)adaptor.dupNode(UnquotedString45);


                    adaptor.addChild(root_0, UnquotedString45_tree);
                    }


                    if ( state.backtracking==0 ) {
                    	   try{
                    	    if (Flags[15] == 0 && Flags[17] == 0){
                    		texto = (UnquotedString45!=null?UnquotedString45.getText():null);
                    		linha = (UnquotedString45!=null?UnquotedString45.getLine():0);
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // XSS.g:391:7: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atom_in_value534);
                    atom46=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom46.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, value_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "value"


    public static class complexStatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "complexStatement"
    // XSS.g:394:1: complexStatement : ( ifStatement | ^( FOR forHeader statement ) | ^( FOR_EACH forHeader statement ) | ^( WHILE whileCondition statement ) | ^( DO statement whileCondition ) | ^( SWITCH expression cases ) | functionDefinition | ^( TRY statement catchStatement ) );
    public final XSS.complexStatement_return complexStatement() throws RecognitionException {
        XSS.complexStatement_return retval = new XSS.complexStatement_return();
        retval.start = input.LT(1);

        int complexStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FOR48=null;
        CommonTree FOR_EACH51=null;
        CommonTree WHILE54=null;
        CommonTree DO57=null;
        CommonTree SWITCH60=null;
        CommonTree TRY64=null;
        XSS.ifStatement_return ifStatement47 =null;

        XSS.forHeader_return forHeader49 =null;

        XSS.statement_return statement50 =null;

        XSS.forHeader_return forHeader52 =null;

        XSS.statement_return statement53 =null;

        XSS.whileCondition_return whileCondition55 =null;

        XSS.statement_return statement56 =null;

        XSS.statement_return statement58 =null;

        XSS.whileCondition_return whileCondition59 =null;

        XSS.expression_return expression61 =null;

        XSS.cases_return cases62 =null;

        XSS.functionDefinition_return functionDefinition63 =null;

        XSS.statement_return statement65 =null;

        XSS.catchStatement_return catchStatement66 =null;


        CommonTree FOR48_tree=null;
        CommonTree FOR_EACH51_tree=null;
        CommonTree WHILE54_tree=null;
        CommonTree DO57_tree=null;
        CommonTree SWITCH60_tree=null;
        CommonTree TRY64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // XSS.g:395:5: ( ifStatement | ^( FOR forHeader statement ) | ^( FOR_EACH forHeader statement ) | ^( WHILE whileCondition statement ) | ^( DO statement whileCondition ) | ^( SWITCH expression cases ) | functionDefinition | ^( TRY statement catchStatement ) )
            int alt19=8;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt19=1;
                }
                break;
            case FOR:
                {
                alt19=2;
                }
                break;
            case FOR_EACH:
                {
                alt19=3;
                }
                break;
            case WHILE:
                {
                alt19=4;
                }
                break;
            case DO:
                {
                alt19=5;
                }
                break;
            case SWITCH:
                {
                alt19=6;
                }
                break;
            case FUNCTION:
                {
                alt19=7;
                }
                break;
            case TRY:
                {
                alt19=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // XSS.g:395:7: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ifStatement_in_complexStatement551);
                    ifStatement47=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ifStatement47.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:396:7: ^( FOR forHeader statement )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    FOR48=(CommonTree)match(input,FOR,FOLLOW_FOR_in_complexStatement565); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR48_tree = (CommonTree)adaptor.dupNode(FOR48);


                    root_1 = (CommonTree)adaptor.becomeRoot(FOR48_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_forHeader_in_complexStatement567);
                    forHeader49=forHeader();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, forHeader49.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_complexStatement569);
                    statement50=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement50.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // XSS.g:397:7: ^( FOR_EACH forHeader statement )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    FOR_EACH51=(CommonTree)match(input,FOR_EACH,FOLLOW_FOR_EACH_in_complexStatement579); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR_EACH51_tree = (CommonTree)adaptor.dupNode(FOR_EACH51);


                    root_1 = (CommonTree)adaptor.becomeRoot(FOR_EACH51_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_forHeader_in_complexStatement581);
                    forHeader52=forHeader();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, forHeader52.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_complexStatement583);
                    statement53=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement53.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // XSS.g:398:7: ^( WHILE whileCondition statement )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    WHILE54=(CommonTree)match(input,WHILE,FOLLOW_WHILE_in_complexStatement593); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE54_tree = (CommonTree)adaptor.dupNode(WHILE54);


                    root_1 = (CommonTree)adaptor.becomeRoot(WHILE54_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whileCondition_in_complexStatement595);
                    whileCondition55=whileCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, whileCondition55.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_complexStatement597);
                    statement56=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement56.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // XSS.g:399:7: ^( DO statement whileCondition )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DO57=(CommonTree)match(input,DO,FOLLOW_DO_in_complexStatement607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO57_tree = (CommonTree)adaptor.dupNode(DO57);


                    root_1 = (CommonTree)adaptor.becomeRoot(DO57_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_complexStatement609);
                    statement58=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement58.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whileCondition_in_complexStatement611);
                    whileCondition59=whileCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, whileCondition59.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // XSS.g:400:7: ^( SWITCH expression cases )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SWITCH60=(CommonTree)match(input,SWITCH,FOLLOW_SWITCH_in_complexStatement621); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH60_tree = (CommonTree)adaptor.dupNode(SWITCH60);


                    root_1 = (CommonTree)adaptor.becomeRoot(SWITCH60_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_complexStatement623);
                    expression61=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression61.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_cases_in_complexStatement625);
                    cases62=cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, cases62.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // XSS.g:401:7: functionDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
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

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_functionDefinition_in_complexStatement637);
                    functionDefinition63=functionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, functionDefinition63.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // XSS.g:439:4: ^( TRY statement catchStatement )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    TRY64=(CommonTree)match(input,TRY,FOLLOW_TRY_in_complexStatement644); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY64_tree = (CommonTree)adaptor.dupNode(TRY64);


                    root_1 = (CommonTree)adaptor.becomeRoot(TRY64_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_complexStatement646);
                    statement65=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement65.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_catchStatement_in_complexStatement648);
                    catchStatement66=catchStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, catchStatement66.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, complexStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "complexStatement"


    public static class catchStatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "catchStatement"
    // XSS.g:442:1: catchStatement : ^( CATCH whileCondition statement ) ;
    public final XSS.catchStatement_return catchStatement() throws RecognitionException {
        XSS.catchStatement_return retval = new XSS.catchStatement_return();
        retval.start = input.LT(1);

        int catchStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CATCH67=null;
        XSS.whileCondition_return whileCondition68 =null;

        XSS.statement_return statement69 =null;


        CommonTree CATCH67_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // XSS.g:443:2: ( ^( CATCH whileCondition statement ) )
            // XSS.g:443:4: ^( CATCH whileCondition statement )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CATCH67=(CommonTree)match(input,CATCH,FOLLOW_CATCH_in_catchStatement664); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH67_tree = (CommonTree)adaptor.dupNode(CATCH67);


            root_1 = (CommonTree)adaptor.becomeRoot(CATCH67_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_whileCondition_in_catchStatement666);
            whileCondition68=whileCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, whileCondition68.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_statement_in_catchStatement668);
            statement69=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, statement69.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, catchStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "catchStatement"


    public static class simpleStatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleStatement"
    // XSS.g:446:1: simpleStatement : ( ^( GLOBAL ( name )+ ) | ^( RETURN ( expression )? ) | simpleRequire | outputFunctions | expression | ignoreOthers );
    public final XSS.simpleStatement_return simpleStatement() throws RecognitionException {
        XSS.simpleStatement_return retval = new XSS.simpleStatement_return();
        retval.start = input.LT(1);

        int simpleStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GLOBAL70=null;
        CommonTree RETURN72=null;
        XSS.name_return name71 =null;

        XSS.expression_return expression73 =null;

        XSS.simpleRequire_return simpleRequire74 =null;

        XSS.outputFunctions_return outputFunctions75 =null;

        XSS.expression_return expression76 =null;

        XSS.ignoreOthers_return ignoreOthers77 =null;


        CommonTree GLOBAL70_tree=null;
        CommonTree RETURN72_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // XSS.g:447:5: ( ^( GLOBAL ( name )+ ) | ^( RETURN ( expression )? ) | simpleRequire | outputFunctions | expression | ignoreOthers )
            int alt22=6;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // XSS.g:447:6: ^( GLOBAL ( name )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    		Flags[9] = 1; /*globalVarFunction_flag = 1;*/
                    	}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GLOBAL70=(CommonTree)match(input,GLOBAL,FOLLOW_GLOBAL_in_simpleStatement691); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GLOBAL70_tree = (CommonTree)adaptor.dupNode(GLOBAL70);


                    root_1 = (CommonTree)adaptor.becomeRoot(GLOBAL70_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // XSS.g:450:16: ( name )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==CLASS_MEMBER||LA20_0==DOLLAR||LA20_0==INSTANCE_MEMBER||LA20_0==OPEN_SQUARE_BRACE||LA20_0==UnquotedString) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // XSS.g:450:16: name
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_name_in_simpleStatement693);
                    	    name71=name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, name71.getTree());


                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:468:8: ^( RETURN ( expression )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
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

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    RETURN72=(CommonTree)match(input,RETURN,FOLLOW_RETURN_in_simpleStatement713); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN72_tree = (CommonTree)adaptor.dupNode(RETURN72);


                    root_1 = (CommonTree)adaptor.becomeRoot(RETURN72_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // XSS.g:485:12: ( expression )?
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==AMPERSAND||LA21_0==ASTERISK||(LA21_0 >= Apply && LA21_0 <= Array)||(LA21_0 >= AssignmentOperator && LA21_0 <= BANG)||LA21_0==Boolean||(LA21_0 >= CLASS_MEMBER && LA21_0 <= CLONE)||(LA21_0 >= Cast && LA21_0 <= ConcatAssigmentOperator)||LA21_0==DIE||(LA21_0 >= DOLLAR && LA21_0 <= DOT)||(LA21_0 >= DoubleQuotedString && LA21_0 <= ECHO)||(LA21_0 >= EQUALS && LA21_0 <= EqualityOperator)||LA21_0==FORWARD_SLASH||LA21_0==HereDoc||(LA21_0 >= INSTANCE_MEMBER && LA21_0 <= IfExpression)||(LA21_0 >= Integer && LA21_0 <= List)||LA21_0==MINUS||LA21_0==NEW||LA21_0==OPEN_SQUARE_BRACE||(LA21_0 >= PERCENT && LA21_0 <= PRINTF)||(LA21_0 >= Postfix && LA21_0 <= Prefix)||LA21_0==Real||LA21_0==SUPPRESS_WARNINGS||(LA21_0 >= ShiftOperator && LA21_0 <= SingleQuotedString)||LA21_0==TILDE||LA21_0==UnquotedString||(LA21_0 >= 114 && LA21_0 <= 117)||(LA21_0 >= 120 && LA21_0 <= 121)||(LA21_0 >= 123 && LA21_0 <= ERROR)) ) {
                            alt21=1;
                        }
                        switch (alt21) {
                            case 1 :
                                // XSS.g:485:12: expression
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_expression_in_simpleStatement715);
                                expression73=expression();

                                state._fsp--;
                                if (state.failed) return retval;
                                if ( state.backtracking==0 ) 
                                adaptor.addChild(root_1, expression73.getTree());


                                if ( state.backtracking==0 ) {
                                }
                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // XSS.g:530:7: simpleRequire
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_simpleRequire_in_simpleStatement730);
                    simpleRequire74=simpleRequire();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, simpleRequire74.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // XSS.g:531:7: outputFunctions
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_outputFunctions_in_simpleStatement738);
                    outputFunctions75=outputFunctions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, outputFunctions75.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // XSS.g:532:7: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_simpleStatement750);
                    expression76=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, expression76.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // XSS.g:533:7: ignoreOthers
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ignoreOthers_in_simpleStatement759);
                    ignoreOthers77=ignoreOthers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ignoreOthers77.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, simpleStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "simpleStatement"


    public static class simpleRequire_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleRequire"
    // XSS.g:536:1: simpleRequire : ^( RequireOperator expression ) ;
    public final XSS.simpleRequire_return simpleRequire() throws RecognitionException {
        XSS.simpleRequire_return retval = new XSS.simpleRequire_return();
        retval.start = input.LT(1);

        int simpleRequire_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RequireOperator78=null;
        XSS.expression_return expression79 =null;


        CommonTree RequireOperator78_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // XSS.g:537:5: ( ^( RequireOperator expression ) )
            // XSS.g:537:7: ^( RequireOperator expression )
            {
            root_0 = (CommonTree)adaptor.nil();


            if ( state.backtracking==0 ) {
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

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RequireOperator78=(CommonTree)match(input,RequireOperator,FOLLOW_RequireOperator_in_simpleRequire785); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RequireOperator78_tree = (CommonTree)adaptor.dupNode(RequireOperator78);


            root_1 = (CommonTree)adaptor.becomeRoot(RequireOperator78_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_simpleRequire787);
            expression79=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expression79.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, simpleRequire_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "simpleRequire"


    public static class ifStatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStatement"
    // XSS.g:625:1: ifStatement options {backtrack=true; } : ^( IF expression statement ( conditional )? ) ;
    public final XSS.ifStatement_return ifStatement() throws RecognitionException {
        XSS.ifStatement_return retval = new XSS.ifStatement_return();
        retval.start = input.LT(1);

        int ifStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IF80=null;
        XSS.expression_return expression81 =null;

        XSS.statement_return statement82 =null;

        XSS.conditional_return conditional83 =null;


        CommonTree IF80_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // XSS.g:627:5: ( ^( IF expression statement ( conditional )? ) )
            // XSS.g:627:7: ^( IF expression statement ( conditional )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            if ( state.backtracking==0 ) {
            		try{
                	  Flags[14] = 1; /*if_presence_flag=1 */
                	  indexIf++;
                	  numElemIfBegin.add(currentScope.getMembers().size());  
            		} catch (Exception e){
            			
            		}  	  
                  }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IF80=(CommonTree)match(input,IF,FOLLOW_IF_in_ifStatement830); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF80_tree = (CommonTree)adaptor.dupNode(IF80);


            root_1 = (CommonTree)adaptor.becomeRoot(IF80_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_ifStatement832);
            expression81=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expression81.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_statement_in_ifStatement834);
            statement82=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, statement82.getTree());


            // XSS.g:636:32: ( conditional )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ELSE||LA23_0==IF) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // XSS.g:636:32: conditional
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditional_in_ifStatement836);
                    conditional83=conditional();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, conditional83.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            		try{
                     Flags[14] = 0;
                     numElemIfBegin.remove(indexIf-1);
                     indexIf--;  
            		} catch (Exception e){
            			
            		}       
                  }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, ifStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ifStatement"


    public static class conditional_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditional"
    // XSS.g:648:1: conditional : ( ^( ELSE statement ) | ^( IF expression statement ( conditional )? ) );
    public final XSS.conditional_return conditional() throws RecognitionException {
        XSS.conditional_return retval = new XSS.conditional_return();
        retval.start = input.LT(1);

        int conditional_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ELSE84=null;
        CommonTree IF86=null;
        XSS.statement_return statement85 =null;

        XSS.expression_return expression87 =null;

        XSS.statement_return statement88 =null;

        XSS.conditional_return conditional89 =null;


        CommonTree ELSE84_tree=null;
        CommonTree IF86_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // XSS.g:649:5: ( ^( ELSE statement ) | ^( IF expression statement ( conditional )? ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ELSE) ) {
                alt25=1;
            }
            else if ( (LA25_0==IF) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // XSS.g:649:7: ^( ELSE statement )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ELSE84=(CommonTree)match(input,ELSE,FOLLOW_ELSE_in_conditional865); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE84_tree = (CommonTree)adaptor.dupNode(ELSE84);


                    root_1 = (CommonTree)adaptor.becomeRoot(ELSE84_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_conditional867);
                    statement85=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement85.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:650:7: ^( IF expression statement ( conditional )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    		try{
                        	  Flags[14] = 1;
                        	  indexIf++;
                        	  numElemIfBegin.add(currentScope.getMembers().size());
                    		} catch (Exception e){
                    			
                    		}   	  
                          }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    IF86=(CommonTree)match(input,IF,FOLLOW_IF_in_conditional886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF86_tree = (CommonTree)adaptor.dupNode(IF86);


                    root_1 = (CommonTree)adaptor.becomeRoot(IF86_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_conditional888);
                    expression87=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression87.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_conditional890);
                    statement88=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement88.getTree());


                    // XSS.g:659:34: ( conditional )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==ELSE||LA24_0==IF) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // XSS.g:659:34: conditional
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_conditional_in_conditional892);
                            conditional89=conditional();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, conditional89.getTree());


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    		try{
                             Flags[14] = 0;
                             numElemIfBegin.remove(indexIf-1);
                             indexIf--;
                    		} catch (Exception e){
                    			
                    		}         
                          }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, conditional_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditional"


    public static class forHeader_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forHeader"
    // XSS.g:671:1: forHeader : ignoreStatement ;
    public final XSS.forHeader_return forHeader() throws RecognitionException {
        XSS.forHeader_return retval = new XSS.forHeader_return();
        retval.start = input.LT(1);

        int forHeader_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        XSS.ignoreStatement_return ignoreStatement90 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // XSS.g:672:5: ( ignoreStatement )
            // XSS.g:672:7: ignoreStatement
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_ignoreStatement_in_forHeader919);
            ignoreStatement90=ignoreStatement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, ignoreStatement90.getTree());


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, forHeader_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forHeader"


    public static class whileCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileCondition"
    // XSS.g:675:1: whileCondition : ignoreStatement ;
    public final XSS.whileCondition_return whileCondition() throws RecognitionException {
        XSS.whileCondition_return retval = new XSS.whileCondition_return();
        retval.start = input.LT(1);

        int whileCondition_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        XSS.ignoreStatement_return ignoreStatement91 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // XSS.g:676:5: ( ignoreStatement )
            // XSS.g:676:7: ignoreStatement
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_ignoreStatement_in_whileCondition936);
            ignoreStatement91=ignoreStatement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, ignoreStatement91.getTree());


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, whileCondition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "whileCondition"


    public static class ignoreOthers_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ignoreOthers"
    // XSS.g:679:1: ignoreOthers : ignoreStatement ;
    public final XSS.ignoreOthers_return ignoreOthers() throws RecognitionException {
        XSS.ignoreOthers_return retval = new XSS.ignoreOthers_return();
        retval.start = input.LT(1);

        int ignoreOthers_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        XSS.ignoreStatement_return ignoreStatement92 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // XSS.g:680:5: ( ignoreStatement )
            // XSS.g:680:7: ignoreStatement
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_ignoreStatement_in_ignoreOthers953);
            ignoreStatement92=ignoreStatement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, ignoreStatement92.getTree());


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, ignoreOthers_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ignoreOthers"


    public static class cases_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cases"
    // XSS.g:683:1: cases : ( casestatement )* ( defaultcase )? ;
    public final XSS.cases_return cases() throws RecognitionException {
        XSS.cases_return retval = new XSS.cases_return();
        retval.start = input.LT(1);

        int cases_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        XSS.casestatement_return casestatement93 =null;

        XSS.defaultcase_return defaultcase94 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // XSS.g:684:5: ( ( casestatement )* ( defaultcase )? )
            // XSS.g:684:7: ( casestatement )* ( defaultcase )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // XSS.g:684:7: ( casestatement )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==CASE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // XSS.g:684:7: casestatement
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_casestatement_in_cases971);
            	    casestatement93=casestatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_0, casestatement93.getTree());


            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            // XSS.g:684:22: ( defaultcase )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DEFAULT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // XSS.g:684:22: defaultcase
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_defaultcase_in_cases974);
                    defaultcase94=defaultcase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, defaultcase94.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, cases_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "cases"


    public static class casestatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "casestatement"
    // XSS.g:687:1: casestatement : ^( CASE expression ( statement )* ) ;
    public final XSS.casestatement_return casestatement() throws RecognitionException {
        XSS.casestatement_return retval = new XSS.casestatement_return();
        retval.start = input.LT(1);

        int casestatement_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CASE95=null;
        XSS.expression_return expression96 =null;

        XSS.statement_return statement97 =null;


        CommonTree CASE95_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // XSS.g:688:5: ( ^( CASE expression ( statement )* ) )
            // XSS.g:688:7: ^( CASE expression ( statement )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            if ( state.backtracking==0 ) {
            	  Flags[17] = 1; /*case_flag = 1;*/
                  }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CASE95=(CommonTree)match(input,CASE,FOLLOW_CASE_in_casestatement1000); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE95_tree = (CommonTree)adaptor.dupNode(CASE95);


            root_1 = (CommonTree)adaptor.becomeRoot(CASE95_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_casestatement1002);
            expression96=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expression96.getTree());


            // XSS.g:691:24: ( statement )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // XSS.g:691:24: statement
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_statement_in_casestatement1004);
            	    statement97=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, statement97.getTree());


            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, casestatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "casestatement"


    public static class defaultcase_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defaultcase"
    // XSS.g:694:1: defaultcase : ^( DEFAULT ( statement )* ) ;
    public final XSS.defaultcase_return defaultcase() throws RecognitionException {
        XSS.defaultcase_return retval = new XSS.defaultcase_return();
        retval.start = input.LT(1);

        int defaultcase_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFAULT98=null;
        XSS.statement_return statement99 =null;


        CommonTree DEFAULT98_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // XSS.g:695:5: ( ^( DEFAULT ( statement )* ) )
            // XSS.g:695:7: ^( DEFAULT ( statement )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DEFAULT98=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultcase1025); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT98_tree = (CommonTree)adaptor.dupNode(DEFAULT98);


            root_1 = (CommonTree)adaptor.becomeRoot(DEFAULT98_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // XSS.g:695:17: ( statement )*
                loop29:
                do {
                    int alt29=2;
                    alt29 = dfa29.predict(input);
                    switch (alt29) {
                	case 1 :
                	    // XSS.g:695:17: statement
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_statement_in_defaultcase1027);
                	    statement99=statement();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, statement99.getTree());


                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop29;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, defaultcase_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "defaultcase"


    public static class functionDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionDefinition"
    // XSS.g:698:1: functionDefinition : ^( FUNCTION UnquotedString ^( Params ( paramDef )* ) ^( Block ( statement )* ) ) ;
    public final XSS.functionDefinition_return functionDefinition() throws RecognitionException {
        XSS.functionDefinition_return retval = new XSS.functionDefinition_return();
        retval.start = input.LT(1);

        int functionDefinition_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FUNCTION100=null;
        CommonTree UnquotedString101=null;
        CommonTree Params102=null;
        CommonTree Block104=null;
        XSS.paramDef_return paramDef103 =null;

        XSS.statement_return statement105 =null;


        CommonTree FUNCTION100_tree=null;
        CommonTree UnquotedString101_tree=null;
        CommonTree Params102_tree=null;
        CommonTree Block104_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // XSS.g:699:5: ( ^( FUNCTION UnquotedString ^( Params ( paramDef )* ) ^( Block ( statement )* ) ) )
            // XSS.g:699:7: ^( FUNCTION UnquotedString ^( Params ( paramDef )* ) ^( Block ( statement )* ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FUNCTION100=(CommonTree)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDefinition1048); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCTION100_tree = (CommonTree)adaptor.dupNode(FUNCTION100);


            root_1 = (CommonTree)adaptor.becomeRoot(FUNCTION100_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            UnquotedString101=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_functionDefinition1050); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString101_tree = (CommonTree)adaptor.dupNode(UnquotedString101);


            adaptor.addChild(root_1, UnquotedString101_tree);
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Params102=(CommonTree)match(input,Params,FOLLOW_Params_in_functionDefinition1053); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Params102_tree = (CommonTree)adaptor.dupNode(Params102);


            root_2 = (CommonTree)adaptor.becomeRoot(Params102_tree, root_2);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // XSS.g:699:42: ( paramDef )*
                loop30:
                do {
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==AMPERSAND||LA30_0==ArrayWord||LA30_0==DOLLAR||LA30_0==EQUALS||LA30_0==UnquotedString) ) {
                        alt30=1;
                    }


                    switch (alt30) {
                	case 1 :
                	    // XSS.g:699:42: paramDef
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_paramDef_in_functionDefinition1055);
                	    paramDef103=paramDef();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_2, paramDef103.getTree());


                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop30;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Block104=(CommonTree)match(input,Block,FOLLOW_Block_in_functionDefinition1060); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Block104_tree = (CommonTree)adaptor.dupNode(Block104);


            root_2 = (CommonTree)adaptor.becomeRoot(Block104_tree, root_2);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // XSS.g:699:61: ( statement )*
                loop31:
                do {
                    int alt31=2;
                    alt31 = dfa31.predict(input);
                    switch (alt31) {
                	case 1 :
                	    // XSS.g:699:61: statement
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_statement_in_functionDefinition1062);
                	    statement105=statement();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_2, statement105.getTree());


                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop31;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            	  try{	
            	   if (Flags[15] == 0){
            		currentMethod.setFunctionName((UnquotedString101!=null?UnquotedString101.getText():null));
            		currentMethod.setCodeLine((UnquotedString101!=null?UnquotedString101.getLine():0));
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

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, functionDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionDefinition"


    public static class paramDef_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramDef"
    // XSS.g:726:1: paramDef : ( ^( EQUALS ( UnquotedString | ArrayWord )? paramName atomOrReference ) | ( UnquotedString | ArrayWord )? paramName );
    public final XSS.paramDef_return paramDef() throws RecognitionException {
        XSS.paramDef_return retval = new XSS.paramDef_return();
        retval.start = input.LT(1);

        int paramDef_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUALS106=null;
        CommonTree set107=null;
        CommonTree set110=null;
        XSS.paramName_return paramName108 =null;

        XSS.atomOrReference_return atomOrReference109 =null;

        XSS.paramName_return paramName111 =null;


        CommonTree EQUALS106_tree=null;
        CommonTree set107_tree=null;
        CommonTree set110_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // XSS.g:727:5: ( ^( EQUALS ( UnquotedString | ArrayWord )? paramName atomOrReference ) | ( UnquotedString | ArrayWord )? paramName )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==EQUALS) ) {
                alt34=1;
            }
            else if ( (LA34_0==AMPERSAND||LA34_0==ArrayWord||LA34_0==DOLLAR||LA34_0==UnquotedString) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // XSS.g:727:7: ^( EQUALS ( UnquotedString | ArrayWord )? paramName atomOrReference )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    		Flags[7] = 1; /*defArgFunction_flag = 1;*/
                    	}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQUALS106=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_paramDef1096); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS106_tree = (CommonTree)adaptor.dupNode(EQUALS106);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQUALS106_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // XSS.g:730:11: ( UnquotedString | ArrayWord )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==ArrayWord||LA32_0==UnquotedString) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // XSS.g:
                            {
                            _last = (CommonTree)input.LT(1);
                            set107=(CommonTree)input.LT(1);

                            if ( input.LA(1)==ArrayWord||input.LA(1)==UnquotedString ) {
                                input.consume();
                                if ( state.backtracking==0 ) {
                                set107_tree = (CommonTree)adaptor.dupNode(set107);


                                adaptor.addChild(root_1, set107_tree);
                                }

                                state.errorRecovery=false;
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_paramName_in_paramDef1107);
                    paramName108=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, paramName108.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atomOrReference_in_paramDef1109);
                    atomOrReference109=atomOrReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, atomOrReference109.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    	  try{
                    	    if (Flags[15] == 0){
                    		ArgFunctionSymbol afs = (ArgFunctionSymbol)((currentMethod.getArgsFunction()).get((paramName108!=null?paramName108.nomeArg:null)));
                    		afs.setType("equal");
                    		afs.setEqual(texto);
                    	    }
                    		Flags[7] = 0; /*defArgFunction_flag = 0;*/
                    	  	} catch (Exception e){
                    			
                    		}
                    	}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:743:7: ( UnquotedString | ArrayWord )? paramName
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // XSS.g:743:7: ( UnquotedString | ArrayWord )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==ArrayWord||LA33_0==UnquotedString) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // XSS.g:
                            {
                            _last = (CommonTree)input.LT(1);
                            set110=(CommonTree)input.LT(1);

                            if ( input.LA(1)==ArrayWord||input.LA(1)==UnquotedString ) {
                                input.consume();
                                if ( state.backtracking==0 ) {
                                set110_tree = (CommonTree)adaptor.dupNode(set110);


                                adaptor.addChild(root_0, set110_tree);
                                }

                                state.errorRecovery=false;
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_paramName_in_paramDef1131);
                    paramName111=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, paramName111.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, paramDef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "paramDef"


    public static class paramName_return extends TreeRuleReturnScope {
        public String nomeArg;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramName"
    // XSS.g:746:1: paramName returns [String nomeArg] : ( ^( DOLLAR UnquotedString ) | ^( AMPERSAND ^( DOLLAR UnquotedString ) ) );
    public final XSS.paramName_return paramName() throws RecognitionException {
        XSS.paramName_return retval = new XSS.paramName_return();
        retval.start = input.LT(1);

        int paramName_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DOLLAR112=null;
        CommonTree UnquotedString113=null;
        CommonTree AMPERSAND114=null;
        CommonTree DOLLAR115=null;
        CommonTree UnquotedString116=null;

        CommonTree DOLLAR112_tree=null;
        CommonTree UnquotedString113_tree=null;
        CommonTree AMPERSAND114_tree=null;
        CommonTree DOLLAR115_tree=null;
        CommonTree UnquotedString116_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // XSS.g:747:5: ( ^( DOLLAR UnquotedString ) | ^( AMPERSAND ^( DOLLAR UnquotedString ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==DOLLAR) ) {
                alt35=1;
            }
            else if ( (LA35_0==AMPERSAND) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // XSS.g:747:7: ^( DOLLAR UnquotedString )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DOLLAR112=(CommonTree)match(input,DOLLAR,FOLLOW_DOLLAR_in_paramName1153); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOLLAR112_tree = (CommonTree)adaptor.dupNode(DOLLAR112);


                    root_1 = (CommonTree)adaptor.becomeRoot(DOLLAR112_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString113=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName1155); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString113_tree = (CommonTree)adaptor.dupNode(UnquotedString113);


                    adaptor.addChild(root_1, UnquotedString113_tree);
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    	  try{
                    	    if (Flags[15] == 0){
                    		retval.nomeArg = (UnquotedString113!=null?UnquotedString113.getText():null);
                    		ArgFunctionSymbol afs = new ArgFunctionSymbol((UnquotedString113!=null?UnquotedString113.getText():null), (UnquotedString113!=null?UnquotedString113.getLine():0), "var", null, posParmDefFunc);
                    		currentMethod.setArgFunction((UnquotedString113!=null?UnquotedString113.getText():null), afs);
                    		posParmDefFunc++;
                    	    }
                    		} catch (Exception e){
                    			
                    		}
                    	}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:760:7: ^( AMPERSAND ^( DOLLAR UnquotedString ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AMPERSAND114=(CommonTree)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_paramName1168); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AMPERSAND114_tree = (CommonTree)adaptor.dupNode(AMPERSAND114);


                    root_1 = (CommonTree)adaptor.becomeRoot(AMPERSAND114_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DOLLAR115=(CommonTree)match(input,DOLLAR,FOLLOW_DOLLAR_in_paramName1171); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOLLAR115_tree = (CommonTree)adaptor.dupNode(DOLLAR115);


                    root_2 = (CommonTree)adaptor.becomeRoot(DOLLAR115_tree, root_2);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString116=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName1173); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString116_tree = (CommonTree)adaptor.dupNode(UnquotedString116);


                    adaptor.addChild(root_2, UnquotedString116_tree);
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    	  try{
                    	    if (Flags[15] == 0){
                    		retval.nomeArg = (UnquotedString116!=null?UnquotedString116.getText():null);
                    		ArgFunctionSymbol afs = new ArgFunctionSymbol((UnquotedString116!=null?UnquotedString116.getText():null), (UnquotedString116!=null?UnquotedString116.getLine():0), "pointer", null, posParmDefFunc);
                    		currentMethod.setArgFunction((UnquotedString116!=null?UnquotedString116.getText():null), afs);
                    		posParmDefFunc++;
                    	    }
                    		} catch (Exception e){
                    			
                    		}
                    	}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, paramName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "paramName"


    public static class outputFunctions_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "outputFunctions"
    // XSS.g:775:1: outputFunctions : ( ^( ECHO ( expression )+ ) | ^( PRINT ( expression )+ ) | ^( PRINTF ( expression )+ ) | ^( DIE ( expression )+ ) | ^( ERROR ( expression )+ ) );
    public final XSS.outputFunctions_return outputFunctions() throws RecognitionException {
        XSS.outputFunctions_return retval = new XSS.outputFunctions_return();
        retval.start = input.LT(1);

        int outputFunctions_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ECHO117=null;
        CommonTree PRINT119=null;
        CommonTree PRINTF121=null;
        CommonTree DIE123=null;
        CommonTree ERROR125=null;
        XSS.expression_return expression118 =null;

        XSS.expression_return expression120 =null;

        XSS.expression_return expression122 =null;

        XSS.expression_return expression124 =null;

        XSS.expression_return expression126 =null;


        CommonTree ECHO117_tree=null;
        CommonTree PRINT119_tree=null;
        CommonTree PRINTF121_tree=null;
        CommonTree DIE123_tree=null;
        CommonTree ERROR125_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // XSS.g:797:5: ( ^( ECHO ( expression )+ ) | ^( PRINT ( expression )+ ) | ^( PRINTF ( expression )+ ) | ^( DIE ( expression )+ ) | ^( ERROR ( expression )+ ) )
            int alt41=5;
            switch ( input.LA(1) ) {
            case ECHO:
                {
                alt41=1;
                }
                break;
            case PRINT:
                {
                alt41=2;
                }
                break;
            case PRINTF:
                {
                alt41=3;
                }
                break;
            case DIE:
                {
                alt41=4;
                }
                break;
            case ERROR:
                {
                alt41=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // XSS.g:798:3: ^( ECHO ( expression )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    	   try{
                    		CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
                    		currentScope.define(ms, ms, false);	
                    		currentScope = ms;
                    		} catch (Exception e){
                    			
                    		}
                    	 }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ECHO117=(CommonTree)match(input,ECHO,FOLLOW_ECHO_in_outputFunctions1217); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ECHO117_tree = (CommonTree)adaptor.dupNode(ECHO117);


                    root_1 = (CommonTree)adaptor.becomeRoot(ECHO117_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // XSS.g:807:13: ( expression )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==AMPERSAND||LA36_0==ASTERISK||(LA36_0 >= Apply && LA36_0 <= Array)||(LA36_0 >= AssignmentOperator && LA36_0 <= BANG)||LA36_0==Boolean||(LA36_0 >= CLASS_MEMBER && LA36_0 <= CLONE)||(LA36_0 >= Cast && LA36_0 <= ConcatAssigmentOperator)||LA36_0==DIE||(LA36_0 >= DOLLAR && LA36_0 <= DOT)||(LA36_0 >= DoubleQuotedString && LA36_0 <= ECHO)||(LA36_0 >= EQUALS && LA36_0 <= EqualityOperator)||LA36_0==FORWARD_SLASH||LA36_0==HereDoc||(LA36_0 >= INSTANCE_MEMBER && LA36_0 <= IfExpression)||(LA36_0 >= Integer && LA36_0 <= List)||LA36_0==MINUS||LA36_0==NEW||LA36_0==OPEN_SQUARE_BRACE||(LA36_0 >= PERCENT && LA36_0 <= PRINTF)||(LA36_0 >= Postfix && LA36_0 <= Prefix)||LA36_0==Real||LA36_0==SUPPRESS_WARNINGS||(LA36_0 >= ShiftOperator && LA36_0 <= SingleQuotedString)||LA36_0==TILDE||LA36_0==UnquotedString||(LA36_0 >= 114 && LA36_0 <= 117)||(LA36_0 >= 120 && LA36_0 <= 121)||(LA36_0 >= 123 && LA36_0 <= ERROR)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // XSS.g:807:13: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_outputFunctions1219);
                    	    expression118=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression118.getTree());


                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { try{ currentScope.getScopeSymbol().setName("echo"); } catch (Exception e){}}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:811:3: ^( PRINT ( expression )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    	   try{
                    		CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
                    		currentScope.define(ms, ms, false);	
                    		currentScope = ms;
                    		} catch (Exception e){
                    			
                    		}
                    	 }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PRINT119=(CommonTree)match(input,PRINT,FOLLOW_PRINT_in_outputFunctions1258); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRINT119_tree = (CommonTree)adaptor.dupNode(PRINT119);


                    root_1 = (CommonTree)adaptor.becomeRoot(PRINT119_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // XSS.g:820:14: ( expression )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==AMPERSAND||LA37_0==ASTERISK||(LA37_0 >= Apply && LA37_0 <= Array)||(LA37_0 >= AssignmentOperator && LA37_0 <= BANG)||LA37_0==Boolean||(LA37_0 >= CLASS_MEMBER && LA37_0 <= CLONE)||(LA37_0 >= Cast && LA37_0 <= ConcatAssigmentOperator)||LA37_0==DIE||(LA37_0 >= DOLLAR && LA37_0 <= DOT)||(LA37_0 >= DoubleQuotedString && LA37_0 <= ECHO)||(LA37_0 >= EQUALS && LA37_0 <= EqualityOperator)||LA37_0==FORWARD_SLASH||LA37_0==HereDoc||(LA37_0 >= INSTANCE_MEMBER && LA37_0 <= IfExpression)||(LA37_0 >= Integer && LA37_0 <= List)||LA37_0==MINUS||LA37_0==NEW||LA37_0==OPEN_SQUARE_BRACE||(LA37_0 >= PERCENT && LA37_0 <= PRINTF)||(LA37_0 >= Postfix && LA37_0 <= Prefix)||LA37_0==Real||LA37_0==SUPPRESS_WARNINGS||(LA37_0 >= ShiftOperator && LA37_0 <= SingleQuotedString)||LA37_0==TILDE||LA37_0==UnquotedString||(LA37_0 >= 114 && LA37_0 <= 117)||(LA37_0 >= 120 && LA37_0 <= 121)||(LA37_0 >= 123 && LA37_0 <= ERROR)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // XSS.g:820:14: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_outputFunctions1260);
                    	    expression120=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression120.getTree());


                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { try{ currentScope.getScopeSymbol().setName("print"); } catch (Exception e){}}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // XSS.g:824:3: ^( PRINTF ( expression )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    	   try{
                    		CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
                    		currentScope.define(ms, ms, false);
                    		currentScope = ms;
                    		} catch (Exception e){
                    			
                    		}
                    	 }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PRINTF121=(CommonTree)match(input,PRINTF,FOLLOW_PRINTF_in_outputFunctions1294); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRINTF121_tree = (CommonTree)adaptor.dupNode(PRINTF121);


                    root_1 = (CommonTree)adaptor.becomeRoot(PRINTF121_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // XSS.g:833:16: ( expression )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==AMPERSAND||LA38_0==ASTERISK||(LA38_0 >= Apply && LA38_0 <= Array)||(LA38_0 >= AssignmentOperator && LA38_0 <= BANG)||LA38_0==Boolean||(LA38_0 >= CLASS_MEMBER && LA38_0 <= CLONE)||(LA38_0 >= Cast && LA38_0 <= ConcatAssigmentOperator)||LA38_0==DIE||(LA38_0 >= DOLLAR && LA38_0 <= DOT)||(LA38_0 >= DoubleQuotedString && LA38_0 <= ECHO)||(LA38_0 >= EQUALS && LA38_0 <= EqualityOperator)||LA38_0==FORWARD_SLASH||LA38_0==HereDoc||(LA38_0 >= INSTANCE_MEMBER && LA38_0 <= IfExpression)||(LA38_0 >= Integer && LA38_0 <= List)||LA38_0==MINUS||LA38_0==NEW||LA38_0==OPEN_SQUARE_BRACE||(LA38_0 >= PERCENT && LA38_0 <= PRINTF)||(LA38_0 >= Postfix && LA38_0 <= Prefix)||LA38_0==Real||LA38_0==SUPPRESS_WARNINGS||(LA38_0 >= ShiftOperator && LA38_0 <= SingleQuotedString)||LA38_0==TILDE||LA38_0==UnquotedString||(LA38_0 >= 114 && LA38_0 <= 117)||(LA38_0 >= 120 && LA38_0 <= 121)||(LA38_0 >= 123 && LA38_0 <= ERROR)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // XSS.g:833:16: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_outputFunctions1296);
                    	    expression122=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression122.getTree());


                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { try{ currentScope.getScopeSymbol().setName("printf"); } catch (Exception e){}}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // XSS.g:837:3: ^( DIE ( expression )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    	   try{
                    		CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
                    		currentScope.define(ms, ms, false);
                    		currentScope = ms;
                    		} catch (Exception e){
                    			
                    		}
                    	}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DIE123=(CommonTree)match(input,DIE,FOLLOW_DIE_in_outputFunctions1330); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DIE123_tree = (CommonTree)adaptor.dupNode(DIE123);


                    root_1 = (CommonTree)adaptor.becomeRoot(DIE123_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // XSS.g:846:12: ( expression )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==AMPERSAND||LA39_0==ASTERISK||(LA39_0 >= Apply && LA39_0 <= Array)||(LA39_0 >= AssignmentOperator && LA39_0 <= BANG)||LA39_0==Boolean||(LA39_0 >= CLASS_MEMBER && LA39_0 <= CLONE)||(LA39_0 >= Cast && LA39_0 <= ConcatAssigmentOperator)||LA39_0==DIE||(LA39_0 >= DOLLAR && LA39_0 <= DOT)||(LA39_0 >= DoubleQuotedString && LA39_0 <= ECHO)||(LA39_0 >= EQUALS && LA39_0 <= EqualityOperator)||LA39_0==FORWARD_SLASH||LA39_0==HereDoc||(LA39_0 >= INSTANCE_MEMBER && LA39_0 <= IfExpression)||(LA39_0 >= Integer && LA39_0 <= List)||LA39_0==MINUS||LA39_0==NEW||LA39_0==OPEN_SQUARE_BRACE||(LA39_0 >= PERCENT && LA39_0 <= PRINTF)||(LA39_0 >= Postfix && LA39_0 <= Prefix)||LA39_0==Real||LA39_0==SUPPRESS_WARNINGS||(LA39_0 >= ShiftOperator && LA39_0 <= SingleQuotedString)||LA39_0==TILDE||LA39_0==UnquotedString||(LA39_0 >= 114 && LA39_0 <= 117)||(LA39_0 >= 120 && LA39_0 <= 121)||(LA39_0 >= 123 && LA39_0 <= ERROR)) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // XSS.g:846:12: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_outputFunctions1332);
                    	    expression124=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression124.getTree());


                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { try{ currentScope.getScopeSymbol().setName("die"); } catch (Exception e){}}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // XSS.g:850:2: ^( ERROR ( expression )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    	   try{
                    		CallSymbol ms = new CallSymbol("echo", -1, currentScope, 0, currentFile);
                    		currentScope.define(ms, ms, false);	
                    		currentScope = ms;
                    		} catch (Exception e){
                    			
                    		}
                    	}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ERROR125=(CommonTree)match(input,ERROR,FOLLOW_ERROR_in_outputFunctions1364); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ERROR125_tree = (CommonTree)adaptor.dupNode(ERROR125);


                    root_1 = (CommonTree)adaptor.becomeRoot(ERROR125_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // XSS.g:859:14: ( expression )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==AMPERSAND||LA40_0==ASTERISK||(LA40_0 >= Apply && LA40_0 <= Array)||(LA40_0 >= AssignmentOperator && LA40_0 <= BANG)||LA40_0==Boolean||(LA40_0 >= CLASS_MEMBER && LA40_0 <= CLONE)||(LA40_0 >= Cast && LA40_0 <= ConcatAssigmentOperator)||LA40_0==DIE||(LA40_0 >= DOLLAR && LA40_0 <= DOT)||(LA40_0 >= DoubleQuotedString && LA40_0 <= ECHO)||(LA40_0 >= EQUALS && LA40_0 <= EqualityOperator)||LA40_0==FORWARD_SLASH||LA40_0==HereDoc||(LA40_0 >= INSTANCE_MEMBER && LA40_0 <= IfExpression)||(LA40_0 >= Integer && LA40_0 <= List)||LA40_0==MINUS||LA40_0==NEW||LA40_0==OPEN_SQUARE_BRACE||(LA40_0 >= PERCENT && LA40_0 <= PRINTF)||(LA40_0 >= Postfix && LA40_0 <= Prefix)||LA40_0==Real||LA40_0==SUPPRESS_WARNINGS||(LA40_0 >= ShiftOperator && LA40_0 <= SingleQuotedString)||LA40_0==TILDE||LA40_0==UnquotedString||(LA40_0 >= 114 && LA40_0 <= 117)||(LA40_0 >= 120 && LA40_0 <= 121)||(LA40_0 >= 123 && LA40_0 <= ERROR)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // XSS.g:859:14: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_outputFunctions1366);
                    	    expression126=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression126.getTree());


                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) { try{ currentScope.getScopeSymbol().setName("error"); } catch (Exception e){}}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

            if ( state.backtracking==0 ) {
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
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, outputFunctions_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "outputFunctions"


    public static class expression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // XSS.g:864:1: expression : ( ^( 'or' expression expression ) | ^( 'OR' expression expression ) | ^( 'xor' expression expression ) | ^( 'XOR' expression expression ) | ^( 'and' expression expression ) | ^( 'AND' expression expression ) | ^( EQUALS expression simpleRequire ) | ^( EQUALS expression expression ) | ^( ConcatAssigmentOperator expression expression ) | ^( AssignmentOperator expression expression ) | ^( IfExpression expression expression expression ) | ^( LOGICAL_OR expression expression ) | ^( LOGICAL_AND expression expression ) | ^( PIPE expression expression ) | ^( AMPERSAND expression expression ) | ^( EqualityOperator expression expression ) | ^( ComparisionOperator expression expression ) | ^( ShiftOperator expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( DOT expression expression ) | ^( ASTERISK expression expression ) | ^( FORWARD_SLASH expression expression ) | ^( PERCENT expression expression ) | ^( BANG expression ) | ^( INSTANCE_OF expression expression ) | ^( TILDE expression ) | ^( MINUS expression ) | ^( SUPPRESS_WARNINGS expression ) | ^( Cast UnquotedString expression ) | ^( Prefix IncrementOperator name ) | ^( Postfix IncrementOperator name ) | ^( NEW nameOrFunctionCall ) | ^( CLONE name ) | atomOrReference | outputFunctions );
    public final XSS.expression_return expression() throws RecognitionException {
        XSS.expression_return retval = new XSS.expression_return();
        retval.start = input.LT(1);

        int expression_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal127=null;
        CommonTree string_literal130=null;
        CommonTree string_literal133=null;
        CommonTree string_literal136=null;
        CommonTree string_literal139=null;
        CommonTree string_literal142=null;
        CommonTree EQUALS145=null;
        CommonTree EQUALS148=null;
        CommonTree ConcatAssigmentOperator151=null;
        CommonTree AssignmentOperator154=null;
        CommonTree IfExpression157=null;
        CommonTree LOGICAL_OR161=null;
        CommonTree LOGICAL_AND164=null;
        CommonTree PIPE167=null;
        CommonTree AMPERSAND170=null;
        CommonTree EqualityOperator173=null;
        CommonTree ComparisionOperator176=null;
        CommonTree ShiftOperator179=null;
        CommonTree PLUS182=null;
        CommonTree MINUS185=null;
        CommonTree DOT188=null;
        CommonTree ASTERISK191=null;
        CommonTree FORWARD_SLASH194=null;
        CommonTree PERCENT197=null;
        CommonTree BANG200=null;
        CommonTree INSTANCE_OF202=null;
        CommonTree TILDE205=null;
        CommonTree MINUS207=null;
        CommonTree SUPPRESS_WARNINGS209=null;
        CommonTree Cast211=null;
        CommonTree UnquotedString212=null;
        CommonTree Prefix214=null;
        CommonTree IncrementOperator215=null;
        CommonTree Postfix217=null;
        CommonTree IncrementOperator218=null;
        CommonTree NEW220=null;
        CommonTree CLONE222=null;
        XSS.expression_return expression128 =null;

        XSS.expression_return expression129 =null;

        XSS.expression_return expression131 =null;

        XSS.expression_return expression132 =null;

        XSS.expression_return expression134 =null;

        XSS.expression_return expression135 =null;

        XSS.expression_return expression137 =null;

        XSS.expression_return expression138 =null;

        XSS.expression_return expression140 =null;

        XSS.expression_return expression141 =null;

        XSS.expression_return expression143 =null;

        XSS.expression_return expression144 =null;

        XSS.expression_return expression146 =null;

        XSS.simpleRequire_return simpleRequire147 =null;

        XSS.expression_return expression149 =null;

        XSS.expression_return expression150 =null;

        XSS.expression_return expression152 =null;

        XSS.expression_return expression153 =null;

        XSS.expression_return expression155 =null;

        XSS.expression_return expression156 =null;

        XSS.expression_return expression158 =null;

        XSS.expression_return expression159 =null;

        XSS.expression_return expression160 =null;

        XSS.expression_return expression162 =null;

        XSS.expression_return expression163 =null;

        XSS.expression_return expression165 =null;

        XSS.expression_return expression166 =null;

        XSS.expression_return expression168 =null;

        XSS.expression_return expression169 =null;

        XSS.expression_return expression171 =null;

        XSS.expression_return expression172 =null;

        XSS.expression_return expression174 =null;

        XSS.expression_return expression175 =null;

        XSS.expression_return expression177 =null;

        XSS.expression_return expression178 =null;

        XSS.expression_return expression180 =null;

        XSS.expression_return expression181 =null;

        XSS.expression_return expression183 =null;

        XSS.expression_return expression184 =null;

        XSS.expression_return expression186 =null;

        XSS.expression_return expression187 =null;

        XSS.expression_return expression189 =null;

        XSS.expression_return expression190 =null;

        XSS.expression_return expression192 =null;

        XSS.expression_return expression193 =null;

        XSS.expression_return expression195 =null;

        XSS.expression_return expression196 =null;

        XSS.expression_return expression198 =null;

        XSS.expression_return expression199 =null;

        XSS.expression_return expression201 =null;

        XSS.expression_return expression203 =null;

        XSS.expression_return expression204 =null;

        XSS.expression_return expression206 =null;

        XSS.expression_return expression208 =null;

        XSS.expression_return expression210 =null;

        XSS.expression_return expression213 =null;

        XSS.name_return name216 =null;

        XSS.name_return name219 =null;

        XSS.nameOrFunctionCall_return nameOrFunctionCall221 =null;

        XSS.name_return name223 =null;

        XSS.atomOrReference_return atomOrReference224 =null;

        XSS.outputFunctions_return outputFunctions225 =null;


        CommonTree string_literal127_tree=null;
        CommonTree string_literal130_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree string_literal136_tree=null;
        CommonTree string_literal139_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree EQUALS145_tree=null;
        CommonTree EQUALS148_tree=null;
        CommonTree ConcatAssigmentOperator151_tree=null;
        CommonTree AssignmentOperator154_tree=null;
        CommonTree IfExpression157_tree=null;
        CommonTree LOGICAL_OR161_tree=null;
        CommonTree LOGICAL_AND164_tree=null;
        CommonTree PIPE167_tree=null;
        CommonTree AMPERSAND170_tree=null;
        CommonTree EqualityOperator173_tree=null;
        CommonTree ComparisionOperator176_tree=null;
        CommonTree ShiftOperator179_tree=null;
        CommonTree PLUS182_tree=null;
        CommonTree MINUS185_tree=null;
        CommonTree DOT188_tree=null;
        CommonTree ASTERISK191_tree=null;
        CommonTree FORWARD_SLASH194_tree=null;
        CommonTree PERCENT197_tree=null;
        CommonTree BANG200_tree=null;
        CommonTree INSTANCE_OF202_tree=null;
        CommonTree TILDE205_tree=null;
        CommonTree MINUS207_tree=null;
        CommonTree SUPPRESS_WARNINGS209_tree=null;
        CommonTree Cast211_tree=null;
        CommonTree UnquotedString212_tree=null;
        CommonTree Prefix214_tree=null;
        CommonTree IncrementOperator215_tree=null;
        CommonTree Postfix217_tree=null;
        CommonTree IncrementOperator218_tree=null;
        CommonTree NEW220_tree=null;
        CommonTree CLONE222_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // XSS.g:865:5: ( ^( 'or' expression expression ) | ^( 'OR' expression expression ) | ^( 'xor' expression expression ) | ^( 'XOR' expression expression ) | ^( 'and' expression expression ) | ^( 'AND' expression expression ) | ^( EQUALS expression simpleRequire ) | ^( EQUALS expression expression ) | ^( ConcatAssigmentOperator expression expression ) | ^( AssignmentOperator expression expression ) | ^( IfExpression expression expression expression ) | ^( LOGICAL_OR expression expression ) | ^( LOGICAL_AND expression expression ) | ^( PIPE expression expression ) | ^( AMPERSAND expression expression ) | ^( EqualityOperator expression expression ) | ^( ComparisionOperator expression expression ) | ^( ShiftOperator expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( DOT expression expression ) | ^( ASTERISK expression expression ) | ^( FORWARD_SLASH expression expression ) | ^( PERCENT expression expression ) | ^( BANG expression ) | ^( INSTANCE_OF expression expression ) | ^( TILDE expression ) | ^( MINUS expression ) | ^( SUPPRESS_WARNINGS expression ) | ^( Cast UnquotedString expression ) | ^( Prefix IncrementOperator name ) | ^( Postfix IncrementOperator name ) | ^( NEW nameOrFunctionCall ) | ^( CLONE name ) | atomOrReference | outputFunctions )
            int alt42=36;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // XSS.g:865:7: ^( 'or' expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal127=(CommonTree)match(input,121,FOLLOW_121_in_expression1401); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal127_tree = (CommonTree)adaptor.dupNode(string_literal127);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal127_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1403);
                    expression128=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression128.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1405);
                    expression129=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression129.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:879:7: ^( 'OR' expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal130=(CommonTree)match(input,115,FOLLOW_115_in_expression1422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal130_tree = (CommonTree)adaptor.dupNode(string_literal130);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal130_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1424);
                    expression131=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression131.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1426);
                    expression132=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression132.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // XSS.g:893:7: ^( 'xor' expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal133=(CommonTree)match(input,123,FOLLOW_123_in_expression1444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal133_tree = (CommonTree)adaptor.dupNode(string_literal133);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal133_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1446);
                    expression134=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression134.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1448);
                    expression135=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression135.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // XSS.g:907:7: ^( 'XOR' expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal136=(CommonTree)match(input,116,FOLLOW_116_in_expression1465); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal136_tree = (CommonTree)adaptor.dupNode(string_literal136);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal136_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1467);
                    expression137=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression137.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1469);
                    expression138=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression138.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // XSS.g:921:7: ^( 'and' expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal139=(CommonTree)match(input,117,FOLLOW_117_in_expression1489); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal139_tree = (CommonTree)adaptor.dupNode(string_literal139);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal139_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1491);
                    expression140=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression140.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1493);
                    expression141=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression141.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // XSS.g:935:7: ^( 'AND' expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal142=(CommonTree)match(input,114,FOLLOW_114_in_expression1510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal142_tree = (CommonTree)adaptor.dupNode(string_literal142);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal142_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1512);
                    expression143=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression143.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1514);
                    expression144=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression144.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // XSS.g:949:7: ^( EQUALS expression simpleRequire )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQUALS145=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_expression1533); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS145_tree = (CommonTree)adaptor.dupNode(EQUALS145);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQUALS145_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1535);
                    expression146=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression146.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_simpleRequire_in_expression1537);
                    simpleRequire147=simpleRequire();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, simpleRequire147.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // XSS.g:976:7: ^( EQUALS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[0] = 1; /*assign_flag = 1;*/}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQUALS148=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_expression1557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS148_tree = (CommonTree)adaptor.dupNode(EQUALS148);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQUALS148_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1559);
                    expression149=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression149.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1561);
                    expression150=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression150.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // XSS.g:1037:7: ^( ConcatAssigmentOperator expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[0] = 1; /*assign_flag = 1;*/}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ConcatAssigmentOperator151=(CommonTree)match(input,ConcatAssigmentOperator,FOLLOW_ConcatAssigmentOperator_in_expression1590); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ConcatAssigmentOperator151_tree = (CommonTree)adaptor.dupNode(ConcatAssigmentOperator151);


                    root_1 = (CommonTree)adaptor.becomeRoot(ConcatAssigmentOperator151_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1592);
                    expression152=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression152.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1594);
                    expression153=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression153.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // XSS.g:1061:7: ^( AssignmentOperator expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AssignmentOperator154=(CommonTree)match(input,AssignmentOperator,FOLLOW_AssignmentOperator_in_expression1608); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AssignmentOperator154_tree = (CommonTree)adaptor.dupNode(AssignmentOperator154);


                    root_1 = (CommonTree)adaptor.becomeRoot(AssignmentOperator154_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1610);
                    expression155=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression155.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1612);
                    expression156=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression156.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {Flags[15] = 0;}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // XSS.g:1062:7: ^( IfExpression expression expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    		try{
                        	  Flags[14] = 1; /*if_presence_flag=1 */
                        	  indexIf++;
                        	  numElemIfBegin.add(currentScope.getMembers().size()); 
                    		} catch (Exception e){
                    			
                    		}   	  
                          }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    IfExpression157=(CommonTree)match(input,IfExpression,FOLLOW_IfExpression_in_expression1641); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IfExpression157_tree = (CommonTree)adaptor.dupNode(IfExpression157);


                    root_1 = (CommonTree)adaptor.becomeRoot(IfExpression157_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1643);
                    expression158=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression158.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1645);
                    expression159=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression159.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1647);
                    expression160=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression160.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    		try{
                             Flags[14] = 0;
                             numElemIfBegin.remove(indexIf-1);
                             indexIf--;
                    		} catch (Exception e){
                    			
                    		}         
                          }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // XSS.g:1081:7: ^( LOGICAL_OR expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LOGICAL_OR161=(CommonTree)match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expression1666); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOGICAL_OR161_tree = (CommonTree)adaptor.dupNode(LOGICAL_OR161);


                    root_1 = (CommonTree)adaptor.becomeRoot(LOGICAL_OR161_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1668);
                    expression162=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression162.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1670);
                    expression163=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression163.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 13 :
                    // XSS.g:1095:7: ^( LOGICAL_AND expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LOGICAL_AND164=(CommonTree)match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expression1691); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOGICAL_AND164_tree = (CommonTree)adaptor.dupNode(LOGICAL_AND164);


                    root_1 = (CommonTree)adaptor.becomeRoot(LOGICAL_AND164_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1693);
                    expression165=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression165.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1695);
                    expression166=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression166.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 14 :
                    // XSS.g:1109:7: ^( PIPE expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[15] = 0;}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PIPE167=(CommonTree)match(input,PIPE,FOLLOW_PIPE_in_expression1718); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PIPE167_tree = (CommonTree)adaptor.dupNode(PIPE167);


                    root_1 = (CommonTree)adaptor.becomeRoot(PIPE167_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1720);
                    expression168=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression168.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1722);
                    expression169=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression169.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 15 :
                    // XSS.g:1131:7: ^( AMPERSAND expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[15] = 1;}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AMPERSAND170=(CommonTree)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_expression1746); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AMPERSAND170_tree = (CommonTree)adaptor.dupNode(AMPERSAND170);


                    root_1 = (CommonTree)adaptor.becomeRoot(AMPERSAND170_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1748);
                    expression171=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression171.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1750);
                    expression172=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression172.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 16 :
                    // XSS.g:1145:7: ^( EqualityOperator expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EqualityOperator173=(CommonTree)match(input,EqualityOperator,FOLLOW_EqualityOperator_in_expression1772); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EqualityOperator173_tree = (CommonTree)adaptor.dupNode(EqualityOperator173);


                    root_1 = (CommonTree)adaptor.becomeRoot(EqualityOperator173_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1774);
                    expression174=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression174.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1776);
                    expression175=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression175.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 17 :
                    // XSS.g:1159:7: ^( ComparisionOperator expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ComparisionOperator176=(CommonTree)match(input,ComparisionOperator,FOLLOW_ComparisionOperator_in_expression1796); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ComparisionOperator176_tree = (CommonTree)adaptor.dupNode(ComparisionOperator176);


                    root_1 = (CommonTree)adaptor.becomeRoot(ComparisionOperator176_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1798);
                    expression177=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression177.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1800);
                    expression178=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression178.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 18 :
                    // XSS.g:1173:7: ^( ShiftOperator expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[15] = 1;}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ShiftOperator179=(CommonTree)match(input,ShiftOperator,FOLLOW_ShiftOperator_in_expression1823); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ShiftOperator179_tree = (CommonTree)adaptor.dupNode(ShiftOperator179);


                    root_1 = (CommonTree)adaptor.becomeRoot(ShiftOperator179_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1825);
                    expression180=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression180.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1827);
                    expression181=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression181.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {Flags[15] = 0;}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 19 :
                    // XSS.g:1174:7: ^( PLUS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PLUS182=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression1839); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS182_tree = (CommonTree)adaptor.dupNode(PLUS182);


                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS182_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1841);
                    expression183=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression183.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1843);
                    expression184=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression184.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 20 :
                    // XSS.g:1175:7: ^( MINUS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS185=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression1853); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS185_tree = (CommonTree)adaptor.dupNode(MINUS185);


                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS185_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1855);
                    expression186=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression186.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1857);
                    expression187=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression187.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 21 :
                    // XSS.g:1176:7: ^( DOT expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
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

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DOT188=(CommonTree)match(input,DOT,FOLLOW_DOT_in_expression1871); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT188_tree = (CommonTree)adaptor.dupNode(DOT188);


                    root_1 = (CommonTree)adaptor.becomeRoot(DOT188_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1873);
                    expression189=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression189.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1875);
                    expression190=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression190.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 22 :
                    // XSS.g:1210:7: ^( ASTERISK expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ASTERISK191=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_expression1889); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASTERISK191_tree = (CommonTree)adaptor.dupNode(ASTERISK191);


                    root_1 = (CommonTree)adaptor.becomeRoot(ASTERISK191_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1891);
                    expression192=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression192.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1893);
                    expression193=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression193.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 23 :
                    // XSS.g:1211:7: ^( FORWARD_SLASH expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    FORWARD_SLASH194=(CommonTree)match(input,FORWARD_SLASH,FOLLOW_FORWARD_SLASH_in_expression1903); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FORWARD_SLASH194_tree = (CommonTree)adaptor.dupNode(FORWARD_SLASH194);


                    root_1 = (CommonTree)adaptor.becomeRoot(FORWARD_SLASH194_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1905);
                    expression195=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression195.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1907);
                    expression196=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression196.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 24 :
                    // XSS.g:1212:7: ^( PERCENT expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PERCENT197=(CommonTree)match(input,PERCENT,FOLLOW_PERCENT_in_expression1917); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PERCENT197_tree = (CommonTree)adaptor.dupNode(PERCENT197);


                    root_1 = (CommonTree)adaptor.becomeRoot(PERCENT197_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1919);
                    expression198=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression198.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1921);
                    expression199=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression199.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 25 :
                    // XSS.g:1213:7: ^( BANG expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BANG200=(CommonTree)match(input,BANG,FOLLOW_BANG_in_expression1931); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG200_tree = (CommonTree)adaptor.dupNode(BANG200);


                    root_1 = (CommonTree)adaptor.becomeRoot(BANG200_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1933);
                    expression201=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression201.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 26 :
                    // XSS.g:1227:7: ^( INSTANCE_OF expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    INSTANCE_OF202=(CommonTree)match(input,INSTANCE_OF,FOLLOW_INSTANCE_OF_in_expression1959); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCE_OF202_tree = (CommonTree)adaptor.dupNode(INSTANCE_OF202);


                    root_1 = (CommonTree)adaptor.becomeRoot(INSTANCE_OF202_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1961);
                    expression203=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression203.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1963);
                    expression204=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression204.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 27 :
                    // XSS.g:1228:7: ^( TILDE expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[15] = 1;}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    TILDE205=(CommonTree)match(input,TILDE,FOLLOW_TILDE_in_expression1975); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TILDE205_tree = (CommonTree)adaptor.dupNode(TILDE205);


                    root_1 = (CommonTree)adaptor.becomeRoot(TILDE205_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1977);
                    expression206=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression206.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 28 :
                    // XSS.g:1242:7: ^( MINUS expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[15] = 1;}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS207=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression2002); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS207_tree = (CommonTree)adaptor.dupNode(MINUS207);


                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS207_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2004);
                    expression208=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression208.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {Flags[15] = 0;}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 29 :
                    // XSS.g:1243:7: ^( SUPPRESS_WARNINGS expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUPPRESS_WARNINGS209=(CommonTree)match(input,SUPPRESS_WARNINGS,FOLLOW_SUPPRESS_WARNINGS_in_expression2016); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUPPRESS_WARNINGS209_tree = (CommonTree)adaptor.dupNode(SUPPRESS_WARNINGS209);


                    root_1 = (CommonTree)adaptor.becomeRoot(SUPPRESS_WARNINGS209_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2018);
                    expression210=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression210.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 30 :
                    // XSS.g:1244:7: ^( Cast UnquotedString expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Cast211=(CommonTree)match(input,Cast,FOLLOW_Cast_in_expression2028); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Cast211_tree = (CommonTree)adaptor.dupNode(Cast211);


                    root_1 = (CommonTree)adaptor.becomeRoot(Cast211_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString212=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_expression2030); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString212_tree = (CommonTree)adaptor.dupNode(UnquotedString212);


                    adaptor.addChild(root_1, UnquotedString212_tree);
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2032);
                    expression213=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression213.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 31 :
                    // XSS.g:1245:7: ^( Prefix IncrementOperator name )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[15] = 1;}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Prefix214=(CommonTree)match(input,Prefix,FOLLOW_Prefix_in_expression2048); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Prefix214_tree = (CommonTree)adaptor.dupNode(Prefix214);


                    root_1 = (CommonTree)adaptor.becomeRoot(Prefix214_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    IncrementOperator215=(CommonTree)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_expression2050); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IncrementOperator215_tree = (CommonTree)adaptor.dupNode(IncrementOperator215);


                    adaptor.addChild(root_1, IncrementOperator215_tree);
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_name_in_expression2052);
                    name216=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, name216.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {Flags[15] = 0;}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 32 :
                    // XSS.g:1246:7: ^( Postfix IncrementOperator name )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[15] = 1;}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Postfix217=(CommonTree)match(input,Postfix,FOLLOW_Postfix_in_expression2066); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Postfix217_tree = (CommonTree)adaptor.dupNode(Postfix217);


                    root_1 = (CommonTree)adaptor.becomeRoot(Postfix217_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    IncrementOperator218=(CommonTree)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_expression2068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IncrementOperator218_tree = (CommonTree)adaptor.dupNode(IncrementOperator218);


                    adaptor.addChild(root_1, IncrementOperator218_tree);
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_name_in_expression2070);
                    name219=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, name219.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {Flags[15] = 0;}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 33 :
                    // XSS.g:1247:7: ^( NEW nameOrFunctionCall )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[20] = 1; /* createObject_class = 1 */}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NEW220=(CommonTree)match(input,NEW,FOLLOW_NEW_in_expression2084); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW220_tree = (CommonTree)adaptor.dupNode(NEW220);


                    root_1 = (CommonTree)adaptor.becomeRoot(NEW220_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nameOrFunctionCall_in_expression2086);
                    nameOrFunctionCall221=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, nameOrFunctionCall221.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    		try{
                    		
                    		if (Flags[21] == 2){ //call_MethodClass_flag = 2, se construtor encontrado	
                    			Flags[21] = 0; //call_UserFunction_flag = 0;
                    		}
                    		Flags[20] = 1;
                    		} catch (Exception e){}
                          }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 34 :
                    // XSS.g:1257:7: ^( CLONE name )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[22] = 1; /* createClone_flag = 1 */}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CLONE222=(CommonTree)match(input,CLONE,FOLLOW_CLONE_in_expression2106); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLONE222_tree = (CommonTree)adaptor.dupNode(CLONE222);


                    root_1 = (CommonTree)adaptor.becomeRoot(CLONE222_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_name_in_expression2108);
                    name223=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, name223.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    		  try{
                        	  	if (Flags[18] == 0 && Flags[6] == 0){ //defMethodClass_flag = 1
                        	  		Symbol sy_ali = currentScope.getScopeSymbol();
                        	  		Symbol sy_obj = (Symbol) currentScope.getMembers().get(0);
                        	  		currentSymbolTable.getAliases().put(sy_ali.getName(), sy_obj); 
                        	  	}
                    		} catch (Exception e){
                    			
                    		}
                        	  }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 35 :
                    // XSS.g:1270:7: atomOrReference
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atomOrReference_in_expression2130);
                    atomOrReference224=atomOrReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atomOrReference224.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 36 :
                    // XSS.g:1271:7: outputFunctions
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_outputFunctions_in_expression2139);
                    outputFunctions225=outputFunctions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, outputFunctions225.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class atomOrReference_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomOrReference"
    // XSS.g:1275:1: atomOrReference : ( atom | reference );
    public final XSS.atomOrReference_return atomOrReference() throws RecognitionException {
        XSS.atomOrReference_return retval = new XSS.atomOrReference_return();
        retval.start = input.LT(1);

        int atomOrReference_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        XSS.atom_return atom226 =null;

        XSS.reference_return reference227 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // XSS.g:1276:5: ( atom | reference )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Array||LA43_0==Boolean||LA43_0==DoubleQuotedString||LA43_0==HereDoc||LA43_0==Integer||LA43_0==List||LA43_0==Real||LA43_0==SingleQuotedString||LA43_0==120) ) {
                alt43=1;
            }
            else if ( (LA43_0==AMPERSAND||LA43_0==Apply||LA43_0==CLASS_MEMBER||LA43_0==DOLLAR||LA43_0==INSTANCE_MEMBER||LA43_0==OPEN_SQUARE_BRACE||LA43_0==UnquotedString) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // XSS.g:1276:7: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atom_in_atomOrReference2158);
                    atom226=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom226.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:1277:7: reference
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_reference_in_atomOrReference2166);
                    reference227=reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, reference227.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, atomOrReference_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "atomOrReference"


    public static class arrayDeclaration_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayDeclaration"
    // XSS.g:1280:1: arrayDeclaration : ^( Array ( arrayEntry )* ) ;
    public final XSS.arrayDeclaration_return arrayDeclaration() throws RecognitionException {
        XSS.arrayDeclaration_return retval = new XSS.arrayDeclaration_return();
        retval.start = input.LT(1);

        int arrayDeclaration_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Array228=null;
        XSS.arrayEntry_return arrayEntry229 =null;


        CommonTree Array228_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // XSS.g:1281:5: ( ^( Array ( arrayEntry )* ) )
            // XSS.g:1281:7: ^( Array ( arrayEntry )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            if ( state.backtracking==0 ) {
            	    try{
            			Flags[29] = 1;    		
            			ind_keyValuePair = 0;
                		Scope aux = currentScope.getEnclosingScope();    		
                		ind_scope = aux.getMembers().size()-1;
            		} catch (Exception e){
            			
            		}
                	}

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Array228=(CommonTree)match(input,Array,FOLLOW_Array_in_arrayDeclaration2190); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Array228_tree = (CommonTree)adaptor.dupNode(Array228);


            root_1 = (CommonTree)adaptor.becomeRoot(Array228_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // XSS.g:1291:13: ( arrayEntry )*
                loop44:
                do {
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0 >= AMPERSAND && LA44_0 <= ASTERISK)||(LA44_0 >= Apply && LA44_0 <= Array)||(LA44_0 >= AssignmentOperator && LA44_0 <= BANG)||LA44_0==Boolean||(LA44_0 >= CLASS_MEMBER && LA44_0 <= CLONE)||(LA44_0 >= Cast && LA44_0 <= ConcatAssigmentOperator)||LA44_0==DIE||(LA44_0 >= DOLLAR && LA44_0 <= DOT)||(LA44_0 >= DoubleQuotedString && LA44_0 <= ECHO)||(LA44_0 >= EQUALS && LA44_0 <= EqualityOperator)||LA44_0==FORWARD_SLASH||LA44_0==HereDoc||(LA44_0 >= INSTANCE_MEMBER && LA44_0 <= IfExpression)||(LA44_0 >= Integer && LA44_0 <= List)||LA44_0==MINUS||LA44_0==NEW||LA44_0==OPEN_SQUARE_BRACE||(LA44_0 >= PERCENT && LA44_0 <= PRINTF)||(LA44_0 >= Postfix && LA44_0 <= Prefix)||LA44_0==Real||LA44_0==SUPPRESS_WARNINGS||(LA44_0 >= ShiftOperator && LA44_0 <= SingleQuotedString)||LA44_0==TILDE||LA44_0==UnquotedString||(LA44_0 >= 114 && LA44_0 <= 117)||(LA44_0 >= 120 && LA44_0 <= 121)||(LA44_0 >= 123 && LA44_0 <= ERROR)) ) {
                        alt44=1;
                    }


                    switch (alt44) {
                	case 1 :
                	    // XSS.g:1291:13: arrayEntry
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration2192);
                	    arrayEntry229=arrayEntry();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, arrayEntry229.getTree());


                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop44;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            		try{
                   	if (currentScope.getScopeSymbol().getIsFunction() == false){      	
                  		if (ind_scope > 0)
                   			ind_keyValuePair = 1;
                   	}
                   	Flags[29] = 0;
            		} catch (Exception e){
            			
            		}
                   }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, arrayDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayDeclaration"


    public static class arrayEntry_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayEntry"
    // XSS.g:1305:1: arrayEntry : ( keyValuePair | expression );
    public final XSS.arrayEntry_return arrayEntry() throws RecognitionException {
        XSS.arrayEntry_return retval = new XSS.arrayEntry_return();
        retval.start = input.LT(1);

        int arrayEntry_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        XSS.keyValuePair_return keyValuePair230 =null;

        XSS.expression_return expression231 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // XSS.g:1306:5: ( keyValuePair | expression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==ARRAY_ASSIGN) ) {
                alt45=1;
            }
            else if ( (LA45_0==AMPERSAND||LA45_0==ASTERISK||(LA45_0 >= Apply && LA45_0 <= Array)||(LA45_0 >= AssignmentOperator && LA45_0 <= BANG)||LA45_0==Boolean||(LA45_0 >= CLASS_MEMBER && LA45_0 <= CLONE)||(LA45_0 >= Cast && LA45_0 <= ConcatAssigmentOperator)||LA45_0==DIE||(LA45_0 >= DOLLAR && LA45_0 <= DOT)||(LA45_0 >= DoubleQuotedString && LA45_0 <= ECHO)||(LA45_0 >= EQUALS && LA45_0 <= EqualityOperator)||LA45_0==FORWARD_SLASH||LA45_0==HereDoc||(LA45_0 >= INSTANCE_MEMBER && LA45_0 <= IfExpression)||(LA45_0 >= Integer && LA45_0 <= List)||LA45_0==MINUS||LA45_0==NEW||LA45_0==OPEN_SQUARE_BRACE||(LA45_0 >= PERCENT && LA45_0 <= PRINTF)||(LA45_0 >= Postfix && LA45_0 <= Prefix)||LA45_0==Real||LA45_0==SUPPRESS_WARNINGS||(LA45_0 >= ShiftOperator && LA45_0 <= SingleQuotedString)||LA45_0==TILDE||LA45_0==UnquotedString||(LA45_0 >= 114 && LA45_0 <= 117)||(LA45_0 >= 120 && LA45_0 <= 121)||(LA45_0 >= 123 && LA45_0 <= ERROR)) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // XSS.g:1306:7: keyValuePair
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_keyValuePair_in_arrayEntry2220);
                    keyValuePair230=keyValuePair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, keyValuePair230.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:1307:7: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_arrayEntry2228);
                    expression231=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, expression231.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, arrayEntry_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayEntry"


    public static class keyValuePair_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keyValuePair"
    // XSS.g:1310:1: keyValuePair : ^( ARRAY_ASSIGN ( expression )* ) ;
    public final XSS.keyValuePair_return keyValuePair() throws RecognitionException {
        XSS.keyValuePair_return retval = new XSS.keyValuePair_return();
        retval.start = input.LT(1);

        int keyValuePair_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ARRAY_ASSIGN232=null;
        XSS.expression_return expression233 =null;


        CommonTree ARRAY_ASSIGN232_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // XSS.g:1312:5: ( ^( ARRAY_ASSIGN ( expression )* ) )
            // XSS.g:1312:7: ^( ARRAY_ASSIGN ( expression )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ARRAY_ASSIGN232=(CommonTree)match(input,ARRAY_ASSIGN,FOLLOW_ARRAY_ASSIGN_in_keyValuePair2247); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARRAY_ASSIGN232_tree = (CommonTree)adaptor.dupNode(ARRAY_ASSIGN232);


            root_1 = (CommonTree)adaptor.becomeRoot(ARRAY_ASSIGN232_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // XSS.g:1312:22: ( expression )*
                loop46:
                do {
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==AMPERSAND||LA46_0==ASTERISK||(LA46_0 >= Apply && LA46_0 <= Array)||(LA46_0 >= AssignmentOperator && LA46_0 <= BANG)||LA46_0==Boolean||(LA46_0 >= CLASS_MEMBER && LA46_0 <= CLONE)||(LA46_0 >= Cast && LA46_0 <= ConcatAssigmentOperator)||LA46_0==DIE||(LA46_0 >= DOLLAR && LA46_0 <= DOT)||(LA46_0 >= DoubleQuotedString && LA46_0 <= ECHO)||(LA46_0 >= EQUALS && LA46_0 <= EqualityOperator)||LA46_0==FORWARD_SLASH||LA46_0==HereDoc||(LA46_0 >= INSTANCE_MEMBER && LA46_0 <= IfExpression)||(LA46_0 >= Integer && LA46_0 <= List)||LA46_0==MINUS||LA46_0==NEW||LA46_0==OPEN_SQUARE_BRACE||(LA46_0 >= PERCENT && LA46_0 <= PRINTF)||(LA46_0 >= Postfix && LA46_0 <= Prefix)||LA46_0==Real||LA46_0==SUPPRESS_WARNINGS||(LA46_0 >= ShiftOperator && LA46_0 <= SingleQuotedString)||LA46_0==TILDE||LA46_0==UnquotedString||(LA46_0 >= 114 && LA46_0 <= 117)||(LA46_0 >= 120 && LA46_0 <= 121)||(LA46_0 >= 123 && LA46_0 <= ERROR)) ) {
                        alt46=1;
                    }


                    switch (alt46) {
                	case 1 :
                	    // XSS.g:1312:22: expression
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_expression_in_keyValuePair2249);
                	    expression233=expression();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, expression233.getTree());


                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop46;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, keyValuePair_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "keyValuePair"


    public static class listDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listDefinition"
    // XSS.g:1347:1: listDefinition : ^( List ( atomOrReference )* ( ^( EQUALS listEntry ) )? ) ;
    public final XSS.listDefinition_return listDefinition() throws RecognitionException {
        XSS.listDefinition_return retval = new XSS.listDefinition_return();
        retval.start = input.LT(1);

        int listDefinition_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree List234=null;
        CommonTree EQUALS236=null;
        XSS.atomOrReference_return atomOrReference235 =null;

        XSS.listEntry_return listEntry237 =null;


        CommonTree List234_tree=null;
        CommonTree EQUALS236_tree=null;


        		Scope scp_main = currentScope;
        		Flags[16] = 1; /*list_flag = 1;*/
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // XSS.g:1352:5: ( ^( List ( atomOrReference )* ( ^( EQUALS listEntry ) )? ) )
            // XSS.g:1352:7: ^( List ( atomOrReference )* ( ^( EQUALS listEntry ) )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            List234=(CommonTree)match(input,List,FOLLOW_List_in_listDefinition2282); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            List234_tree = (CommonTree)adaptor.dupNode(List234);


            root_1 = (CommonTree)adaptor.becomeRoot(List234_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // XSS.g:1352:14: ( atomOrReference )*
                loop47:
                do {
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==AMPERSAND||(LA47_0 >= Apply && LA47_0 <= Array)||LA47_0==Boolean||LA47_0==CLASS_MEMBER||LA47_0==DOLLAR||LA47_0==DoubleQuotedString||LA47_0==HereDoc||LA47_0==INSTANCE_MEMBER||LA47_0==Integer||LA47_0==List||LA47_0==OPEN_SQUARE_BRACE||LA47_0==Real||LA47_0==SingleQuotedString||LA47_0==UnquotedString||LA47_0==120) ) {
                        alt47=1;
                    }


                    switch (alt47) {
                	case 1 :
                	    // XSS.g:1352:14: atomOrReference
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_atomOrReference_in_listDefinition2284);
                	    atomOrReference235=atomOrReference();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, atomOrReference235.getTree());


                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop47;
                    }
                } while (true);


                // XSS.g:1352:31: ( ^( EQUALS listEntry ) )?
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==EQUALS) ) {
                    alt48=1;
                }
                switch (alt48) {
                    case 1 :
                        // XSS.g:1352:32: ^( EQUALS listEntry )
                        {
                        _last = (CommonTree)input.LT(1);
                        {
                        CommonTree _save_last_2 = _last;
                        CommonTree _first_2 = null;
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        _last = (CommonTree)input.LT(1);
                        EQUALS236=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_listDefinition2289); if (state.failed) return retval;
                        if ( state.backtracking==0 ) {
                        EQUALS236_tree = (CommonTree)adaptor.dupNode(EQUALS236);


                        root_2 = (CommonTree)adaptor.becomeRoot(EQUALS236_tree, root_2);
                        }


                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_listEntry_in_listDefinition2291);
                        listEntry237=listEntry();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_2, listEntry237.getTree());


                        match(input, Token.UP, null); if (state.failed) return retval;
                        adaptor.addChild(root_1, root_2);
                        _last = _save_last_2;
                        }


                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, listDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "listDefinition"


    public static class listEntry_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listEntry"
    // XSS.g:1391:1: listEntry : ( expression | ^( ListAssign ( expression )* ) );
    public final XSS.listEntry_return listEntry() throws RecognitionException {
        XSS.listEntry_return retval = new XSS.listEntry_return();
        retval.start = input.LT(1);

        int listEntry_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ListAssign239=null;
        XSS.expression_return expression238 =null;

        XSS.expression_return expression240 =null;


        CommonTree ListAssign239_tree=null;


        		CallSymbol ms_aux = new CallSymbol("AssignList", linha, currentScope, 0, currentFile);
        		currentScope.define(ms_aux, ms_aux, false);
        		currentScope = ms_aux;
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // XSS.g:1397:5: ( expression | ^( ListAssign ( expression )* ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==AMPERSAND||LA50_0==ASTERISK||(LA50_0 >= Apply && LA50_0 <= Array)||(LA50_0 >= AssignmentOperator && LA50_0 <= BANG)||LA50_0==Boolean||(LA50_0 >= CLASS_MEMBER && LA50_0 <= CLONE)||(LA50_0 >= Cast && LA50_0 <= ConcatAssigmentOperator)||LA50_0==DIE||(LA50_0 >= DOLLAR && LA50_0 <= DOT)||(LA50_0 >= DoubleQuotedString && LA50_0 <= ECHO)||(LA50_0 >= EQUALS && LA50_0 <= EqualityOperator)||LA50_0==FORWARD_SLASH||LA50_0==HereDoc||(LA50_0 >= INSTANCE_MEMBER && LA50_0 <= IfExpression)||(LA50_0 >= Integer && LA50_0 <= List)||LA50_0==MINUS||LA50_0==NEW||LA50_0==OPEN_SQUARE_BRACE||(LA50_0 >= PERCENT && LA50_0 <= PRINTF)||(LA50_0 >= Postfix && LA50_0 <= Prefix)||LA50_0==Real||LA50_0==SUPPRESS_WARNINGS||(LA50_0 >= ShiftOperator && LA50_0 <= SingleQuotedString)||LA50_0==TILDE||LA50_0==UnquotedString||(LA50_0 >= 114 && LA50_0 <= 117)||(LA50_0 >= 120 && LA50_0 <= 121)||(LA50_0 >= 123 && LA50_0 <= ERROR)) ) {
                alt50=1;
            }
            else if ( (LA50_0==ListAssign) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // XSS.g:1397:7: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_listEntry2329);
                    expression238=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, expression238.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:1398:7: ^( ListAssign ( expression )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ListAssign239=(CommonTree)match(input,ListAssign,FOLLOW_ListAssign_in_listEntry2338); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ListAssign239_tree = (CommonTree)adaptor.dupNode(ListAssign239);


                    root_1 = (CommonTree)adaptor.becomeRoot(ListAssign239_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // XSS.g:1398:20: ( expression )*
                        loop49:
                        do {
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==AMPERSAND||LA49_0==ASTERISK||(LA49_0 >= Apply && LA49_0 <= Array)||(LA49_0 >= AssignmentOperator && LA49_0 <= BANG)||LA49_0==Boolean||(LA49_0 >= CLASS_MEMBER && LA49_0 <= CLONE)||(LA49_0 >= Cast && LA49_0 <= ConcatAssigmentOperator)||LA49_0==DIE||(LA49_0 >= DOLLAR && LA49_0 <= DOT)||(LA49_0 >= DoubleQuotedString && LA49_0 <= ECHO)||(LA49_0 >= EQUALS && LA49_0 <= EqualityOperator)||LA49_0==FORWARD_SLASH||LA49_0==HereDoc||(LA49_0 >= INSTANCE_MEMBER && LA49_0 <= IfExpression)||(LA49_0 >= Integer && LA49_0 <= List)||LA49_0==MINUS||LA49_0==NEW||LA49_0==OPEN_SQUARE_BRACE||(LA49_0 >= PERCENT && LA49_0 <= PRINTF)||(LA49_0 >= Postfix && LA49_0 <= Prefix)||LA49_0==Real||LA49_0==SUPPRESS_WARNINGS||(LA49_0 >= ShiftOperator && LA49_0 <= SingleQuotedString)||LA49_0==TILDE||LA49_0==UnquotedString||(LA49_0 >= 114 && LA49_0 <= 117)||(LA49_0 >= 120 && LA49_0 <= 121)||(LA49_0 >= 123 && LA49_0 <= ERROR)) ) {
                                alt49=1;
                            }


                            switch (alt49) {
                        	case 1 :
                        	    // XSS.g:1398:20: expression
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_listEntry2340);
                        	    expression240=expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_1, expression240.getTree());


                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop49;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, listEntry_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "listEntry"


    public static class atom_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // XSS.g:1401:1: atom : ( SingleQuotedString | DoubleQuotedString | Integer | Real | Boolean | 'null' | HereDoc | arrayDeclaration | listDefinition );
    public final XSS.atom_return atom() throws RecognitionException {
        XSS.atom_return retval = new XSS.atom_return();
        retval.start = input.LT(1);

        int atom_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SingleQuotedString241=null;
        CommonTree DoubleQuotedString242=null;
        CommonTree Integer243=null;
        CommonTree Real244=null;
        CommonTree Boolean245=null;
        CommonTree string_literal246=null;
        CommonTree HereDoc247=null;
        XSS.arrayDeclaration_return arrayDeclaration248 =null;

        XSS.listDefinition_return listDefinition249 =null;


        CommonTree SingleQuotedString241_tree=null;
        CommonTree DoubleQuotedString242_tree=null;
        CommonTree Integer243_tree=null;
        CommonTree Real244_tree=null;
        CommonTree Boolean245_tree=null;
        CommonTree string_literal246_tree=null;
        CommonTree HereDoc247_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // XSS.g:1402:5: ( SingleQuotedString | DoubleQuotedString | Integer | Real | Boolean | 'null' | HereDoc | arrayDeclaration | listDefinition )
            int alt51=9;
            switch ( input.LA(1) ) {
            case SingleQuotedString:
                {
                alt51=1;
                }
                break;
            case DoubleQuotedString:
                {
                alt51=2;
                }
                break;
            case Integer:
                {
                alt51=3;
                }
                break;
            case Real:
                {
                alt51=4;
                }
                break;
            case Boolean:
                {
                alt51=5;
                }
                break;
            case 120:
                {
                alt51=6;
                }
                break;
            case HereDoc:
                {
                alt51=7;
                }
                break;
            case Array:
                {
                alt51=8;
                }
                break;
            case List:
                {
                alt51=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // XSS.g:1402:7: SingleQuotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    SingleQuotedString241=(CommonTree)match(input,SingleQuotedString,FOLLOW_SingleQuotedString_in_atom2359); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SingleQuotedString241_tree = (CommonTree)adaptor.dupNode(SingleQuotedString241);


                    adaptor.addChild(root_0, SingleQuotedString241_tree);
                    }


                    if ( state.backtracking==0 ) {
                    	  try{
                    	    if (Flags[15] == 0 && Flags[17] == 0){
                    		texto = (SingleQuotedString241!=null?SingleQuotedString241.getText():null);
                    		linha = (SingleQuotedString241!=null?SingleQuotedString241.getLine():0);

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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:1429:7: DoubleQuotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    DoubleQuotedString242=(CommonTree)match(input,DoubleQuotedString,FOLLOW_DoubleQuotedString_in_atom2371); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DoubleQuotedString242_tree = (CommonTree)adaptor.dupNode(DoubleQuotedString242);


                    adaptor.addChild(root_0, DoubleQuotedString242_tree);
                    }


                    if ( state.backtracking==0 ) {
                    	  try{
                    	    if (Flags[15] == 0 && Flags[17] == 0){
                    		texto = (DoubleQuotedString242!=null?DoubleQuotedString242.getText():null);
                    		linha = (DoubleQuotedString242!=null?DoubleQuotedString242.getLine():0);
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // XSS.g:1455:7: Integer
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    Integer243=(CommonTree)match(input,Integer,FOLLOW_Integer_in_atom2383); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Integer243_tree = (CommonTree)adaptor.dupNode(Integer243);


                    adaptor.addChild(root_0, Integer243_tree);
                    }


                    if ( state.backtracking==0 ) {
                    	  try{
                    	    if (Flags[15] == 0 && Flags[17] == 0){
                    		texto = (Integer243!=null?Integer243.getText():null);
                    		linha = (Integer243!=null?Integer243.getLine():0);
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // XSS.g:1472:7: Real
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    Real244=(CommonTree)match(input,Real,FOLLOW_Real_in_atom2394); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Real244_tree = (CommonTree)adaptor.dupNode(Real244);


                    adaptor.addChild(root_0, Real244_tree);
                    }


                    if ( state.backtracking==0 ) {
                    	  try{
                    	    if (Flags[15] == 0 && Flags[17] == 0){
                    		texto = (Real244!=null?Real244.getText():null);
                    		linha = (Real244!=null?Real244.getLine():0);
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // XSS.g:1489:7: Boolean
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    Boolean245=(CommonTree)match(input,Boolean,FOLLOW_Boolean_in_atom2405); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Boolean245_tree = (CommonTree)adaptor.dupNode(Boolean245);


                    adaptor.addChild(root_0, Boolean245_tree);
                    }


                    if ( state.backtracking==0 ) {
                    	  try{
                    	    if (Flags[15] == 0 && Flags[17] == 0){
                    		texto = (Boolean245!=null?Boolean245.getText():null);
                    		linha = (Boolean245!=null?Boolean245.getLine():0);
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // XSS.g:1506:7: 'null'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    string_literal246=(CommonTree)match(input,120,FOLLOW_120_in_atom2417); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal246_tree = (CommonTree)adaptor.dupNode(string_literal246);


                    adaptor.addChild(root_0, string_literal246_tree);
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // XSS.g:1521:7: HereDoc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    HereDoc247=(CommonTree)match(input,HereDoc,FOLLOW_HereDoc_in_atom2429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HereDoc247_tree = (CommonTree)adaptor.dupNode(HereDoc247);


                    adaptor.addChild(root_0, HereDoc247_tree);
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // XSS.g:1521:17: arrayDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayDeclaration_in_atom2433);
                    arrayDeclaration248=arrayDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, arrayDeclaration248.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // XSS.g:1521:36: listDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_listDefinition_in_atom2437);
                    listDefinition249=listDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, listDefinition249.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, atom_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class reference_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "reference"
    // XSS.g:1524:1: reference : ( ^( AMPERSAND nameOrFunctionCall ) | nameOrFunctionCall );
    public final XSS.reference_return reference() throws RecognitionException {
        XSS.reference_return retval = new XSS.reference_return();
        retval.start = input.LT(1);

        int reference_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AMPERSAND250=null;
        XSS.nameOrFunctionCall_return nameOrFunctionCall251 =null;

        XSS.nameOrFunctionCall_return nameOrFunctionCall252 =null;


        CommonTree AMPERSAND250_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // XSS.g:1525:5: ( ^( AMPERSAND nameOrFunctionCall ) | nameOrFunctionCall )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==AMPERSAND) ) {
                alt52=1;
            }
            else if ( (LA52_0==Apply||LA52_0==CLASS_MEMBER||LA52_0==DOLLAR||LA52_0==INSTANCE_MEMBER||LA52_0==OPEN_SQUARE_BRACE||LA52_0==UnquotedString) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }
            switch (alt52) {
                case 1 :
                    // XSS.g:1525:7: ^( AMPERSAND nameOrFunctionCall )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AMPERSAND250=(CommonTree)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_reference2455); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AMPERSAND250_tree = (CommonTree)adaptor.dupNode(AMPERSAND250);


                    root_1 = (CommonTree)adaptor.becomeRoot(AMPERSAND250_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference2457);
                    nameOrFunctionCall251=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, nameOrFunctionCall251.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:1526:7: nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference2466);
                    nameOrFunctionCall252=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nameOrFunctionCall252.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, reference_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "reference"


    public static class nameOrFunctionCall_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nameOrFunctionCall"
    // XSS.g:1529:1: nameOrFunctionCall : ( ^( Apply name ( expression )* ) | name );
    public final XSS.nameOrFunctionCall_return nameOrFunctionCall() throws RecognitionException {
        XSS.nameOrFunctionCall_return retval = new XSS.nameOrFunctionCall_return();
        retval.start = input.LT(1);

        int nameOrFunctionCall_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Apply253=null;
        XSS.name_return name254 =null;

        XSS.expression_return expression255 =null;

        XSS.name_return name256 =null;


        CommonTree Apply253_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // XSS.g:1530:4: ( ^( Apply name ( expression )* ) | name )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Apply) ) {
                alt54=1;
            }
            else if ( (LA54_0==CLASS_MEMBER||LA54_0==DOLLAR||LA54_0==INSTANCE_MEMBER||LA54_0==OPEN_SQUARE_BRACE||LA54_0==UnquotedString) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // XSS.g:1530:6: ^( Apply name ( expression )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[1] = 1; /*callFunction_flag = 1;*/}

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    Apply253=(CommonTree)match(input,Apply,FOLLOW_Apply_in_nameOrFunctionCall2486); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Apply253_tree = (CommonTree)adaptor.dupNode(Apply253);


                    root_1 = (CommonTree)adaptor.becomeRoot(Apply253_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_name_in_nameOrFunctionCall2488);
                    name254=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, name254.getTree());


                    // XSS.g:1530:62: ( expression )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==AMPERSAND||LA53_0==ASTERISK||(LA53_0 >= Apply && LA53_0 <= Array)||(LA53_0 >= AssignmentOperator && LA53_0 <= BANG)||LA53_0==Boolean||(LA53_0 >= CLASS_MEMBER && LA53_0 <= CLONE)||(LA53_0 >= Cast && LA53_0 <= ConcatAssigmentOperator)||LA53_0==DIE||(LA53_0 >= DOLLAR && LA53_0 <= DOT)||(LA53_0 >= DoubleQuotedString && LA53_0 <= ECHO)||(LA53_0 >= EQUALS && LA53_0 <= EqualityOperator)||LA53_0==FORWARD_SLASH||LA53_0==HereDoc||(LA53_0 >= INSTANCE_MEMBER && LA53_0 <= IfExpression)||(LA53_0 >= Integer && LA53_0 <= List)||LA53_0==MINUS||LA53_0==NEW||LA53_0==OPEN_SQUARE_BRACE||(LA53_0 >= PERCENT && LA53_0 <= PRINTF)||(LA53_0 >= Postfix && LA53_0 <= Prefix)||LA53_0==Real||LA53_0==SUPPRESS_WARNINGS||(LA53_0 >= ShiftOperator && LA53_0 <= SingleQuotedString)||LA53_0==TILDE||LA53_0==UnquotedString||(LA53_0 >= 114 && LA53_0 <= 117)||(LA53_0 >= 120 && LA53_0 <= 121)||(LA53_0 >= 123 && LA53_0 <= ERROR)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // XSS.g:1530:62: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_nameOrFunctionCall2490);
                    	    expression255=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression255.getTree());


                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:1627:7: name
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_name_in_nameOrFunctionCall2504);
                    name256=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, name256.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, nameOrFunctionCall_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "nameOrFunctionCall"


    public static class name_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // XSS.g:1630:1: name : ( staticMemberAccess | memberAccess | variable );
    public final XSS.name_return name() throws RecognitionException {
        XSS.name_return retval = new XSS.name_return();
        retval.start = input.LT(1);

        int name_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        XSS.staticMemberAccess_return staticMemberAccess257 =null;

        XSS.memberAccess_return memberAccess258 =null;

        XSS.variable_return variable259 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // XSS.g:1631:5: ( staticMemberAccess | memberAccess | variable )
            int alt55=3;
            switch ( input.LA(1) ) {
            case CLASS_MEMBER:
                {
                alt55=1;
                }
                break;
            case INSTANCE_MEMBER:
            case OPEN_SQUARE_BRACE:
                {
                alt55=2;
                }
                break;
            case DOLLAR:
            case UnquotedString:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }

            switch (alt55) {
                case 1 :
                    // XSS.g:1631:7: staticMemberAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_staticMemberAccess_in_name2521);
                    staticMemberAccess257=staticMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, staticMemberAccess257.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:1632:7: memberAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_memberAccess_in_name2529);
                    memberAccess258=memberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, memberAccess258.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // XSS.g:1633:7: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_name2538);
                    variable259=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, variable259.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, name_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "name"


    public static class staticMemberAccess_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "staticMemberAccess"
    // XSS.g:1636:1: staticMemberAccess : ^( '::' UnquotedString nameOrFunctionCall ) ;
    public final XSS.staticMemberAccess_return staticMemberAccess() throws RecognitionException {
        XSS.staticMemberAccess_return retval = new XSS.staticMemberAccess_return();
        retval.start = input.LT(1);

        int staticMemberAccess_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal260=null;
        CommonTree UnquotedString261=null;
        XSS.nameOrFunctionCall_return nameOrFunctionCall262 =null;


        CommonTree string_literal260_tree=null;
        CommonTree UnquotedString261_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // XSS.g:1637:5: ( ^( '::' UnquotedString nameOrFunctionCall ) )
            // XSS.g:1637:7: ^( '::' UnquotedString nameOrFunctionCall )
            {
            root_0 = (CommonTree)adaptor.nil();


            if ( state.backtracking==0 ) {
            		try{
            		Flags[21] = 1;
                 	CallSymbol ms = new CallSymbol("staticMemberAccess", -1, currentScope, 0, currentFile);
                 	currentScope.define(ms, ms, false);
                 	currentScope = ms;  
            		} catch (Exception e){
            			
            		} 	
            	 }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            string_literal260=(CommonTree)match(input,CLASS_MEMBER,FOLLOW_CLASS_MEMBER_in_staticMemberAccess2572); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal260_tree = (CommonTree)adaptor.dupNode(string_literal260);


            root_1 = (CommonTree)adaptor.becomeRoot(string_literal260_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            UnquotedString261=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_staticMemberAccess2574); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString261_tree = (CommonTree)adaptor.dupNode(UnquotedString261);


            adaptor.addChild(root_1, UnquotedString261_tree);
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_nameOrFunctionCall_in_staticMemberAccess2576);
            nameOrFunctionCall262=nameOrFunctionCall();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, nameOrFunctionCall262.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            		try{
            		Flags[21] = 0;
            		currentScope.getScopeSymbol().setCodeLine(linha);
            		currentScope.getScopeSymbol().setIsStaticMember(true);
            		currentScope.getScopeSymbol().setIsClassInstruction(true);
            		String cname = (UnquotedString261!=null?UnquotedString261.getText():null);
            		currentScope.getScopeSymbol().setName(cname);

            		//Symbol symm = (Symbol) currentScope.getMembers().get(0);		
            		
            		
            		currentScope = currentScope.getEnclosingScope();		
                   
            		} catch (Exception e){
            			
            		}
            	}

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, staticMemberAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "staticMemberAccess"


    public static class memberAccess_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "memberAccess"
    // XSS.g:1668:1: memberAccess : ( arrayAccess ( INSTANCE_MEMBER UnquotedString )? | ^( INSTANCE_MEMBER variable arrayOrUnquotedStringOrFunctionCall ) );
    public final XSS.memberAccess_return memberAccess() throws RecognitionException {
        XSS.memberAccess_return retval = new XSS.memberAccess_return();
        retval.start = input.LT(1);

        int memberAccess_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSTANCE_MEMBER264=null;
        CommonTree UnquotedString265=null;
        CommonTree INSTANCE_MEMBER266=null;
        XSS.arrayAccess_return arrayAccess263 =null;

        XSS.variable_return variable267 =null;

        XSS.arrayOrUnquotedStringOrFunctionCall_return arrayOrUnquotedStringOrFunctionCall268 =null;


        CommonTree INSTANCE_MEMBER264_tree=null;
        CommonTree UnquotedString265_tree=null;
        CommonTree INSTANCE_MEMBER266_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // XSS.g:1669:5: ( arrayAccess ( INSTANCE_MEMBER UnquotedString )? | ^( INSTANCE_MEMBER variable arrayOrUnquotedStringOrFunctionCall ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==OPEN_SQUARE_BRACE) ) {
                alt57=1;
            }
            else if ( (LA57_0==INSTANCE_MEMBER) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }
            switch (alt57) {
                case 1 :
                    // XSS.g:1669:7: arrayAccess ( INSTANCE_MEMBER UnquotedString )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {Flags[12] = 1;}

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayAccess_in_memberAccess2605);
                    arrayAccess263=arrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, arrayAccess263.getTree());


                    // XSS.g:1669:36: ( INSTANCE_MEMBER UnquotedString )?
                    int alt56=2;
                    alt56 = dfa56.predict(input);
                    switch (alt56) {
                        case 1 :
                            // XSS.g:1669:37: INSTANCE_MEMBER UnquotedString
                            {
                            _last = (CommonTree)input.LT(1);
                            INSTANCE_MEMBER264=(CommonTree)match(input,INSTANCE_MEMBER,FOLLOW_INSTANCE_MEMBER_in_memberAccess2608); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INSTANCE_MEMBER264_tree = (CommonTree)adaptor.dupNode(INSTANCE_MEMBER264);


                            adaptor.addChild(root_0, INSTANCE_MEMBER264_tree);
                            }


                            _last = (CommonTree)input.LT(1);
                            UnquotedString265=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_memberAccess2610); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            UnquotedString265_tree = (CommonTree)adaptor.dupNode(UnquotedString265);


                            adaptor.addChild(root_0, UnquotedString265_tree);
                            }


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
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

                    	if ((UnquotedString265!=null?UnquotedString265.getText():null) != null){
                    		CallSymbol ms = new CallSymbol((UnquotedString265!=null?UnquotedString265.getText():null), linha, null, 0, currentFile);
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:1696:7: ^( INSTANCE_MEMBER variable arrayOrUnquotedStringOrFunctionCall )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    		try{
                        		Flags[0] = 1; // assign_flag = 1
                        		Flags[25] = 1; // instanceMember_flag = 1
                        		instanceName = "";
                        		accessInstance++;  
                    		} catch (Exception e){}
                          }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    INSTANCE_MEMBER266=(CommonTree)match(input,INSTANCE_MEMBER,FOLLOW_INSTANCE_MEMBER_in_memberAccess2640); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCE_MEMBER266_tree = (CommonTree)adaptor.dupNode(INSTANCE_MEMBER266);


                    root_1 = (CommonTree)adaptor.becomeRoot(INSTANCE_MEMBER266_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_memberAccess2642);
                    variable267=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, variable267.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_memberAccess2644);
                    arrayOrUnquotedStringOrFunctionCall268=arrayOrUnquotedStringOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, arrayOrUnquotedStringOrFunctionCall268.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 40, memberAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "memberAccess"


    public static class arrayOrUnquotedStringOrFunctionCall_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayOrUnquotedStringOrFunctionCall"
    // XSS.g:1727:1: arrayOrUnquotedStringOrFunctionCall : ( ^( EQUALS arrayAccess expression ) | arrayAccess | ^( EQUALS expression expression ) | ^( AssignmentOperator expression expression ) | ^( ConcatAssigmentOperator expression expression ) | ^( INSTANCE_MEMBER objectNameOrMethod arrayOrUnquotedStringOrFunctionCall ) | nameOrFunctionCall );
    public final XSS.arrayOrUnquotedStringOrFunctionCall_return arrayOrUnquotedStringOrFunctionCall() throws RecognitionException {
        XSS.arrayOrUnquotedStringOrFunctionCall_return retval = new XSS.arrayOrUnquotedStringOrFunctionCall_return();
        retval.start = input.LT(1);

        int arrayOrUnquotedStringOrFunctionCall_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUALS269=null;
        CommonTree EQUALS273=null;
        CommonTree AssignmentOperator276=null;
        CommonTree ConcatAssigmentOperator279=null;
        CommonTree INSTANCE_MEMBER282=null;
        XSS.arrayAccess_return arrayAccess270 =null;

        XSS.expression_return expression271 =null;

        XSS.arrayAccess_return arrayAccess272 =null;

        XSS.expression_return expression274 =null;

        XSS.expression_return expression275 =null;

        XSS.expression_return expression277 =null;

        XSS.expression_return expression278 =null;

        XSS.expression_return expression280 =null;

        XSS.expression_return expression281 =null;

        XSS.objectNameOrMethod_return objectNameOrMethod283 =null;

        XSS.arrayOrUnquotedStringOrFunctionCall_return arrayOrUnquotedStringOrFunctionCall284 =null;

        XSS.nameOrFunctionCall_return nameOrFunctionCall285 =null;


        CommonTree EQUALS269_tree=null;
        CommonTree EQUALS273_tree=null;
        CommonTree AssignmentOperator276_tree=null;
        CommonTree ConcatAssigmentOperator279_tree=null;
        CommonTree INSTANCE_MEMBER282_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // XSS.g:1731:5: ( ^( EQUALS arrayAccess expression ) | arrayAccess | ^( EQUALS expression expression ) | ^( AssignmentOperator expression expression ) | ^( ConcatAssigmentOperator expression expression ) | ^( INSTANCE_MEMBER objectNameOrMethod arrayOrUnquotedStringOrFunctionCall ) | nameOrFunctionCall )
            int alt58=7;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==DOWN) ) {
                    int LA58_10 = input.LA(3);

                    if ( (synpred124_XSS()) ) {
                        alt58=1;
                    }
                    else if ( (synpred126_XSS()) ) {
                        alt58=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 10, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;

                }
                }
                break;
            case OPEN_SQUARE_BRACE:
                {
                int LA58_2 = input.LA(2);

                if ( (LA58_2==DOWN) ) {
                    int LA58_11 = input.LA(3);

                    if ( (synpred125_XSS()) ) {
                        alt58=2;
                    }
                    else if ( (true) ) {
                        alt58=7;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 11, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 2, input);

                    throw nvae;

                }
                }
                break;
            case AssignmentOperator:
                {
                alt58=4;
                }
                break;
            case ConcatAssigmentOperator:
                {
                alt58=5;
                }
                break;
            case INSTANCE_MEMBER:
                {
                int LA58_5 = input.LA(2);

                if ( (LA58_5==DOWN) ) {
                    int LA58_12 = input.LA(3);

                    if ( (synpred129_XSS()) ) {
                        alt58=6;
                    }
                    else if ( (true) ) {
                        alt58=7;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 12, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 5, input);

                    throw nvae;

                }
                }
                break;
            case Apply:
            case CLASS_MEMBER:
            case DOLLAR:
            case UnquotedString:
                {
                alt58=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }

            switch (alt58) {
                case 1 :
                    // XSS.g:1732:6: ^( EQUALS arrayAccess expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
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

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQUALS269=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_arrayOrUnquotedStringOrFunctionCall2690); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS269_tree = (CommonTree)adaptor.dupNode(EQUALS269);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQUALS269_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayAccess_in_arrayOrUnquotedStringOrFunctionCall2692);
                    arrayAccess270=arrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, arrayAccess270.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2694);
                    expression271=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression271.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    	  try{
                         	currentScope = currentScope.getEnclosingScope();
                    		} catch (Exception e){
                    			
                    		}
                    	
                    	}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:1758:2: arrayAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    	  try{
                    		Flags[23] = 1;   			
                    		Flags[12] = 1;
                    		Flags[28] = 1;
                    		
                    		initInstanceOperations();
                    		} catch (Exception e){
                    			
                    		}
                        }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayAccess_in_arrayOrUnquotedStringOrFunctionCall2714);
                    arrayAccess272=arrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, arrayAccess272.getTree());


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // XSS.g:1797:2: ^( EQUALS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    	  try{
                    		Flags[23] = 1;
                    		Flags[24] = 1; /*assign_flag = 1;*/
                        
                    		initInstanceOperations();
                        		if (Flags[26] == 0) /*noClass_instMember_flag e callMethodClass ou access*/
                        			Flags[21] = 1;
                    		} catch (Exception e){
                    			
                    		}
                        }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQUALS273=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_arrayOrUnquotedStringOrFunctionCall2744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS273_tree = (CommonTree)adaptor.dupNode(EQUALS273);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQUALS273_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2746);
                    expression274=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression274.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2748);
                    expression275=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression275.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    		try{
                    		if (Flags[26] == 1){
                    			Flags[24] = 1;	   	
                    		}
                         	currentScope = currentScope.getEnclosingScope();
                    		} catch (Exception e){
                    			
                    		}     	
                          }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // XSS.g:1822:7: ^( AssignmentOperator expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AssignmentOperator276=(CommonTree)match(input,AssignmentOperator,FOLLOW_AssignmentOperator_in_arrayOrUnquotedStringOrFunctionCall2772); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AssignmentOperator276_tree = (CommonTree)adaptor.dupNode(AssignmentOperator276);


                    root_1 = (CommonTree)adaptor.becomeRoot(AssignmentOperator276_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2774);
                    expression277=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression277.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2776);
                    expression278=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression278.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // XSS.g:1824:2: ^( ConcatAssigmentOperator expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
                    	  try{
                    		Flags[23] = 1;
                    		Flags[24] = 1; /*assign_flag = 1;*/
                        
                    		initInstanceOperations();
                    		} catch (Exception e){
                    			
                    		}
                        }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ConcatAssigmentOperator279=(CommonTree)match(input,ConcatAssigmentOperator,FOLLOW_ConcatAssigmentOperator_in_arrayOrUnquotedStringOrFunctionCall2791); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ConcatAssigmentOperator279_tree = (CommonTree)adaptor.dupNode(ConcatAssigmentOperator279);


                    root_1 = (CommonTree)adaptor.becomeRoot(ConcatAssigmentOperator279_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2793);
                    expression280=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression280.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2795);
                    expression281=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression281.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // XSS.g:1849:7: ^( INSTANCE_MEMBER objectNameOrMethod arrayOrUnquotedStringOrFunctionCall )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    INSTANCE_MEMBER282=(CommonTree)match(input,INSTANCE_MEMBER,FOLLOW_INSTANCE_MEMBER_in_arrayOrUnquotedStringOrFunctionCall2814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCE_MEMBER282_tree = (CommonTree)adaptor.dupNode(INSTANCE_MEMBER282);


                    root_1 = (CommonTree)adaptor.becomeRoot(INSTANCE_MEMBER282_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_objectNameOrMethod_in_arrayOrUnquotedStringOrFunctionCall2816);
                    objectNameOrMethod283=objectNameOrMethod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, objectNameOrMethod283.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_arrayOrUnquotedStringOrFunctionCall2818);
                    arrayOrUnquotedStringOrFunctionCall284=arrayOrUnquotedStringOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, arrayOrUnquotedStringOrFunctionCall284.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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
                    		 		instanceName = (objectNameOrMethod283!=null?objectNameOrMethod283.instanceName_aux:null);
                    		 	else
                    		 		currentInstance = (objectNameOrMethod283!=null?objectNameOrMethod283.inst_aux:null);
                    		 		
                    			currentScope = currentScope.getEnclosingScope();
                    		}
                    		Flags[27] = 0;
                    		} catch (Exception e){
                    			
                    		}
                          }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // XSS.g:1874:7: nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( state.backtracking==0 ) {
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

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nameOrFunctionCall_in_arrayOrUnquotedStringOrFunctionCall2856);
                    nameOrFunctionCall285=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nameOrFunctionCall285.getTree());


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

            if ( state.backtracking==0 ) {
            		Flags[23] = 0;
            	}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 41, arrayOrUnquotedStringOrFunctionCall_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayOrUnquotedStringOrFunctionCall"


    public static class objectNameOrMethod_return extends TreeRuleReturnScope {
        public String instanceName_aux;
        public Instance inst_aux;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objectNameOrMethod"
    // XSS.g:1948:1: objectNameOrMethod returns [String instanceName_aux, Instance inst_aux] : nameOrFunctionCall ;
    public final XSS.objectNameOrMethod_return objectNameOrMethod() throws RecognitionException {
        XSS.objectNameOrMethod_return retval = new XSS.objectNameOrMethod_return();
        retval.start = input.LT(1);

        int objectNameOrMethod_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        XSS.nameOrFunctionCall_return nameOrFunctionCall286 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // XSS.g:1949:5: ( nameOrFunctionCall )
            // XSS.g:1949:7: nameOrFunctionCall
            {
            root_0 = (CommonTree)adaptor.nil();


            if ( state.backtracking==0 ) {
            		try{
            		Flags[23] = 1;
                
            		initInstanceOperations();
                		if (Flags[26] == 0) /*noClass_instMember_flag e callMethodClass ou access*/
                			Flags[21] = 1; /*callMethodClass or access attribute*/
            		} catch (Exception e){
            			
            		}
                }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_nameOrFunctionCall_in_objectNameOrMethod2906);
            nameOrFunctionCall286=nameOrFunctionCall();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, nameOrFunctionCall286.getTree());


            if ( state.backtracking==0 ) {
            	  try{
                  	Flags[21] = 0;
                  	if (Flags[26] == 0){
                  	currentScope.getScopeSymbol().setIsClassInstruction(true);
                  	if (currentScope.getMembers().size() == 0){
            			CallSymbol ms = new CallSymbol(texto, linha, currentScope, 0, currentFile);
            		   	currentScope.define(ms, ms, false);
            		   	currentScope = ms;
            		   	retval.instanceName_aux = instanceName;
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
            						retval.inst_aux = currentInstance;
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

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 42, objectNameOrMethod_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objectNameOrMethod"


    public static class arrayAccess_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayAccess"
    // XSS.g:2023:1: arrayAccess : ^( OPEN_SQUARE_BRACE variable ( expression )* ) ;
    public final XSS.arrayAccess_return arrayAccess() throws RecognitionException {
        XSS.arrayAccess_return retval = new XSS.arrayAccess_return();
        retval.start = input.LT(1);

        int arrayAccess_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OPEN_SQUARE_BRACE287=null;
        XSS.variable_return variable288 =null;

        XSS.expression_return expression289 =null;


        CommonTree OPEN_SQUARE_BRACE287_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // XSS.g:2024:5: ( ^( OPEN_SQUARE_BRACE variable ( expression )* ) )
            // XSS.g:2024:7: ^( OPEN_SQUARE_BRACE variable ( expression )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            OPEN_SQUARE_BRACE287=(CommonTree)match(input,OPEN_SQUARE_BRACE,FOLLOW_OPEN_SQUARE_BRACE_in_arrayAccess2930); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OPEN_SQUARE_BRACE287_tree = (CommonTree)adaptor.dupNode(OPEN_SQUARE_BRACE287);


            root_1 = (CommonTree)adaptor.becomeRoot(OPEN_SQUARE_BRACE287_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_arrayAccess2932);
            variable288=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, variable288.getTree());


            // XSS.g:2024:36: ( expression )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==AMPERSAND||LA59_0==ASTERISK||(LA59_0 >= Apply && LA59_0 <= Array)||(LA59_0 >= AssignmentOperator && LA59_0 <= BANG)||LA59_0==Boolean||(LA59_0 >= CLASS_MEMBER && LA59_0 <= CLONE)||(LA59_0 >= Cast && LA59_0 <= ConcatAssigmentOperator)||LA59_0==DIE||(LA59_0 >= DOLLAR && LA59_0 <= DOT)||(LA59_0 >= DoubleQuotedString && LA59_0 <= ECHO)||(LA59_0 >= EQUALS && LA59_0 <= EqualityOperator)||LA59_0==FORWARD_SLASH||LA59_0==HereDoc||(LA59_0 >= INSTANCE_MEMBER && LA59_0 <= IfExpression)||(LA59_0 >= Integer && LA59_0 <= List)||LA59_0==MINUS||LA59_0==NEW||LA59_0==OPEN_SQUARE_BRACE||(LA59_0 >= PERCENT && LA59_0 <= PRINTF)||(LA59_0 >= Postfix && LA59_0 <= Prefix)||LA59_0==Real||LA59_0==SUPPRESS_WARNINGS||(LA59_0 >= ShiftOperator && LA59_0 <= SingleQuotedString)||LA59_0==TILDE||LA59_0==UnquotedString||(LA59_0 >= 114 && LA59_0 <= 117)||(LA59_0 >= 120 && LA59_0 <= 121)||(LA59_0 >= 123 && LA59_0 <= ERROR)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // XSS.g:2024:36: expression
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expression_in_arrayAccess2934);
            	    expression289=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, expression289.getTree());


            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 43, arrayAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayAccess"


    public static class variable_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // XSS.g:2097:1: variable : ( ^( DOLLAR variable ) | UnquotedString );
    public final XSS.variable_return variable() throws RecognitionException {
        XSS.variable_return retval = new XSS.variable_return();
        retval.start = input.LT(1);

        int variable_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DOLLAR290=null;
        CommonTree UnquotedString292=null;
        XSS.variable_return variable291 =null;


        CommonTree DOLLAR290_tree=null;
        CommonTree UnquotedString292_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // XSS.g:2098:5: ( ^( DOLLAR variable ) | UnquotedString )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==DOLLAR) ) {
                alt60=1;
            }
            else if ( (LA60_0==UnquotedString) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }
            switch (alt60) {
                case 1 :
                    // XSS.g:2098:7: ^( DOLLAR variable )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DOLLAR290=(CommonTree)match(input,DOLLAR,FOLLOW_DOLLAR_in_variable2958); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOLLAR290_tree = (CommonTree)adaptor.dupNode(DOLLAR290);


                    root_1 = (CommonTree)adaptor.becomeRoot(DOLLAR290_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_variable2960);
                    variable291=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, variable291.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // XSS.g:2177:7: UnquotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    UnquotedString292=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_variable2972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString292_tree = (CommonTree)adaptor.dupNode(UnquotedString292);


                    adaptor.addChild(root_0, UnquotedString292_tree);
                    }


                    if ( state.backtracking==0 ) {
                    	  try{
                    	    if (Flags[15] == 0){
                    	     if (Flags[20] == 1 || Flags[22] == 1)
                    	     	instanceName = texto;
                    	    
                    		texto=(UnquotedString292!=null?UnquotedString292.getText():null);
                    	   	linha=(UnquotedString292!=null?UnquotedString292.getLine():0);

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

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 44, variable_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variable"


    public static class instanceMember_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instanceMember"
    // XSS.g:2414:1: instanceMember : ^( INSTANCE_MEMBER arrayOrUnquotedStringOrFunctionCall ) ;
    public final XSS.instanceMember_return instanceMember() throws RecognitionException {
        XSS.instanceMember_return retval = new XSS.instanceMember_return();
        retval.start = input.LT(1);

        int instanceMember_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSTANCE_MEMBER293=null;
        XSS.arrayOrUnquotedStringOrFunctionCall_return arrayOrUnquotedStringOrFunctionCall294 =null;


        CommonTree INSTANCE_MEMBER293_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // XSS.g:2415:4: ( ^( INSTANCE_MEMBER arrayOrUnquotedStringOrFunctionCall ) )
            // XSS.g:2415:6: ^( INSTANCE_MEMBER arrayOrUnquotedStringOrFunctionCall )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INSTANCE_MEMBER293=(CommonTree)match(input,INSTANCE_MEMBER,FOLLOW_INSTANCE_MEMBER_in_instanceMember2992); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INSTANCE_MEMBER293_tree = (CommonTree)adaptor.dupNode(INSTANCE_MEMBER293);


            root_1 = (CommonTree)adaptor.becomeRoot(INSTANCE_MEMBER293_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_instanceMember2994);
            arrayOrUnquotedStringOrFunctionCall294=arrayOrUnquotedStringOrFunctionCall();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, arrayOrUnquotedStringOrFunctionCall294.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 45, instanceMember_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "instanceMember"


    public static class ignoreStatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ignoreStatement"
    // XSS.g:2418:1: ignoreStatement : PhpStatement ;
    public final XSS.ignoreStatement_return ignoreStatement() throws RecognitionException {
        XSS.ignoreStatement_return retval = new XSS.ignoreStatement_return();
        retval.start = input.LT(1);

        int ignoreStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PhpStatement295=null;

        CommonTree PhpStatement295_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // XSS.g:2419:5: ( PhpStatement )
            // XSS.g:2419:7: PhpStatement
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            PhpStatement295=(CommonTree)match(input,PhpStatement,FOLLOW_PhpStatement_in_ignoreStatement3011); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PhpStatement295_tree = (CommonTree)adaptor.dupNode(PhpStatement295);


            adaptor.addChild(root_0, PhpStatement295_tree);
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, ignoreStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ignoreStatement"

    // $ANTLR start synpred2_XSS
    public final void synpred2_XSS_fragment() throws RecognitionException {
        // XSS.g:233:7: ( ignoreStatement )
        // XSS.g:233:7: ignoreStatement
        {
        pushFollow(FOLLOW_ignoreStatement_in_synpred2_XSS103);
        ignoreStatement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_XSS

    // $ANTLR start synpred26_XSS
    public final void synpred26_XSS_fragment() throws RecognitionException {
        // XSS.g:367:7: ( 'null' )
        // XSS.g:367:7: 'null'
        {
        match(input,120,FOLLOW_120_in_synpred26_XSS509); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred26_XSS

    // $ANTLR start synpred40_XSS
    public final void synpred40_XSS_fragment() throws RecognitionException {
        // XSS.g:531:7: ( outputFunctions )
        // XSS.g:531:7: outputFunctions
        {
        pushFollow(FOLLOW_outputFunctions_in_synpred40_XSS738);
        outputFunctions();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred40_XSS

    // $ANTLR start synpred41_XSS
    public final void synpred41_XSS_fragment() throws RecognitionException {
        // XSS.g:532:7: ( expression )
        // XSS.g:532:7: expression
        {
        pushFollow(FOLLOW_expression_in_synpred41_XSS750);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred41_XSS

    // $ANTLR start synpred72_XSS
    public final void synpred72_XSS_fragment() throws RecognitionException {
        // XSS.g:949:7: ( ^( EQUALS expression simpleRequire ) )
        // XSS.g:949:7: ^( EQUALS expression simpleRequire )
        {
        match(input,EQUALS,FOLLOW_EQUALS_in_synpred72_XSS1533); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred72_XSS1535);
        expression();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_simpleRequire_in_synpred72_XSS1537);
        simpleRequire();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred72_XSS

    // $ANTLR start synpred73_XSS
    public final void synpred73_XSS_fragment() throws RecognitionException {
        // XSS.g:976:7: ( ^( EQUALS expression expression ) )
        // XSS.g:976:7: ^( EQUALS expression expression )
        {
        match(input,EQUALS,FOLLOW_EQUALS_in_synpred73_XSS1557); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred73_XSS1559);
        expression();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred73_XSS1561);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred73_XSS

    // $ANTLR start synpred80_XSS
    public final void synpred80_XSS_fragment() throws RecognitionException {
        // XSS.g:1131:7: ( ^( AMPERSAND expression expression ) )
        // XSS.g:1131:7: ^( AMPERSAND expression expression )
        {
        match(input,AMPERSAND,FOLLOW_AMPERSAND_in_synpred80_XSS1746); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred80_XSS1748);
        expression();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred80_XSS1750);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred80_XSS

    // $ANTLR start synpred85_XSS
    public final void synpred85_XSS_fragment() throws RecognitionException {
        // XSS.g:1175:7: ( ^( MINUS expression expression ) )
        // XSS.g:1175:7: ^( MINUS expression expression )
        {
        match(input,MINUS,FOLLOW_MINUS_in_synpred85_XSS1853); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred85_XSS1855);
        expression();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred85_XSS1857);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred85_XSS

    // $ANTLR start synpred93_XSS
    public final void synpred93_XSS_fragment() throws RecognitionException {
        // XSS.g:1242:7: ( ^( MINUS expression ) )
        // XSS.g:1242:7: ^( MINUS expression )
        {
        match(input,MINUS,FOLLOW_MINUS_in_synpred93_XSS2002); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred93_XSS2004);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred93_XSS

    // $ANTLR start synpred100_XSS
    public final void synpred100_XSS_fragment() throws RecognitionException {
        // XSS.g:1270:7: ( atomOrReference )
        // XSS.g:1270:7: atomOrReference
        {
        pushFollow(FOLLOW_atomOrReference_in_synpred100_XSS2130);
        atomOrReference();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred100_XSS

    // $ANTLR start synpred124_XSS
    public final void synpred124_XSS_fragment() throws RecognitionException {
        // XSS.g:1732:6: ( ^( EQUALS arrayAccess expression ) )
        // XSS.g:1732:6: ^( EQUALS arrayAccess expression )
        {
        match(input,EQUALS,FOLLOW_EQUALS_in_synpred124_XSS2690); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_arrayAccess_in_synpred124_XSS2692);
        arrayAccess();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred124_XSS2694);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred124_XSS

    // $ANTLR start synpred125_XSS
    public final void synpred125_XSS_fragment() throws RecognitionException {
        // XSS.g:1758:2: ( arrayAccess )
        // XSS.g:1758:2: arrayAccess
        {
        pushFollow(FOLLOW_arrayAccess_in_synpred125_XSS2714);
        arrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred125_XSS

    // $ANTLR start synpred126_XSS
    public final void synpred126_XSS_fragment() throws RecognitionException {
        // XSS.g:1797:2: ( ^( EQUALS expression expression ) )
        // XSS.g:1797:2: ^( EQUALS expression expression )
        {
        match(input,EQUALS,FOLLOW_EQUALS_in_synpred126_XSS2744); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred126_XSS2746);
        expression();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred126_XSS2748);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred126_XSS

    // $ANTLR start synpred129_XSS
    public final void synpred129_XSS_fragment() throws RecognitionException {
        // XSS.g:1849:7: ( ^( INSTANCE_MEMBER objectNameOrMethod arrayOrUnquotedStringOrFunctionCall ) )
        // XSS.g:1849:7: ^( INSTANCE_MEMBER objectNameOrMethod arrayOrUnquotedStringOrFunctionCall )
        {
        match(input,INSTANCE_MEMBER,FOLLOW_INSTANCE_MEMBER_in_synpred129_XSS2814); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_objectNameOrMethod_in_synpred129_XSS2816);
        objectNameOrMethod();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_synpred129_XSS2818);
        arrayOrUnquotedStringOrFunctionCall();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred129_XSS

    // Delegated rules

    public final boolean synpred2_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred124_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred129_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred126_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_XSS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_XSS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA56 dfa56 = new DFA56(this);
    static final String DFA1_eotS =
        "\105\uffff";
    static final String DFA1_eofS =
        "\1\1\104\uffff";
    static final String DFA1_minS =
        "\1\5\104\uffff";
    static final String DFA1_maxS =
        "\1\174\104\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\2\1\1\102\uffff";
    static final String DFA1_specialS =
        "\105\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff"+
            "\3\2\10\uffff\3\2\1\uffff\1\2\1\uffff\3\2\2\uffff\2\2\2\uffff"+
            "\2\2\3\uffff\4\2\3\uffff\1\2\1\uffff\1\2\2\uffff\4\2\6\uffff"+
            "\4\2\1\uffff\1\2\2\uffff\1\2\3\uffff\1\2\1\uffff\5\2\1\uffff"+
            "\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff\2\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 229:7: ( statement )*";
        }
    }
    static final String DFA3_eotS =
        "\u008c\uffff";
    static final String DFA3_eofS =
        "\u008c\uffff";
    static final String DFA3_minS =
        "\1\5\1\0\u008a\uffff";
    static final String DFA3_maxS =
        "\1\174\1\0\u008a\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\7\uffff\1\6\175\uffff\1\1";
    static final String DFA3_specialS =
        "\1\uffff\1\0\u008a\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\15\1\uffff\1\15\1\uffff\2\15\1\uffff\2\15\1\uffff\1\3\1\2"+
            "\1\15\2\uffff\1\4\2\15\10\uffff\3\15\1\uffff\1\15\1\uffff\1"+
            "\5\2\15\2\uffff\2\15\2\uffff\2\15\3\uffff\1\5\1\15\2\5\3\uffff"+
            "\1\15\1\uffff\1\15\2\uffff\1\5\3\15\6\uffff\4\15\1\uffff\1\15"+
            "\2\uffff\1\15\3\uffff\1\15\1\uffff\5\15\1\uffff\1\1\2\15\1\uffff"+
            "\3\15\1\uffff\1\15\1\5\2\15\1\uffff\1\15\1\5\2\uffff\1\15\1"+
            "\uffff\1\5\1\uffff\4\15\2\uffff\2\15\1\uffff\2\15",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "231:1: statement : ( ignoreStatement | BodyString | ^( Block ( statement )* ) | classDefinition | complexStatement | simpleStatement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_XSS()) ) {s = 139;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_1);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA2_eotS =
        "\105\uffff";
    static final String DFA2_eofS =
        "\105\uffff";
    static final String DFA2_minS =
        "\1\3\104\uffff";
    static final String DFA2_maxS =
        "\1\174\104\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\2\1\1\102\uffff";
    static final String DFA2_specialS =
        "\105\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\3\2\2\uffff\3\2\10\uffff\3\2\1\uffff\1\2\1\uffff\3\2\2\uffff"+
            "\2\2\2\uffff\2\2\3\uffff\4\2\3\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\6\uffff\4\2\1\uffff\1\2\2\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\5\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 235:15: ( statement )*";
        }
    }
    static final String DFA10_eotS =
        "\105\uffff";
    static final String DFA10_eofS =
        "\105\uffff";
    static final String DFA10_minS =
        "\1\3\104\uffff";
    static final String DFA10_maxS =
        "\1\174\104\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\1\1\102\uffff";
    static final String DFA10_specialS =
        "\105\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\3\2\2\uffff\3\2\10\uffff\3\2\1\uffff\1\2\1\uffff\3\2\2\uffff"+
            "\2\2\2\uffff\2\2\3\uffff\4\2\3\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\6\uffff\4\2\1\uffff\1\2\2\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\5\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 312:87: ( statement )*";
        }
    }
    static final String DFA22_eotS =
        "\77\uffff";
    static final String DFA22_eofS =
        "\77\uffff";
    static final String DFA22_minS =
        "\1\5\3\uffff\5\2\60\uffff\5\0\1\uffff";
    static final String DFA22_maxS =
        "\1\174\3\uffff\5\2\60\uffff\5\0\1\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\5\uffff\1\5\56\uffff\1\6\5\uffff\1\4";
    static final String DFA22_specialS =
        "\71\uffff\1\0\1\1\1\2\1\3\1\4\1\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\2\11\3\uffff\1\11\3"+
            "\uffff\2\11\10\uffff\3\11\1\uffff\1\7\2\uffff\2\11\2\uffff\1"+
            "\11\1\4\2\uffff\2\11\4\uffff\1\11\5\uffff\1\1\1\uffff\1\11\3"+
            "\uffff\3\11\6\uffff\4\11\1\uffff\1\11\2\uffff\1\11\3\uffff\1"+
            "\11\1\uffff\3\11\1\5\1\6\1\uffff\1\70\2\11\1\uffff\1\2\1\11"+
            "\1\3\1\uffff\1\11\1\uffff\2\11\1\uffff\1\11\3\uffff\1\11\3\uffff"+
            "\4\11\2\uffff\2\11\1\uffff\1\11\1\10",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "446:1: simpleStatement : ( ^( GLOBAL ( name )+ ) | ^( RETURN ( expression )? ) | simpleRequire | outputFunctions | expression | ignoreOthers );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_57 = input.LA(1);

                         
                        int index22_57 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred40_XSS()) ) {s = 62;}

                        else if ( (synpred41_XSS()) ) {s = 9;}

                         
                        input.seek(index22_57);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA22_58 = input.LA(1);

                         
                        int index22_58 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred40_XSS()) ) {s = 62;}

                        else if ( (synpred41_XSS()) ) {s = 9;}

                         
                        input.seek(index22_58);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA22_59 = input.LA(1);

                         
                        int index22_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred40_XSS()) ) {s = 62;}

                        else if ( (synpred41_XSS()) ) {s = 9;}

                         
                        input.seek(index22_59);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA22_60 = input.LA(1);

                         
                        int index22_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred40_XSS()) ) {s = 62;}

                        else if ( (synpred41_XSS()) ) {s = 9;}

                         
                        input.seek(index22_60);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA22_61 = input.LA(1);

                         
                        int index22_61 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred40_XSS()) ) {s = 62;}

                        else if ( (synpred41_XSS()) ) {s = 9;}

                         
                        input.seek(index22_61);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA28_eotS =
        "\105\uffff";
    static final String DFA28_eofS =
        "\105\uffff";
    static final String DFA28_minS =
        "\1\3\104\uffff";
    static final String DFA28_maxS =
        "\1\174\104\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\2\1\1\102\uffff";
    static final String DFA28_specialS =
        "\105\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\3\2\2\uffff\3\2\10\uffff\3\2\1\uffff\1\2\1\uffff\3\2\2\uffff"+
            "\2\2\2\uffff\2\2\3\uffff\4\2\3\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\6\uffff\4\2\1\uffff\1\2\2\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\5\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 691:24: ( statement )*";
        }
    }
    static final String DFA29_eotS =
        "\105\uffff";
    static final String DFA29_eofS =
        "\105\uffff";
    static final String DFA29_minS =
        "\1\3\104\uffff";
    static final String DFA29_maxS =
        "\1\174\104\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\2\1\1\102\uffff";
    static final String DFA29_specialS =
        "\105\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\3\2\2\uffff\3\2\10\uffff\3\2\1\uffff\1\2\1\uffff\3\2\2\uffff"+
            "\2\2\2\uffff\2\2\3\uffff\4\2\3\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\6\uffff\4\2\1\uffff\1\2\2\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\5\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "()* loopback of 695:17: ( statement )*";
        }
    }
    static final String DFA31_eotS =
        "\105\uffff";
    static final String DFA31_eofS =
        "\105\uffff";
    static final String DFA31_minS =
        "\1\3\104\uffff";
    static final String DFA31_maxS =
        "\1\174\104\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\2\1\1\102\uffff";
    static final String DFA31_specialS =
        "\105\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\3\2\2\uffff\3\2\10\uffff\3\2\1\uffff\1\2\1\uffff\3\2\2\uffff"+
            "\2\2\2\uffff\2\2\3\uffff\4\2\3\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\4\2\6\uffff\4\2\1\uffff\1\2\2\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\5\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\4\2\2\uffff\2\2\1\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 699:61: ( statement )*";
        }
    }
    static final String DFA42_eotS =
        "\75\uffff";
    static final String DFA42_eofS =
        "\75\uffff";
    static final String DFA42_minS =
        "\1\5\6\uffff\1\2\6\uffff\1\2\4\uffff\1\2\41\uffff\3\0\5\uffff";
    static final String DFA42_maxS =
        "\1\174\6\uffff\1\2\6\uffff\1\2\4\uffff\1\2\41\uffff\3\0\5\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\13\1\14\1\15"+
        "\1\16\1\uffff\1\20\1\21\1\22\1\23\1\uffff\1\25\1\26\1\27\1\30\1"+
        "\31\1\32\1\33\1\35\1\36\1\37\1\40\1\41\1\42\1\43\16\uffff\1\44\7"+
        "\uffff\1\7\1\10\1\17\1\24\1\34";
    static final String DFA42_specialS =
        "\65\uffff\1\0\1\1\1\2\5\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\16\1\uffff\1\25\1\uffff\2\41\1\uffff\1\11\1\30\3\uffff\1"+
            "\41\3\uffff\1\41\1\40\10\uffff\1\34\1\20\1\10\1\uffff\1\60\2"+
            "\uffff\1\41\1\24\2\uffff\1\41\1\60\2\uffff\1\7\1\17\4\uffff"+
            "\1\26\7\uffff\1\41\3\uffff\1\41\1\31\1\12\6\uffff\1\41\1\14"+
            "\1\13\1\41\1\uffff\1\23\2\uffff\1\37\3\uffff\1\41\1\uffff\1"+
            "\27\1\15\1\22\2\60\2\uffff\1\36\1\35\2\uffff\1\41\2\uffff\1"+
            "\33\1\uffff\1\21\1\41\1\uffff\1\32\3\uffff\1\41\3\uffff\1\6"+
            "\1\2\1\4\1\5\2\uffff\1\41\1\1\1\uffff\1\3\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "",
            "",
            "",
            "",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "864:1: expression : ( ^( 'or' expression expression ) | ^( 'OR' expression expression ) | ^( 'xor' expression expression ) | ^( 'XOR' expression expression ) | ^( 'and' expression expression ) | ^( 'AND' expression expression ) | ^( EQUALS expression simpleRequire ) | ^( EQUALS expression expression ) | ^( ConcatAssigmentOperator expression expression ) | ^( AssignmentOperator expression expression ) | ^( IfExpression expression expression expression ) | ^( LOGICAL_OR expression expression ) | ^( LOGICAL_AND expression expression ) | ^( PIPE expression expression ) | ^( AMPERSAND expression expression ) | ^( EqualityOperator expression expression ) | ^( ComparisionOperator expression expression ) | ^( ShiftOperator expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( DOT expression expression ) | ^( ASTERISK expression expression ) | ^( FORWARD_SLASH expression expression ) | ^( PERCENT expression expression ) | ^( BANG expression ) | ^( INSTANCE_OF expression expression ) | ^( TILDE expression ) | ^( MINUS expression ) | ^( SUPPRESS_WARNINGS expression ) | ^( Cast UnquotedString expression ) | ^( Prefix IncrementOperator name ) | ^( Postfix IncrementOperator name ) | ^( NEW nameOrFunctionCall ) | ^( CLONE name ) | atomOrReference | outputFunctions );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_53 = input.LA(1);

                         
                        int index42_53 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred72_XSS()) ) {s = 56;}

                        else if ( (synpred73_XSS()) ) {s = 57;}

                         
                        input.seek(index42_53);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA42_54 = input.LA(1);

                         
                        int index42_54 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred80_XSS()) ) {s = 58;}

                        else if ( (synpred100_XSS()) ) {s = 33;}

                         
                        input.seek(index42_54);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA42_55 = input.LA(1);

                         
                        int index42_55 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred85_XSS()) ) {s = 59;}

                        else if ( (synpred93_XSS()) ) {s = 60;}

                         
                        input.seek(index42_55);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA56_eotS =
        "\115\uffff";
    static final String DFA56_eofS =
        "\1\2\114\uffff";
    static final String DFA56_minS =
        "\1\3\1\2\113\uffff";
    static final String DFA56_maxS =
        "\1\174\1\156\113\uffff";
    static final String DFA56_acceptS =
        "\2\uffff\1\2\110\uffff\1\1\1\uffff";
    static final String DFA56_specialS =
        "\115\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\2\1\uffff\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\10\2\10\uffff"+
            "\5\2\1\uffff\3\2\2\uffff\3\2\1\uffff\2\2\3\uffff\4\2\3\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\1\2\2\6\uffff\4\2\1\uffff\1\2"+
            "\2\uffff\1\2\3\uffff\1\2\1\uffff\5\2\1\uffff\3\2\1\uffff\3\2"+
            "\1\uffff\4\2\1\uffff\2\2\2\uffff\1\2\1\uffff\1\2\1\uffff\4\2"+
            "\2\uffff\2\2\1\uffff\2\2",
            "\1\2\153\uffff\1\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "1669:36: ( INSTANCE_MEMBER UnquotedString )?";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_prog86 = new BitSet(new long[]{0x9478CCEB8073B6A2L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_ignoreStatement_in_statement103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BodyString_in_statement111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Block_in_statement122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement124 = new BitSet(new long[]{0x9478CCEB8073B6A8L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_classDefinition_in_statement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexStatement_in_statement142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_statement150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDefinition180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Modifiers_in_classDefinition183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classModifier_in_classDefinition185 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_className_in_classDefinition189 = new BitSet(new long[]{0x0084000020000008L,0x0000800020008000L});
    public static final BitSet FOLLOW_extendsclass_in_classDefinition191 = new BitSet(new long[]{0x0080000020000008L,0x0000800020008000L});
    public static final BitSet FOLLOW_classImplements_in_classDefinition194 = new BitSet(new long[]{0x0080000020000008L,0x0000800000008000L});
    public static final BitSet FOLLOW_classMember_in_classDefinition197 = new BitSet(new long[]{0x0080000020000008L,0x0000800000008000L});
    public static final BitSet FOLLOW_UnquotedString_in_className216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Extends_in_extendsclass243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_extendsclass245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ignoreStatement_in_classImplements276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Method_in_classMember300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Modifiers_in_classMember303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember305 = new BitSet(new long[]{0x0000000000000118L,0x0440000000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember309 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_Params_in_classMember312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_paramDef_in_classMember314 = new BitSet(new long[]{0x0000404000000828L,0x0000400000000000L});
    public static final BitSet FOLLOW_Block_in_classMember320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_classMember322 = new BitSet(new long[]{0x9478CCEB8073B6A8L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_definitionAttribute_in_classMember338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_definitionAttribute372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOLLAR_in_definitionAttribute375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_definitionAttribute377 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_value_in_definitionAttribute380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONST_in_definitionAttribute399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_definitionAttribute401 = new BitSet(new long[]{0x1000040000020408L,0x0100410400001200L});
    public static final BitSet FOLLOW_value_in_definitionAttribute403 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Field_in_definitionAttribute422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Modifiers_in_definitionAttribute425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldModifier_in_definitionAttribute427 = new BitSet(new long[]{0x0000000000000118L,0x0440000000000000L});
    public static final BitSet FOLLOW_DOLLAR_in_definitionAttribute432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_definitionAttribute434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_value_in_definitionAttribute437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ABSTRACT_in_classModifier464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_value509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UnquotedString_in_value522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_value534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_complexStatement551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_complexStatement565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forHeader_in_complexStatement567 = new BitSet(new long[]{0x9478CCEB8073B6A0L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_statement_in_complexStatement569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_EACH_in_complexStatement579 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forHeader_in_complexStatement581 = new BitSet(new long[]{0x9478CCEB8073B6A0L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_statement_in_complexStatement583 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_complexStatement593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_whileCondition_in_complexStatement595 = new BitSet(new long[]{0x9478CCEB8073B6A0L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_statement_in_complexStatement597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_complexStatement607 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_complexStatement609 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_whileCondition_in_complexStatement611 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_complexStatement621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_complexStatement623 = new BitSet(new long[]{0x0000000400040008L});
    public static final BitSet FOLLOW_cases_in_complexStatement625 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_functionDefinition_in_complexStatement637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_complexStatement644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_complexStatement646 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_catchStatement_in_complexStatement648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CATCH_in_catchStatement664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_whileCondition_in_catchStatement666 = new BitSet(new long[]{0x9478CCEB8073B6A0L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_statement_in_catchStatement668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GLOBAL_in_simpleStatement691 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_name_in_simpleStatement693 = new BitSet(new long[]{0x0000004000200008L,0x0000400000200001L});
    public static final BitSet FOLLOW_RETURN_in_simpleStatement713 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_simpleStatement715 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_simpleRequire_in_simpleStatement730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputFunctions_in_simpleStatement738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_simpleStatement750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ignoreOthers_in_simpleStatement759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RequireOperator_in_simpleRequire785 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_simpleRequire787 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifStatement830 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifStatement832 = new BitSet(new long[]{0x9478CCEB8073B6A0L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_statement_in_ifStatement834 = new BitSet(new long[]{0x8000100000000008L});
    public static final BitSet FOLLOW_conditional_in_ifStatement836 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_conditional865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_conditional867 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_conditional886 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_conditional888 = new BitSet(new long[]{0x9478CCEB8073B6A0L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_statement_in_conditional890 = new BitSet(new long[]{0x8000100000000008L});
    public static final BitSet FOLLOW_conditional_in_conditional892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ignoreStatement_in_forHeader919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ignoreStatement_in_whileCondition936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ignoreStatement_in_ignoreOthers953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_casestatement_in_cases971 = new BitSet(new long[]{0x0000000400040002L});
    public static final BitSet FOLLOW_defaultcase_in_cases974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_casestatement1000 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_casestatement1002 = new BitSet(new long[]{0x9478CCEB8073B6A8L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_statement_in_casestatement1004 = new BitSet(new long[]{0x9478CCEB8073B6A8L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultcase1025 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_defaultcase1027 = new BitSet(new long[]{0x9478CCEB8073B6A8L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDefinition1048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_functionDefinition1050 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_Params_in_functionDefinition1053 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_paramDef_in_functionDefinition1055 = new BitSet(new long[]{0x0000404000000828L,0x0000400000000000L});
    public static final BitSet FOLLOW_Block_in_functionDefinition1060 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_functionDefinition1062 = new BitSet(new long[]{0x9478CCEB8073B6A8L,0x1B3D4DEEEFA25E07L});
    public static final BitSet FOLLOW_EQUALS_in_paramDef1096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_paramName_in_paramDef1107 = new BitSet(new long[]{0x1000044000220620L,0x0100410400201201L});
    public static final BitSet FOLLOW_atomOrReference_in_paramDef1109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_paramName_in_paramDef1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_in_paramName1153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName1155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AMPERSAND_in_paramName1168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOLLAR_in_paramName1171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName1173 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ECHO_in_outputFunctions1217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_outputFunctions1219 = new BitSet(new long[]{0x1010CCCB806236A8L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_PRINT_in_outputFunctions1258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_outputFunctions1260 = new BitSet(new long[]{0x1010CCCB806236A8L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_PRINTF_in_outputFunctions1294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_outputFunctions1296 = new BitSet(new long[]{0x1010CCCB806236A8L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_DIE_in_outputFunctions1330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_outputFunctions1332 = new BitSet(new long[]{0x1010CCCB806236A8L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_ERROR_in_outputFunctions1364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_outputFunctions1366 = new BitSet(new long[]{0x1010CCCB806236A8L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_121_in_expression1401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1403 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_115_in_expression1422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1424 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_123_in_expression1444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1446 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1448 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_116_in_expression1465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1467 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_117_in_expression1489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1491 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1493 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_114_in_expression1510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1512 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1514 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_expression1533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_simpleRequire_in_expression1537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_expression1557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1559 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1561 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ConcatAssigmentOperator_in_expression1590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1592 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AssignmentOperator_in_expression1608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1610 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IfExpression_in_expression1641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1643 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1645 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expression1666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1668 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1670 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expression1691 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1693 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PIPE_in_expression1718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1720 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AMPERSAND_in_expression1746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1748 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EqualityOperator_in_expression1772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1774 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1776 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ComparisionOperator_in_expression1796 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1798 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1800 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ShiftOperator_in_expression1823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1825 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1827 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression1839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1841 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1843 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression1853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1855 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1857 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_expression1871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1873 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1875 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_expression1889 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1891 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1893 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORWARD_SLASH_in_expression1903 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1905 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1907 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PERCENT_in_expression1917 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1919 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BANG_in_expression1931 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCE_OF_in_expression1959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1961 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression1963 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TILDE_in_expression1975 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1977 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression2002 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2004 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPPRESS_WARNINGS_in_expression2016 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Cast_in_expression2028 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_expression2030 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_expression2032 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Prefix_in_expression2048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IncrementOperator_in_expression2050 = new BitSet(new long[]{0x0000004000200000L,0x0000400000200001L});
    public static final BitSet FOLLOW_name_in_expression2052 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Postfix_in_expression2066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IncrementOperator_in_expression2068 = new BitSet(new long[]{0x0000004000200000L,0x0000400000200001L});
    public static final BitSet FOLLOW_name_in_expression2070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression2084 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_expression2086 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLONE_in_expression2106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_name_in_expression2108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atomOrReference_in_expression2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputFunctions_in_expression2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_atomOrReference2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_atomOrReference2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_arrayDeclaration2190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration2192 = new BitSet(new long[]{0x1010CCCB806236E8L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_keyValuePair_in_arrayEntry2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arrayEntry2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_ASSIGN_in_keyValuePair2247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_keyValuePair2249 = new BitSet(new long[]{0x1010CCCB806236A8L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_List_in_listDefinition2282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atomOrReference_in_listDefinition2284 = new BitSet(new long[]{0x1000444000220628L,0x0100410400201201L});
    public static final BitSet FOLLOW_EQUALS_in_listDefinition2289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_listEntry_in_listDefinition2291 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_listEntry2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ListAssign_in_listEntry2338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_listEntry2340 = new BitSet(new long[]{0x1010CCCB806236A8L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_SingleQuotedString_in_atom2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleQuotedString_in_atom2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_in_atom2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Real_in_atom2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Boolean_in_atom2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_atom2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HereDoc_in_atom2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_atom2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listDefinition_in_atom2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPERSAND_in_reference2455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference2457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Apply_in_nameOrFunctionCall2486 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall2488 = new BitSet(new long[]{0x1010CCCB806236A8L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_nameOrFunctionCall2490 = new BitSet(new long[]{0x1010CCCB806236A8L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticMemberAccess_in_name2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_name2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_name2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_MEMBER_in_staticMemberAccess2572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_staticMemberAccess2574 = new BitSet(new long[]{0x0000004000200200L,0x0000400000200001L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_staticMemberAccess2576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayAccess_in_memberAccess2605 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_INSTANCE_MEMBER_in_memberAccess2608 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_memberAccess2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTANCE_MEMBER_in_memberAccess2640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_memberAccess2642 = new BitSet(new long[]{0x0000404200201200L,0x0000400000200001L});
    public static final BitSet FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_memberAccess2644 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_arrayOrUnquotedStringOrFunctionCall2690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayAccess_in_arrayOrUnquotedStringOrFunctionCall2692 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayAccess_in_arrayOrUnquotedStringOrFunctionCall2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_arrayOrUnquotedStringOrFunctionCall2744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2746 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2748 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AssignmentOperator_in_arrayOrUnquotedStringOrFunctionCall2772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2774 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2776 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ConcatAssigmentOperator_in_arrayOrUnquotedStringOrFunctionCall2791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2793 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_arrayOrUnquotedStringOrFunctionCall2795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCE_MEMBER_in_arrayOrUnquotedStringOrFunctionCall2814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_objectNameOrMethod_in_arrayOrUnquotedStringOrFunctionCall2816 = new BitSet(new long[]{0x0000404200201200L,0x0000400000200001L});
    public static final BitSet FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_arrayOrUnquotedStringOrFunctionCall2818 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_arrayOrUnquotedStringOrFunctionCall2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_objectNameOrMethod2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_SQUARE_BRACE_in_arrayAccess2930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_arrayAccess2932 = new BitSet(new long[]{0x1010CCCB806236A8L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_arrayAccess2934 = new BitSet(new long[]{0x1010CCCB806236A8L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_DOLLAR_in_variable2958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_variable2960 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UnquotedString_in_variable2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTANCE_MEMBER_in_instanceMember2992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_instanceMember2994 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PhpStatement_in_ignoreStatement3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ignoreStatement_in_synpred2_XSS103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_synpred26_XSS509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputFunctions_in_synpred40_XSS738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred41_XSS750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_synpred72_XSS1533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred72_XSS1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_simpleRequire_in_synpred72_XSS1537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_synpred73_XSS1557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred73_XSS1559 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_synpred73_XSS1561 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AMPERSAND_in_synpred80_XSS1746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred80_XSS1748 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_synpred80_XSS1750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_synpred85_XSS1853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred85_XSS1855 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_synpred85_XSS1857 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_synpred93_XSS2002 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred93_XSS2004 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atomOrReference_in_synpred100_XSS2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_synpred124_XSS2690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayAccess_in_synpred124_XSS2692 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_synpred124_XSS2694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayAccess_in_synpred125_XSS2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_synpred126_XSS2744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred126_XSS2746 = new BitSet(new long[]{0x1010CCCB806236A0L,0x1B3C45A4CFA25E07L});
    public static final BitSet FOLLOW_expression_in_synpred126_XSS2748 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCE_MEMBER_in_synpred129_XSS2814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_objectNameOrMethod_in_synpred129_XSS2816 = new BitSet(new long[]{0x0000404200201200L,0x0000400000200001L});
    public static final BitSet FOLLOW_arrayOrUnquotedStringOrFunctionCall_in_synpred129_XSS2818 = new BitSet(new long[]{0x0000000000000008L});

}