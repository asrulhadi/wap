/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.homeunix.wap.utils.GlobalDataApp;
import org.homeunix.wap.utils.Dates;
import org.homeunix.wap.utils.ManageFiles;
import org.homeunix.wap.utils.buildAST;
import org.homeunix.wap.table.symbol.SymbolTable;
import org.homeunix.wap.table.symbol.Symbol;
import org.homeunix.wap.table.symbol.MethodTable;
import org.homeunix.wap.table.symbol.MethodSymbol;
import org.homeunix.wap.table.symbol.Scope;
import org.homeunix.wap.sqli.OutputAnalysisSqli;
import org.homeunix.wap.sqli.FuncAndIncSQLI;
import org.homeunix.wap.sqli.GlobalDataSqli;
import org.homeunix.wap.XSS.FuncAndIncXSS;
import org.homeunix.wap.XSS.GlobalDataXSS;
import org.homeunix.wap.XSS.OutputAnalysisXSS;
import org.homeunix.wap.XSS.buildWalkerTree_XSS;
import org.homeunix.wap.CodeInjection.GlobalDataCodeInj;
import org.homeunix.wap.CodeInjection.buildWalkerTree_CodeInj;
import org.homeunix.wap.CodeInjection.FuncAndIncCodeInj;
import org.homeunix.wap.CodeInjection.OutputAnalysisCodeInj;
import org.homeunix.wap.sqli.buildWalkerTree_sqli;
import org.homeunix.wap.table.tainted.TaintedTable;
import java.io.*;
import java.lang.reflect.Field;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;

/**
 *
 * @author iberiam
 *
 * Classe que faz a analise dos tipos de analise passados nos argumentos da aplicacao
 */
public class wapAnalysis {
    List<String> fileList = new ArrayList<String>();
    SymbolTable st = null;

