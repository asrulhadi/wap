/*
 * single-scope symtab
 * One file without functions and class.
 */

package org.homeunix.wap.table.symbol;
import org.homeunix.wap.sqli.GlobalDataSqli;
import org.homeunix.wap.sqli.buildWalkerTree_sqli;
import java.io.IOException;
import org.homeunix.wap.table.tainted.TaintedTable;
import org.homeunix.wap.table.tainted.UntaintedTable;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.homeunix.wap.CodeInjection.GlobalDataCodeInj;
import org.homeunix.wap.CodeInjection.buildWalkerTree_CodeInj;
import org.homeunix.wap.XSS.GlobalDataXSS;
import org.homeunix.wap.XSS.buildWalkerTree_XSS;
import org.homeunix.wap.table.tainted.MethodTaintedTable;
import org.homeunix.wap.utils.GlobalDataApp;
import org.homeunix.wap.utils.buildAST;

/**
 *
 * @author Iberia Medeiros
 */
public class SymbolTable implements Scope{
    String name;
    //Map<String, Symbol> symbols;
    List<Symbol> symbols;
    Boolean haveFunctions;
    Boolean haveClasses;
    List<String> includeFiles;
    Map <String, Symbol> aliases;
    Map <String, Symbol> globalVars;
    MethodTableCalls methodCallInstance;    // para somente os StaticMemberAccees diferentes de self e parent
    MethodTaintedTable methTaintedInstance; // para somente os StaticMemberAccees diferentes de self e parent


    // *** CONSTRUCTORS
    public SymbolTable(String name) {
        this.name = name;
        //symbols = new LinkedHashMap<String, Symbol>();
        symbols = new ArrayList<Symbol>();
        haveFunctions = false;
        haveClasses = false;
        includeFiles = new ArrayList<String>();
        this.aliases = new LinkedHashMap<String, Symbol>();
        this.globalVars = new LinkedHashMap<String, Symbol>();

        // cria a tabela para as st dos StaticMemberAccees que serao chamados diferentes de self e parent
        methodCallInstance = new MethodTableCalls(name);

        // cria a tainted table para as chamadas dos StaticMemberAccees diferentes de self e parent
        methTaintedInstance = new MethodTaintedTable(name);
   }

    // *** METHODS

    // Satisfy Scope interface
    public String getScopeName() {
    	//return "global";
        return name;
    }

    // am I nested in another?
    public Scope getEnclosingScope() {
    	return null;
    }

    /*
     * Give the Map that contain the Symbols of main Map
     * This symbols are root symbol the scopes CallSymbol (for Callfunction
     * or assign instrutions) or MethodSymbol (for user function definition)
     */
    public List getMembers() {
        return symbols;
    }

    /*
     * Give the root Symbol of the scope. In another words, give the symbol
     * that create a new scope.
     * Here, in main table of symbols, don't exist root symbol.
     */
    public Symbol getScopeSymbol() {
    	return null;
    }

    /*
     * Tell if file have functions definied by the programmer
     */
    public Boolean getHaveFunctions() {
    	return haveFunctions;
    }

    /*
     * Tell if file have classes definied by the programmer
     */
    public Boolean getHaveClasses() {
    	return haveClasses;
    }

    /*
     * Give the list of the include files that the analysed file have
     */
    public List<String> getIncludeFiles() {
    	return includeFiles;
    }

    /*
     * Give the Map of the alises defined inthe symbolTable
     */
    public Map getAliases(){
        return this.aliases;
    }

    public Map getGlobalVarsOfSymbolTable() {
        return globalVars;
    }

    public MethodTableCalls getMethodCallInstance() {
        return this.methodCallInstance;
    }

    public MethodTaintedTable getMethodTaintedInstance() {
        return this.methTaintedInstance;
    }
    
