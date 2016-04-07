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
public class MethodSymbol extends ScopedSymbol implements Cloneable{
    Boolean haveSubFunctions;
    String Progenitorfunction = "";
    Map <String, ArgFunctionSymbol> argsFunction;
    Map<String, Symbol> globalVars;
    List<Symbol> symbols;
    
    
    // ****** CONSTRUCTORS ***********
     public MethodSymbol(String function_name, int line, int tainted, Scope parent, String filename) {
        //this.functionName = fname;
        super (function_name, line, tainted, parent, filename);
	haveSubFunctions = false;
        argsFunction = new HashMap <String, ArgFunctionSymbol>();
        globalVars = new HashMap<String, Symbol>();
        //staticVars = new HashMap<String, Object>();
        symbols = new ArrayList<Symbol>(); //instructions of the function, except global instruction
    }
    
    
    // *** METHODS ********
    public String getFunctionName() {
        return this.getName();
    }

    public Boolean getHaveSubFunctions() {
        return haveSubFunctions;
    }
    
    public String getProgenitorFunction() {
        return this.Progenitorfunction;
    }
    
    public Map getArgsFunction() {
        return argsFunction;
    }
    
   
    public Map getGlobalVarsOfFunction() {
        return globalVars;
    }
    
    
    public void setFunctionName(String name) {
        this.setName(name);
    }    
    
    public void setHaveSubFunctions() {
        this.haveSubFunctions = true;
    }
    
    public void setProgenitorFunction(String p) {
        this.Progenitorfunction = p;
    }
    
    public void setArgFunction(String argName, ArgFunctionSymbol arg) {
        argsFunction.put(argName, arg);
    }
    
    public void setGlobalVarFunction(String varName, Symbol gvar) {
        globalVars.put(varName, gvar);

    }

