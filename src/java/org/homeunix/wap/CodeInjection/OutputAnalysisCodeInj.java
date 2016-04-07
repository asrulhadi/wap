/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.homeunix.wap.CodeInjection;

import org.homeunix.wap.utils.LinesToCorrect;
import org.homeunix.wap.utils.GlobalDataApp;
import org.homeunix.wap.utils.ManageFiles;
import org.homeunix.wap.table.tainted.ListVulners;
import org.homeunix.wap.table.tainted.Vulner;
import org.homeunix.wap.table.symbol.SymbolTable;
import org.homeunix.wap.table.symbol.MethodTable;
import org.homeunix.wap.table.symbol.MethodSymbol;
import java.util.*;
import java.io.*;
//import org.homeunix.awap.XSS.GlobalDataXSS;

/**
 *
 * @author iberiam
 */
public class OutputAnalysisCodeInj {

    //public static void outputAnalysisWithCorrection (String type_analyse, String filename) throws IOException{
    public static void outputAnalysisWithCorrection (String type_analyse, String filename, LinesToCorrect ltc, int num_file) throws IOException{        
        FileWriter out_FileOfPaths = null;
        File dir = null;
        BufferedWriter bufferWritter = null;
        Date date = new Date(System.currentTimeMillis());
        int i = GlobalDataCodeInj.MainLinesToCorrect.size();

        if (type_analyse.equals("project") == true){
            dir = new File(System.getProperty("base.dir") + File.separator + "NewFiles");
            
            // Se ja houve analises anteriores apaga dir
            if (GlobalDataApp.numAnalysis == 0 && dir.exists() == true && num_file == i){
                ManageFiles r = new ManageFiles(dir.toString());
                r.deleteDir(dir);
                GlobalDataApp.numAnalysis++;
            }
            
            //Criar directorio para colocar fichs corrigidos
            if (dir.exists() == false)
                dir.mkdir();
            // cria ficheiro que contem a path dos ficheiros que serao corrigidos
            File fileOfPaths = new File(dir+ File.separator +"PathNewFiles.txt");
            if (fileOfPaths.exists() == true)
                out_FileOfPaths = new FileWriter(fileOfPaths, true);
            else
                out_FileOfPaths = new FileWriter(fileOfPaths);
            bufferWritter = new BufferedWriter(out_FileOfPaths);
        }

        // Escrever Ficheiro corrigido
        //for (Iterator <LinesToCorrect> it = GlobalDataCodeInj.MainLinesToCorrect.values().iterator(); it.hasNext();){
        //    ltc = it.next();

            //ltc = GlobalDataCodeInj.MainLinesToCorrect.get(filename);
            String file = ltc.getNameFile();
            ManageFiles relativeFile = new ManageFiles(file);
            //File filename = relativeFile.getFileName();

            if (type_analyse.equals("single_file") == true || type_analyse.equals("files") == true){
                File baseDir = relativeFile.getBaseDir();
                dir = new File(baseDir + File.separator + "NewFiles");
                
                // Se ja houve analises anteriores apaga dir
                if (GlobalDataApp.numAnalysis == 0 && dir.exists() == true && num_file == i){
                    ManageFiles r = new ManageFiles(dir.toString());
                    r.deleteDir(dir);
                    GlobalDataApp.numAnalysis++;
                }
                
                //Criar directorio para colocar fichs corrigidos
                File fileOfPaths = new File(dir+ File.separator +"PathNewFiles.txt");
                if (dir.exists() == false)
                    dir.mkdir();

                if (fileOfPaths.exists() == true)
                    out_FileOfPaths = new FileWriter(fileOfPaths, true);
                else
                    out_FileOfPaths = new FileWriter(fileOfPaths);

    	        bufferWritter = new BufferedWriter(out_FileOfPaths);
            }


            if (ltc.getMapLinesToCorrectArray().isEmpty() == false){
                File ff = new File(dir+ File.separator + file);
                File in = null, out = null, temp = null, inn = null;                
                if (ff.exists() == false){                   
                    bufferWritter.write(date + " " + file + "\n");
                    in = new File(file);
                    try{
                        int ind = file.lastIndexOf(File.separator);
                        String s = file.substring(0, ind);
                        File d = new File(dir + File.separator + s);
                        d.mkdirs();   
                        out = new File(ff.toString());
                    } catch (Exception e) {}                    
                }
                else{
                    in = new File(ff.toString());
                    temp = new File(ff.toString() + "temp");
                    in.renameTo(temp);
                    in = new File(temp.toString());
                    out = new File(dir+ File.separator + file);
                }
                
                Scanner fscanner = new Scanner(in);
                FileWriter outFinalFile = new FileWriter(out);

                Map sortedMap = new TreeMap(ltc.getMapLinesToCorrectArray());
                Set a = sortedMap.keySet();
                String codeLine;
                int line = 0;
                Boolean foundFirst = false;
                for (Object key : a) {
                    for (int j = line+1; j < (Integer)key; j++){
                        codeLine = fscanner.nextLine();
                        outFinalFile.write(codeLine+"\n");
 //                       if(codeLine.contains("<?php") && foundFirst == false){
 //                           foundFirst = true;
 //                           outFinalFile.write("include(\"includes_awap" + File.separator + "awap_CodeInjection.php\");" + "\n");
//                            if (GlobalDataApp.args_flags[7]==1 && GlobalDataXSS.MainListVulners.size()>0)
//                                outFile.write("include(\"includes_awap" + File.separator + "awap_XSS.php\");" + "\n");
                        //}
                    }
                    codeLine = fscanner.nextLine();
                    String[] b = (String[]) sortedMap.get(key);
                    if (codeLine.contains("{")){
                        int ind = codeLine.indexOf("{");
                        outFinalFile.write(codeLine.substring(0, ind+1) + "\n");
                        codeLine = codeLine.substring(ind+1);
                    }                       
                    outFinalFile.write(b[3] + "\n");
                    outFinalFile.write(b[4] + "\n");
                    //outFile.write(b[2] + "\n");
                    if (codeLine.contains("}")){                      
                        int ind = codeLine.indexOf("}");
                        codeLine = codeLine.substring(0, ind-1);
                        outFinalFile.write(codeLine + "\n");
                        outFinalFile.write("}" + "\n");
                    }
                    //else
                        //outFinalFile.write(codeLine + "\n");
                    line = (Integer)key;
                }

                while (fscanner.hasNextLine()){
                    codeLine = fscanner.nextLine();
                    outFinalFile.write(codeLine+"\n");
                }
                fscanner.close();
                outFinalFile.close();
                //in.delete();
                
                if (type_analyse.equals("single_file") == true || type_analyse.equals("files") == true)
                    bufferWritter.close();
            }
        //}
        if (type_analyse.equals("project") == true)
            bufferWritter.close();
    }


