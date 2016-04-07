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
public class ClassTable  implements Scope{
    String name;
    List<ClassSymbol> classes;
    

    // *** CONSTRUCTORS
    public ClassTable(String name) {
        this.name = name;
        classes = new ArrayList<ClassSymbol>();
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
        return classes;
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
    public void define(ClassSymbol cl) {
    	//symbols.put(sym.getName(), sym);
        classes.add(cl);
    }
    
   /*
     * Return a specific ClassSymbol
     */
    public ClassSymbol getClassOfListClasses(String className){
        ClassSymbol cssym_final = null;
        Iterator <ClassSymbol> it = this.getMembers().iterator();
        ClassSymbol cssym;
        for (;it.hasNext();){
            cssym = it.next();
            if (cssym.getClassName().equals(className) == true){
                cssym_final = cssym;
                break;
            }
        }
        return cssym_final;
    }

    /*
     * Tells if the symbols list contains a gived symbol
     */
    
    public Boolean containsClass(String className){
        Iterator <ClassSymbol> it = this.getMembers().iterator();
        ClassSymbol cssym;
        Boolean haveClass = false;
        for (;it.hasNext();){
            cssym = it.next();
            if (cssym.getClassName().equals(className) == true){
                haveClass = true;
                break;
            }
        }
        return haveClass;
    }
     

    /*
     * Not relevant here!
     */
    //public Boolean resolve(String name, TaintedTable mts, UntaintedTable mus) {
    public void resolveSymbol(Scope scp, Symbol sy, TaintedTable mts, UntaintedTable mus, String file){
    }


    public Boolean resolve(Symbol symb, TaintedTable mts, UntaintedTable mus) {
    	//return symbols.get(name);
        return true;
    }

    @Override
    public String toString() {
    	return getScopeName()+":"+classes;
    }

    public void define(Symbol sym, Scope scp, Boolean IsVariableSymbol) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void resolveSymbolIncludeSQLI(Scope scp, TaintedTable mts, UntaintedTable mus, Map mift, String filename, Map mft, Map mst, Map varsDB, Map mftt, Map MainLinesToCorrect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String resolveVarInclude(Scope scp, SymbolTable st) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void print(Scope scp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void resolveSymbolFunctionSQLI(MethodSymbol mt, Scope rootScope, TaintedTable mts, UntaintedTable mus, Map mift, String filename, Map mft, Map mst, Map varsDB, Map mftt, Map MainLinesToCorrect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean verifyNumberVarList(int num_var) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void populateList(Scope scp_left, Scope scp_right, int num_var, TaintedTable mts, UntaintedTable mus, String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String buildCorrectSQL(String connDB, String nameDB, int lineMysqliBindParam, List UserInput, TaintedTable mts_princ, SymbolTable st, Map MainLinesToCorrect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean buildCorrectCodeInj(String fileInc, List UserInput, TaintedTable mts_princ, SymbolTable st, Map MainLinesToCorrect) {
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

    public void copyScope(Scope src, Scope dest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
