/*
 * Represent a symbol in scope
 */

package org.homeunix.wap.table.symbol;

import org.homeunix.wap.table.tainted.RootTaintedSymbol;
import org.homeunix.wap.table.tainted.UntaintedTable;
import org.homeunix.wap.table.tainted.TaintedTable;
import org.homeunix.wap.table.tainted.VariableTaintedSymbol;
import org.homeunix.wap.table.tainted.RelatedTaintedSymbol;
import java.util.*;


/**
 *
 * @author Iberia Medeiros
 */
public abstract class ScopedSymbol extends Symbol implements Scope, Cloneable{
    public Scope parent;

    // *** CONSTRUCTORS
    public ScopedSymbol(String name, int line, int tainted, Scope parent, String file) {
        super(name, tainted, line, file);
        this.parent = parent;
    }


    // *** METHODS

    // give the scope name
    public String getScopeName() {
    	return this.getName();
    }

    // am I nested in another?
    public Scope getEnclosingScope() {
        return parent;

    }
  
    // get the taint value of scope root symbol
    public Integer getTainted(Scope sc) {
        return sc.getScopeSymbol().getTainted();
    }

    // give the root symbol of the scope
     public Symbol getScopeSymbol() {
    	return super.getSymbol();
    }

    /* Insert symbol in Map
     * This symbol is a member of an assign instruction or a call function instruction
     */
    public void define(Symbol sym, Scope scp, Boolean IsVariableSymbol) {
        getMembers().add(sym); 
        sym.setRootScope(scp);
        sym.setScope(this);
        sym.setIsVariableSymbol(IsVariableSymbol); 
    }

    /*
     * Resolve Symbol... Bottom-Up navegation
     * This method occur after all symbols of one assign/call function instruction
     * are inserted in scope. After that, one by one is analyse (taint/untaint)
     */
    public void resolveSymbol(Scope scp, Symbol sy, TaintedTable mts, UntaintedTable mus, String file) {
        Boolean b = scp.resolve(sy, mts, mus);
        Symbol sym = scp.getScopeSymbol();

	// if symbol is tainted, then insert the symbol scope in the main TaintedTable, if it don't exist yet
	// if don't, then verify if it pass to taint to untaint, and insert in main UntaintedTable
	if (b == true){
            sy.setTainted(1);
            if (mts.getTaintedMembers().containsKey(sym.getName()) == false){ // verify if the tainted symbol exist in mts TaintedTable
                RootTaintedSymbol Rrt = new RootTaintedSymbol(sym.getName(), sym.getCodeLine(), sym.getTainted(), sym.getAlfanumeric(), sym.getFileSymbol());
                mts.define(Rrt); // insert in mts TaintedTable
            }
            else{
                RootTaintedSymbol Rrt = (RootTaintedSymbol) mts.getTaintedMembers().get(sym.getName());
                if (Rrt.getLinesList().contains(sym.getCodeLine()) == false ||
                   (Rrt.getLinesList().contains(sym.getCodeLine()) == true && Rrt.getFilesList().contains(sym.getFileSymbol()) == false)){
			Rrt.setLineCode(sym.getCodeLine());
			Rrt.setFile(sym.getFileSymbol());
                        RelatedTaintedSymbol rtt = new RelatedTaintedSymbol(sym.getCodeLine(), sym.getFileSymbol());
                        Rrt.define(rtt);
                }
	   }
	   if (mus.existSymbol(sym.getName()) == true) // verify if symbol pass to untaint to taint
		mus.removeUntaintSymbol(sym);
	}
	else{
            // verify if symbol pertence to mts and not to mus, then pass to taint to untaint
            if (mts.getTaintedMembers().containsKey(sym.getName()) == true && mus.existSymbol(sym.getName()) == false){
                RootTaintedSymbol Rrt = (RootTaintedSymbol) mts.getTaintedMembers().get(sym.getName());
		if (Rrt.getLinesList().contains(sy.getCodeLine()) == false)
                    mus.insertUntaintSymbol(sym);
            }
	}
    }


