/*
 * This class will represent method or user defined function category.
 */

package org.homeunix.wap.table.symbol;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iberia Medeiros
 */
public class ClassSymbol implements Cloneable{
    String className;
    String fileClass;
    String extendsNameClass;
    String fileExtendsClass;
    SymbolTable attributes;
    MethodTable membersMethods;
    
    
    // ****** CONSTRUCTORS ***********
     public ClassSymbol(String class_name, String file, String extendsClass) {
        this.className = class_name;
        this.fileClass = file;
        this.extendsNameClass = extendsClass;
        //this.attributes = new ArrayList<CallSymbol>();
        //this.membersMethods = new ArrayList<MethodSymbol>();
    }
    
    
    // *** METHODS ********
    public String getClassName() {
        return this.className;
    }

    public String getExtendsClassName() {
        return this.extendsNameClass;
    }

    public String getFileClass() {
        return this.fileClass;
    }

    public String getFileExtendsClass() {
        return this.fileExtendsClass;
    }
    
    public SymbolTable getAttributes() {
        return this.attributes;
    }
       
    public MethodTable getMembersMethods() {
        return this.membersMethods;
    }

    public MethodClass getMethodClass(String methName, String methType, Map mct) {
        MethodSymbol mss_final = null;
        ClassSymbol cs = null;
        MethodClass mc = null;
        int i;
        String f = "";
        Iterator <MethodSymbol> it = this.getMembersMethods().getMembers().iterator();
        MethodSymbol ms = null;
        Boolean contConstruct = false;
        Boolean cont_methName = false;
        for (;it.hasNext();){
            ms = it.next();
            if (ms.getFunctionName().equals(methName) == true){
                f = methName;
                cont_methName = true;
                break;
            }
            if (methType.equals("construct") == true && ms.getFunctionName().equals("__construct") == true){
                f = "__construct";
                contConstruct = true;
                break;
            }
        }

        if (cont_methName == true || contConstruct == true){
            mss_final = ms;
            cs = this;
        }
        else{
            String ff = this.fileExtendsClass;
            String fff = this.extendsNameClass;
            try{
                ClassTable ct = (ClassTable) mct.get(ff);
                cs = ct.getClassOfListClasses(fff);
                mc = cs.getMethodClass(methName, methType, mct);
            } catch (Exception e){}
        }

        if (mss_final != null)
            mc = new MethodClass(mss_final, cs);
        return mc;
    }



    /*
    public void setFunctionName(String name) {
        this.setName(name);
    }    
    
    public void setHaveSubFunctions() {
        this.haveSubFunctions = true;
    }
    
    public void setProgenitorFunction(String p) {
        this.Progenitorfunction = p;
    }

     *
     */

    public void setClassName(String n) {
        this.className = n;
        this.attributes = new SymbolTable(n);
        this.membersMethods = new MethodTable(n);
    }

    public void setExtendedNameClass(String n, String filename, Map mct) {
        this.extendsNameClass = n;
        ClassTable ct = (ClassTable) mct.get(filename);
        if (ct.containsClass(n) == true)
            this.fileExtendsClass = filename;
        else{
            for (Object key : mct.keySet()){
                //String k = (String) key;
                ct = (ClassTable) mct.get(key);
                if (ct.containsClass(n) == true){
                    this.fileExtendsClass = (String) key;
                    break;
                }
            }
        }
    }

/*
    public void setAttribut(CallSymbol attribute) {
        attributes.define(attribute, attribute, false);
        //attributes.add(attribute);
    }
    
    public void setMemberMethod(MethodSymbol mth) {
        membersMethods.add(mth);

    }
*/

    public SymbolTable copyListAttributes(SymbolTable st_toCopy) {
        SymbolTable att = new SymbolTable(null);
        SymbolTable st_ori;
        //List <CallSymbol> att = new ArrayList<CallSymbol>();
        Symbol sym;

        if (st_toCopy == null)
            st_ori = this.getAttributes();
        else
            st_ori = st_toCopy;

        //copia a lista de atributos da classe
        Scope scp, scpRoot=null;
        CallSymbol curScope;
        for(Iterator <Symbol> it = st_ori.getMembers().iterator(); it.hasNext();){
            scp = (Scope) it.next();
            sym = scp.getScopeSymbol();
            curScope = new CallSymbol (sym.getName(), sym.getCodeLine(), null, sym.getTainted(), sym.getFileSymbol());
            curScope.setRootScope(curScope);
            curScope.setScope(curScope);
            curScope.setIsVariableSymbol(false);
            copyScope(scp, curScope);
            att.define(curScope, curScope, false);
            //att.add(curScope);
         }
/*
         System.out.println("\n\n\t\tPRINT COPY\n");
         for(Iterator <Symbol> it = mt.getMembers().iterator(); it.hasNext();){
            scp = (Scope) it.next();
            scp.print(scp);
         }
 *
 */

        return att;
    }

    private void copyScope(Scope cs, Scope csClone){
        Symbol aux1, aux2;
        Scope s, s1 = null;
        CallSymbol curScope1;
        if (!cs.getMembers().isEmpty()){
            for(Iterator <Symbol> it = cs.getMembers().iterator(); it.hasNext();){
                aux1 = it.next();
                if ( aux1.getRootScope() != null ) { // is a root of a new scope?
                        s = aux1.getRootScope();
                        try {
                            s1 = (Scope) cs.getScopeSymbol().clone();
                        } catch (CloneNotSupportedException ex) {
                            Logger.getLogger(MethodSymbol.class.getName()).log(Level.SEVERE, null, ex);
                        }                        
                        curScope1 = new CallSymbol (aux1.getName(), aux1.getCodeLine(), s1, aux1.getTainted(), aux1.getFileSymbol());
                        curScope1.getScopeSymbol().setIsFunction(aux1.getIsFunction());
                        curScope1.getScopeSymbol().setIsSecureFunction(aux1.getIsSecureFunction());
                        curScope1.getScopeSymbol().setIsTaintedFunction(aux1.getIsTaintedFunction());
                        csClone.define(curScope1, curScope1, false);
                        copyScope(s, curScope1);
                }
                else{
                    VariableSymbol vs = new VariableSymbol(aux1.getName(), aux1.getTainted(), aux1.getCodeLine(), aux1.getFileSymbol());
                    csClone.define(vs, null, true);
                }
                    
            }
        }       
    }

}
