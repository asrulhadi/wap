/*
 * classe que faz a gestao de files, como paths
 */

package org.homeunix.wap.utils;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Iberia Medeiros
 */
public class ManageFiles{
    private File f;

    // *** CONSTRUCTORS
    public ManageFiles (String filename){
        //super(filename);
        f = new File(filename);
    }


    // *** METHODS
    /*
     * give base directory of te file
     */
    public File getBaseDir(){
        File baseDir = new File(f.getParent());
        return baseDir;
    }
    
    /*
     * Give just the name of the file
     */
    public File getFileName(){
        File f1 = new File (f.getName());
        return f1;
    }

     /*
     * Give all name of the file (path and name)
     */
    public File getAllFile(){
        File f1 = new File(this.getBaseDir().toString(),this.getFileName().toString());
        return f1;
    }

    /*
     * Verify if file exist
     */
    public Boolean existFile(String filename){
        if (f.exists())
            return true;
        else{
            //String s = "File or directory not found... " + filename;
            //System.out.println(s);
            return false;
        }
    }

    /*
     * Verify if directory exist
     */
    public Boolean existDirectory(String filename){
        if (f.isDirectory() && f.exists())
            return true;
        else{
            //String s = "File or directory not found... " + filename;
            //System.out.println(s);
            return false;
        }
    }
    
    /*
     * Verify if extension of file is php, Php or PHP
     */
    public Boolean validExtension(String filename, int IsSearchFile){
        // .inc include file
        // faltam: .tpl template; .cgi script Perl/C
        String Extensions[] = {".php", ".phps", ".php3", ".php4", ".php5", ".phtml", ".inc", ".phpsec"};
        List<String> ValidExtensionsPhp = Arrays.asList(Extensions);

        int dotPos = filename.lastIndexOf(".");
        if(dotPos == -1)
                return false;
        else{
            String extensionFile = (filename.substring(dotPos)).toLowerCase();
            //if (extension.equals(".php") == false && extension.equals(".PHP") == false && extension.equals(".Php") == false){
            //if (extension.equalsIgnoreCase(".php") == false){
            if (ValidExtensionsPhp.contains(extensionFile) == false){
                if (IsSearchFile == 0){
                    String s = "Type of file not permited... \n" + extensionFile;
                    System.out.println(s);
                }
                return false;
            }
            else
                return true;
        }

    }

    /*
     * Search php files in directory specified by user.
     * This method is recursive
     */
    public void searchPhpFiles(List lista){
        File l[] = this.getAllFile().listFiles();
            for(int i=0; i<l.length; i++){
                if (l[i].isFile() == true){
                    ManageFiles aux = new ManageFiles(l[i].toString());
                    if (aux.validExtension(l[i].toString(), 1) == true){
                        lista.add(l[i].toString());
                    }
                }
                if (l[i].isDirectory() == true){
                    ManageFiles aux = new ManageFiles(l[i].toString());
                    aux.searchPhpFiles(lista);
                }

            }
    }

    /*
     * Search the index.php file in list of files of the project directory
     */
    public void searchIndexPhp(List<String> lista){    
        for(int i=0; i<lista.size(); i++){
            String au = lista.get(i).toString();
            String[] a;
            if (GlobalDataApp.isWindows.booleanValue() == true)
                a = au.split(Pattern.quote(File.separator));
            else
                a = au.split(File.separator);
            String[] b = (a[(a.length)-1].toUpperCase()).split(".PHP");                      
            if(b[0].equalsIgnoreCase("INDEX") == true){
                String aux = lista.get(0).toString();
                lista.set(0, lista.get(i).toString());
                lista.set(i, aux);
                break;
            }
        }
    }

