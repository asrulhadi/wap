/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.table.tainted;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.homeunix.wap.table.symbol.Symbol;

/**
 *
 * @author iberiam
 */
public class MethodTaintedTable implements ScopeTainted{
    String filename;
    List <MethodSymbolTainted> methodsTainteds;
    
    /* CONSTRUCTOR */
    public MethodTaintedTable (String f){
        this.filename = f;
        methodsTainteds = new ArrayList<MethodSymbolTainted>();
    }

    public String getScopeTaintedName() {
        return this.filename;
    }

    public List getListTaintedMembers() {
        return this.methodsTainteds;
    }    
    
    public ScopeTainted getEnclosingScopeTainted() {
        return null;
    }

    public void define(MethodSymbolTainted mss) {
        this.methodsTainteds.add(mss);
    }

    public void define(Symbol sym) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Map getTaintedMembers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }    
}