    /*
     * Give if the symbol is taint or not.
     * This method occur after all symbols of one assign/call function instruction
     * are inserted in scope. After that, one by one symbol is analyse (taint/untaint)
     */
    public Boolean resolve(Symbol symb, TaintedTable mts, UntaintedTable mus) {
    	Symbol aux;
        String s, nam;
        RelatedTaintedSymbol rtt;
        RootTaintedSymbol Rrt;
        Scope scp;

        // Caso o symbol ja seja tainted. Coloca o parent scope a taint
        Symbol sym = symb;
        nam = sym.getName();
        if (sym.getTainted() == 1 && sym.getAlfanumeric() == false){
            scp =sym.getScope();
            scp.getScopeSymbol().setTainted(1);

            // No caso de nome da funcao ser tainted
            if (mts.getTaintedMembers().containsKey(nam) == true){
                // Inserir o socpe parent como dependente da funcao tainted
                Rrt = (RootTaintedSymbol) mts.getTaintedMembers().get(nam);
                rtt = (RelatedTaintedSymbol) Rrt.getListTaintedMembers().get(Rrt.getListTaintedMembers().size()-1);

                // Caso o parent nao pertenca 'a lista da funcao tainted
                if (rtt.getTaintedMembers().containsKey(scp.getScopeName()) == false){
                    VariableTaintedSymbol var = new VariableTaintedSymbol(scp.getScopeName(),
                                                scp.getScopeSymbol().getCodeLine(), scp.getScopeSymbol().getTainted(),
                                                scp.getScopeSymbol().getFileSymbol());
                    rtt.define(var);
                }
                else{ // Caso o parent pertenca 'a lista da funcao tainted
                    VariableTaintedSymbol var = (VariableTaintedSymbol) rtt.getTaintedMembers().get(scp.getScopeName());
                    var.InsertLine(scp.getScopeSymbol().getCodeLine());
                    var.InsertFile(scp.getScopeSymbol().getFileSymbol());
                }
                return true;
            }
            
            // Se uma userfunction ver se os seus parametros sao tainted e inserir a function como dependente deles
            if (sym.getIsUserFunction() == true){
                Scope scp_aux = (Scope) sym;
                String sy_name;
                Symbol sy_aux;
                Iterator <Symbol> it;
                for (it = scp_aux.getMembers().iterator(); it.hasNext(); ){
                    sy_aux = it.next();
                    sy_name = sy_aux.getName();
                    if (sy_aux.getTainted() == 1){
                        if (mts.getTaintedMembers().containsKey(sy_name) == true){
                            // Inserir o nome da user function como dependente do seu parametro
                            Rrt = (RootTaintedSymbol) mts.getTaintedMembers().get(sy_name);
                            rtt = (RelatedTaintedSymbol) Rrt.getListTaintedMembers().get(Rrt.getListTaintedMembers().size()-1);

                            // Caso a user function nao pertenca 'a lista do parametro tainted
                            if (rtt.getTaintedMembers().containsKey(sym.getName()) == false){
                                VariableTaintedSymbol var = new VariableTaintedSymbol(sym.getName(),
                                                            sym.getCodeLine(), sym.getTainted(),
                                                            sym.getFileSymbol());
                                rtt.define(var);                            
                            }
                            else{ // Caso a user function pertenca 'a lista do parametro tainted
                                VariableTaintedSymbol var = (VariableTaintedSymbol) rtt.getTaintedMembers().get(sym.getName());
                                var.InsertLine(sym.getCodeLine());
                                var.InsertFile(sym.getFileSymbol());
                            }
                        
                        }
                    }
                }
                
                //if (mts.getTaintedMembers().containsKey(nam) == false){ // verify if the tainted symbol exist in mts TaintedTable
                Rrt = new RootTaintedSymbol(sym.getName(), sym.getCodeLine(), sym.getTainted(), sym.getAlfanumeric(), sym.getFileSymbol());
                mts.define(Rrt); // insert in mts TaintedTable
            }
            
            return true;
        }

        // Caso o symbol seja uma var ja tainted e pertenca a tabela das vars tainteds
        if (mts.getTaintedMembers().containsKey(nam) == true && mus.existSymbol(sym.getName()) == false) {
            // colocar scope parent tainted
            scp =sym.getScope();
            scp.getScopeSymbol().setTainted(1);

            // Inserir o socpe parent como dependente do symbol tainted
            Rrt = (RootTaintedSymbol) mts.getTaintedMembers().get(nam);
            rtt = (RelatedTaintedSymbol) Rrt.getListTaintedMembers().get(Rrt.getListTaintedMembers().size()-1);

            // Caso o parent nao pertenca 'a lista do symbol tainted
            if (rtt.getTaintedMembers().containsKey(scp.getScopeName()) == false){
                VariableTaintedSymbol var = new VariableTaintedSymbol(scp.getScopeName(), scp.getScopeSymbol().getCodeLine(),
                                                scp.getScopeSymbol().getTainted(), scp.getScopeSymbol().getFileSymbol());
                rtt.define(var);
            }
            else{ // Caso o parent pertenca 'a lista do symbol tainted
                VariableTaintedSymbol var = (VariableTaintedSymbol) rtt.getTaintedMembers().get(scp.getScopeName());
                var.InsertLine(scp.getScopeSymbol().getCodeLine());
                var.InsertFile(scp.getScopeSymbol().getFileSymbol());
            }
            return true;
        }

        // Caso o symbol seja um alfanumeric e contenha uma var tainted da tabela das vars tainteds
        if (sym.getAlfanumeric() == true) {
            Boolean existe = false;
            Iterator <Symbol> it = mts.getTaintedMembers().values().iterator();
            for(;it.hasNext(); ){
                s = it.next().getName();

                if (nam.contains("$"+s) == true && mus.existSymbol(s) == false){
                    // colocar scope parent tainted
                    scp =sym.getScope();
                    scp.getScopeSymbol().setTainted(1);
                    
                    // Inserir o socpe parent como dependente do symbol tainted
                    Rrt = (RootTaintedSymbol) mts.getTaintedMembers().get(s);
                    rtt = (RelatedTaintedSymbol) Rrt.getListTaintedMembers().get(Rrt.getListTaintedMembers().size()-1);

                    // Caso o parent nao pertenca 'a lista do symbol tainted
                    if (rtt.getTaintedMembers().containsKey(scp.getScopeName()) == false){
                        VariableTaintedSymbol var = new VariableTaintedSymbol(scp.getScopeName(),
                                                        scp.getScopeSymbol().getCodeLine(), scp.getScopeSymbol().getTainted(),
                                                        scp.getScopeSymbol().getFileSymbol());
                        rtt.define(var);
                    }
                    else{ // Caso o parent pertenca 'a lista do symbol tainted
                        VariableTaintedSymbol var = (VariableTaintedSymbol) rtt.getTaintedMembers().get(scp.getScopeName());
                        var.InsertLine(scp.getScopeSymbol().getCodeLine());
                        var.InsertFile(scp.getScopeSymbol().getFileSymbol());
                    }

                    existe = true;
                }
            }
            
            if (sym.getTainted() == 1){
                scp =sym.getScope();
                scp.getScopeSymbol().setTainted(1);

                // No caso de nome da funcao ser tainted
                if (mts.getTaintedMembers().containsKey(nam) == true){
                    // Inserir o socpe parent como dependente da funcao tainted
                    Rrt = (RootTaintedSymbol) mts.getTaintedMembers().get(nam);
                    rtt = (RelatedTaintedSymbol) Rrt.getListTaintedMembers().get(Rrt.getListTaintedMembers().size()-1);

                    // Caso o parent nao pertenca 'a lista da funcao tainted
                    if (rtt.getTaintedMembers().containsKey(scp.getScopeName()) == false){
                        VariableTaintedSymbol var = new VariableTaintedSymbol(scp.getScopeName(),
                                                    scp.getScopeSymbol().getCodeLine(), scp.getScopeSymbol().getTainted(),
                                                    scp.getScopeSymbol().getFileSymbol());
                        rtt.define(var);
                    }
                    else{ // Caso o parent pertenca 'a lista da funcao tainted
                        VariableTaintedSymbol var = (VariableTaintedSymbol) rtt.getTaintedMembers().get(scp.getScopeName());
                        var.InsertLine(scp.getScopeSymbol().getCodeLine());
                        var.InsertFile(scp.getScopeSymbol().getFileSymbol());
                    }
                }
                existe = true;
            }           
            return existe;
        }

        return false; // nao e' tainted a var
    }