    public String composePathFile(String s, File baseDir) throws IOException{
        String final_file = "";

        if (s.startsWith("\"") || s.startsWith("\'"))
            s = s.substring(1, s.length()-1);
        
        File ff = new File(s);
        File base;
        if (ff.exists() == false){ // Se a path do file nao e' passada toda no include 
            String a[];
            if (GlobalDataApp.isWindows.booleanValue() == true)
                a = s.split(Pattern.quote(File.separator));
            else
                a = s.split(File.separator);
            base = new File(baseDir.toString());
            File b[] = base.listFiles();

            if (a.length == 0){ // se passou somente path sem file no include
                String ss = "File not specified in \"include\" instruction";
                System.out.println(ss);
            }
            else {
                int cont = 0;
                for (String aux : a){
                    if (aux.equals("..") == true)
                        cont++;
                }
                if (cont == 0){
                    if (a[0].equals(".") == true){ // se passou o file relativo a base.dir
                        String aux = s.substring(2);
                        final_file = base.toString() + File.separator + aux;
                    }
                    else // se passou no include uma path de subdirs de base.dir
                        final_file = base.toString() + File.separator + s;
                }
                else{ // se passou no include uma path de subdirs atras de base.dir
                    String[] c;
                    if (GlobalDataApp.isWindows.booleanValue() == true)
                        c = base.toString().split(Pattern.quote(File.separator));
                    else
                        c = base.toString().split(File.separator);
                    
                    //String c[] = base.toString().split(File.separator);
                    String d = File.separator;
                    int i;
                    for (i=0; i < c.length - cont; i++)
                        d = d + c[i] + File.separator;

                    for (i = cont; i < a.length - 1; i++)
                        d = d + a[i] + File.separator;

                    final_file = d + a[a.length-1];
                } // if (cont == 0){
            } // if (a.length == 0)
        }
        else {// if (ff.exists())
            final_file = s;
        }
        
        if (final_file.isEmpty() == false){
            //System.out.println("File not found...");
        //else{
            ff = new File(final_file);
            if (ff.exists() == false){
                //System.out.println("File not found..." + final_file);
                final_file = "";
            }
        }
        
        return final_file;
    }

    public int getNumberLinesFile() throws FileNotFoundException{
        String line = "";
        int count = 0;
        Scanner fscanner = new Scanner(new FileReader(this.f.toString()));
        while (fscanner.hasNextLine()) {
            line = fscanner.nextLine();
            count += 1;
        }
        fscanner.close();
        return count;
    }

   public String getLineOfCode(int line){
       String codeLine = "";
       Scanner fscanner = null;
       try {
            fscanner = new Scanner(new FileReader(this.f.toString()));


       for (int jj=1; jj<=line;jj++){
            codeLine = fscanner.nextLine();
       }
       
       String aux = codeLine;
       codeLine = "";
       while (aux.lastIndexOf(';') == -1){
            if (codeLine.isEmpty() == true)
                codeLine += aux.trim();
            else
                codeLine += " " + aux.trim();
            aux = fscanner.nextLine();
       }

       if (codeLine.isEmpty())
           codeLine = aux;
       else
           codeLine += " " + aux.trim();

       fscanner.close();
       } catch (Exception e){}       

       return codeLine;
   }