    public String getInstanceNameFromAliases(String s, InstanceTable instTab){
        String instName = "";
        boolean found = false;
        while (found == false){
            if (instTab.containsInstance(s) == true){
                instName = s;
                found = true;
            }
            else{
                if (this.getAliases().containsKey(s)){
                    Symbol sym = (Symbol) this.getAliases().get(s);
                    s = sym.getName();
                }
            }
        }
        return instName;
    }

    /*
     * Return a specific symbol
     */
    public Symbol getSymbolOfListSymbols(String symName){
        Symbol sym_final = null;
        Iterator <Symbol> it = this.getMembers().iterator();
        Symbol sym;
        for (;it.hasNext();){
                sym = it.next();
                if (sym.getName().equals(symName) == true){
                    sym_final = sym;
                    break;
                }
        }
        return sym_final;
    }

    /*
     * Tells if the symbols list contains a gived symbol
     */
    public Boolean containsSymbol(String symName){
        Iterator <Symbol> it = this.getMembers().iterator();
        Symbol sym;
        Boolean haveSymbol = false;
        for (;it.hasNext();){
                sym = it.next();
                if (sym.getName().equals(symName) == true){
                    haveSymbol = true;
                    break;
                }
        }
        return haveSymbol;
    }

    /*
     * Insert a root symbol (new scope) in main Map.
     */
    public void define(Symbol sym, Scope scp, Boolean IsVariableSymbol) {
        symbols.add(sym);
        sym.setRootScope(scp);
        sym.setScope(this);
        sym.setIsVariableSymbol(IsVariableSymbol);
    }

    /*
     * Set true if the analysed file have functions defined by user
     */
    public void setHaveFunctions(){
        haveFunctions = true;
    }

    /*
     * Set true if the analysed file have classes defined by user
     */
    public void setHaveClasses(){
        haveClasses = true;
    }
    
    public void setGlobalVarSymbolTable(String varName, Symbol gvar) {
        globalVars.put(varName, gvar);
    }

    /*
     * Set true if the analysed file have functions defined by user
     */
    public void setAllSymbols(List<Symbol> syms){
        symbols.addAll(syms);
    }
    
    /*
     * Set true if the analysed file have functions defined by user
     */
    public void setAllIncludeFiles(List<String> incs){
        includeFiles.addAll(incs);
    }    

    /*
     * Not relevant here!
     */
    //public Boolean resolve(String name, TaintedTable mts, UntaintedTable mus) {
    public void resolveSymbol(Scope scp, Symbol sy, TaintedTable mts, UntaintedTable mus, String file){
    	//return symbols.get(name);
    //    return true;
    }


    public Boolean resolve(Symbol symb, TaintedTable mts, UntaintedTable mus) {
        return true;
    }
     