     public void resolveSymbolClass(TaintedTable mts, UntaintedTable mus, String filename){
         if (!this.getMembers().isEmpty()){
            Symbol sym1;
            for(Iterator <Symbol> it1 = this.getMembers().iterator(); it1.hasNext();){
                sym1 = it1.next();
                this.resolveSymbol(this, sym1, mts, mus, filename);
            }
         }
     }
       

    // Resolve the name of include/require files.
    // The resolution can be a normal path or a concatenation of parts of the path (inclusive vars)
    public String resolveVarInclude(Scope scp, SymbolTable st){
        Symbol sym;
	String ss, s, string_final = "";
	Scope scp_aux = scp;

        // verifica se o nome da var a resolver não se chama a si propria. $a = $var.$a
        // evita ciclo infinito, na resolucao.
        Boolean call_Itself = verifyCallItself(scp, scp.getScopeName());
        if (call_Itself == true)
            return string_final;
        
	for(Iterator <Symbol> it = scp_aux.getMembers().iterator();it.hasNext(); ){
            sym = it.next();          
            if (sym.getRootScope() != null && sym.getAlfanumeric() == false){
                scp_aux = (Scope)sym;
                try{
                    ss = scp_aux.resolveVarInclude(scp_aux, st);
                    string_final = string_final + ss;
                } catch (Exception e) {}              
            }
            else{               
                if (sym.getAlfanumeric() == true){
                    ss = sym.getName();
                    if (ss.startsWith("\"") || ss.startsWith("\'"))
                        ss = ss.substring(1,ss.length()-1);
                }

                Boolean found = false;
                ss = sym.getName();
                for(Iterator <Symbol> it1 = st.getMembers().iterator();it1.hasNext(); ){
                    sym = it1.next();
                    s = sym.getName();                        
                    if (s.equals(ss) == true){
                        int i = st.getMembers().indexOf(sym);
                        scp_aux = (Scope) st.getMembers().get(i);
                        try{
                        ss = scp_aux.resolveVarInclude(scp_aux, st);
                        } catch (Exception e){}
                        found = true;
                        break;
                    } 
                }
                string_final = string_final + ss;              
            }
	}

        try{
        // remover ' ou " do path do file
        String AA[];
        AA = string_final.split("\"");
        if (AA[0].equals(string_final))
            AA = string_final.split("\'");
        
        
        String sss="";
        for (int i=0; i< AA.length; i++){
            sss = sss + AA[i];
        }

        if (sss.isEmpty() == false)
            string_final = sss;
        // fim remover
        } catch (Exception e) {}
	return string_final;
    }


