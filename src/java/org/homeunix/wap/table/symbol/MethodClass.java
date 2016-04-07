/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.homeunix.wap.table.symbol;

/**
 *
 * @author iberiam
 */
public class MethodClass {
    MethodSymbol meth;
    ClassSymbol cl;

    // *** CONSTRUCTORS
    public MethodClass(MethodSymbol m, ClassSymbol c) {
        this.meth = m;
        this.cl = c;
    }

    // *** METHODS

    public MethodSymbol getMeth() {
        return this.meth;
    }

     public ClassSymbol getClassMeth() {
        return this.cl;
    }
}