    public static void outputAnalysis(String type_analyse, FileWriter outFile, String diff_date_fidt, List files) throws IOException{
        int vuu = GlobalDataCodeInj.getNumVul(), fpp = GlobalDataCodeInj.getNumFP();
        /*
        Integer j;
        for(Iterator <Integer> it = GlobalDataCodeInj.MainNumVul.values().iterator(); it.hasNext(); ){
            j = it.next();
            vuu += j;
        }

        for(Iterator <Integer> it = GlobalDataCodeInj.MainNumFP.values().iterator(); it.hasNext(); ){
            j = it.next();
            fpp += j;
        }
        */
        
        String setPlainText = "";
        String setBoldText = "";
        if (GlobalDataApp.isWindows.booleanValue() == false){
            setPlainText = "\033[0;0m";
            setBoldText = "\033[0;1m";
        }       
        
        System.out.println(setBoldText +"\n\n  + Type of Analysis: RFI/LFI/DT/SCD/OS/Eval");
        System.out.println("\t     > Summary:" + setPlainText);
        
        if(GlobalDataApp.args_flags[4] == 1){
            outFile.write("\n\n  + Type of Analysis: RFI/LFI/DT/SCD/OS/Eval\n");
            outFile.write("\t     > Summary:\n");
        }
        
        if (vuu + fpp > 0){
            System.out.println("        - Time of analyse: " + diff_date_fidt);
            System.out.println("        - Number of vulnerabilities detected: " + setBoldText + (vuu+fpp) + setPlainText);
            System.out.println("           - Real vulnerabilities: " + setBoldText + vuu + setPlainText);
            System.out.println("           - False positives: " + setBoldText + fpp + setPlainText);
            System.out.println("        - Number of vulnerable files: " +
                    setBoldText + GlobalDataCodeInj.MainListVulners.size() + setPlainText);
            System.out.println("        - List of vulnerable files:");
            
            if(GlobalDataApp.args_flags[4] == 1){
                outFile.write("        - Time of analyse: " + diff_date_fidt+"\n");
                outFile.write("        - Number of vulnerabilities detected: " + (vuu+fpp)+"\n");
                outFile.write("           - Real vulnerabilities: " + vuu+"\n");
                outFile.write("           - False positives: " + fpp+"\n");
                outFile.write("        - Number of vulnerable files: " + GlobalDataCodeInj.MainListVulners.size()+"\n");
                outFile.write("        - List of vulnerable files:\n");
            }

            for(Iterator <ListVulners> it = GlobalDataCodeInj.MainListVulners.values().iterator(); it.hasNext(); ){
                ListVulners lv = it.next();
                System.out.println("\t    " + lv.getFilename());
                
                if(GlobalDataApp.args_flags[4] == 1){
                    outFile.write("\t    " + lv.getFilename()+"\n");
                }
            }

            if (GlobalDataApp.args_flags[5] == 0){
                // code needed for keyboard input
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String temp;
                System.out.println("\n\nPress enter to view vulnerabilities...");
                temp = br.readLine();
            }
        }
        else{
            System.out.println("        - Time of analyse: " + diff_date_fidt);
            System.out.println("        - Number of vulnerabilities found: " + setBoldText +"none" + setPlainText);
            if(GlobalDataApp.args_flags[4] == 1){
                outFile.write("        - Time of analyse: " + diff_date_fidt +"\n");
                outFile.write("        - Number of vulnerabilities found: none\n");
            }

            return;            
        }      
        
        
        ListVulners lv = null;
        for (Iterator <ListVulners> it = GlobalDataCodeInj.MainListVulners.values().iterator(); it.hasNext();){
            lv = it.next();
            if (GlobalDataApp.args_flags[5] == 0){
                String file = lv.getFilename();
                ManageFiles ff = new ManageFiles (file);
                System.out.println(setBoldText + "\n> > > >  File: " + setPlainText + file + 
                        setBoldText + " < < < <" + setPlainText);
                System.out.println(setBoldText + "     > Information:" + setPlainText);
                System.out.println("        - Number of Lines of Code: " + ff.getNumberLinesFile());             

                if(GlobalDataApp.args_flags[4] == 1){
                    outFile.write("\n> > > >  File: " + file + " < < < <\n");
                    outFile.write("     > Information:\n");
                    outFile.write("        - Number of Lines of Code: " + ff.getNumberLinesFile()+"\n");
                }

                // is a include file?
                if (GlobalDataCodeInj.MainIncludeFilesTable.containsKey(file) == true){
                    System.out.println("        - Is a include file: yes");

                    if(GlobalDataApp.args_flags[4] == 1){
                        outFile.write("        - Is a include file: yes\n");
                    }
                }
                else{
                    System.out.println("        - Is a include file: no");

                    if(GlobalDataApp.args_flags[4] == 1){
                        outFile.write("        - Is a include file: no\n");
                    }
                }

                // list of included files from "regular" or include file
                SymbolTable st = null;
                if (GlobalDataCodeInj.MainSymbolTable.containsKey(file) == true)
                    st = GlobalDataCodeInj.MainSymbolTable.get(file);
                else
                    st = GlobalDataCodeInj.MainIncludeFilesTable.get(file);

                if(st.getIncludeFiles().isEmpty() == false){
                    System.out.println("        - Included files:");
                    if(GlobalDataApp.args_flags[4] == 1){
                        outFile.write("        - Included files:\n");
                    }

                    for (int i = 0; i < st.getIncludeFiles().size(); i++){
                        System.out.println("\t    "+st.getIncludeFiles().get(i));

                        if(GlobalDataApp.args_flags[4] == 1){
                            outFile.write("\t    "+st.getIncludeFiles().get(i)+"\n");
                        }
                    }
                }
                else{
                    System.out.println("        - Included files: none");

                    if(GlobalDataApp.args_flags[4] == 1){
                        outFile.write("        - Included files: none\n");
                    }
                }


                // list of defined user functioms
                if (GlobalDataCodeInj.MainFunctionsTable.containsKey(file) == true){
                    MethodTable mt = GlobalDataCodeInj.MainFunctionsTable.get(file);
                    System.out.println("        - Defined user functions:");
                    if(GlobalDataApp.args_flags[4] == 1){
                        outFile.write("        - Defined user functions:\n");
                    }

                    for (Iterator <MethodSymbol> it1 = mt.getMembers().iterator(); it1.hasNext(); ){    
                        MethodSymbol ms = it1.next();
                        System.out.println("\t  "+ms.getFunctionName());
                        if(GlobalDataApp.args_flags[4] == 1){
                            outFile.write("\t  "+ms.getFunctionName()+"\n");
                        }
                    }
                }
                else{
                    System.out.println("        - Defined user function: none");
                    if(GlobalDataApp.args_flags[4] == 1){
                        outFile.write("        - Defined user function: none\n");
                    }
                }

                // list of vulnerabilities of file
                Vulner v;
                int vuu_f = lv.getListOfVulners().size();
                int fpp_f = 0;
                for (Iterator <Vulner> it1 = lv.getListOfVulners().iterator(); it1.hasNext();){
                    v = it1.next();
                    if (v.IsFP() == 1)
                        fpp_f++;
                }
                vuu_f -= fpp_f;
                
                System.out.println("        - Number of Vulnerabilities detected: " +
                        setBoldText + lv.getListOfVulners().size() + setPlainText); 
                System.out.println("           - Real Vulnerabilities: " +
                        setBoldText + vuu_f + setPlainText);
                System.out.println("           - False positives: " +
                        setBoldText + fpp_f + setPlainText);
                if(GlobalDataApp.args_flags[4] == 1){
                    outFile.write("        - Number of Vulnerabilities detected: "+lv.getListOfVulners().size()+"\n");
                    outFile.write("           - Real Vulnerabilities: "+vuu+"\n");
                    outFile.write("           - False positives: "+fpp_f+"\n");
                }

                analysisOfFile(lv, outFile, file.toString());
                if (it.hasNext() && GlobalDataApp.args_flags[0] == 1){
                    // code needed for keyboard input
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String temp;
                    System.out.println("\n\nPress enter to view vulnerabilities of next file...");
                    temp = br.readLine();
                }
            }
        }
            
            if(GlobalDataApp.args_flags[0] == 0 && vuu > 0){
                // code needed for keyboard input
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String temp;

                System.out.println("\n\nPress enter to proceed automatic correction...");
                temp = br.readLine();

                try{
                LinesToCorrect ltc;
                int i = GlobalDataCodeInj.MainLinesToCorrect.size();
                for (Iterator <LinesToCorrect> it = GlobalDataCodeInj.MainLinesToCorrect.values().iterator(); it.hasNext();){
                    ltc = it.next();
                    OutputAnalysisCodeInj.outputAnalysisWithCorrection(type_analyse, ltc.getNameFile(), ltc, i);
                    i--;
                }
                } catch (Exception e){}                
                
                //OutputAnalysisCodeInj.outputAnalysisWithCorrection(type_analyse, lv.getFilename());
                System.out.println("\n\nAutomatic correction complete !!!");
                if(GlobalDataApp.args_flags[4] == 1){
                    outFile.write("\n\nAutomatic correction complete !!!\n");
                }
            }

        //}
    }

