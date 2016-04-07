/*
 * Class that represent the untainted variables
 */

package org.homeunix.wap.table.tainted;

import org.homeunix.wap.table.symbol.Symbol;
import org.homeunix.wap.table.symbol.MethodSymbol;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iberia Medeiros
 */
public class UntaintedTable {
    Map<String, Symbol> symbolsUntainted;

    /* CONSTRUCTOR */
    public UntaintedTable() {
     symbolsUntainted = new LinkedHashMap<String, Symbol>();
    }


    /* METHODS of the class*/

    /*
     * Give the Map that contain the untainted variables
     */
    public Map getUntaintedMembers() {
        return symbolsUntainted;
    }

    /*
     * Verify if a untainted variable exist in Map
     */
    public Boolean existSymbol(String s) {
        return symbolsUntainted.containsKey(s);
    }

    /*
     * Insert a untainted variable in Map
     */
    public void insertUntaintSymbol(Symbol sym) {
    	symbolsUntainted.put(sym.getName(), sym);
    }

    /*
     * Remove a untainted variable from Map
     */
    public void removeUntaintSymbol(Symbol sym) {
    	symbolsUntainted.remove(sym.getName());
    }

    public void copyToMUS(UntaintedTable m) { // m = mus
        Iterator <Symbol> it = this.getUntaintedMembers().values().iterator(); // mus_aux
        Symbol sym;
        for(;it.hasNext();){
            sym = it.next();
            if (!sym.getName().equals("return"))
                m.getUntaintedMembers().put(sym.getName(), sym);
        }
    }

    public void copyGlobalsToMUS(TaintedTable mts_princ , UntaintedTable mus_princ, MethodSymbol meth_sym_clone){
        for(Iterator <Symbol> it = meth_sym_clone.getGlobalVarsOfFunction().values().iterator(); it.hasNext();){
            Symbol sym = it.next();
            if (this.getUntaintedMembers().containsKey(sym.getName()) == true && mts_princ.getTaintedMembers().containsKey(sym.getName()) == true) {
                if (mus_princ.existSymbol(sym.getName()) == false){
                    // Se passou de tainted para untainted, colocar em untainted
                    mus_princ.insertUntaintSymbol(sym);
                }
            }
        }
    }    
    
    
    public UntaintedTable copyUntaintedTable() {
        UntaintedTable tab = new UntaintedTable();
        for(Iterator <Symbol> it = this.getUntaintedMembers().values().iterator(); it.hasNext();){
		Symbol cs = it.next();
            try {
                tab.getUntaintedMembers().put(cs.getName(), cs.clone());
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(UntaintedTable.class.getName()).log(Level.SEVERE, null, ex);
            }
	 }
    	return tab;
    }
    
     public void cleanAll(){
        Collection <Symbol> c = this.symbolsUntainted.values();
    	c.removeAll(c);
    	this.symbolsUntainted.clear();
    }

}