    public wapAnalysis (List<String> inputs, String type_analyse, String fileToOut) throws IOException {
        int i, j;
        String input="";
        FileWriter outFile = null;
        String diff_date=null, diff_date_sqli=null, diff_date_fidt=null, diff_date_xss=null;
        Long sumSecs_sqli = 0L, sumSecs_fidt = 0L, sumSecs_xss = 0L;
        
        if(GlobalDataApp.args_flags[4] == 1){
            File out = new File(fileToOut);
            outFile = new FileWriter(out);
        }
        
        //Inicio do TIMER        
        Date date = new Date(System.currentTimeMillis());
        Long begin_date = date.getTime();

        System.out.println("    * Collecting the number and type of files to analyse ......................... ");
        
        
        
        if (type_analyse.equals("files") == true){
            for (i = 0; i < inputs.size(); i++) {
                input = inputs.get(i);
                fileList.add(input);
            }
        }
        
        if (type_analyse.equals("project") == true){
            input = inputs.get(0);           
            ManageFiles projectDirectory = new ManageFiles(input);
            projectDirectory.searchPhpFiles(fileList);

            if (fileList.isEmpty() == true){
                String s = "There are no type of php files in the specified Project Directory... \n" + input;
                System.out.println(s);
            }
            else{
                projectDirectory.searchIndexPhp(fileList);
                System.setProperty("base.dir", input);
            }
        }
        //System.out.println("done");
        
        int num = fileList.size();
        //System.out.println("done\n");
        System.out.println("\n    * Generating AST's ........................................................... ");
        //System.out.println("done\n");
        
        System.out.println("\n    * Taint Analysis .............................................................");
        
        if(GlobalDataApp.args_flags[3] == 1)
        System.out.println("      - SQL Injection ");
        
        if(GlobalDataApp.args_flags[6] == 1)
        System.out.println("      - RFI, LFI, DT, SCD, OSCI and PHP code injection ");
        
        if(GlobalDataApp.args_flags[7] == 1)
        System.out.println("      - Cross Site Scripting - XSS ");

        System.out.println("\n        (this task can take several minutes, depending on number of the files to");        
        System.out.println("         analyze. So, you can take a coffee or something else :-) )");
        
        // Para ambos type_analyse (files or project)
        // Create AST and performs walker tree
        for(i=0; i<num; i++){
            input = fileList.get(i);
            CommonTreeNodeStream nodes = null;
            
            // Create AST
            try{
                buildAST ast = new buildAST(input, 1);
                nodes = ast.getNodes();
            } catch (IOException e){
                System.out.println("Error in processing of the file: "+input);
                fileList.remove(i);
                num--;
            }


            // SQLI - performs walker tree to create symboltables
            if(GlobalDataApp.args_flags[3] == 1){
                
                // inicio TIMER SQLI
               Date date1 = new Date(System.currentTimeMillis());
               Long begin_date_sqli = date1.getTime();

                // build walker tree to SQLI
               try{
                buildWalkerTree_sqli sqli = new buildWalkerTree_sqli(nodes, input, GlobalDataSqli.MainSymbolTable, GlobalDataSqli.MainIncludeFilesTable,
                                                                    GlobalDataSqli.MainFunctionsTable, GlobalDataSqli.MainFunctionsTaintedTable,
                                                                    GlobalDataSqli.MainTaintedTable, GlobalDataSqli.mus, GlobalDataSqli.MainLinesToCorrect,
                                                                    GlobalDataSqli.MainClassesTable, GlobalDataSqli.MainInstancesTable, fileList);
                
               } catch (IOException e){
                    System.out.println("Error in processing of the file: "+input);
               } catch (RecognitionException ex) {
                    Logger.getLogger(wapAnalysis.class.getName()).log(Level.SEVERE, null, ex);
                }
               try{
                    nodes.reset(); 
               } catch (Exception e) {}

               // fim TIMER SQLI
                date1 = new Date(System.currentTimeMillis());
                Long end_date_sqli = date1.getTime();
                sumSecs_sqli = sumSecs_sqli + end_date_sqli - begin_date_sqli;
                //System.out.println("done");
            }
            
            // RFI/LFI/DT/SCD/OS/Eval - performs walker tree to create symboltables
            if(GlobalDataApp.args_flags[6] == 1){
                
                
                // inicio TIMER RFI/LFI/DT
               Date date1 = new Date(System.currentTimeMillis());
               Long begin_date_fidt = date1.getTime();

                // build walker tree to RFI/LFI/DT
               try{
                buildWalkerTree_CodeInj ci = new buildWalkerTree_CodeInj(nodes, input, GlobalDataCodeInj.MainSymbolTable, GlobalDataCodeInj.MainIncludeFilesTable,
                                                                    GlobalDataCodeInj.MainFunctionsTable, GlobalDataCodeInj.MainFunctionsTaintedTable,
                                                                    GlobalDataCodeInj.MainTaintedTable, GlobalDataCodeInj.mus, GlobalDataCodeInj.MainLinesToCorrect,
                                                                    GlobalDataCodeInj.MainClassesTable, GlobalDataCodeInj.MainInstancesTable, fileList);
               } catch (IOException e){
                    System.out.println("Error in processing of the file: "+input);
               }
               try{
                    nodes.reset(); 
               } catch (Exception e) {}
                
                // fim TIMER RFI/LFI/DT
                date1 = new Date(System.currentTimeMillis());
                Long end_date_fidt = date1.getTime();
                sumSecs_fidt = sumSecs_fidt + end_date_fidt - begin_date_fidt;
               // System.out.println("done");
            }

            // XSS - performs walker tree to create symboltables
            if(GlobalDataApp.args_flags[7] == 1){
                // inicio XSS
               Date date1 = new Date(System.currentTimeMillis());
               Long begin_date_xss = date1.getTime();

                // build walker tree to XSS
               try{
                buildWalkerTree_XSS xss = new buildWalkerTree_XSS(nodes, input, GlobalDataXSS.MainSymbolTable, GlobalDataXSS.MainIncludeFilesTable,
                                                                    GlobalDataXSS.MainFunctionsTable, GlobalDataXSS.MainFunctionsTaintedTable,
                                                                    GlobalDataXSS.MainTaintedTable, GlobalDataXSS.mus, GlobalDataXSS.MainLinesToCorrect,
                                                                    GlobalDataXSS.MainClassesTable, GlobalDataXSS.MainInstancesTable, fileList);
               } catch (IOException e){
                    System.out.println("Error in processing of the file: "+input);
               }
               try{
                    nodes.reset(); 
               } catch (Exception e) {}
                
                // fim TIMER XSS
                date1 = new Date(System.currentTimeMillis());
                Long end_date_xss = date1.getTime();
                sumSecs_xss = sumSecs_xss + end_date_xss - begin_date_xss;
                //System.out.println("done");
            }            
        }
        // FIM: Create AST and performs walker tree
        
        // Move st de mst para mitf. Para o caso de alguma ter ficado esquecida em mst
        Map mst_initial;
        if(GlobalDataApp.args_flags[3] == 1)
            mst_initial = GlobalDataSqli.MainSymbolTable;
        else
            if(GlobalDataApp.args_flags[7] == 1)
                mst_initial = GlobalDataXSS.MainSymbolTable;
            else
                mst_initial = GlobalDataCodeInj.MainSymbolTable;

        Iterator <SymbolTable> it;
        SymbolTable st_aux;
        int qt_initial = mst_initial.size();
        int qt_inside;
        Boolean mv = false;
        for(i=0; i < qt_initial; i++){
            for (it = mst_initial.values().iterator(); mv.equals(false) && it.hasNext();){
                st_aux = it.next();
                st_aux.mvIncludeFiles(fileList);

                qt_inside = mst_initial.size();
                if (qt_inside != qt_initial){
                    mv = true;
                    qt_initial = qt_inside;
                }
            }
        }         
        
        //System.out.println("\n    * Taint Analysis - Bottom up approach");
        //System.out.println("       (this task can take several minuts.)");        
        
        // SQLI Taint Analise
       if(GlobalDataApp.args_flags[3] == 1){
           // System.out.print("      - SQL Injection ..................................................");
           // inicio TIMER SQLI
          Date date1 = new Date(System.currentTimeMillis());
          Long begin_date_sqli = date1.getTime();

           for (it = GlobalDataSqli.MainSymbolTable.values().iterator(); it.hasNext();){
               st_aux = it.next();

               // create structures
               String file = st_aux.getScopeName();
               GlobalDataSqli.MainNumVul.put(file, 0);
               GlobalDataSqli.MainNumFP.put(file, 0);
               TaintedTable mts = new TaintedTable(file);
               GlobalDataSqli.MainTaintedTable.put(file, mts);
               GlobalDataSqli.mus.getUntaintedMembers().clear();
               String mysqlFunc="";
               String connectionDB="";
               String selectDB = "";

               // MAKES ANALYSIS
               // mapa que contem as vars da conexao e db do mysql
               Map <String, String> varsDB = new HashMap <String, String>();
               varsDB.put("connectionDB", connectionDB);
               varsDB.put("selectDB", selectDB);
               Integer ii = -1;
               varsDB.put("lineMysqliBindParam", ii.toString());
             
               // Analysis
               Iterator <Symbol> it1 = st_aux.getMembers().iterator();
               Scope cs;
               Symbol sy;
               for(; it1.hasNext();){
                   sy = it1.next();
                   if (sy.getIsVariableSymbol() == false){
                   try{
                       cs = (Scope) sy;
                       FuncAndIncSQLI css = new FuncAndIncSQLI(cs);                       
                       css.resolveSymbolSQLI(cs, mts, GlobalDataSqli.mus, GlobalDataSqli.MainIncludeFilesTable,
                                             st_aux.getScopeName(), GlobalDataSqli.MainFunctionsTable, GlobalDataSqli.MainSymbolTable,
                                             varsDB, GlobalDataSqli.MainFunctionsTaintedTable, GlobalDataSqli.MainLinesToCorrect,
                                             GlobalDataSqli.MainClassesTable, GlobalDataSqli.MainInstancesTable);
                   } catch (Exception e){
                   //     System.out.println("Error processing: "+sy.getName());
                   }
                   }
                   //else{
                   //    st_aux.getMembers().remove(sy);
                   //}
               }
           } 

          // fim TIMER SQLI
           date1 = new Date(System.currentTimeMillis());
           Long end_date_sqli = date1.getTime();
           sumSecs_sqli = sumSecs_sqli + end_date_sqli - begin_date_sqli;
           
            //System.out.println("done");        
           
           
       }
            
        // RFI/LFI/DT/SCD/OS/Eval Taint Analise
        if(GlobalDataApp.args_flags[6] == 1){
            //System.out.print("      - RFI, LFI, DT, SCD, OSCI and PHP code injection .................");
            // inicio TIMER RFI/LFI/DT
            Date date1 = new Date(System.currentTimeMillis());
            Long begin_date_fidt = date1.getTime();

           for (it = GlobalDataCodeInj.MainSymbolTable.values().iterator(); it.hasNext();){
               st_aux = it.next();

               // create structures
               String file = st_aux.getScopeName();
               GlobalDataCodeInj.MainNumVul.put(file, 0);
               GlobalDataCodeInj.MainNumFP.put(file, 0);
               TaintedTable mts = new TaintedTable(file);
               GlobalDataCodeInj.MainTaintedTable.put(file, mts);
               GlobalDataCodeInj.mus.getUntaintedMembers().clear();
               Boolean codeinjfunc=false;

               // Analysis
               Iterator <Symbol> it1 = st_aux.getMembers().iterator();
               Scope cs;
               Symbol sy;
               for(; it1.hasNext();){
                   sy = it1.next();
                   if (sy.getIsVariableSymbol() == false){
                       try{
                       cs = (Scope) sy;
                       FuncAndIncCodeInj css = new FuncAndIncCodeInj(cs);
                       css.resolveSymbolCodeInj(cs, mts, GlobalDataCodeInj.mus, GlobalDataCodeInj.MainIncludeFilesTable,
                                             st_aux.getScopeName(), GlobalDataCodeInj.MainFunctionsTable, GlobalDataCodeInj.MainSymbolTable,
                                             GlobalDataCodeInj.MainFunctionsTaintedTable, GlobalDataCodeInj.MainLinesToCorrect,
                                             GlobalDataCodeInj.MainClassesTable, GlobalDataCodeInj.MainInstancesTable);
                   
                       } catch (Exception e){
                       //  System.out.println("Error processing: "+sy.getName());
                       }
                  }
               }
           }

            // fim TIMER RFI/LFI/DT
            date1 = new Date(System.currentTimeMillis());
            Long end_date_fidt = date1.getTime();
            sumSecs_fidt = sumSecs_fidt + end_date_fidt - begin_date_fidt;
            //System.out.println("done");
        }

        // XSS Taint Analise
        if(GlobalDataApp.args_flags[7] == 1){
            //System.out.print("      - Cross Site Scripting - XSS .....................................");
            // inicio XSS
            Date date1 = new Date(System.currentTimeMillis());
            Long begin_date_xss = date1.getTime();

           for (it = GlobalDataXSS.MainSymbolTable.values().iterator(); it.hasNext();){
               st_aux = it.next();

               // create structures
               String file = st_aux.getScopeName();
               GlobalDataXSS.MainNumVul.put(file, 0);
               GlobalDataXSS.MainNumFP.put(file, 0);
               TaintedTable mts = new TaintedTable(file);
               GlobalDataXSS.MainTaintedTable.put(file, mts);
               GlobalDataXSS.mus.getUntaintedMembers().clear();
               Boolean xssfunc=false;

               // Analysis
               Iterator <Symbol> it1 = st_aux.getMembers().iterator();
               Scope cs;
               Symbol sy;
               for(; it1.hasNext();){
                   sy = it1.next();
                   if (sy.getIsVariableSymbol() == false){
                       try{
                       cs = (Scope) sy;
                       FuncAndIncXSS xss = new FuncAndIncXSS(cs);
                       xss.resolveSymbolXSS(cs, mts, GlobalDataXSS.mus, GlobalDataXSS.MainIncludeFilesTable,
                                             st_aux.getScopeName(), GlobalDataXSS.MainFunctionsTable, GlobalDataXSS.MainSymbolTable,
                                             GlobalDataXSS.MainFunctionsTaintedTable, GlobalDataXSS.MainLinesToCorrect,
                                             GlobalDataXSS.MainClassesTable, GlobalDataXSS.MainInstancesTable);
                       } catch (Exception e){
                       }
                   }
               }
           }

           // fim TIMER XSS
            date1 = new Date(System.currentTimeMillis());
            Long end_date_xss = date1.getTime();
            sumSecs_xss = sumSecs_xss + end_date_xss - begin_date_xss;
            //System.out.println("done");
        }            
            
            
        diff_date_sqli = Dates.DiffDates(sumSecs_sqli);
        diff_date_fidt = Dates.DiffDates(sumSecs_fidt);
        diff_date_xss = Dates.DiffDates(sumSecs_xss);
        
              
        // fim TIMER
        date = new Date(System.currentTimeMillis());
        Long end_date = date.getTime();
        diff_date = Dates.DiffDates(end_date - begin_date);

        System.out.println("\n    * Detecting vulnerabilities and predicting false positives ...................");
        if (GlobalDataApp.args_flags[0] == 0)
            System.out.println("\n    * Correcting vulnerabilities .................................................");
        
        // code needed for keyboard input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tempp;
        System.out.println("\n\nPress enter to view results...");
        tempp = br.readLine();

        /***************
 * ***************
 */        
        
        
        // Cabecalho da aplicacao
        if(GlobalDataApp.args_flags[4] == 1){
            outFile.write("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
            outFile.write("\n*                           WAP - Web Application Protection                          *");
            outFile.write("\n*                    Source Code Static Analysis & Data Mining Tool                   *");
            outFile.write("\n*                                     version 2.1                                   *");
            outFile.write("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        }      
        
        // Sumario Global da analise
        
        // Obter uma class GlobalData
        String className = null;
        if(GlobalDataApp.args_flags[3] == 1)
            className = "org.homeunix.wap.sqli.GlobalDataSqli";
        else
            if(GlobalDataApp.args_flags[6] == 1)
                className = "org.homeunix.wap.CodeInjection.GlobalDataCodeInj";
            else
                if(GlobalDataApp.args_flags[7] == 1)
                    className = "org.homeunix.wap.XSS.GlobalDataXSS";
        
        // Obter Campos
        Map m1 = null, m2 = null;
        try {
            Class cl = Class.forName(className);
            try {
                Field field1 = cl.getField("MainSymbolTable");
                Field field2 = cl.getField("MainIncludeFilesTable");
                try {
                    m1 = (Map) field1.get(null);
                    m2 = (Map) field2.get(null);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(wapAnalysis.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(wapAnalysis.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NoSuchFieldException ex) {
                Logger.getLogger(wapAnalysis.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(wapAnalysis.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(wapAnalysis.class.getName()).log(Level.SEVERE, null, ex);
        }

        i = m1.size();
        j = m2.size();

        int soma = 0;
        for(Iterator <SymbolTable> it1 = m1.values().iterator(); it1.hasNext(); ){
            SymbolTable stab = it1.next();
            String s = stab.getScopeName();          
            ManageFiles ff = new ManageFiles(s);
            soma += ff.getNumberLinesFile();
        }

        for(Iterator <SymbolTable> it1 = m2.values().iterator(); it1.hasNext(); ){
            SymbolTable stab = it1.next();
            try{
            String s = stab.getScopeName(); 
            ManageFiles ff = new ManageFiles(s);
            soma += ff.getNumberLinesFile();
            } catch (Exception e){
                //System.out.println("\t\tErro = ");
            }
        }     
        
        
        /*** OUTPUT ***/
        String setPlainText = "";
        String setBoldText = "";
        if (GlobalDataApp.isWindows.booleanValue() == false){
            setPlainText = "\033[0;0m";
            setBoldText = "\033[0;1m";
        }
        
        if (type_analyse.equals("project") == true){   
            System.out.println(setBoldText + "\n\n PROJECT ANALYSIS: ");
            System.out.println("\n  + Global Summary:" + setPlainText);
            System.out.println("     - Project directory: " + System.getProperty("base.dir"));
            
            if(GlobalDataApp.args_flags[4] == 1){
                outFile.write("\n\n PROJECT ANALYSIS:\n");
                outFile.write("\n  + Global Summary:\n");
                outFile.write("     - Project directory: " + System.getProperty("base.dir") + "\n");
            }
        }
        else{
            System.out.println(setBoldText + "\n\n FILE(S) ANALYSIS");
            System.out.println("\n  + Global Summary:" + setPlainText);
            
            if(GlobalDataApp.args_flags[4] == 1){
                outFile.write("\n\n FILE(S) ANALYSIS\n");
                outFile.write("\n  + Global Summary:\n");
            }
        }

        System.out.println("     - Total time: " + diff_date);
        System.out.println("     - Files: " + (i+j));
        System.out.println("     - Lines of code: " + soma);
        System.out.println("\n     - Regular files: " + i);
        System.out.println("     - Include files: " + j);        

        if(GlobalDataApp.args_flags[4] == 1){
            outFile.write("     - Total time: " + diff_date+"\n");
            outFile.write("     - Files: " + (i+j) +"\n");
            outFile.write("     - Lines of code: " + soma+"\n");
            outFile.write("\n     - Regular files: " + i +"\n");
            outFile.write("     - Include files: " + j +"\n");            
        }
        
        if (GlobalDataApp.args_flags[0] == 1){
            System.out.println("\n     - Automatic correction: " + setBoldText + "no" + setPlainText);
            if(GlobalDataApp.args_flags[4] == 1)
                outFile.write("\n     - Automatic correction: no\n");
        }
        else{
            System.out.println("\n     - Automatic correction: " + setBoldText + "yes" + setPlainText);
            if(GlobalDataApp.args_flags[4] == 1)
                outFile.write("\n     - Automatic correction: yes\n");            
        }

        // Sumario da analise SQLI
        if(GlobalDataApp.args_flags[3] == 1)
            OutputAnalysisSqli.outputAnalysis(type_analyse, outFile, diff_date_sqli, fileList);

        // Sumario da analise XSS
        if(GlobalDataApp.args_flags[7] == 1)
            OutputAnalysisXSS.outputAnalysis(type_analyse, outFile, diff_date_xss, fileList);
        
        // Sumario da analise RFI/LFI/DT
        if(GlobalDataApp.args_flags[6] == 1)
            OutputAnalysisCodeInj.outputAnalysis(type_analyse, outFile, diff_date_fidt, fileList);        
        
        if(GlobalDataApp.args_flags[4] == 1)
            outFile.close();
        
        // Renomear os files file.php_ori para os originais
        for(Iterator <String> it1 = fileList.iterator(); it1.hasNext(); ){
            String aux = it1.next();
            File ori = new File(aux + "_ori");
            File temp = new File(aux);
            ori.renameTo(temp);
        }

        
        if(GlobalDataApp.args_flags[0] == 0 &&
           (GlobalDataApp.args_flags[3] == 1 && GlobalDataSqli.getNumVul() > 0) ||
           (GlobalDataApp.args_flags[6] == 1 && GlobalDataCodeInj.getNumVul() > 0) ||
           (GlobalDataApp.args_flags[7] == 1 && GlobalDataXSS.getNumVul() > 0)){        
        //1. 00ToKeyword em filename      
        File dir;
        if (type_analyse.equals("project") == true){        
            dir = new File(System.getProperty("base.dir") + File.separator + "NewFiles");
            if (dir.exists() == true && dir.listFiles().length > 1){
                for(i=0; i<fileList.size(); i++){
                    File ff = new File(dir + fileList.get(i).toString());
                    if(ff.exists() == true){
                        ManageFiles h = new ManageFiles(ff.toString());
                        h.keywordFrom00(ff.toString());
                    } 
                }
            }
            
            // Se existe somente o fich das paths entao nenhum fich foi corrigido
            try{
            if (dir.exists()==true){
                if (dir.listFiles().length == 1){
                    File fList[] = dir.listFiles();
                    fList[0].delete();
                    dir.delete();
            }
            else{
                System.out.println(setBoldText + "\n> > > > IMPROVEMENTS at directory: " +
                        setPlainText + dir + setBoldText + " < < < < " + setPlainText);
                System.out.println("  + New application files: ");
                File in = new File(dir+ File.separator +"PathNewFiles.txt");
                Scanner fscanner = new Scanner(in);
                while (fscanner.hasNextLine()){
                    String s = fscanner.nextLine();
                    System.out.println("     - "+s);
                }
                fscanner.close();
                               
                if((GlobalDataApp.args_flags[3] == 1 && GlobalDataSqli.getNumVul() > 0) ||
                   (GlobalDataApp.args_flags[6] == 1 && GlobalDataCodeInj.getNumVul() > 0) ||
                   (GlobalDataApp.args_flags[7] == 1 && GlobalDataXSS.getNumVul() > 0)){
                    File dir_dest = new File(System.getProperty("base.dir") + File.separator + "NewFiles" + File.separator + "includes_wap");
                    dir_dest.mkdirs();
                    
                    String curDir = System.getProperty("user.dir");
                    File d = new File(curDir);
                    // RETIRAR na Versao Final                    
                    //d = new File(d.getParent());                       
                    File d1 = new File(d + File.separator + "includes_wap");                        
                    ManageFiles dir_src = new ManageFiles(d1.toString());                     

                    dir_src.copyFileImprovement(dir_dest.toString());
                    System.out.println("\n  + Directory includes_wap:");
                    System.out.println("     - fixes (php wap files) to sanitize the user inputs\n");
                    
                    System.out.println(setBoldText + "\n       IMPORTANT:" + setPlainText);
                    System.out.println("\tCopy this directory to your directory project and insert, in each file listed in");
                    System.out.println("\t\"New application files\", the following line of code:");
                    System.out.println("\t\tinclude(\'wap.php\');");
                    System.out.println("\tDo not forget to indicate the correct path of the wap.php.\n");
                }
            }
            }
            } catch (IOException e) {}            
        }
        if (type_analyse.equals("single_file") == true || type_analyse.equals("files") == true){
            for(i=0; i<fileList.size(); i++){
                ManageFiles relativeFile = new ManageFiles(fileList.get(i).toString());
                File baseDir = relativeFile.getBaseDir();
                dir = new File(baseDir + File.separator + "NewFiles");        
                if (dir.exists() == true && dir.listFiles().length > 1){
                    File ff = new File(dir + relativeFile.toString());
                    if(ff.exists() == true){
                        ManageFiles h = new ManageFiles(ff.toString());
                        h.keywordFrom00(ff.toString());
                    }
                }
                
                // Se existe somente o fich das paths entao nenhum fich foi corrigido
                try{
                if (dir.exists() == true){
                if (dir.listFiles().length == 1){
                    File fList[] = dir.listFiles();
                    fList[0].delete();
                    dir.delete();
                }
                else{
                    System.out.println(setBoldText + "\n> > > > IMPROVEMENTS at directory: " +
                        setPlainText + dir + setBoldText + " < < < < " + setPlainText);
                    System.out.println("  + New application files: ");
                    File in = new File(dir+ File.separator +"PathNewFiles.txt");
                    Scanner fscanner = new Scanner(in);
                    while (fscanner.hasNextLine()){
                        String s = fscanner.nextLine();
                        System.out.println("     - "+s);
                    }
                    fscanner.close();
                    
                    if((GlobalDataApp.args_flags[3] == 1 && GlobalDataSqli.getNumVul() > 0) ||
                       (GlobalDataApp.args_flags[6] == 1 && GlobalDataCodeInj.getNumVul() > 0) ||
                       (GlobalDataApp.args_flags[7] == 1 && GlobalDataXSS.getNumVul() > 0)){
                        File dir_dest = new File(dir + File.separator + "includes_wap");
                        dir_dest.mkdirs();
                        String curDir = System.getProperty("user.dir"); 
                      
                        File d = new File(curDir);
                        // RETIRAR na Versao Final
                        //d = new File(d.getParent());                       
                        File d1 = new File(d + File.separator + "includes_wap");                        
                        ManageFiles dir_src = new ManageFiles(d1.toString());                       
                        dir_src.copyFileImprovement(dir_dest.toString());
                        System.out.println("\n  + Directory includes_wap:");
                        System.out.println("     - fixes (php wap files) to sanitize the user inputs\n");
                        
                        System.out.println(setBoldText + "\n       IMPORTANT:" + setPlainText);
                        System.out.println("\tCopy this directory to your directory project and insert, in each file listed in");
                        System.out.println("\t\"New application files\", the following line of code:");
                        System.out.println("\t\tinclude(\'wap.php\');");
                        System.out.println("\tDo not forget to indicate the correct path of the wap.php.\n");
                    }                    
                }
                }
                } catch (IOException e) {}
            }
        }
    }
        
        
    }


    private void copyFileList(List <String> srcList, List <String> destList){
        for (int i=0; i <= srcList.size()-1; i++){
                //Object s = new Object();
                String s = srcList.get(i).toString();
                String sd = new String(s);
                destList.add(sd);
        }
    }
    

    private void printAll(){
    // ########### PARA RETIRAR DEPOIS #############
        System.out.println("mst = "+GlobalDataSqli.MainSymbolTable.size()+"\t\tmtt = "+GlobalDataSqli.MainTaintedTable.size()+
                           "\t\tmift = "+ GlobalDataSqli.MainIncludeFilesTable.size()+"\t\tmft = "+GlobalDataSqli.MainFunctionsTable.size()+"\n");
	
        for(Iterator <SymbolTable> it3 = GlobalDataSqli.MainSymbolTable.values().iterator(); it3.hasNext(); ){
            SymbolTable sss = it3.next();
            System.out.println("mst = "+sss.getScopeName()+"\n");
	}
	for(Iterator <TaintedTable> it1 = GlobalDataSqli.MainTaintedTable.values().iterator(); it1.hasNext(); ){
            TaintedTable sss1 = it1.next();
            System.out.println("mtt = "+sss1.getScopeTaintedName()+"\n");
	}
	for(Iterator <SymbolTable> it2 = GlobalDataSqli.MainIncludeFilesTable.values().iterator(); it2.hasNext(); ){
            SymbolTable sss2 = it2.next();
            System.out.println("mift = "+sss2.getScopeName()+"\n");
	}
        
        for(Iterator <MethodTable> it3 = GlobalDataSqli.MainFunctionsTable.values().iterator(); it3.hasNext(); ){
            MethodTable sss3 = it3.next();
            System.out.println("mft = "+sss3.getScopeName()+"\n");
            for(Iterator <MethodSymbol> it1 = sss3.getMembers().iterator(); it1.hasNext(); ){
                MethodSymbol ms = it1.next();
                System.out.println("\tfunc = "+ms.getFunctionName()+"\n");
            }
	}

    }
}
