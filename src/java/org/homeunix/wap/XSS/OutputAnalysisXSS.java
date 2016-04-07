/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.homeunix.wap.XSS;

import org.homeunix.wap.utils.LinesToCorrect;
import org.homeunix.wap.utils.GlobalDataApp;
import org.homeunix.wap.utils.ManageFiles;
import org.homeunix.wap.table.tainted.ListVulners;
import org.homeunix.wap.table.symbol.SymbolTable;
import org.homeunix.wap.table.symbol.MethodTable;
import org.homeunix.wap.table.symbol.MethodSymbol;
import java.util.*;
import java.io.*;

/**
 *
 * @author iberiam
 */
public class OutputAnalysisXSS {

    //public static void outputAnalysisWithCorrection (String type_analyse, String filename) throws IOException{
    public static void outputAnalysisWithCorrection (String type_analyse, String filename, LinesToCorrect ltc, int num_file) throws IOException{    
        FileWriter out_FileOfPaths;
        File dir = null;
        BufferedWriter bufferWritter = null;
        Date date = new Date(System.currentTimeMillis());
        int i = GlobalDataXSS.MainLinesToCorrect.size();

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

           // LinesToCorrect ltc = GlobalDataXSS.MainLinesToCorrect.get(filename);            
            String file = ltc.getNameFile();
            ManageFiles relativeFile = new ManageFiles(file);

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


            if (ltc.getMapLinesToCorrect().isEmpty() == false){
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
                    inn = new File(ff.toString());
                    temp = new File(ff.toString() + "temp");
                    inn.renameTo(temp);
                    in = new File(temp.toString());
                    out = new File(dir+ File.separator + file);
                }

                Scanner fscanner = new Scanner(in);
                FileWriter outFinalFile = new FileWriter(out);

                Map sortedMap = new TreeMap(ltc.getMapLinesToCorrect());
                Set a = sortedMap.keySet();
                String codeLine;
                int line = 0;
                Boolean foundFirst = false;
                for (Object key : a) {
                    for (int j = line+1; j < (Integer)key; j++){
                        codeLine = fscanner.nextLine();
                        outFinalFile.write(codeLine+"\n");
//                        if(codeLine.contains("<?php") && foundFirst == false){
//                            foundFirst = true;
//                            outFinalFile.write("include(\"includes_awap" + File.separator + "awap_XSS.php\");" + "\n");
//                        }
                    }
                    codeLine = fscanner.nextLine();
                    outFinalFile.write(sortedMap.get(key).toString()+"\n");
                    line = (Integer)key;
                }

                while (fscanner.hasNextLine()){
                    codeLine = fscanner.nextLine();
                    outFinalFile.write(codeLine+"\n");
                }
                fscanner.close();
                outFinalFile.close();
                
                if (inn != null && inn.exists())
                    inn.delete();

                if (type_analyse.equals("single_file") == true || type_analyse.equals("files") == true)
                    bufferWritter.close();
            }
        //}
        if (type_analyse.equals("project") == true)
            bufferWritter.close();
    }


    public static void outputAnalysis(String type_analyse, FileWriter outFile, String diff_date_xss, List files) throws IOException{
        int vuu = GlobalDataXSS.getNumVul(), fpp = GlobalDataXSS.getNumFP();
        /*
        for(Iterator <Integer> it = GlobalDataXSS.MainNumVul.values().iterator(); it.hasNext(); ){
            Integer j = it.next();
            vuu += j;
        }
        
        for(Iterator <Integer> it = GlobalDataXSS.MainNumFP.values().iterator(); it.hasNext(); ){
            Integer j = it.next();
            fpp += j;
        }        
        */
        
        String setPlainText = "";
        String setBoldText = "";
        if (GlobalDataApp.isWindows.booleanValue() == false){
            setPlainText = "\033[0;0m";
            setBoldText = "\033[0;1m";
        }
        
        System.out.println(setBoldText +"\n\n+ + + Type of Analysis: XSS");
        System.out.println("     > Summary:" + setPlainText);
        
        if(GlobalDataApp.args_flags[4] == 1){
            outFile.write("\n\n  + Type of Analysis: XSS\n");
            outFile.write("     > Summary:\n");
        }
        
        if (vuu+fpp > 0){
            System.out.println("        - Time of analysis: " + diff_date_xss);
            System.out.println("        - Number of vulnerabilities detected: " + setBoldText + (vuu+fpp) + setPlainText);
            System.out.println("           - Real vulnerabilities: " + setBoldText + vuu + setPlainText);
            System.out.println("           - False positives: " + setBoldText + fpp + setPlainText);
            System.out.println("        - Number of vulnerable files: " +
                    setBoldText + GlobalDataXSS.MainListVulners.size() + setPlainText);
            System.out.println("        - List of vulnerable files:");
            
            if(GlobalDataApp.args_flags[4] == 1){
                outFile.write("        - Time of analysis: " + diff_date_xss+"\n");
                outFile.write("        - Number of vulnerabilities detected: " + (vuu+fpp)+"\n");
                outFile.write("           - Real vulnerabilities: " + vuu+"\n");
                outFile.write("           - False positives: " + fpp+"\n");
                outFile.write("        - Number of vulnerable files: " + GlobalDataXSS.MainListVulners.size()+"\n");
                outFile.write("        - List of vulnerable files:\n");
            }

            for(Iterator <ListVulners> it = GlobalDataXSS.MainListVulners.values().iterator(); it.hasNext(); ){
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
            System.out.println("        - Time of analysis: " + diff_date_xss);
            System.out.println("        - Number of vulnerabilities detected: "  + setBoldText +"none" + setPlainText);
            if(GlobalDataApp.args_flags[4] == 1){
                outFile.write("        - Time of analysis: " + diff_date_xss +"\n");
                outFile.write("        - Number of vulnerabilities detected: none\n");
            }
            
            return;            
        }      
        
        
        ListVulners lv = null;
        for (Iterator <ListVulners> it = GlobalDataXSS.MainListVulners.values().iterator(); it.hasNext();){
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
                if (GlobalDataXSS.MainIncludeFilesTable.containsKey(file) == true){
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
                if (GlobalDataXSS.MainSymbolTable.containsKey(file) == true)
                    st = GlobalDataXSS.MainSymbolTable.get(file);
                else
                    st = GlobalDataXSS.MainIncludeFilesTable.get(file);

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
                if (GlobalDataXSS.MainFunctionsTable.containsKey(file) == true){
                    MethodTable mt = GlobalDataXSS.MainFunctionsTable.get(file);
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
                VulnerXSS v;
                int vuu_f = lv.getListOfVulners().size();
                int fpp_f = 0;
                for (Iterator <VulnerXSS> it1 = lv.getListOfVulners().iterator(); it1.hasNext();){
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
                    outFile.write("           - Real Vulnerabilities: "+vuu_f+"\n");
                    outFile.write("           - False positives: "+fpp_f+"\n");
                }

                analysisOfFile(lv, outFile, file.toString());
                if (it.hasNext() && GlobalDataApp.args_flags[0] == 1){
                    // code needed for keyboard input
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String temp;
                    System.out.println("\n\nPress enterGlobalDataSqli to view vulnerabilities of next file...");
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
            int i = GlobalDataXSS.MainLinesToCorrect.size();
            for (Iterator <LinesToCorrect> it1 = GlobalDataXSS.MainLinesToCorrect.values().iterator(); it1.hasNext();){
                ltc = it1.next();
                OutputAnalysisXSS.outputAnalysisWithCorrection(type_analyse, ltc.getNameFile(), ltc, i);
                i--;
            }
            } catch (Exception e){}
               
                //OutputAnalysisXSS.outputAnalysisWithCorrection(type_analyse, lv.getFilename());
                
                
                System.out.println("\n\nAutomatic correction complete !!!");
                if(GlobalDataApp.args_flags[4] == 1){
                    outFile.write("\n\nAutomatic correction complete !!!\n");
                }
            }

        //}

/*        
        // Renomear os files file.php_ori para os originais
        for(Iterator <String> it1 = files.iterator(); it1.hasNext(); ){
            String aux = it1.next();
            File ori = new File(aux + "_ori");
            File temp = new File(aux);
            ori.renameTo(temp);
        }
         * 
         */
    }

    private static void analysisOfFile(ListVulners lv, FileWriter outFile, String filename) throws IOException{
        VulnerXSS v;
        String cl, correctedCode = "", aux = "";
        Iterator <VulnerXSS> it;
        int i=0;
        LinesToCorrect ltc;
        Object key;
        
        String setPlainText = "";
        String setBoldText = "";
        if (GlobalDataApp.isWindows.booleanValue() == false){
            setPlainText = "\033[0;0m";
            setBoldText = "\033[0;1m";
        }
        
        //ltc = GlobalDataXSS.MainLinesToCorrect.get(filename);
        //Map sortedMap = new TreeMap(ltc.getMapLinesToCorrect());


        for (it = lv.getListOfVulners().iterator(); it.hasNext();){
            v = it.next();
            if (v.IsFP() == 0)
                System.out.println(setBoldText + "\n\t= = = =  Vulnerability n.: " + (i+1) + "  = = = =");
            else
                System.out.println(setBoldText + "\n\t= = = =  Vulnerability n.: " + (i+1) + "   >>> is a possible False Positive <<<  = = = =");
            System.out.println("\tVulnerable code:" + setPlainText);
            if(GlobalDataApp.args_flags[4] == 1){
                if (v.IsFP() == 0)
                    outFile.write("\n\t= = = =  Vulnerability n.: " + (i+1) + "  = = = =\n");
                else
                    outFile.write("\n\t= = = =  Vulnerability n.: " + (i+1) + "   >>> is a possible False Positive <<<  = = = =\n");
                outFile.write("\tVulnerable code:\n");
            }
            i++;

            try{
            // escrever vulnerabilidade no ecra
            String f;
            correctedCode = "";
            for (int l = v.getLinesOfVulner().size() -1; l >= 0; l--){
                f = "";
                if (v.getFilesOfVulner().get(l).equals(lv.getFilename()) == false)
                    f = (String) v.getFilesOfVulner().get(l);

                ManageFiles fff = new ManageFiles ((String) v.getFilesOfVulner().get(l));
                cl = fff.getLineOfCode((Integer) v.getLinesOfVulner().get(l));
                System.out.println("\t" + v.getLinesOfVulner().get(l) + ": "+ cl);
                if(GlobalDataApp.args_flags[4] == 1){
                    outFile.write("\t" + v.getLinesOfVulner().get(l) + ": "+ cl+"\n");
                }
                if (f.equals("") == false){
                    System.out.println("\t    (" + f + ")");
                    if(GlobalDataApp.args_flags[4] == 1){
                        outFile.write("\t    (" + f + ")\n");
                    }
                }
                

                if (v.IsFP() == 0){
                    // escrita do corrected code no ecra
                    ltc = GlobalDataXSS.MainLinesToCorrect.get(v.getFileOfLineToSanitize());
                    Map sortedMap = new TreeMap(ltc.getMapLinesToCorrect());                
                    if (ltc.getMapLinesToCorrect().containsKey(v.getLinesOfVulner().get(l)) == true){
                        key = v.getLinesOfVulner().get(l);
                        aux =  "\t" + (Integer)key + ": " + sortedMap.get(key).toString()+"\n";
                    }
                    else
                        aux =  "\t" + v.getLinesOfVulner().get(l) + ": "+ cl + "\n";
                    correctedCode = correctedCode + aux;
                }  
            }
        }catch (Exception e){
            aux = "\tSome unexpected error in analysis happened. Sorry :-(";
            correctedCode = correctedCode + aux;
        }            

        if (v.IsFP() == 0){
            System.out.println(setBoldText + "\n\tCorrected code:" + setPlainText);
            System.out.println(correctedCode);
            if(GlobalDataApp.args_flags[4] == 1)
                outFile.write("\n\tCorrected code:\n" + correctedCode);
        }
        else{
            String justifyFP = v.getJustificationOfFP();
            System.out.println(setBoldText + "\n\tFalse Positive justification:" + setPlainText);
            System.out.println(justifyFP);
            if(GlobalDataApp.args_flags[4] == 1)
                outFile.write("\n\tFalse Positive justification:\n" + justifyFP); 
        }            
        }
    }

}
