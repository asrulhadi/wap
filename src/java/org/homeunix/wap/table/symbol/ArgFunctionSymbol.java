/*
 * This class will represent global variable, functions parameters and local variable.
 * An Object of this class is caracterized by name and tainted value
 */

package org.homeunix.wap.table.symbol;

/**
 *
 * @author Iberia Medeiros
 */
//public class ArgFunctionSymbol extends Symbol{
public class ArgFunctionSymbol implements Cloneable{
    String paramName;
    int line;
    String type; // var => $var; pointer => &$var; equal => $var = qq
    String equal; // -; -; atom
    String callFunctionArg; //var que entra na chamada da funcao
    int positionParam; //primeiro, segundo,... parametro
    int taintedValueCallFunctionArg; //tainted value da var que entra na chamada da funcao
    
    // *** CONSTRUCTORS
    //public ArgFunctionSymbol(String name, int tainted, int line, String file, String t, String e, int p) {
    public ArgFunctionSymbol(String name, int line, String t, String e, int p) {    
        this.paramName = name;
        this.line = line;
        this.type = t;
        this.equal = e;
        this.positionParam = p;
        this.callFunctionArg = "";
        this.taintedValueCallFunctionArg = 0;
    }

    // *** METHODS
    
    public String getParamName() {
        return paramName;
    }
    
    public int getLine() {
        return line;
    }
    
    public String getType() {
        return type;
    }

    public String getEqual() {
        return equal;
    }
    
    public String getCallFunctionArg() {
        return this.callFunctionArg;
    }
    
    public int getTaintedValueCallFunctionArg() {
        return taintedValueCallFunctionArg;
    }
    
    public int getPositionParam() {
        return positionParam;
    }

    public void setParamName(String name) {
        this.paramName = name;
    }
    
    public void setLine(int l) {
        this.line = l;
    }
    
    public void setType(String t) {
        this.type = t;
    }
    
    public void setEqual(String e) {
        this.equal = e;
    }
    
    public void setCallFunctionArg(String arg) {
        this.callFunctionArg = arg;
    }
    
    public void setTaintedValueCallFunctionArg(int t) {
        this.taintedValueCallFunctionArg = t;
    }
    
    public void setPositionParam(int p) {
        positionParam = p;
    }
    
     @Override
     public Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }
}
