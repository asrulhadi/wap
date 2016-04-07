/*
 * Symbol that represent taint Variable, that will be include in Map of
 * RelatedTaintedVariables
 */

package org.homeunix.wap.table.tainted;

import org.homeunix.wap.table.symbol.Symbol;
import java.util.*;

/**
 *
 * @author Iberia Medeiros
 */
public class VariableTaintedSymbol extends Symbol{
    // criacao do mapa de variaveis/funcoes tainted a inserir nos mapas das relacoes
    List<Integer> linesVars; // Lista que armazenara as linhas de vars, fun tainteds
    List<String> filesVars; // Lista que armazenara as ficheiros a que pertencem as vars, fun tainteds

    /* CONSTRUCTOR */
    public VariableTaintedSymbol(String name, int line, int tainted, String file){
        super(name, tainted, line, file);
        linesVars = new ArrayList<Integer>();
        filesVars = new ArrayList<String>();
        linesVars.add(line);
        filesVars.add(file);
    }


    /* METHODS of the class*/

    /*
     * Insert a code line in List of the tainted variable included in RelatedTaintedSymbol Map.
     * This appened when dependent tainted variable is identified, and your code line
     * is included in List
     */
    public void InsertLine (int line){
        linesVars.add(line);
    }

    /*
     * Give the List of line codes from the variable included in RelatedTainted Map
     */
    public List getVariableLines (){
        return linesVars;
    }    

    /*
     * Insert name of file in List of the tainted variable included in RelatedTaintedSymbol Map.
     * This appened when dependent tainted variable is identified, and your file name
     * is included in List
     */
    public void InsertFile (String file){
        filesVars.add(file);
    }

    /*
     * Give the List of files from the variable included in RelatedTainted Map
     */
    public List getVariableFiles (){
        return filesVars;
    }
}