    /*
     * clean html code from a given file
     */
    public String cleanHTML(String f) throws FileNotFoundException, IOException{
        String[] filename;
        if (GlobalDataApp.isWindows.booleanValue() == true)
            filename = f.split(Pattern.quote(File.separator));
        else
            filename = f.split(File.separator);        
        
        //String[] filename = f.split(File.separator);
        String[] filename_parts = filename[filename.length-1].split("[.]");

        InputStream in = new FileInputStream(f);
        Scanner fscanner = new Scanner(in);
        String temp_file = this.getBaseDir().toString() + File.separator + filename_parts[0] + "_000." +filename_parts[1];
        File out = new File(temp_file);
        FileWriter outFile = new FileWriter(out);

        String aux[], auxx = null;
        Boolean firstOpen_bodyString = false;
        Boolean close_bodyString = false;
        Boolean more_bodyString = false;
        int lineLastClose = 0;
        
        Pattern open = Pattern.compile("<[?]"+"php");
        Pattern open1 = Pattern.compile("<[?]");
        Pattern close = Pattern.compile("[?]>");
        Matcher matcher_open;
        Matcher matcher_open1;
        Matcher matcher_close;

        String s = null, s1 = null, codeLine;
        int countLines = 0, blankLines = 0;
        
        for (; fscanner.hasNextLine();) {
            codeLine = fscanner.nextLine();
            countLines++;            
            matcher_open = open.matcher(codeLine);
            matcher_open1 = open1.matcher(codeLine);
            matcher_close = close.matcher(codeLine);

            if ((matcher_open.find() || matcher_open1.find()) && !matcher_close.find()){              
                if (firstOpen_bodyString == false){
                    firstOpen_bodyString=true;
                    close_bodyString = false;
                    outFile.write(codeLine+"\n");
                }
                else{
                    more_bodyString = true;
                    close_bodyString = false;
                    if (matcher_open.find())
                        aux = open.split(codeLine);
                    else
                        aux = open1.split(codeLine);

                    if (aux.length <= 1)
                        outFile.write("\n");
                    else{
                        if (aux[1].startsWith("php")){
                            aux = aux[1].split("php");
                            try{
                                outFile.write(aux[1] + "\n");
                            }catch (Exception e) {
                                outFile.write("\n");
                            }
                        }
                        else{
                            if (aux[1].startsWith(" ")){
                                try{
                                    outFile.write(aux[1] + "\n");
                                }catch (Exception e) {
                                    outFile.write("\n");
                                }                                
                            }
                        }
                    }
                }
            }
            else{             
                if (matcher_open.find() || matcher_open1.find()) {
                    lineLastClose = countLines;
                    if (matcher_open.find())
                        aux = open.split(codeLine);
                    else
                        aux = open1.split(codeLine);
                    
                    if (aux[1].startsWith("php "))
                        auxx = aux[1].substring(3);
                    else
                        auxx = aux[1];

                    aux = close.split(auxx);
                    if (!aux[0].endsWith(";"))
                        aux[0] = aux[0] + ";";                  
                    
                    if (firstOpen_bodyString == false){
                           // s = "<?php " + aux[0] + " ?>" + "\n";
                            s = "<?php " + aux[0];
                            outFile.write(s + "\n");
                            firstOpen_bodyString = true;
                            close_bodyString = true;
                    }
                    else{
                        more_bodyString = false;
                        close_bodyString = true;
                        outFile.write(aux[0] + "\n");
                    }
                }
                else{
                    if(matcher_close.find()){
                        lineLastClose = countLines;
                        //if (more_bodyString == true)
                            more_bodyString = false;
                        //else
                            close_bodyString = true;

                        aux = close.split(codeLine);
                        try{
                            outFile.write(aux[0] + "\n");
                        } catch (Exception e) {
                            outFile.write("\n");
                        }

                    }
                    else{
                        if ((more_bodyString == true || close_bodyString == false) && firstOpen_bodyString == true)
                            outFile.write(codeLine+"\n");
                        else{
                            outFile.write("\n");
                            blankLines++;
                        }
                    }
                }
            }
        }


        fscanner.close();
        outFile.close();

        // Para escrever a tag end_php na linha que aparece por ultimo
        in = new FileInputStream(temp_file);
        fscanner = new Scanner(in);
        String final_file = this.getBaseDir().toString() + File.separator + filename_parts[0] + "_0." +filename_parts[1];
        out = new File(final_file);
        outFile = new FileWriter(out);         
        countLines = 0;
        for (; fscanner.hasNextLine();) {
            codeLine = fscanner.nextLine();
            countLines++;
            if (countLines == lineLastClose)
                outFile.write(codeLine + "?>\n");
            else
                outFile.write(codeLine + "\n");
        }        
        fscanner.close();
        outFile.close();
        File t = new File(temp_file);
        t.delete();
          
        
        if (countLines == blankLines){
            out = new File(final_file);
            outFile = new FileWriter(out);
            outFile.write("<?php\n");
            outFile.write("?>\n");
            outFile.close();
        }
        return final_file;
    }   
   
    
    /*
     * Replace reserved words in variable names to keyword_00
     */
    public String keywordTo00(String ori, String html_clear) throws FileNotFoundException, IOException{
        String final_file = ori;

        // KeyWords
        String ReservedWords[] = {"case", "if", "array", "list", "else", "elseif", "for", "foreach", "while", "do",
                                  "switch", "default", "function", "global", "and", "or", "xor", "instanceof", "return", //};
                                  "print", "public"};
        List<String> KeyWords = Arrays.asList(ReservedWords);

        InputStream in = new FileInputStream(html_clear);
        Scanner fscanner = new Scanner(in);

        ArrayList<String> al = new ArrayList<String>();
        while( fscanner.hasNext() ) {
            String all = fscanner.nextLine();
            al.add(all);
        }
        fscanner.close();

        File out = new File(final_file);
        FileWriter outFile = new FileWriter(out);

        Pattern p = Pattern.compile("[a-zA-Z_0-9]");
        Matcher mat;
        boolean b;
        String linef;
        int nline;

        for (String aux : KeyWords){
            nline = 0;
            for( String line : al ) {
                linef = "";
                if (line.contains(aux) == true){
                    int indOf=0;
                    while (indOf != -1){
                        indOf = line.indexOf(aux);
                        if (indOf != -1){
                            if (indOf != 0){
                                String[] a = line.split(aux);
                                if (line.charAt(indOf-1) == '$'){
                                    try{
                                    char c = line.charAt(indOf + aux.length());
                                    mat = p.matcher(Character.toString(c));
                                    if (mat.matches() == false){
                                        linef = linef + a[0] + aux + "_00";
                                    }
                                    else
                                        linef = linef + a[0] + aux;
                                    } catch (Exception e){}
                                    line = line.substring(indOf + aux.length());
                                }
                                else{
                                    line = line.substring(indOf + aux.length());
                                    linef = linef + a[0] + aux;
                                }
                            }
                            else{
                                linef += aux;
                                line = line.substring(aux.length());
                            }

                        }
                        else
                            linef += line;
                    }
                    al.set(nline, linef);
                }
                nline++;
            }
        }

        for( String line : al ) {
            outFile.write(line+"\n");
        }
        outFile.close();

        return final_file;
    }