    public MethodSymbol copyMethodSymbol(MethodSymbol meth_sym, String function_name, int line, Scope parent, String filename) {
        MethodSymbol mt = new MethodSymbol(function_name, line, 0, parent, filename);
        Symbol sym;

        //copia o map de argumentos da funcao
        ArgFunctionSymbol arg;
        for(Iterator <ArgFunctionSymbol> it = meth_sym.getArgsFunction().values().iterator(); it.hasNext();){
            arg = it.next();
            try {
                mt.argsFunction.put(arg.getParamName(), (ArgFunctionSymbol) arg.clone());
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(MethodSymbol.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          
        //copia o map das vars globais da funcao
        for(Iterator <Symbol> it = meth_sym.getGlobalVarsOfFunction().values().iterator(); it.hasNext();){
            sym = it.next();
                try {
                    mt.getGlobalVarsOfFunction().put(sym.getName(), (Symbol) sym.clone());
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(MethodSymbol.class.getName()).log(Level.SEVERE, null, ex);
                }
	 }
 
                
        //copia a lista de instrucoes da funcao
        Scope scp, scpRoot=null;
        CallSymbol curScope;
        Symbol sy;
        for(Iterator <Symbol> it = meth_sym.getMembers().iterator(); it.hasNext();){
            sy = it.next();
            if (sy.getIsVariableSymbol() == false){
                scp = (Scope) sy; 
                sym = scp.getScopeSymbol();
                curScope = new CallSymbol (sym.getName(), sym.getCodeLine(), null, sym.getTainted(), sym.getFileSymbol());
                curScope.setRootScope(curScope);
                curScope.setScope(curScope);
                curScope.setIsVariableSymbol(false);
                curScope.getScopeSymbol().setIsInstance(sym.getIsInstance());
                curScope.getScopeSymbol().setIsClone(sym.getIsClone());
                curScope.getScopeSymbol().setIsStaticMember(sym.getIsStaticMember());
                curScope.getScopeSymbol().setIsClassInstruction(sym.getIsClassInstruction());
                
                curScope.getScopeSymbol().setIsFunction(sym.getIsFunction());
                curScope.getScopeSymbol().setIsSecureFunction(sym.getIsSecureFunction());
                curScope.getScopeSymbol().setIsTaintedFunction(sym.getIsTaintedFunction());
                curScope.getScopeSymbol().setAlfanumeric(sym.getAlfanumeric());
                curScope.getScopeSymbol().setIsUserFunction(sym.getIsUserFunction());
                curScope.getScopeSymbol().setIsClassMethod(sym.getIsClassMethod());                
                
                copyScope(scp, curScope);
                mt.getMembers().add(curScope);
            }
         }
        
        return mt;
    }

    public void copyScope(Scope cs, Scope csClone){
        Symbol aux1, aux2;
        Scope s, s1 = null;
        CallSymbol curScope1;
        if (!cs.getMembers().isEmpty()){
            for(Iterator <Symbol> it = cs.getMembers().iterator(); it.hasNext();){
                aux1 = it.next();
                if ( aux1.getRootScope() != null ) { // is a root of a new scope?
                        s = aux1.getRootScope();
                        //aux2 = s.getScopeSymbol();
                        try {
                            s1 = (Scope) cs.getScopeSymbol().clone();
                        } catch (CloneNotSupportedException ex) {
                            Logger.getLogger(MethodSymbol.class.getName()).log(Level.SEVERE, null, ex);
                        }                        
                        curScope1 = new CallSymbol (aux1.getName(), aux1.getCodeLine(), s1, aux1.getTainted(), aux1.getFileSymbol());
                        curScope1.getScopeSymbol().setIsFunction(aux1.getIsFunction());
                        curScope1.getScopeSymbol().setIsSecureFunction(aux1.getIsSecureFunction());
                        curScope1.getScopeSymbol().setIsTaintedFunction(aux1.getIsTaintedFunction());
                        curScope1.getScopeSymbol().setAlfanumeric(aux1.getAlfanumeric());
                        curScope1.getScopeSymbol().setIsUserFunction(aux1.getIsUserFunction());
                        curScope1.getScopeSymbol().setIsInstance(aux1.getIsInstance());
                        curScope1.getScopeSymbol().setIsClone(aux1.getIsClone());
                        curScope1.getScopeSymbol().setIsStaticMember(aux1.getIsStaticMember());
                        curScope1.getScopeSymbol().setIsClassInstruction(aux1.getIsClassInstruction());
                        curScope1.getScopeSymbol().setIsClassMethod(aux1.getIsClassMethod());

                        csClone.define(curScope1, curScope1, false);
                        copyScope(s, curScope1);
                }
                else{
                    VariableSymbol vs = new VariableSymbol(aux1.getName(), aux1.getTainted(), aux1.getCodeLine(), aux1.getAlfanumeric(), aux1.getFileSymbol());
                    csClone.define(vs, null, true);

                }
                    
            }
        }       
    }


    public void cleanAll(){
            haveSubFunctions = false;
            Progenitorfunction = "";

            Collection <ArgFunctionSymbol> c = argsFunction.values();
            c.removeAll(c);
            argsFunction.clear();

            Collection <Symbol> c1 = globalVars.values();
            c1.removeAll(c1);
            globalVars.clear();

            Collection <Symbol> c2 = symbols;
            c2.removeAll(c2);
            symbols.clear();
    }
    
    // give the members (instructions) of the function
    public List<Symbol> getMembers() {
        return symbols;
    }

    public void printMethodSymbol() {
        System.out.println("FUNCTION: "+this.getFunctionName()+"\tTAINTED: "+this.getTainted());
        System.out.println("\tHave SubFunctions: "+ this.getHaveSubFunctions());
        System.out.println("\tFunction Progenitor: "+ this.getProgenitorFunction());
        
        System.out.println("\tPARAMETERS");
        Iterator <ArgFunctionSymbol> it;
        ArgFunctionSymbol afs;
        for(it = this.getArgsFunction().values().iterator(); it.hasNext();){
            afs = it.next();
            System.out.println("\t\tName: "+afs.getParamName()+"\tType: "+afs.getType()+"\tPosition: "+afs.getPositionParam()+
                                "\tTainted: "+afs.getTaintedValueCallFunctionArg()+"\tArgCallFunction: "+afs.getCallFunctionArg());
        }
        
        System.out.println("\tGLOBALS");
        Iterator <Symbol> it1;
        Symbol sym;
        for(it1 = this.getGlobalVarsOfFunction().values().iterator(); it1.hasNext();){
            sym = it1.next();
            System.out.println("\t\tName: "+sym.getName()+"\tTainted: "+sym.getTainted());
        }
        
        System.out.println("\tINSTRUCTIONS");
        Scope sc;
        for(it1 = this.getMembers().iterator(); it1.hasNext();){
            sc = (Scope) it1.next();
            System.out.println("ScopeName: "+sc.getScopeName()+"\tTainted: "+sc.getScopeSymbol().getTainted()
                                +"\tRootScope: "+sc.getScopeSymbol().getRootScope().getScopeName()
                                +"\tTaintedRootScope: "+sc.getScopeSymbol().getRootScope().getScopeSymbol().getTainted());
            sc.print(sc);
        }        
    }    
    
    public void print(Scope scp) {

    }

}
