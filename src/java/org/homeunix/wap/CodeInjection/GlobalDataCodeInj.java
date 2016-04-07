/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.CodeInjection;

import org.homeunix.wap.utils.LinesToCorrect;
import org.homeunix.wap.table.tainted.MethodTaintedTable;
import org.homeunix.wap.table.tainted.ListVulners;
import org.homeunix.wap.table.tainted.UntaintedTable;
import org.homeunix.wap.table.tainted.TaintedTable;
import org.homeunix.wap.table.tainted.Vulner;
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
public class GlobalDataCodeInj {
    // user input
    private final static String UserInputs[] = {"_GET", "_POST", "_COOKIE", "_REQUEST", "HTTP_GET_VARS", "HTTP_POST_VARS", "HTTP_COOKIE_VARS", "HTTP_REQUEST_VARS", "_FILES"};
    public static List<String> UserInput = Arrays.asList(UserInputs);

    // functions where can occur RFI/LFI/DT
    // readfile can occur Source-code disclosure, too
    private final static String RFITaintFunctions[] = {"readfile", "highlight_file", "fopen", "file_get_contents", "file", "copy", 
    "unlink", "move_uploaded_file", "imagecreatefromgd2", "imagecreatefromgd2part", "imagecreatefromgd",
    "imagecreatefromgif", "imagecreatefromjpeg", "imagecreatefrompng", "imagecreatefromstring", "imagecreatefromwbmp",
    "imagecreatefromxbm", "imagecreatefromxpm", "require", "require_once", "include", "include_once"};
    public static List<String> RFIFunctions = Arrays.asList(RFITaintFunctions);
     
    // functions where can occur OS command injection
    private final static String OSTaintFunctions[] = {"passthru", "system", "shell_exec", "exec", "pcntl_exec", 
    "popen", "proc_open"};
    public static List<String> OSFunctions = Arrays.asList(OSTaintFunctions);

    // functions where can occur Eval-injection
    private final static String EvalTaintFunctions[] = {"eval", "preg_replace"};
    public static List<String> EvalFunctions = Arrays.asList(EvalTaintFunctions);

    // WAP sanitizations functions - fixes
    private final static String FixesFunctions[] = {"san_mix", "san_osci", "san_eval"};
    public static List<String> CInjSecFunctions = Arrays.asList(FixesFunctions);    
    
    

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
    public static Vulner currentVulner = null;
    public static Map <String, Integer> MainNumFP = new LinkedHashMap<String, Integer>();
    
    /*
     * Verify if symbol name contain tainted input
     */
    public static String containsInput(String f){
        //Verificar se f tem UserInput
        String found = "";
        for (String aux : GlobalDataCodeInj.UserInput){
                if (f.contains(aux) == true){
                    return aux;
                }
        }
        return found;
    }
    
    public static String getTypeVulInjection(String function){
        if (function.equals("readfile") == true || function.equals("highlight_file") == true)
            return "Source Code Discloser";
        else
            if (function.equals("eval") == true || function.equals("preg_replace") == true)
                return "PHP Code Injection";
            else
                if (GlobalDataCodeInj.OSFunctions.contains(function))
                    return "OS Command Injection";
                else
                    return "RFI, LFI, DT";
    }
    
    /*
     * Returns the number of real vulnerabilities detected
     */    
    public static int getNumVul(){
        int j, vuu=0;
        for(Iterator <Integer> it = GlobalDataCodeInj.MainNumVul.values().iterator(); it.hasNext(); ){
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
        for(Iterator <Integer> it = GlobalDataCodeInj.MainNumFP.values().iterator(); it.hasNext(); ){
            j = it.next();
            fpp += j;
        }
        return fpp;
    }    
}
