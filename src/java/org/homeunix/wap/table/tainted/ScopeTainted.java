/*
 * Interface that represent a Tainted Scope, and get information about it.
 */

package org.homeunix.wap.table.tainted;

import org.homeunix.wap.table.symbol.Symbol;
import java.util.*;

/**
 *
 * @author Iberia Medeiros
 */
public interface ScopeTainted {
    public String getScopeTaintedName();		// do I have a name?
    public ScopeTainted getEnclosingScopeTainted();	// am I nested in another?
    public Map getTaintedMembers();                     // list of my symbols
    public List getListTaintedMembers();                     // list of my symbols
    public void define(Symbol sym);                     // define sym in this scope
}
