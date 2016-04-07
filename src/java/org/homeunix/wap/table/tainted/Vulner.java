/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.homeunix.wap.table.tainted;

import org.homeunix.wap.datamining.FP_Attributes;
import java.util.*;

/**
 *
 * @author iberiam
 */
public class Vulner {
    // Para o vuln path
    List<Integer> lines; // Lista que armazenara as linhas de código da vulner
    List<String> files; // Lista que armazenara os files names das linhas de código da vulner
    String file_of_ss; // file da sensitive sink
    String typeVul; // nome da vv
    
    // Tainted inputs
    List<String> taintedinputs;
    List<Integer> lineTaintedinputs;
    List<String> fileTaintedinputs;
    
    // Para correcao
    int lineToSanitize; // linha onde sera aplicada a sanitização. Sera na do SQL, que pode ser a da SS
    String file_lineToSanitize; // file da linha a asanitizar
    List<Integer> positionSanFunction; // Lista com as posicoes da linha da SS onde inserir sanitizacao
    List<Integer> lenghtSanFunction; // Lista com os comprimentos das vars na linha da SS onde inserir sanitizacao    
    String vulCode; // excerto de codigo a corrigir
    String correctedCode; // excerto de codigo corrigido
    
    // Para Data Mining
    int fp; // Se a vv e' um FP
    FP_Attributes vvAtt_fp; // Atributos para data mining dizer se e' ou nao FP
    List<Integer> lines_fp; // Lista que armazena as linhas onde se verifica a presenca dos atts
    List<String> files_fp; // Lista que armazena os files names das linhas onde se verifica a presenca dos atts
    String justify_fp; // forma uma string com os atributos do FP para ser impressa como output
    String justify_fp_aux; // guarda a anterior lina de justificacao

    
    /* CONSTRUCTOR */
    public Vulner(int l, String f, Boolean IsSQlI, String type_vv){
        lines = new ArrayList<Integer>();
        files = new ArrayList<String>();
        lines.add(l);
        files.add(f);
        file_of_ss = f;
        typeVul = type_vv;
        
        taintedinputs = new ArrayList<String>();
        lineTaintedinputs = new ArrayList<Integer>();
        fileTaintedinputs = new ArrayList<String>();     
        
        lineToSanitize = -1;
        positionSanFunction = new ArrayList<Integer>();
        lenghtSanFunction = new ArrayList<Integer>();
        vulCode = "";
        correctedCode = "";        
        
        vvAtt_fp = new FP_Attributes(IsSQlI);
        fp = 0;
        lines_fp = new ArrayList<Integer>();
        files_fp = new ArrayList<String>();
        justify_fp = "";
        justify_fp_aux = "";
        
    }

    /* METHODS */

   /*
    * Set a line of the vulner
    */
    public void setLineOfVulner(int l, String f){
        lines.add(l);
        files.add(f);
    }

    /*
     * Give the List of line codes from a vulner
     */
    public List getLinesOfVulner (){
        return lines;
    }

    /*
     * Give the List of the files names from a vulner
     */
    public List getFilesOfVulner (){
        return files;
    }

    /*
     * Give the type of vv
     */
    public String getTypeVuln (){
        return typeVul;
    }    
    
   /*
    * Set tainted input
    */
    public void setTaintedInputElements(int l, String f, String in){
        taintedinputs.add(in);
        lineTaintedinputs.add(l);
        fileTaintedinputs.add(f);  
    }
    
    /*
     * Give the name tainted inputs
     */
    public List getTaintedinputs (){
        return taintedinputs;
    } 
    
    /*
     * Give the lines of tainted inputs
     */
    public List getLineTaintedinputs (){
        return lineTaintedinputs;
    }    
    
    /*
     * Give the file of tainted inputs
     */
    public List getFileTaintedinputs (){
        return fileTaintedinputs;
    }
    
    /*
     * Give the SS file
     */
    public String getFileOf_SS (){
        return file_of_ss;
    }    
    
    /*
     * Give the line of code of SQL instruction to apply sanitization
     * Can be in line of SS
     */
    public int getLineToSanitize (){
        return lineToSanitize;
    }
    
    /*
     * Set the line of code of SQL instruction to apply sanitization
     */
    public void setLineToSanitize (int a){
        lineToSanitize = a;
    }     

    /*
     * Give the file of the line of code of SQL instruction to apply sanitization
     * Can be in line of SS
     */
    public String getFileOfLineToSanitize (){
        return file_lineToSanitize;
    }
    
    /*
     * Set the file of line of code of SQL instruction to apply sanitization
     */
    public void setFileOfLineToSanitize (String a){
        file_lineToSanitize = a;
    }      
    
    
    /*
     * Give the List of the position into SS to insert san functions
     */
    public List getPositionSanFunction (){
        return positionSanFunction;
    }    

    /*
     * Set position to insert san function
     */
    public void setPositionSanFunction (int a){
        positionSanFunction.add(a);
    }    

    /*
     * Give the List of the vars lenghts into SS to insert san functions
     */
    public List getLenghtSanFunction (){
        return lenghtSanFunction;
    }    

    /*
     * Set var lenght to be sanitized with san function
     */
    public void setLenghtSanFunction (int a){
        lenghtSanFunction.add(a);
    }    

    /*
     * Give the piece of code vulnerable that needs correction
     */
    public String getVulCode (){
        return vulCode;
    }
    
    /*
     * Set the piece of code vulnerable, that will be corrected
     */
    public void setVulCode (String a){
        vulCode = a;
    }    
    
    /*
     * Give the piece of code corrected
     */
    public String getCorrectedCode (){
        return correctedCode;
    }
    
    /*
     * Set the piece of code corrected to substitute the vulnerable code
     */
    public void setCorrectedCode (String a){
        correctedCode = a;
    }     

    /*
     * Tell if the vv is a FP or not
     */
    public int IsFP (){
        return fp;
    }    

    /*
     * Set if the vv is or not a FP
     */
    public void setIsFP (int a){
        fp = a;
    }     
    
    /*
     * Give the metric value from vv
     */
    public FP_Attributes getVectorAttributesOfVulner (){
        return vvAtt_fp;
    }
    
   /*
    * Set a line to FP
    */
    public void setLineOfFP(int l, String f){
        lines_fp.add(l);
        files_fp.add(f);
    }

    /*
     * Give the List of line codes that justify the FP
     */
    public List getLinesOfFP (){
        return lines_fp;
    }

    /*
     * Give the List of the files names from FP
     */
    public List getFilesOfFP (){
        return files_fp;
    }
    
   /*
    * Set a line to FP
    */
    public void setJustificationOfFP(String jus){
        if (justify_fp.isEmpty() == true && justify_fp_aux.isEmpty() == true){
            justify_fp = jus + "\n";
            //justify_fp_aux = jus;
        }
        else{
            if (jus.contains(justify_fp_aux) == false){
                String a[] = justify_fp.split(":");
                if (jus.contains(a[1]) == false)
                    justify_fp = justify_fp + jus + "\n";
            }
        }
        justify_fp_aux = jus;
    }

    /*
     * Give the List of line codes that justify the FP
     */
    public String getJustificationOfFP (){
        return justify_fp;
    }    
}
