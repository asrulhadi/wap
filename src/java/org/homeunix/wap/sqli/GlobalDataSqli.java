/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.sqli;

import org.homeunix.wap.utils.LinesToCorrect;
import org.homeunix.wap.table.tainted.MethodTaintedTable;
import org.homeunix.wap.table.tainted.ListVulners;
import org.homeunix.wap.table.tainted.UntaintedTable;
import org.homeunix.wap.table.tainted.TaintedTable;
import org.homeunix.wap.table.symbol.MethodTableCalls;
import org.homeunix.wap.table.symbol.ClassTable;
import org.homeunix.wap.table.symbol.InstanceTable;
import org.homeunix.wap.table.symbol.SymbolTable;
import org.homeunix.wap.table.symbol.MethodTable;
import java.util.*;

/**
 *
 * @author iberiam
 */
public class GlobalDataSqli {

    // user input
    private final static String UserInputs[] = {"_GET", "_POST", "_COOKIE", "_REQUEST", "HTTP_GET_VARS", "HTTP_POST_VARS", "HTTP_COOKIE_VARS", "HTTP_REQUEST_VARS"};
    public static List<String> UserInput = Arrays.asList(UserInputs);

    // functions where can occur SQLI
    // functions deprecated: mysql_db_query, mysqli_execute, mysqli_master_query
    private final static String TaintFunctions[] = {"mysql_db_query", "mysql_query", "mysql_unbuffered_query", "mysqli_multi_query", "mysqli_stmt_execute",
                               "mysqli_execute", "mysqli_query", "mysqli_real_query", "mysqli_master_query", "query", "multi_query", "real_query", "execute",
                               "db2_exec", "pg_query", "pg_send_query"};
    /* "mysqli_stmt_execute", "execute" */
    public static List<String> SQLIFunctions = Arrays.asList(TaintFunctions);

    // functions that make secure the user input
    // functions deprecated: mysqli_bind_param, mysql_escape_string, mysqli_escape_string
    private final static String SecureFunctions[] = {"mysql_escape_string", "mysql_real_escape_string", "mysqli_escape_string", "mysqli_real_escape_string",
                                "mysqli_stmt_bind_param", "escape_string", "real_escape_string", "bind_param",
                                "db2_escape_string", "pg_escape_string", "pg_escape_bytea", "pg_escape_literal", "san_sqli"};
    //private final static String SecureFunctions[] = {};    
    public static List<String> SQLSecFunctions = Arrays.asList(SecureFunctions);

    // functions to connect to db
    private final static String ConnectFunctions[] = {"mysql_connect", "mysql_pconnect", "mysqli_connect", "mysqli_real_connect", "real_connect", "__construct",
                                "db2_connect", "db2_pconnect", "pg_connect", "pg_pconnect"};
    public static List<String> SQLConnectFunctions = Arrays.asList(ConnectFunctions);

    // functions to select db
    private final static String SelectDbFunctions[] = {"mysql_select_db", "mysqli_select_db", "select_db"};
    public static List<String> SQLSelectDbFunctions = Arrays.asList(SelectDbFunctions);
    
    // Mysql keywords
    private final static String clausules[] = {"SELECT", "INSERT INTO", "UPDATE", "ALTER TABLE", "DELETE FROM", "CREATE TABLE", "DROP TABLE",
                                "CREATE DATABASE", "DROP DATABASE", "FROM", "WHERE", "ORDER BY", "GROUP BY", "HAVING"};
    public static List<String> SQLKeywords = Arrays.asList(clausules);    

    // create main Tables
    public static Map <String, SymbolTable> MainSymbolTable = new LinkedHashMap<String, SymbolTable>();
    public static Map <String, SymbolTable> MainIncludeFilesTable = new LinkedHashMap<String, SymbolTable>();
    public static Map <String, MethodTable> MainFunctionsTable = new LinkedHashMap<String, MethodTable>();
    public static Map <String, MethodTableCalls> MainFunctionsCallsTable = new LinkedHashMap<String, MethodTableCalls>();
    public static Map <String, ClassTable> MainClassesTable = new LinkedHashMap<String, ClassTable>();
    public static Map <String, InstanceTable> MainInstancesTable = new LinkedHashMap<String, InstanceTable>();
    public static Map <String, TaintedTable> MainTaintedTable = new LinkedHashMap<String, TaintedTable>();
    public static Map <String, MethodTaintedTable> MainFunctionsTaintedTable = new LinkedHashMap<String, MethodTaintedTable>();
    public static UntaintedTable mus = new UntaintedTable();
    public static Map <String, LinesToCorrect> MainLinesToCorrect = new LinkedHashMap<String, LinesToCorrect>();
    public static Map <String, Integer> MainNumVul = new LinkedHashMap<String, Integer>();
    public static Map <String, ListVulners> MainListVulners = new LinkedHashMap<String, ListVulners>();
    public static VulnerSQLI currentVulner = null;
    public static Map <String, Integer> MainNumFP = new LinkedHashMap<String, Integer>();

    /*
     * Verify if symbol name contain tainted input
     */
    public static String containsInput(String f){
        //Verificar se f tem UserInput
        String found = "";
        for (String aux : GlobalDataSqli.UserInput){
                if (f.contains(aux) == true){
                    return aux;
                }
        }
        return found;
    }
  
    
    /*
     * Returns the number of real vulnerabilities detected
     */    
    public static int getNumVul(){
        int j, vuu=0;
        for(Iterator <Integer> it = GlobalDataSqli.MainNumVul.values().iterator(); it.hasNext(); ){
            j = it.next();
            vuu += j;
        }
        return vuu;
    }    

    /*
     * Returns the number of false positives detected
     */    
    public static int getNumFP(){
        int j, fpp=0;
        for(Iterator <Integer> it = GlobalDataSqli.MainNumFP.values().iterator(); it.hasNext(); ){
            j = it.next();
            fpp += j;
        }
        return fpp;
    }     
    
    
    
}
