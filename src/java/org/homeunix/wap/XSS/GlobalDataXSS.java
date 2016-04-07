/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.XSS;

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
public class GlobalDataXSS {
    // user input
    private final static String UserInputs[] = {"_GET", "_POST", "_COOKIE", "_REQUEST", "HTTP_GET_VARS", "HTTP_POST_VARS",
                                                "HTTP_COOKIE_VARS", "HTTP_REQUEST_VARS", "_FILES", "_SERVER"};
    public static List<String> UserInput = Arrays.asList(UserInputs);

    // functions where can occur XSS Reflected and Stored
    private final static String XSSTaintFunctions[] = {"echo", "print", "printf", "file_get_contents", "file_put_contents",
                                                        "fprintf", "fgets", "fgetc", "fscanf", "die", "exit", "error"};
    public static List<String> XSSFunctions = Arrays.asList(XSSTaintFunctions);
   
    // functions that make secure the user input
    //private final static String SecureFunctions[] = {"htmlentities", "htmlspecialchars", "strip_tags", "urlencode",
    //                                                  "san_out", "san_rdata", "san_wdata"};
    private final static String SecureFunctions[] = {};    
    public static List<String> XSSSecFunctions = Arrays.asList(SecureFunctions);

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
    public static VulnerXSS currentVulner = null;
    public static Map <String, Integer> MainNumFP = new LinkedHashMap<String, Integer>();
    
    /*
     * Verify if symbol name contain tainted input
     */
    public static String containsInput(String f){
        //Verificar se f tem UserInput
        String found = "";
        for (String aux : GlobalDataXSS.UserInput){
                if (f.contains(aux) == true){
                    //found = aux;
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
        for(Iterator <Integer> it = GlobalDataXSS.MainNumVul.values().iterator(); it.hasNext(); ){
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
        for(Iterator <Integer> it = GlobalDataXSS.MainNumFP.values().iterator(); it.hasNext(); ){
            j = it.next();
            fpp += j;
        }
        return fpp;
    }     
}