    /*
     * Process inverse of keywordTo00, ie, Replace keyword_00 to keyword
     */
    public void keywordFrom00(String html_clear) throws FileNotFoundException, IOException{
        // KeyWords_00
        String ReservedWords[] = {"case_00", "if_00", "array_00", "list_00", "else_00", "elseif_00", "for_00", "foreach_00",
                                  "while_00", "do_00", "switch_00", "default_00", "function_00", "global_00", "and_00",
                                  "or_00", "xor_00", "instanceof_00", "return_00", "print_00", "public_00"};
        List<String> KeyWords = Arrays.asList(ReservedWords);

        InputStream in = new FileInputStream(html_clear);
        Scanner fscanner = new Scanner(in);

        ArrayList<String> al = new ArrayList<String>();
        while( fscanner.hasNext() ) {
            String all = fscanner.nextLine();
            al.add(all);
        }
        fscanner.close();

        File out = new File(html_clear + "_tmp");
        FileWriter outFile = new FileWriter(out);

        Pattern p = Pattern.compile("[a-zA-Z_0-9]");
        Matcher mat;
        boolean b;
        String linef;
        int nline;

        for (String aux : KeyWords){
            nline = 0;
            for( String line : al ) {
                linef = "";
                if (line.contains(aux) == true){
                    int indOf=0;
                    while (indOf != -1){
                        indOf = line.indexOf(aux);
                        if (indOf != -1){
                            if (indOf != 0){
                                String[] a = line.split(aux);
                                if (line.charAt(indOf-1) == '$'){
                                    char c = line.charAt(indOf + aux.length());
                                    mat = p.matcher(Character.toString(c));
                                    if (mat.matches() == false){
                                        linef = linef + a[0] + aux.substring(0, aux.length()-4);
                                    }
                                    else
                                        linef = linef + a[0] + aux;
                                    line = line.substring(indOf + aux.length());
                                }
                                else{
                                    line = line.substring(indOf + aux.length());
                                    linef = linef + a[0] + aux;
                                }
                            }
                        }
                        else
                            linef += line;
                    }
                    al.set(nline, linef);
                }
                nline++;
            }
        }

        for( String line : al ) {
            outFile.write(line+"\n");
        }
        outFile.close();

        //Renomear file html_clear_tmp to html_clear
        File bb = new File(html_clear);
        out.renameTo(bb);
    }

