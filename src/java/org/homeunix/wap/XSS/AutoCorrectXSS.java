/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.XSS;


import org.homeunix.wap.table.tainted.Vulner;
import java.util.*;
import org.homeunix.wap.utils.LinesToCorrect;
import org.homeunix.wap.utils.ManageFiles;

/**
 *
 * @author iberiam
 */
public class AutoCorrectXSS{
    Vulner vv;
    
    // *** CONSTRUCTOR
    public AutoCorrectXSS(Vulner vul) {
        this.vv = vul;
    }

    // *** METHODS

  
   public void buildCorrect(Map MainLinesToCorrect){
        String stmt_final = "";
        LinesToCorrect ltc = getLinesToCorrect(vv.getFileOfLineToSanitize(), MainLinesToCorrect);
        ManageFiles fff = new ManageFiles (vv.getFileOfLineToSanitize());
            
        String codeLine = fff.getLineOfCode(vv.getLineToSanitize());
        String cod_antes = codeLine.toString();
        codeLine = codeLine.replace(vv.getVulCode(), vv.getCorrectedCode()); 
        
        if (cod_antes.equals(vv.getVulCode()) == false)
            ltc.getMapLinesToCorrect().put(vv.getLineToSanitize(), codeLine);
        else
            ltc.getMapLinesToCorrect().put(vv.getLineToSanitize(), vv.getCorrectedCode());         
        
        //ltc.getMapLinesToCorrect().put(vv.getLineToSanitize(), codeLine); 
   }
     
    
    private LinesToCorrect getLinesToCorrect(String filename, Map MainLinesToCorrect){
        if (MainLinesToCorrect.containsKey(filename))
            return (LinesToCorrect) MainLinesToCorrect.get(filename);
        else{
            LinesToCorrect l = new LinesToCorrect(filename);
            MainLinesToCorrect.put(filename, l);
            return l;
        }
    }

}
