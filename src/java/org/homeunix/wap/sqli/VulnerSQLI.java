/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.homeunix.wap.sqli;

import org.homeunix.wap.table.tainted.*;

/**
 *
 * @author iberiam
 */
public class VulnerSQLI extends Vulner{
    // Para correcao
    String mysqlFunc;
    int indiceMysqlEscapeFunc;
    String decreptedMysqlFuncToSubst;
    int lineMysqliBindParam;

    
    /* CONSTRUCTOR */
    public VulnerSQLI(int l, String f, String myf, int bp){
        super(l, f, true, "SQLI");
        mysqlFunc = myf;
        decreptedMysqlFuncToSubst = "";
        indiceMysqlEscapeFunc = -1;
        lineMysqliBindParam = bp;    
    }

    /* METHODS */

    /*
     * Give the mysql function reached by tainted entry point
     */
    public String getMysqlFunc (){
        return mysqlFunc;
    }


    /*
     * Give the mysql function that will be substitute the decrepted function
     */
    public String getDecreptedMysqlFuncToSubst (){
        return decreptedMysqlFuncToSubst;
    }

    /*
     * set the mysql function that will be substitute the decrepted function
     */
    public void setDecreptedMysqlFuncToSubst (String a){
        decreptedMysqlFuncToSubst = a;
    }    
       
    /*
     * Give the indice of MysqlEscapeFunc to get the san_sqli function that to ne applyed
     */
    public int getIndiceMysqlEscapeFunc (){
        return indiceMysqlEscapeFunc;
    }    

    /*
     * Set indiceMysqlEscapeFunc
     */
    public void setIndiceMysqlEscapeFunc (int a){
        indiceMysqlEscapeFunc = a;
    }     

    /*
     * Give if the lineMysqliBindParam 
     */
    public int getLineMysqliBindParam (){
        return lineMysqliBindParam;
    }    
}