   private Boolean verifyCallItself(Scope scp, String scp_name_resolve){
        Symbol sym;
        int i;
        Boolean equalItself = false;
	for(Iterator <Symbol> it = scp.getMembers().iterator(); it.hasNext();){
            sym = it.next();           
            if (sym.getRootScope() != null){
                Scope scp_aux = (Scope) sym;
                equalItself = verifyCallItself(scp_aux, scp_name_resolve);
                if (equalItself == true)
                    return true;
            }
            else{
                if (sym.getName().equals(scp_name_resolve) == true)
                    return true;
            }
        }      
       
       return equalItself;
   } 
    
    
    // Verify if the number of items of list right member (on fedinition) is equal to left member  
    public Boolean verifyNumberVarList(int num_var){
        Iterator <Symbol> it1 = this.getMembers().iterator();
        Symbol sym1;
        int i;
        for(i = 1; i < num_var; i++){
            sym1 = it1.next();
            if(sym1.getIsVariableSymbol() == false)
                break;
        }
        
        if (i == num_var)
            return true;
        else
            return false;
    }
    
    public void populateList(Scope scp_main, Scope scp_right, int num_var, TaintedTable mts, UntaintedTable mus, String filename){
        Iterator <Symbol> it = this.getMembers().iterator();
        Iterator <Symbol> it1 = scp_right.getMembers().iterator();
        Symbol sym, sym1;
        for(int i = 1; i < num_var; i++){
            sym1 = it1.next();
            sym = it.next();
            CallSymbol ms_aux = new CallSymbol(sym.getName(), sym.getCodeLine(), scp_main, 0, sym.getFileSymbol());
            VariableSymbol vs = new VariableSymbol(sym1.getName(), sym1.getTainted(), sym1.getCodeLine(), sym1.getFileSymbol()) {};
            ms_aux.define(vs, null, true);
            ms_aux.resolveSymbol(ms_aux, (Symbol) vs, mts, mus, filename);
            scp_main.define(ms_aux, ms_aux, false);
        }    
    }
    
    

    // set the scope root symbol taint
    public void setTainted(Scope sc, int taint) {
        sc.getScopeSymbol().setTainted(taint);
    }
  
    
//########################    
    // set the scope root symbol taint
    public void printtt(String sp, Scope cp) {
        System.out.println(sp+"Scope: "+cp.getScopeName());
        
        Iterator <Symbol> it=cp.getMembers().iterator();
        Symbol sy;
        for(;it.hasNext();){
            sy = it.next();
            if (sy.getRootScope() == null){
                System.out.println(sp+"\tmember: "+sy.getName());
            }
            else{
                cp = (Scope) sy;
                sp = sp + "\t";
                cp.printtt(sp, cp);
            }
        }
        
    }
    

    // give the members map
    // is implemented in CallSymbol
    //public abstract Map<String, Symbol> getMembers();
    public abstract List<Symbol> getMembers();
    
   
    public String buildCorrectSQL(String connDB, String nameDB, int lineMysqliBindParam, List UserInput, TaintedTable mts_princ, SymbolTable st, Map MainLinesToCorrect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean buildCorrectCodeInj(String fileInc, List UserInput, TaintedTable mts_princ, SymbolTable st, Map MainLinesToCorrect){
            throw new UnsupportedOperationException("Not supported yet.");
    }
}
