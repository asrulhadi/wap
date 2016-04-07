/*
 * Class that represents each symbol in program.
 * The symbol can be: variable, function, method, ...
 */

package org.homeunix.wap.table.symbol;

/**
 *
 * @author Iberia Medeiros
 */
public class Symbol implements Cloneable{
    private String name;                // All symbols at least have a name
    private int tainted = 0;                // All symbols are untainted (0), when are initialized
    private int line;                   // Code Line of the symbol
    private Scope scope;                // Symbol have a scope
    private Scope rootScope;            // Symbol can be a new scope
    private Boolean alfanumeric = false; // parameters, arguments or values are alfanumerics
    private String fileSymbol; // Symbol pertence a file - string is the completed path of the file
    private Boolean isVariableSymbol=false;   // if the symbol is a object of VariableSymbol class
    private Boolean isSecureFunction = false; // if the symbol represents a mysql secure function
    private Boolean isFunction = false;  // if the symbol is call function
    private Boolean isUserFunction = false;  // if the symbol is call user function
    private Boolean isParameterUserFunction = false;  // if the symbol is a parameter of a user funcrion or a method class
    private Boolean isTaintedFunction = false; // if the symbol represents a tainted function (ex. mysql sqli)
    private Boolean isVulDetected = false; // if the symbol is a tainted function and it was detected as vulnerable (ex. mysql sqli)
    private Boolean isInstance = false;  // if the symbol is a new instance of a class
    private Boolean isClone = false;  // if the symbol is a clone of a instance class
    private Boolean isStaticMember = false;  // if the symbol is a call the one method in static way
    private Boolean isClassInstruction = false;  // if the symbol represents a class instruction
    private Boolean isClassMethod = false;  // if the symbol is call method of the class
    // public Type type;   // Symbols have types

    // *** CONSTRUCTORS
    public Symbol(String name, int line, String file) {
	this.name = name;
        this.line = line;
        this.fileSymbol = file;
    }
    public Symbol(String name, int tainted, int line, String file) {
	this.name = name;
	this.tainted = tainted;
        this.line = line;
        this.fileSymbol = file;
    }
    public Symbol(String name, int line, Boolean alfanumeric, String file) {
	this.name = name;
        this.line = line;
        this.alfanumeric = alfanumeric;
        this.fileSymbol = file;
    }

    public Symbol(String name, int tainted, int line, Boolean alfanumeric, String file) {
	this.name = name;
	this.tainted = tainted;
        this.line = line;
        this.alfanumeric = alfanumeric;
        this.fileSymbol = file;
    }


    // *** METHODS

    // Get the name of the symbol
    public String getName() {
	return name;
    }

    // Get the tainted value of the symbol
    public int getTainted() {
	return tainted;
    }

    // Get the number code line of the symbol
    public int getCodeLine() {
	return line;
    }

    // Get the alfanumeric value of the symbol
    public Boolean getAlfanumeric() {
	return alfanumeric;
    }

    // Get the Scope of the Symbol
    public Scope getScope() {
	return scope;
    }

    // Get rootScope of Symbol
    public Scope getRootScope() {
	return rootScope;
    }

    // Get Symbol
    public Symbol getSymbol() {
	return this;
    }

    // give the file that the symbol pertence
    public String getFileSymbol() {
        return fileSymbol;
    }

    // Tell if the symcol is a vaiable or not (callSymbol ou other)
    public Boolean getIsVariableSymbol() {
        return isVariableSymbol;
    }
    
    // Tell if the symbol is represents a mysql secure function
    public Boolean getIsSecureFunction() {
        return isSecureFunction;
    }
    
    // Tell if the symbol is a call function
    public Boolean getIsFunction() {
        return isFunction;
    }

    // Tell if the symbol is a User function
    public Boolean getIsUserFunction() {
        return isUserFunction;
    }
    
