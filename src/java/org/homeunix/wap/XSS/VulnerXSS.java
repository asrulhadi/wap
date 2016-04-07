/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.homeunix.wap.XSS;

import org.homeunix.wap.table.tainted.*;

/**
 *
 * @author iberiam
 */
public class VulnerXSS extends Vulner{
    // Para correcao
    String xssFunc;
    int indiceXSSEscapeFunc;

    
    /* CONSTRUCTOR */
    public VulnerXSS(int l, String f, String myf){
        super(l, f, false, "XSS");
        xssFunc = myf;
        indiceXSSEscapeFunc = -1; 
    }

    /* METHODS */

    /*
     * Give the mysql function reached by tainted entry point
     */
    public String getXSSFunc (){
        return xssFunc;
    }

    /*
     * Give the indice of MysqlEscapeFunc to get the san_sqli function that to ne applyed
     */
    public int getIndiceXSSEscapeFunc (){
        return indiceXSSEscapeFunc;
    }    

    /*
     * Set indiceMysqlEscapeFunc
     */
    public void setIndiceXSSEscapeFunc (int a){
        indiceXSSEscapeFunc = a;
    }     
  
}
