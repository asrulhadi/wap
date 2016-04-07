/*
 * Classe das linhas a corrigir no ficheiro
 */
package org.homeunix.wap.utils;

import java.util.*;

/**
 *
 * @author iberiam
 */
public class LinesToCorrect {
    String nameFile;
    Map<Integer, String> MapLinesToCorrect;
    Map<Integer, String[]> MapLinesToCorrectArray;

    
    public LinesToCorrect (String filename){
        this.nameFile = filename;
        MapLinesToCorrect = new LinkedHashMap<Integer, String>();
    }

    public LinesToCorrect (String filename, Boolean array){
        this.nameFile = filename;
        MapLinesToCorrectArray = new LinkedHashMap<Integer, String[]>();
    }
    
    public Map getMapLinesToCorrect (){
        return MapLinesToCorrect;
    }

    public Map getMapLinesToCorrectArray (){
        return MapLinesToCorrectArray;
    }
    
    public String getNameFile(){
        return nameFile;
    }
    
}
