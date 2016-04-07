/*
 * Each object of this class is a element (member) of tme main Map TaintedTable
 */

package org.homeunix.wap.table.tainted;


import org.homeunix.wap.table.symbol.Symbol;
import java.util.*;

/**
 *
 * @author Iberia Medeiros
 */
public class RelatedTaintedSymbol implements ScopeTainted{
    // criacao do mapa de variaveis/funcoes tainted e relacoes
    Map<String, VariableTaintedSymbol> MapVarTaint;
    int lineRts; // Lista que armazenara as linhas de vars, fun tainteds
    String fileRts; // Lista que armazenara os files names de vars, fun tainteds


    /* CONSTRUCTOR */
    public RelatedTaintedSymbol(int line, String file){
        MapVarTaint = new LinkedHashMap<String, VariableTaintedSymbol>();
        this.lineRts = line;
        this.fileRts = file;
    }


    /* METHODS that satisfy TaintedScope interface*/

    /*
     * Give the the name of RelatedTaintedSymbol scope.
     */
    public String getScopeTaintedName() {
    	throw new UnsupportedOperationException("Not supported yet.");
    }

     /*
     * If the tainted scope is enclosing in another (if have parent), give the
     * name of the parent scope.
     */
    public ScopeTainted getEnclosingScopeTainted() {
    	throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Give the Map that contain the tainted variables dependents of the
     * variable included in main Map
     */
    public Map getTaintedMembers() {
        return MapVarTaint;
    }

    /*
     * Give the List of line codes from the variable included in main Map
     */
    public int getLineRts (){
        return lineRts;
    }

    /*
     * Give the List of the files names from the variable included in main Map
     */
    public String getFileRts (){
        return fileRts;
    }

    /*
     * Insert a tainted variable in Map of the tainted variable included in main Map.
     * Each member of this Map is a VariableTaintedSymbol, composed by:
     * Symbol and List to store code lines of tainted variables
     */
    public void define(VariableTaintedSymbol sym) {
        MapVarTaint.put(sym.getName(), sym);
    }

    /*
     * Insert a code line in List of the tainted variable included in main Map.
     * This appened when new tainted variable is identified, and your code line
     * is included in List
     */
    public void setLineRts (int line){
        lineRts = line;
    }

    /*
     * Insert a file name in List of the tainted variable included in main Map.
     * This appened when new tainted variable is identified, and your code line
     * is included in List
     */
    public void setFileRts (String file){
       fileRts = file;
    }

    public void define(Symbol sym) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List getListTaintedMembers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
