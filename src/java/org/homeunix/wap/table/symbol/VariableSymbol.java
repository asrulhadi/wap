/*
 * This class will represent global variable, functions parameters and local variable.
 * An Object of this class is caracterized by name and tainted value
 */

package org.homeunix.wap.table.symbol;

/**
 *
 * @author Iberia Medeiros
 */
public class VariableSymbol extends Symbol{

    // *** CONSTRUCTORS
    public VariableSymbol(String name, int tainted, int line, String file) {
	super(name, tainted, line, file);
    }
    
    public VariableSymbol(String name, int tainted, int line, Boolean alfanumeric, String file) {
        super(name, tainted, line, alfanumeric, file);
    }
}
