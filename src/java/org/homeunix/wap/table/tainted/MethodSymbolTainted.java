/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.table.tainted;

/**
 *
 * @author iberiam
 */
public class MethodSymbolTainted {
    String functionNameCall;
    int lineCall;
    String fileOfMethod; // file that calls the method
    TaintedTable tabtaint;
    
    /* CONSTRUCTOR*/
    public MethodSymbolTainted(String func, int line, String file) {
        this.functionNameCall = func;
        this.lineCall = line;
        this.fileOfMethod = file;
        this.tabtaint = new TaintedTable(func, file); //entra o nome da funcao e o nome do ficheiro
    }    
    
    /* METHODS*/
    
    public String getFunctionNameCall(){
        return this.functionNameCall;
    }
    
    public int getLineNumberCall(){
        return this.lineCall;
    }

    public String getFileOfMethod(){
        return this.fileOfMethod;
    }    
    
    public TaintedTable getFunctionTaintedTable(){
        return this.tabtaint;
    }   
}
