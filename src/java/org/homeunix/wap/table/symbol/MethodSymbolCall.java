/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.table.symbol;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author iberiam
 */
public class MethodSymbolCall {
    String functionNameCall;
    int lineCall;
    String fileOfMethod;
    List<Symbol> symbols;
    InstanceTable objectsOfMethod; //objs criados na chamada de um metodo
    Map <String, Symbol> aliases;
    //SymbolTable tabsymb;
    
    /* CONSTRUCTOR */
    public MethodSymbolCall(String func, int line, Boolean meth, String file) {
        this.functionNameCall = func;
        this.lineCall = line;
        this.fileOfMethod = file;
        this.symbols = new ArrayList<Symbol>();
        if (meth == true)
            this.objectsOfMethod = new InstanceTable(func);
        this.aliases = new LinkedHashMap<String, Symbol>();
        //this.tabsymb = new SymbolTable(func); //entra o nome da funcao, em vez do nome do ficheiro
    }

    
    /* METHODS*/
    public String getFunctionNameCall(){
        return this.functionNameCall;
    }
    
    public int getLineNumberCall(){
        return this.lineCall;
    }
    
    public String getFileOfMethod(){
        return this.fileOfMethod;
    }    
    
    public List getCallFunctionSymbols(){
        //return this.tabsymb;
        return this.symbols;
    }

    public InstanceTable getObjectsOfMethod(){
        return this.objectsOfMethod;
    }

    public Map getAliases(){
        return this.aliases;
    }

    public String getInstanceNameFromAliases(String s, InstanceTable instTab){
        String instName = "";
        boolean found = false;
        while (found == false){
            if (instTab.containsInstance(s) == true){
                instName = s;
                found = true;
            }
            else{
                if (this.getAliases().containsKey(s)){
                    Symbol sym = (Symbol) this.getAliases().get(s);
                    s = sym.getName();
                }
            }
        }
        return instName;
    }
}