    /*
     * replace the html code removed on begin of the process
     */
    public void putHtml(String ori, String html_clear) throws FileNotFoundException, IOException{
        InputStream in_ori = new FileInputStream(ori);
        Scanner fscanner_ori = new Scanner(in_ori);
        InputStream in_html = new FileInputStream(html_clear);
        Scanner fscanner_html = new Scanner(in_html);
        File out = new File(html_clear + "_tmp");
        FileWriter outFile = new FileWriter(out);

        int nline_html = 1;
        int nline_ori = 1;
        String line;
        while( fscanner_html.hasNext() ) {
            line = fscanner_html.nextLine();
            if (line.isEmpty() == false){
                outFile.write(line+"\n");
            }
            else{
                for(int i = nline_ori; i<nline_html; i++)
                    fscanner_ori.nextLine();
                line = fscanner_ori.nextLine();
                outFile.write(line+"\n");
                nline_ori = nline_html+1;
            }
            nline_html++;
        }

        while( fscanner_ori.hasNext() ) {
            line = fscanner_ori.nextLine();
            outFile.write(line+"\n");
        }
        fscanner_ori.close();
        fscanner_html.close();
        outFile.close();

        //Renomear file html_clear_tmp to html_clear
        File bb = new File(html_clear);
        out.renameTo(bb);

    }
    
    // copia file php em analise para Newfiles para podermos introduzir as correcoes no codigo
    public void copyFileToNewfiles(String targetDir, String targetName) throws FileNotFoundException, IOException{ 
        InputStream source = new FileInputStream(this.getAllFile().toString());
        Scanner fscanner_source = new Scanner(source);
        File out = null;
        if (targetName == null){
            try{
                int ind = this.getAllFile().toString().lastIndexOf(File.separator);
                String s = this.getAllFile().toString().substring(0, ind);
                File dir = new File(targetDir + s);
                dir.mkdirs();   
                out = new File(targetDir + this.getAllFile().toString());
            } catch (Exception e) {}
        }
        else{
            try{
                int ind = targetName.lastIndexOf(File.separator);
                String s = targetName.substring(0, ind);
                File dir = new File(targetDir + s);
                dir.mkdirs();   
                out = new File(targetDir + targetName);
            } catch (Exception e) {}
        }
            
        FileWriter outFile = new FileWriter(out);
        String line;
        while( fscanner_source.hasNext() ) {
            line = fscanner_source.nextLine();
            outFile.write(line+"\n");
        }
        fscanner_source.close();
        outFile.close();
    }
    
    // copia file php de improvements para Newfiles. Sao os files de codigo php para sanitizar inputs
    public void copyFileImprovement(String targetDir) throws FileNotFoundException, IOException{ 
        File dest = new File(targetDir);
        dest.mkdirs();
        File src = new File(this.getAllFile().toString());

        // Copy files
        String[] l = src.list();
        for(int i=0; i < l.length; i++){
            InputStream source = new FileInputStream(src + File.separator + l[i]);
            Scanner fscanner_source = new Scanner(source);

            //File out = new File(src + File.separator + l[i] + "_temp");
            File out = new File(dest + File.separator + l[i]);
            FileWriter outFile = new FileWriter(out);
            String line;
            while( fscanner_source.hasNext() ) {
                line = fscanner_source.nextLine();
                outFile.write(line+"\n");
            }
            fscanner_source.close();
            outFile.close();
        }
    }
    
    // Delete a no empty directory
    public Boolean deleteDir(File directory) {
        if (directory.isDirectory()) {
            String[] subDirs = directory.list();
            for (int i=0; i<subDirs.length; i++) {
                boolean success = deleteDir(new File(directory, subDirs[i]));
                if (!success) {
                    return false;
                }
            }
        }

        // The directory is now empty so delete it
        return directory.delete();
    } 
}
