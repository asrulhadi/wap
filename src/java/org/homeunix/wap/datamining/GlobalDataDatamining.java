package org.homeunix.wap.datamining;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class with attributes that characterize an instance
 * 
 * @author iberiam
 */
public class GlobalDataDatamining {
    /*
     * Slice: trecho de código que começa no entry point e acaba na sensitive sink
     * Caminho: subsequência de um slide só com as instruções que propagam a taintedness
     *
     * ** Attributos **
     * == SQL ==
     * From
     * IsNum
     * ComplexSQL
     * AgregatedFunction
     *
     * == String Manipulation ==
     * Substring
     * Concatenation
     * AddChar
     * ReplaceStr
     * ErrorFunction
     * TrimFunction
     *
     * == Validation ==
     * TypeChecking
     * IsSet
     * PatternControl
     * WhiteList
     * BlackList
     * 
     * == Class ==
     * False Positive 
     * Real Vulnerability
     * 
     */
    
    public final static Map <String, Integer> SQLAttributes = new HashMap<String, Integer>();
    static
    {
        SQLAttributes.put("AVG", 0);
        SQLAttributes.put("COUNT", 0);
        SQLAttributes.put("MAX", 0);
        SQLAttributes.put("MIN", 0);
        SQLAttributes.put("SUM", 0);        
        SQLAttributes.put("FROM", 1);
        SQLAttributes.put("IsNum", 2);
        SQLAttributes.put("ComplexSQL", 3);

    }
    
    public final static Map <String, Integer> StringAttributes = new HashMap<String, Integer>();
    static
    {
        StringAttributes.put("substr", 4);
        StringAttributes.put("concatenation", 5);
        StringAttributes.put("addchar", 6);       
        StringAttributes.put("substr_replace", 7); // input no 1 arg
        StringAttributes.put("str_replace", 7); // input no 3 arg
        StringAttributes.put("preg_replace", 7); // input no 3 arg         
        StringAttributes.put("error", 8);
        StringAttributes.put("exit", 8);        
        StringAttributes.put("trim", 9);
        
        /* Introduzir mais tarde estes atributos */
//        StringAttributes.put("str_split", 7); // input no 1 arg
//        StringAttributes.put("str_suffle", 8);
    }  
      
     public final static Map <String, Integer> ValidationAttributes = new HashMap<String, Integer>();
     static
    {

        ValidationAttributes.put("is_string", 10);
        ValidationAttributes.put("is_int", 10);
        ValidationAttributes.put("is_float", 10);
        ValidationAttributes.put("is_numeric", 10);
        ValidationAttributes.put("ctype_digit", 10);        
        ValidationAttributes.put("isset", 11);
        ValidationAttributes.put("preg_match", 12); // input no 2 arg
        ValidationAttributes.put("whitelist", 13);
        ValidationAttributes.put("blacklist", 14);
    }
    
    //public final static String classe[] = {"Yes", "No"};
    
     
    // Mysql Operators Arithmetic and comparasion
    // sem o = por causa das strings, senao vai dar muitos fp
    // sem o % por causa do LIKE
    private final static String operators_aritm[] = {"+", "-", "*", "/"};
    public static List<String> SQLOperators_aritm = Arrays.asList(operators_aritm);     
     
    private final static String operators_comp[] = {">", ">=", "!>", "<", "<=", "!<", "<>", "!="};
    public static List<String> SQLOperators_comp = Arrays.asList(operators_comp);     
     
}
  