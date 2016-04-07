/*
 * Interface that represent a Scope, and get information about it.
 * Class scope as members
 * Function/Method scope as parameters and local variable
 */

package org.homeunix.wap.table.symbol;
import org.homeunix.wap.table.tainted.TaintedTable;
import org.homeunix.wap.table.tainted.UntaintedTable;
import java.util.*;

/**
 *
 * @author Iberia Medeiros
 */
public interface Scope {
    public String getScopeName();		// do I have a name?
    public Scope getEnclosingScope();		// am I nested in another?
    //public Map getMembers();                    // list of my symbols
    public List getMembers();                    // list of my symbols
    public Symbol getScopeSymbol();             // get the symbol that create the scope (the root symbol)
    public void define(Symbol sym, Scope scp, Boolean IsVariableSymbol);	// define sym in this scope
    //public Boolean resolve(String name, TaintedTable mts, UntaintedTable mus);	// look up name in scope
    public Boolean resolve(Symbol symb, TaintedTable mts, UntaintedTable mus);	// look up name in scope
    public void resolveSymbol(Scope scp, Symbol sy, TaintedTable mts, UntaintedTable mus, String file); // resolve symbol in scope
    //public void resolveSymbolInclude(Scope scp1, TaintedTable mts, UntaintedTable mus); // resolve symbols in include/function file
    public void resolveSymbolClass(TaintedTable mts, UntaintedTable mus, String filename);
    //public void resolveSymbolIncludeSQLI(Scope scp, TaintedTable mts, UntaintedTable mus, Map mift, String filename, Map mft, Map mst, Map varsDB, Map mftt, Map MainLinesToCorrect);
    public String resolveVarInclude(Scope scp, SymbolTable st); // resolve name of include/require file
    public void print(Scope scp);
    //public void resolveSymbolFunctionSQLI(MethodSymbol mt, Scope rootScope, TaintedTable mts, UntaintedTable mus, Map mift, String filename, Map mft, Map mst, Map varsDB, Map mftt, Map MainLinesToCorrect);

    public Boolean verifyNumberVarList(int num_var);
    public void populateList(Scope scp_left, Scope scp_right, int num_var, TaintedTable mts, UntaintedTable mus, String filename);
    
    public String buildCorrectSQL(String connDB, String nameDB, int lineMysqliBindParam, List UserInput, TaintedTable mts_princ, SymbolTable st, Map MainLinesToCorrect);

    public Boolean buildCorrectCodeInj(String fileInc, List UserInput, TaintedTable mts_princ, SymbolTable st, Map MainLinesToCorrect);

    public void printtt(String string, Scope cp);
    
}