    // Tell if the symbol is a parameter of a User function or method class
    public Boolean getIsParamUserFunction() {
        return isParameterUserFunction;
    }
    
    // Tell if the symbol represents a mysql sqli function
    public Boolean getIsTaintedFunction() {
        return isTaintedFunction;
    }

    // Tell if the symbol is detected as vulnerable
    public Boolean getIsVulDetected() {
        return isVulDetected;
    }    
    
    // Tell if the symbol represents a instance of a class
    public Boolean getIsInstance() {
        return isInstance;
    }   

    // Tell if the symbol is a clone of a instance class
    public Boolean getIsClone() {
        return isClone;
    }

    // Tell if the symbol is a call of method class in static way
    public Boolean getIsStaticMember() {
        return isStaticMember;
    }

    // Tell if the symbol represents a class instruction
    public Boolean getIsClassInstruction() {
        return isClassInstruction;
    }

    // Tell if the symbol is a call class method
    public Boolean getIsClassMethod() {
        return isClassMethod;
    }

    // Set the tainted or untainted value
    public void setTainted(int t) {
	tainted = t;
    }

    // Set the name of the symbol
    public void setName(String nome) {
	name = nome;
    }

    // Set the code line of the symbol
    public void setCodeLine(int l) {
	line = l;
    }

    // Set the scope of the symbol
    public void setScope(Scope scp) {
	scope = scp;
    }

    // Set the rootScope of the symbol
    public void setRootScope(Scope scp) {
	rootScope = scp;
    }

    // set the file of the symbol pertence
    public void setFileSymbol(String file) {
        this.fileSymbol = file;
    }

    // set true if the symbol is a variableSymbol
    public void setIsVariableSymbol(Boolean a) {
        isVariableSymbol = a;
    }

    // set true if the symbol is a alfanumeric
    public void setAlfanumeric(Boolean a) {
        alfanumeric = a;
        this.setNameMultiline();
    }
    
    // set true if the symbol represents a mysql secure function
    public void setIsSecureFunction(Boolean a) {
        isSecureFunction = a;
    }

    // set true if the symbol is a call function
    public void setIsFunction(Boolean a) {
        isFunction = a;
    }
 
    // set true if the symbol is a user function
    public void setIsUserFunction(Boolean a) {
        isUserFunction = a;
    }

    // set true if the symbol is a parameter of a User function or method class
    public void setIsParamUserFunction(Boolean a) {
        isParameterUserFunction = a;
    }
    
    // set true if the symbol represents a mysql sqli function
    public void setIsTaintedFunction(Boolean a) {
        isTaintedFunction = a;
    }

    // set true when a vul is detected. Just sqli functions have this attribute true
    public void setIsVulDetected(Boolean a) {
        isVulDetected = a;
    }    
    
    // set true if the symbol represents a instance class
    public void setIsInstance(Boolean a) {
        isInstance = a;
    }

    // set true if the symbol is a clone of a instance class
    public void setIsClone(Boolean a) {
        isClone = a;
    }

    // set true if the symbol is a call of method class in static way
    public void setIsStaticMember(Boolean a) {
        isStaticMember = a;
    }

    // set true if the symbol represents a class instruction
    public void setIsClassInstruction(Boolean a) {
        isClassInstruction = a;
    }

    // set true if the symbol is a call class method
    public void setIsClassMethod(Boolean a) {
        isClassMethod = a;
    }

    // set Symbol name if it is composed by n lines
    public void setNameMultiline() {
        if (this.name.contains("\n")){
            String s[] = this.name.split("\n");
            String ss = s[0].trim();
            
            for (int i = 1; i < s.length; i++) {
                ss += " " + s[i].trim();
            }
            this.setName(ss);
        }
    }    
    

    // Print the name and tainted of the symbol
    @Override
    public String toString() {
	return '<'+ line + ":" + getName()+":" +tainted+'>' ;
    }

     @Override
     public Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }
}