    /*
     * Move include file symbolTable from mst to mift
     */
    public void mvIncludeFiles(List fileList) throws IOException{
        for(Iterator <String> it1 = this.getIncludeFiles().iterator(); it1.hasNext();){
            String s = it1.next();
            if(GlobalDataApp.args_flags[3] == 1){
                if (GlobalDataSqli.MainSymbolTable.containsKey(s) == true){
                    GlobalDataSqli.MainIncludeFilesTable.put(s, (SymbolTable)GlobalDataSqli.MainSymbolTable.get(s));
                    GlobalDataSqli.MainSymbolTable.remove(s);
                }
                else{
                    if (GlobalDataSqli.MainIncludeFilesTable.containsKey(s) == false){
                        try {
                            // file include do not exists in mst and mift
                            // Create AST
                            buildAST ast = new buildAST(s, 0);
                            CommonTreeNodeStream nodes = ast.getNodes();
                            
                            // build walker tree to SQLI
                            buildWalkerTree_sqli sqli = new buildWalkerTree_sqli(nodes, s, GlobalDataSqli.MainSymbolTable, GlobalDataSqli.MainIncludeFilesTable,
                                    GlobalDataSqli.MainFunctionsTable, GlobalDataSqli.MainFunctionsTaintedTable,
                                    GlobalDataSqli.MainTaintedTable, GlobalDataSqli.mus, GlobalDataSqli.MainLinesToCorrect,
                                    GlobalDataSqli.MainClassesTable, GlobalDataSqli.MainInstancesTable, fileList);
                            
                            GlobalDataSqli.MainIncludeFilesTable.put(s, (SymbolTable)GlobalDataSqli.MainSymbolTable.get(s));
                            GlobalDataSqli.MainSymbolTable.remove(s);
                        } catch (RecognitionException ex) {
                            Logger.getLogger(SymbolTable.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                SymbolTable st_aux = GlobalDataSqli.MainIncludeFilesTable.get(s);
                if (st_aux.getIncludeFiles().isEmpty() == false){
                    st_aux.mvIncludeFiles(fileList);
                }
            }

            if(GlobalDataApp.args_flags[6] == 1){
                if (GlobalDataCodeInj.MainSymbolTable.containsKey(s) == true){
                    GlobalDataCodeInj.MainIncludeFilesTable.put(s, (SymbolTable)GlobalDataCodeInj.MainSymbolTable.get(s));
                    GlobalDataCodeInj.MainSymbolTable.remove(s);
                }
                else{
                    if (GlobalDataCodeInj.MainIncludeFilesTable.containsKey(s) == false){
                        // file include do not exists in mst and mift
                        // Create AST
                        buildAST ast = new buildAST(s, 0);
                        CommonTreeNodeStream nodes = ast.getNodes();

                        // build walker tree to SQLI
                        buildWalkerTree_CodeInj ci = new buildWalkerTree_CodeInj(nodes, s, GlobalDataCodeInj.MainSymbolTable, GlobalDataCodeInj.MainIncludeFilesTable,
                                                                            GlobalDataCodeInj.MainFunctionsTable, GlobalDataCodeInj.MainFunctionsTaintedTable,
                                                                            GlobalDataCodeInj.MainTaintedTable, GlobalDataCodeInj.mus, GlobalDataCodeInj.MainLinesToCorrect,
                                                                            GlobalDataCodeInj.MainClassesTable, GlobalDataCodeInj.MainInstancesTable, fileList); 

                        GlobalDataCodeInj.MainIncludeFilesTable.put(s, (SymbolTable)GlobalDataCodeInj.MainSymbolTable.get(s));
                        GlobalDataCodeInj.MainSymbolTable.remove(s);
                    }
                }

                SymbolTable st_aux = GlobalDataCodeInj.MainIncludeFilesTable.get(s);
                if (st_aux.getIncludeFiles().isEmpty() == false){
                    st_aux.mvIncludeFiles(fileList);
                }
            }

            if(GlobalDataApp.args_flags[7] == 1){
                if (GlobalDataXSS.MainSymbolTable.containsKey(s) == true){
                    GlobalDataXSS.MainIncludeFilesTable.put(s, (SymbolTable)GlobalDataXSS.MainSymbolTable.get(s));
                    GlobalDataXSS.MainSymbolTable.remove(s);
                }
                else{
                    if (GlobalDataXSS.MainIncludeFilesTable.containsKey(s) == false){
                        // file include do not exists in mst and mift
                        // Create AST
                        buildAST ast = new buildAST(s, 0);
                        CommonTreeNodeStream nodes = ast.getNodes();

                        // build walker tree to SQLI
                        buildWalkerTree_XSS xss = new buildWalkerTree_XSS(nodes, s, GlobalDataXSS.MainSymbolTable, GlobalDataXSS.MainIncludeFilesTable,
                                                                            GlobalDataXSS.MainFunctionsTable, GlobalDataXSS.MainFunctionsTaintedTable,
                                                                            GlobalDataXSS.MainTaintedTable, GlobalDataXSS.mus, GlobalDataXSS.MainLinesToCorrect,
                                                                            GlobalDataXSS.MainClassesTable, GlobalDataXSS.MainInstancesTable, fileList);

                        GlobalDataXSS.MainIncludeFilesTable.put(s, (SymbolTable)GlobalDataXSS.MainSymbolTable.get(s));
                        GlobalDataXSS.MainSymbolTable.remove(s);
                    }
                }

                SymbolTable st_aux = GlobalDataXSS.MainIncludeFilesTable.get(s);
                if (st_aux.getIncludeFiles().isEmpty() == false){
                    st_aux.mvIncludeFiles(fileList);
                }
            }
        }        
    }

    
    
    /*
     * Move include file symbolTable from mst to mift
     */
    public void mvIncludeFiles(List fileList, String file) throws IOException{
    if(GlobalDataApp.args_flags[3] == 1){
        if (GlobalDataSqli.MainIncludeFilesTable.containsKey(file) == false){
            if (GlobalDataSqli.MainSymbolTable.containsKey(file) == true){                               
                GlobalDataSqli.MainIncludeFilesTable.put(file, (SymbolTable)GlobalDataSqli.MainSymbolTable.get(file));
                GlobalDataSqli.MainSymbolTable.remove(file);
            }
            else{
                try {
                    // file include do not exists in mst and mift
                    // Create AST
                    buildAST ast = new buildAST(file, 0);
                    CommonTreeNodeStream nodes = ast.getNodes();
                    
                    // build walker tree to SQLI
                    buildWalkerTree_sqli sqli = new buildWalkerTree_sqli(nodes, file, GlobalDataSqli.MainSymbolTable, GlobalDataSqli.MainIncludeFilesTable,
                            GlobalDataSqli.MainFunctionsTable, GlobalDataSqli.MainFunctionsTaintedTable,
                            GlobalDataSqli.MainTaintedTable, GlobalDataSqli.mus, GlobalDataSqli.MainLinesToCorrect,
                            GlobalDataSqli.MainClassesTable, GlobalDataSqli.MainInstancesTable, fileList);
                    
                    GlobalDataSqli.MainIncludeFilesTable.put(file, (SymbolTable)GlobalDataSqli.MainSymbolTable.get(file));
                    GlobalDataSqli.MainSymbolTable.remove(file);
                } catch (RecognitionException ex) {
                    Logger.getLogger(SymbolTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } 
    }
        
    if(GlobalDataApp.args_flags[6] == 1){
        if (GlobalDataCodeInj.MainIncludeFilesTable.containsKey(file) == false){
            if (GlobalDataCodeInj.MainSymbolTable.containsKey(file) == true){
                GlobalDataCodeInj.MainIncludeFilesTable.put(file, (SymbolTable)GlobalDataCodeInj.MainSymbolTable.get(file));
                GlobalDataCodeInj.MainSymbolTable.remove(file);
            }
            else{
                try{
                    // file include do not exists in mst and mift
                    // Create AST
                    buildAST ast = new buildAST(file, 0);
                    CommonTreeNodeStream nodes = ast.getNodes();

                    // build walker tree to Code Injection
                    buildWalkerTree_CodeInj ci = new buildWalkerTree_CodeInj(nodes, file, GlobalDataCodeInj.MainSymbolTable, GlobalDataCodeInj.MainIncludeFilesTable,
                                                                        GlobalDataCodeInj.MainFunctionsTable, GlobalDataCodeInj.MainFunctionsTaintedTable,
                                                                        GlobalDataCodeInj.MainTaintedTable, GlobalDataCodeInj.mus, GlobalDataCodeInj.MainLinesToCorrect,
                                                                        GlobalDataCodeInj.MainClassesTable, GlobalDataCodeInj.MainInstancesTable, fileList);                                

                    GlobalDataCodeInj.MainIncludeFilesTable.put(file, (SymbolTable)GlobalDataCodeInj.MainSymbolTable.get(file));
                    GlobalDataCodeInj.MainSymbolTable.remove(file);
                } catch (Exception ex) {
                    Logger.getLogger(SymbolTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } 
    }        
 
    if(GlobalDataApp.args_flags[7] == 1){
        if (GlobalDataXSS.MainIncludeFilesTable.containsKey(file) == false){
            if (GlobalDataXSS.MainSymbolTable.containsKey(file) == true){
                GlobalDataXSS.MainIncludeFilesTable.put(file, (SymbolTable)GlobalDataXSS.MainSymbolTable.get(file));
                GlobalDataXSS.MainSymbolTable.remove(file);
            }
            else{
                try{
                    // file include do not exists in mst and mift
                    // Create AST
                    buildAST ast = new buildAST(file, 0);
                    CommonTreeNodeStream nodes = ast.getNodes();

                    // build walker tree to XSS
                    buildWalkerTree_XSS xss = new buildWalkerTree_XSS(nodes, file, GlobalDataXSS.MainSymbolTable, GlobalDataXSS.MainIncludeFilesTable,
                                                                        GlobalDataXSS.MainFunctionsTable, GlobalDataXSS.MainFunctionsTaintedTable,
                                                                        GlobalDataXSS.MainTaintedTable, GlobalDataXSS.mus, GlobalDataXSS.MainLinesToCorrect,
                                                                        GlobalDataXSS.MainClassesTable, GlobalDataXSS.MainInstancesTable, fileList);                                

                    GlobalDataXSS.MainIncludeFilesTable.put(file, (SymbolTable)GlobalDataXSS.MainSymbolTable.get(file));
                    GlobalDataXSS.MainSymbolTable.remove(file);
                } catch (Exception ex) {
                    Logger.getLogger(SymbolTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } 
    }           
}    
      

    /*
     * Print the elements of the main Map scope.
     */
    public void print(Scope scp){
        Symbol aux1;
        Scope s;
        if (!scp.getMembers().isEmpty()){
            System.out.println("\nScope: "+scp.getScopeName()+"\tsize="+scp.getMembers().size());
            Iterator <Symbol> it = scp.getMembers().iterator();
            for(; it.hasNext();){
                aux1 = it.next();
                if ( aux1.getRootScope() != null ) { // is a root of a new scope?
                        s = aux1.getRootScope();
                        s.print(s);
                }
            }
        }
         else{
            aux1 = scp.getScopeSymbol();
             System.out.println("Name: "+aux1.getName()+"\t\tline: "+aux1.getCodeLine()+"\t\ttainted: "
                                +aux1.getTainted()+"\t\tScope: "+aux1.getScope().getScopeName()+"\n");
         }
    }


    @Override
    public String toString() {
    	return getScopeName()+":"+symbols;
    }

    public void resolveSymbolIncludeSQLI(Scope scp, TaintedTable mts, UntaintedTable mus, Map mift, String filename, Map mft, Map mst, Map varsDB, Map mftt, Map MainLinesToCorrect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String resolveVarInclude(Scope scp, SymbolTable st) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void resolveSymbolFunctionSQLI(MethodSymbol mt, Scope rootScope, TaintedTable mts, UntaintedTable mus, Map mift, String filename, Map mft, Map mst, Map varsDB, Map mftt, Map MainLinesToCorrect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean verifyNumberVarList(int num_var){
        throw new UnsupportedOperationException("Not supported yet.");    
    }
    
    public void populateList(Scope scp_left, Scope scp_right, int num_var, TaintedTable mts, UntaintedTable mus, String filename){
        throw new UnsupportedOperationException("Not supported yet.");    
    }

    public String buildCorrectSQL(String connDB, String nameDB, int lineMysqliBindParam, List UserInput, TaintedTable mts_princ, SymbolTable st, Map MainLinesToCorrect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean buildCorrectCodeInj(String fileInc, List UserInput, TaintedTable mts_princ, SymbolTable st, Map MainLinesToCorrect){
            throw new UnsupportedOperationException("Not supported yet.");
    }

    public void resolveSymbolClass(TaintedTable mts, UntaintedTable mus, String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void printtt(String string, Scope cp){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void resolveSymbolParam(TaintedTable mts, UntaintedTable mus, String filename) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void resolveParam(Symbol symb, TaintedTable mts, UntaintedTable mus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
