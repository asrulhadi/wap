/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.homeunix.wap.utils.OSValidator;
import org.homeunix.wap.utils.GlobalDataApp;
import org.homeunix.wap.utils.ManageFiles;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author iberiam
 */
public class wap {
       
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws Exception {
        String input, input1, filename, fileOut = null;
        List<String> inputs = new ArrayList<String>();
        wapAnalysis a;
        String type_analyse="";
        ManageFiles ff;
        
      
        try{
            if (OSValidator.isWindows()) {
                    //Runtime.getRuntime().exec("cls");
                    Runtime.getRuntime().exec("cmd /c cls");
                    //Runtime.getRuntime().exec("command /c cls");
                    System.out.println("This is Windows");
                    System.out.println("version: " + OSValidator.windowsVersion());
                    GlobalDataApp.isWindows = true;
            } else if (OSValidator.isMac()) {
                    Runtime.getRuntime().exec("clear");
                    System.out.println("This is Mac");
            } else if (OSValidator.isUnix()) {
                    Runtime.getRuntime().exec("clear");
                    System.out.println("This is Unix or Linux");
            } else if (OSValidator.isSolaris()) {
                    Runtime.getRuntime().exec("clear");
                    System.out.println("This is Solaris");
            } else {
                    System.out.println("Your OS is not support!!");
                    System.exit(-1);
            }
        } catch (IOException e){}
         
        
        System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                           WAP - Web Application Protection                          *");
        System.out.println("*                    Source Code Static Analysis & Data Mining Tool                   *");
        System.out.println("*                                     version 2.1                                   *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        
        switch (args.length){
            case 0:{
                System.out.println("\nProject Directory or Filename not specified!!!");
                System.out.println("Please specify one or more PHP files or a entire project to be parsed.\n");
                System.out.println("Try `wap -h` or `wap -help` for more information\n");
                break;
            }
            case 1:{
                input = args[0];
                if (input.equals("-help") == true || input.equals("-h") == true){
                    String setPlainText = "";
                    String setBoldText = "";
                    if (GlobalDataApp.isWindows.booleanValue() == false){
                        setPlainText = "\033[0;0m";
                        setBoldText = "\033[0;1m";
                    }
                        
                    System.out.println(setBoldText + "Usage:");
                    System.out.println("\twap" + setPlainText + " [options] -p <project>");
                    System.out.println(setBoldText + "\twap" + setPlainText + " [options] file(s)\n");
                    
                    System.out.println(setBoldText + "Description: "+setPlainText);
                    //System.out.println("Description:");
                    System.out.println("\tWAP is a source code static analysis and data mining tool to detect and correct input validation vulnerabilities");
                    System.out.println("\tin web applications written in PHP (version 4.0 or higher) and with a low rate of false positives.");
                    System.out.println("\tVulnerabilities detected: SQL Injection (SQLI), Cross-site scripting (XSS); Remote File Inclusion (RFI),");
                    System.out.println("\tLocal File Inclusion (LFI), Directory Path or Path Traversal (DT/PT), Source Code Disclosure (SCD),");
                    System.out.println("\tOS Command Injection (OSCI) and PHP Injection.");
                    System.out.println("\tWAP performs: 1. taint analysis to detect vulnerabilities; 2. data mining to confirm if the vulnerabilities");
                    System.out.println("\tdetected are real or are false positives; and 3. correction of the real vulnerabilities with insertion of the");
                    System.out.println("\tfixes (small pieces of code) in the source code.");
                    
                    System.out.println(setBoldText + "\nOptions: "+setPlainText);
                    //System.out.println("\nOptions:");
                    
                    System.out.print(setBoldText + "\t-a "+setPlainText);
                    System.out.println("\tdetects vulnerabilities, without corrected them\n");
                    
                    System.out.print(setBoldText + "\t-s "+setPlainText);
                    System.out.println("\tshows only global summary\n");
                    
                    System.out.print(setBoldText + "\t-sqli "+setPlainText);
                    System.out.println("\tdetects SQLI vulnerabilities. If not used with -a, also automatically corrects them\n");
                    
                    System.out.println(setBoldText + "\t--dbms <dbms> "+setPlainText);
                    System.out.println("\t\tspecifies DBMS used by the application. Available DBMS: MySql, DB2, PostgreSQL.");
                    System.out.println("\t\tThis option is only used with " + setBoldText + "-sqli "+setPlainText +"option and by default MySQL is selected.");
                    System.out.println("\t\tOptions used to DBMS: " + setBoldText + "mysql" + setPlainText + ", "
                                                                    + setBoldText + "db2" + setPlainText + ", "
                                                                    + setBoldText + "pg" + setPlainText + "\n");
                    
                    System.out.print(setBoldText + "\t-ci "+setPlainText);
                    System.out.println("\tdetects RFI/LFI/DT/SCD/OS/PHP Injections vulnerabilities. If not used with -a, also automatically corrects them\n");
                    
                    System.out.print(setBoldText + "\t-xss "+setPlainText);
                    System.out.println("\tdetects Reflected and Stored XSS vulnerabilities. If not used with -a, also automatically corrects them\n");

                    System.out.print(setBoldText + "\t-all "+setPlainText);
                    System.out.println("\tdetects all types of vulnerabilities. The same of \"-sqli -ci -xss\". If not used with -a, also automatically corrects them\n");                    
                    
                    System.out.println(setBoldText + "\t-out <arg>"+setPlainText);
                    System.out.println("\t\tforwards the stdout to a file specified in arg\n");
                                        
                    System.out.println(setBoldText + "\t-p <project>"+setPlainText);
                    System.out.println("\t\tspecifies the full project location\n");
                    
                    System.out.println(setBoldText + "\tfile(s)"+setPlainText);
                    System.out.println("\t\tspecifies the full path of the php file or php files\n");
                    
                    System.out.println(setBoldText + "\t-h, -help"+setPlainText);
                    System.out.println("\t\tdisplay this information\n");
                    break;
                }
                else{
                    System.out.println("\nProject Directory or Filename not specified or type of analyse!!!");
                    System.out.println("Please specifies one or more PHP files or a entire project to be parsed.\n");
                    System.out.println("Try `wap -h` or `wap -help` for more information\n");
                    break;
                }
            }
            default:{
                Boolean error = false;
                for (int i = 0; i < args.length; i++) {
                    int indice = -2;
                    if (args[i].equals("-help") == true || args[i].equals("-h") == true)
                        indice = -1;
                    if (args[i].equals("-a") == true)
                        indice = 0;
                    if (args[i].equals("-p") == true)
                        indice = 1;
                    if (args[i].equals("-sqli") == true)
                        indice = 3;
                    if (args[i].equals("-out") == true)
                        indice = 4;
                    if (args[i].equals("-s") == true)
                        indice = 5;
                    if (args[i].equals("-ci") == true)
                        indice = 6;
                    if (args[i].equals("-xss") == true)
                        indice = 7;
                    if (args[i].equals("--dbms") == true)
                        indice = 8;
                    if (args[i].equals("-all") == true)
                        indice = 9;                    

                    // var que permite verificar os parametros de files para analise
                    int j=0;
                    switch (indice){
                        case -1:{ // verificar se esta a passar -help com outras opcoes...nao pode acontecer
                            System.out.println("\t"+args[i]+" ...invalid combination of options");
                            error = true;
                            break;
                        }
                        case 0:{ // verificacao da opcao "-a" - analise sem correcao
                            if (GlobalDataApp.args_flags[0] == 0){
                                GlobalDataApp.args_flags[0] = 1;
                                j=1;
                            }
                            else{
                                System.out.println("\t"+args[i]+" ...duplicated option");
                                error = true;
                            }
                            break;
                        }
                        case 1:{ // verificacao da opcao "-p" - efectuar analise a projecto
                            if (GlobalDataApp.args_flags[1] == 0){
                                GlobalDataApp.args_flags[1] = 1;
                                j=1;

                                // analise de um so projecto
                                if (i+1 < args.length){
                                    input1 = args[i+1];
                                    i++;

                                    ff = new ManageFiles(input1);
                                    if (ff.existDirectory(input1) == true){                                        
                                        type_analyse = "project";
                                        inputs.add(input1);
                                    }
                                    else{
                                        error = true;
                                        break;
                                    }
                                }
                                else{
                                    System.out.println("\t...not specified directory of project after -p");
                                    error = true;
                                    break;
                                }
                            }
                            else{
                                System.out.println("\t"+args[i]+" ...duplicated option");
                                error = true;
                                break;
                            }
                            break;
                        }
                        case 3:{ // verificacao da opcao "-sqli" - efectuar analise SQLI
                            if (GlobalDataApp.args_flags[3] == 0){
                                GlobalDataApp.args_flags[3] = 1;
                                j=1;
                            }
                            else{
                                System.out.println("\t"+args[i]+" ...duplicated option");
                                error = true;
                            }
                            break;
                        }
                        case 4:{ // verificacao da opcao "-out" - colocar stdout num ficheiro
                            if (GlobalDataApp.args_flags[4] == 0){
                                GlobalDataApp.args_flags[4] = 1;
                                j=1;

                                if (i+1 < args.length){
                                    fileOut = args[i+1];
                                    i++;

                                    File fff = new File(fileOut);
                                    String aux = fff.getAbsolutePath().toString();
                                    ff = new ManageFiles(aux);
                                    ManageFiles ff1 = new ManageFiles(ff.getBaseDir().toString());
                                    
                                    if (ff1.existDirectory(null) == false){
                                        System.out.println("\t"+fileOut+"...invalid directory");
                                        error = true;
                                        break;
                                    }
                                }
                                else{
                                    System.out.println("\t...not specified filename to output after -out");
                                    error = true;
                                    break;
                                }
                            }
                            else{
                                System.out.println("\t"+args[i]+" ...duplicated option");
                                error = true;
                                break;
                            }
                            break;
                        }
                        case 5:{ // verificacao da opcao "-s" - just global summary
                            if (GlobalDataApp.args_flags[5] == 0){
                                GlobalDataApp.args_flags[5] = 1;
                                j=1;
                            }
                            else{
                                System.out.println("\t"+args[i]+" ...duplicated option");
                                error = true;
                            }
                            break;
                        }
                        case 6:{ // verificacao da opcao "-ci" - efectuar analise RFI/LFI/DT/SCD/OS/Eval
                            if (GlobalDataApp.args_flags[6] == 0){
                                GlobalDataApp.args_flags[6] = 1;
                                j=1;
                            }
                            else{
                                System.out.println("\t"+args[i]+" ...duplicated option");
                                error = true;
                            }
                            break;
                        }
                        case 7:{ // verificacao da opcao "-xss" - efectuar analise XSS
                            if (GlobalDataApp.args_flags[7] == 0){
                                GlobalDataApp.args_flags[7] = 1;
                                j=1;
                            }
                            else{
                                System.out.println("\t"+args[i]+" ...duplicated option");
                                error = true;
                            }
                            break;
                        }
                        case 8:{ // verificacao da opcao "-dbms" - especificar SGBD
                            if (GlobalDataApp.args_flags[8] == 0){
                                GlobalDataApp.args_flags[8] = 1;
                                j=1;
                                i++;
                                if (args[i].equals("mysql") || args[i].equals("db2") || args[i].equals("pg"))
                                    GlobalDataApp.dbms = args[i];
                                else{
                                    System.out.println("\t"+args[i]+" ...invalid DBMS");
                                    error = true;
                                }
                            }
                            else{
                                System.out.println("\t"+args[i]+" ...duplicated option");
                                error = true;
                            }
                            break;
                        }
                        case 9:{ // verificacao da opcao "-all" - efectuar analise SQLI, XSS, CI
                            if (GlobalDataApp.args_flags[9] == 0){
                                GlobalDataApp.args_flags[9] = 1;
                                
                                if (GlobalDataApp.args_flags[3] == 0)
                                    GlobalDataApp.args_flags[3] = 1;
                                else{
                                    System.out.println("\t -sqli... duplicated option");
                                    error = true;
                                }
                                 
                                if (GlobalDataApp.args_flags[6] == 0)
                                    GlobalDataApp.args_flags[6] = 1;
                                else{
                                    System.out.println("\t -ci... duplicated option");
                                    error = true;
                                }                                
                                
                                if (GlobalDataApp.args_flags[7] == 0)
                                    GlobalDataApp.args_flags[7] = 1;
                                else{
                                    System.out.println("\t -xss... duplicated option");
                                    error = true;
                                }
                                
                                if (error = false)
                                    j=1;
                            }
                            else{
                                System.out.println("\t"+args[i]+" ...duplicated option");
                                error = true;
                            }
                            break;
                        }                        
                        default:{
                            if (j == 0){                              
                                String line=null;                           
                                ff = new ManageFiles(args[i]);
                                if (ff.existFile(args[i]) == true){
                                    filename = ff.getFileName().toString();
                                    if (filename.contains(".") == false)
                                        System.out.println("\t"+args[i]+" ...invalid File");
                                    else{
                                        if (ff.validExtension(filename, 0) == true){
                                            GlobalDataApp.args_flags[2] = 1;
                                            indice = 2;
                                            type_analyse = "files";
                                            inputs.add(args[i]);
                                        }
                                    }
                                }
                            }

                            if (indice == -2){
                                System.out.println("\t"+args[i]+" ...invalid option");
                                error = true;
                            }
                        }
                    }

                    // Se alguma opcao for invalida, sai do cilo for
                    if (error == true)
                        break;
                }
 
                if (error == false){
                    if (inputs.isEmpty() == true){
                        System.out.println("\nPlease specify one or more PHP files or a entire project to be parsed.\n");
                        System.out.println("Try `wap -h` or `wap -help` for more information\n");
                    }
                    else{
                        if (GlobalDataApp.args_flags[1] == 1 && GlobalDataApp.args_flags[2] == 1){
                            System.out.println("\nCannot specify Project Directory and PHP files in same time!!!");
                            System.out.println("Try `wap -h` or `wap -help` for more information\n");
                        }
                        else{
                            if ((GlobalDataApp.args_flags[3] == 0 || GlobalDataApp.args_flags[6] == 1 || GlobalDataApp.args_flags[7] == 1)
                                && GlobalDataApp.args_flags[8] == 1){
                                System.out.println("\nCannot specify DBMS for this type of analysis!!!");
                                System.out.println("Try `wap -h` or `wap -help` for more information\n");
                            }
                            else{
                                int sumFlagsAnalyse=0;
                                for(int i=3; i<GlobalDataApp.args_flags.length; i++)
                                    sumFlagsAnalyse += GlobalDataApp.args_flags[i];

                                if(GlobalDataApp.args_flags[4] == 1)
                                    sumFlagsAnalyse--;

                                if(GlobalDataApp.args_flags[5] == 1)
                                    sumFlagsAnalyse--;

                                if(GlobalDataApp.args_flags[8] == 1)
                                    sumFlagsAnalyse--;

                                if(sumFlagsAnalyse == 0)
                                    System.out.println("\tNot selected any type of analysis\n");
                                else{
                                    // Initialize the classsifiers to data mining
                                    GlobalDataApp.cf_lr = GlobalDataApp.loadClassifier("lr");
                                    GlobalDataApp.cf_rt = GlobalDataApp.loadClassifier("rt");
                                    GlobalDataApp.cf_svm = GlobalDataApp.loadClassifier("svm");
                                    GlobalDataApp.cf_jrip = GlobalDataApp.loadClassifier("jrip");
                                    
                                    // The analysis begin
                                    a = new wapAnalysis(inputs, type_analyse, fileOut);
                                }
                            }
                        }
                    }
                }
            }
        }            
    }
}
