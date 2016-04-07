/*
 * single-scope symtab
 * One file without functions and class.
 */

package org.homeunix.wap.table.symbol;

import org.homeunix.wap.table.tainted.TaintedTable;
import org.homeunix.wap.table.tainted.UntaintedTable;
import java.util.*;

/**
 *
 * @author Iberia Medeiros
 */
public class MethodTable implements Scope{
    String name;
    List<MethodSymbol> methods;
    

    // *** CONSTRUCTORS
    public MethodTable(String name) {
        this.name = name;
        //symbols = new LinkedHashMap<String, Symbol>();
        methods = new ArrayList<MethodSymbol>();
    }


    // *** METHODS

    // Satisfy Scope interface
    public String getScopeName() {
        return name;
    }

    // am I nested in another?
    public Scope getEnclosingScope() {
    	return null;
    }

    /*
     * Give the List that contain the methods (functions defined by user) of the file
     */
    public List getMembers() {       
        return methods;
    }
    
    public List getMembersList() {
        return null;
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
     * Insert a root symbol (new scope) in main Map.
     */
    public void define(MethodSymbol meth) {
        methods.add(meth);
    }
    
        /*
     * Insert a root symbol (new scope) in main Map.
     */
    //public void define(Symbol sym, Scope scp, Boolean IsVariableSymbol) {
    public void define(MethodSymbol meth, Scope scp, Boolean IsVariableSymbol) {        
        methods.add(meth);
        meth.setRootScope(scp);
        meth.setScope(this);
        meth.setIsVariableSymbol(IsVariableSymbol);
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
    	//return symbols.get(name);
        return true;
    }



    /*
     * Print the elements of the main Map scope.
     */
    public void print(Scope scp){
        Symbol aux1 = null;
        Scope s;
        if (!scp.getMembers().isEmpty()){
            System.out.println("\nScope: "+scp.getScopeName()+"\tsize="+scp.getMembers().size());
            Iterator <Symbol> it = scp.getMembers().iterator();
            for(; it.hasNext();){
                aux1 = it.next();
                //System.out.println("Name: "+aux1.getName()+"\t\tline: "+aux1.getCodeLine()+"\t\ttainted: "
                //                +aux1.getTainted()+"\t\tScope: "+aux1.getScope().getScopeName()+"\n");
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
    	return getScopeName()+":"+methods;
    }

    public void resolveSymbolIncludeSQLI(Scope scp, TaintedTable mts, UntaintedTable mus, Map mift, String filename, Map mft, Map mst, Map varsDB, Map mftt, Map MainLinesToCorrect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String resolveVarInclude(Scope scp, SymbolTable st) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void define(Symbol sym, Scope scp, Boolean IsVariableSymbol) {
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