    private static void analysisOfFile(ListVulners lv, FileWriter outFile, String filename) throws IOException{
        Vulner v;
        String cl, correctedCode = "", aux = "", aux1 = "", vulnerableCode = "", f1="", f;
        String correctedCode_f = "", vulnerableCode_f = "";
        Iterator <Vulner> it;
        int i=0;
        LinesToCorrect ltc;
        Object key;
        String typeVul="";

        String setPlainText = "";
        String setBoldText = "";
        if (GlobalDataApp.isWindows.booleanValue() == false){
            setPlainText = "\033[0;0m";
            setBoldText = "\033[0;1m";
        }

        for (it = lv.getListOfVulners().iterator(); it.hasNext();){
            v = it.next();
            typeVul = v.getTypeVuln();
            
            try{
            // escrever vulnerabilidade no ecra
            correctedCode = setBoldText + "\tCorrected code:" + setPlainText + "\n";
            vulnerableCode = setBoldText + "\n\tVulnerable code:" + setPlainText + "\n";
            
            // escrever vuln para file
            if(GlobalDataApp.args_flags[4] == 1){
                correctedCode_f = "\tCorrected code: \n";
                vulnerableCode_f = "\n\tVulnerable code: \n";                
            }
            for (int l = v.getLinesOfVulner().size() -1; l >= 0; l--){
                f = "";
                if (v.getFilesOfVulner().get(l).equals(lv.getFilename()) == false)
                    f = (String) v.getFilesOfVulner().get(l);

                ManageFiles fff = new ManageFiles ((String) v.getFilesOfVulner().get(l));
                cl = fff.getLineOfCode((Integer) v.getLinesOfVulner().get(l));
                aux = "\t" + v.getLinesOfVulner().get(l) + ": "+ cl + "\n";
                vulnerableCode = vulnerableCode + aux;
                vulnerableCode_f = vulnerableCode_f + aux;

                if (f.equals("") == false){
                    aux = "\t    (" + f + ")" + "\n";
                    vulnerableCode = vulnerableCode + aux;
                    vulnerableCode_f = vulnerableCode_f + aux;
                }
                           
                if (v.IsFP() == 0){
                    // escrita do corrected code no ecra
                    ltc = GlobalDataCodeInj.MainLinesToCorrect.get(v.getFileOfLineToSanitize());
                    Map sortedMap = new TreeMap(ltc.getMapLinesToCorrectArray());
                    if (ltc.getMapLinesToCorrectArray().containsKey(v.getLinesOfVulner().get(l)) == true){
                        key = v.getLinesOfVulner().get(l);
                        String[] b = (String[]) sortedMap.get(key);
                        //f1 = b[2];
                        //typeVul = GlobalDataCodeInj.getTypeVulInjection(f1);
                        
                        if (typeVul.equals("PHP Code Injection") == true){
                            aux1 = "if ( $san_line = " + b[0] + " != 1)";
                            aux = "\t" + (Integer)key + ": " + aux1 +"\n";
                            correctedCode = correctedCode + aux;
                            correctedCode_f = correctedCode_f + aux;

                            aux = "\t" + ((Integer)key + 1) + ":\t $san_line;\n";                        
                        }
                        else{
                            aux1 = "if (" + b[0] + " == 0)";
                            aux = "\t" + (Integer)key + ": " + aux1 +"\n";
                            correctedCode = correctedCode + aux;
                            correctedCode_f = correctedCode_f + aux;

                            //aux1 = aux1 + b[2];
                            aux = "\t" + ((Integer)key + 1) + ":\t" + b[1] +"\n";
                            //aux = "\t" + (Integer)key + ": " + b[0] +"\n";
                        }
                    }
                    else
                        aux =  "\t" + v.getLinesOfVulner().get(l) + ": "+ cl + "\n";
                    correctedCode = correctedCode + aux;
                    correctedCode_f = correctedCode_f + aux;
                }
            }
            }catch (Exception e){
                aux = "\tSome unexpected error in analysis happened. Sorry :-(";
                correctedCode = correctedCode + aux;
                correctedCode_f = correctedCode_f + aux;
            }            
           

            //String typeVul = getTypeVulInjection(f1);
            if (v.IsFP() == 0){
                System.out.println(setBoldText + "\n\t= = = =  Vulnerability n.: " + (i+1) + "  = = = =");
                System.out.println("\tType: " + typeVul + setPlainText);
                System.out.println(vulnerableCode);           
                System.out.println(correctedCode);
            }
            else{
                System.out.println(setBoldText + "\n\t= = = =  Vulnerability n.: " + (i+1) + "   >>> is a possible False Positive <<<  = = = =");
                System.out.println("\tType: " + typeVul + setPlainText);
                System.out.println(vulnerableCode);

                String justifyFP = v.getJustificationOfFP();
                System.out.println(setBoldText + "\n\tFalse Positive justification:" + setPlainText);
                System.out.println(justifyFP);
            }
            
            if(GlobalDataApp.args_flags[4] == 1){
                if (v.IsFP() == 0){
                    outFile.write("\n\t= = = =  Vulnerability n.: " + (i+1) + "  = = = =\n");
                    outFile.write("\tType: " + typeVul + "\n");
                    outFile.write(vulnerableCode_f);
                    outFile.write("\n" + correctedCode_f + "\n");
                }
                else{
                    outFile.write("\n\t= = = =  Vulnerability n.: " + (i+1) + "   >>> is a possible False Positive <<<  = = = =\n");
                    outFile.write("\tType: " + typeVul + "\n");
                    outFile.write(vulnerableCode_f);
                    String justifyFP = v.getJustificationOfFP();
                    outFile.write("\n\tFalse Positive justification:\n" + justifyFP);
                }
            }
            i++;
        }
    }
}
