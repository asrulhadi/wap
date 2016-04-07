/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.sqli;

import java.util.*;
import org.homeunix.wap.utils.LinesToCorrect;
import org.homeunix.wap.utils.ManageFiles;

/**
 *
 * @author iberiam
 */
public class AutoCorrectSQL {
    VulnerSQLI vv;
    
    // *** CONSTRUCTOR
    public AutoCorrectSQL(VulnerSQLI vul) {
        this.vv = vul;
    }

    // *** METHODS
    
    // Cria a string para a correcao automatica
    public void buildCorrectSQL(Map MainLinesToCorrect) {    
        String sql_final = "";
        LinesToCorrect ltc = getLinesToCorrect(vv.getFileOfLineToSanitize(), MainLinesToCorrect);
        ManageFiles fff = new ManageFiles (vv.getFileOfLineToSanitize());
        
        if (vv.getMysqlFunc().equals("mysqli_execute") == true){
                if (vv.getLineMysqliBindParam() > 0){
                    // Linha de mysqli_bind_param passar para mysqli_stmt_bind_param
                    // buscar linha do ficheiro
                    String cLine = fff.getLineOfCode(vv.getLineMysqliBindParam());
                    cLine = cLine.replace("mysqli_bind_param", "mysqli_stmt_bind_param");
                    ltc.getMapLinesToCorrect().put(vv.getLineMysqliBindParam(), cLine);
                }
               vv.setCorrectedCode(vv.getVulCode());
        }
      
        String codeLine = fff.getLineOfCode(vv.getLineToSanitize());
        String cod_antes = codeLine.toString();
        codeLine = codeLine.replace(vv.getVulCode(), vv.getCorrectedCode());
        if (vv.getDecreptedMysqlFuncToSubst().equals("") == false)
            codeLine = codeLine.replace(vv.getMysqlFunc(), vv.getDecreptedMysqlFuncToSubst());
       
        if (cod_antes.equals(vv.getVulCode()) == false)
            ltc.getMapLinesToCorrect().put(vv.getLineToSanitize(), codeLine);
        else
            ltc.getMapLinesToCorrect().put(vv.getLineToSanitize(), vv.getCorrectedCode()); 
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
