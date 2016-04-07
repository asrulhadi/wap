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
public class InstanceTable implements Scope {
    String name;
    List <Instance> instances;
    

    // *** CONSTRUCTORS
    public InstanceTable(String name) {
        this.name = name;
        instances = new ArrayList <Instance>();
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
        return instances;
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
     * Return a specific Instance
     */
    public Instance getInstanceOfListInstances(String instName){
        Instance inst_final = null;
        Iterator <Instance> it = this.getMembers().iterator();
        Instance ins;
        for (;it.hasNext();){
                ins = it.next();
                if (ins.getInstanceName().equals(instName) == true){
                    inst_final = ins;
                    break;
                }
        }
        return inst_final;
    }

    /*
     * Tells if the Instance list contains a gived Instance
     */

    public Boolean containsInstance(String instName){
        Iterator <Instance> it = this.getMembers().iterator();
        Instance ins;
        Boolean haveInst = false;
        for (;it.hasNext();){
                ins = it.next();
                if (ins.getInstanceName().equals(instName) == true){
                    haveInst = true;
                    break;
                }
        }
        return haveInst;
    }



    /*
     * Insert a root symbol (new scope) in main Map.
     */
    public void define(Instance obj) {
    	//symbols.put(sym.getName(), sym);
        instances.add(obj);
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



    @Override
    public String toString() {
    	return getScopeName()+":"+instances;
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

    public void print(Scope scp) {
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
