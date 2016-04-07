/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.table.tainted;

import org.homeunix.wap.table.symbol.Symbol;
import java.util.*;

/**
 *
 * @author iberiam
 */
public class RootTaintedSymbol extends Symbol{
    String nameRootSymbol;
    List<RelatedTaintedSymbol> symbolsTainted;
    List<Integer> lines; // Lista que armazenara as linhas de vars, fun tainteds
    List<String> files; // Lista que armazenara os files names de vars, fun tainteds
    
    /* CONSTRUCTOR */
    public RootTaintedSymbol(String name, int line, int tainted, Boolean alfanumeric, String file){
        super(name, tainted, line, alfanumeric, file);
        symbolsTainted = new ArrayList<RelatedTaintedSymbol>();
        this.nameRootSymbol = name;
        lines = new ArrayList<Integer>();
        files = new ArrayList<String>();
        RelatedTaintedSymbol rrt = new RelatedTaintedSymbol(line, file);
        this.define(rrt);
    }
    
    /* METHODS that satisfy TaintedScope interface*/

    /*
     * Give the the name of taintedScope. How this scope don't have parent, then
     * your name is "globaltainted"
     */
    public String getScopeTaintedName() {
        return nameRootSymbol;
    }

    /*
     * If the tainted scope is enclosing in another (if have parent), give the
     * name of the parent scope.
     * How the Tainted Table is the main scope, then don't have parent (null)
     */
    public ScopeTainted getEnclosingScopeTainted() {
    	return null;
    }

    /*
     * Give the main Map that contain the tainted variables
     */
    public List getListTaintedMembers() {
        return symbolsTainted;
    }

    /*
     * Give the List of line codes from the variable included in main Map
     */
    public List getLinesList (){
        return lines;
    }

    /*
     * Give the List of the files names from the variable included in main Map
     */
    public List getFilesList (){
        return files;
    }    
    
    /*
     * Insert a tainted variable in main Map.
     * Each member of main Map is a RelatedTaintedSymbol, composed by:
     * Map VariableTaintedSymbol and List to store code lines of tainted variables
     */
    public final void define(RelatedTaintedSymbol rtt) {
    	symbolsTainted.add(rtt);
        lines.add(rtt.getLineRts());
        files.add(rtt.getFileRts());
    }
    
    /*
     * Insert a code line in List of the tainted variable included in main Map.
     * This appened when new tainted variable is identified, and your code line
     * is included in List
     */
    public void setLineCode (int line){
        lines.add(line);
    }

    /*
     * Insert a file name in List of the tainted variable included in main Map.
     * This appened when new tainted variable is identified, and your code line
     * is included in List
     */
    public void setFile (String file){
       files.add(file);
    }
    
}
