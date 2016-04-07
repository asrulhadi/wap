/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.table.symbol;

import java.util.*;

/**
 *
 * @author iberiam
 */
public class MethodTableCalls {
    String filename;
    List <MethodSymbolCall> methodsCalls;
    
    /* CONSTRUCTOR */
    public MethodTableCalls (String f){
        this.filename = f;
        //symbols = new LinkedHashMap<String, Symbol>();
        methodsCalls = new ArrayList<MethodSymbolCall>();
    }
    
    public String getScopeName() {
        return this.filename;
    }

    public List getListMethodsMembers() {
        return this.methodsCalls;
    }    

    public void define(MethodSymbolCall msc) {
        this.methodsCalls.add(msc);
    }
}
