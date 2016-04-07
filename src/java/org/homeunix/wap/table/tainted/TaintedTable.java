/*
 * single-scope mts
 * Main Map that will store taint variables
 */

package org.homeunix.wap.table.tainted;

import org.homeunix.wap.table.symbol.Symbol;
import org.homeunix.wap.table.symbol.MethodSymbol;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iberia Medeiros
 */
public class TaintedTable implements ScopeTainted{
    String nameFile;
    String functionNameCall = "";
    Map<String, RootTaintedSymbol> symbolsRootTainted;

    
    /* CONSTRUCTOR */
    public TaintedTable(String filename) {
     symbolsRootTainted = new LinkedHashMap<String, RootTaintedSymbol>();
     this.nameFile = filename;
    }
    
    // Constructor to user function and class method tainted table
    public TaintedTable(String functionName, String filename) {
     symbolsRootTainted = new LinkedHashMap<String, RootTaintedSymbol>();
     this.nameFile = filename;
     this.functionNameCall = functionName;
    }

    /* METHODS that satisfy TaintedScope interface*/

    /*
     * Give the the name of taintedScope. How this scope don't have parent, then
     * your name is "globaltainted"
     */
    public String getScopeTaintedName() {
        return nameFile;
    }
    
    /*
     * Give the the name of user function or class method.
     */
    public String getFunctionNameCall() {
        return functionNameCall;
    }    

    /*
     * If the tainted scope is enclosing in another (if have parent), give the
     * name of the parent scope.
     * How the Tainted Table is the main scope, then don't have parent (null)
     */
    public ScopeTainted getEnclosingScopeTainted() {
    	return null;
    }

    /*
     * Give the main Map that contain the tainted variables
     */
    public Map getTaintedMembers() {
        return symbolsRootTainted;
    }

    /*
     * Insert a tainted variable in main Map.
     * Each member of main Map is a RelatedTaintedSymbol, composed by:
     * Map VariableTaintedSymbol and List to store code lines of tainted variables
     */
    public void define(RootTaintedSymbol rts) {
    	symbolsRootTainted.put(rts.getScopeTaintedName(), rts);
    }

    /*
     * Give RelatedTaintedSymbol from main Map, search by a gived name
     */
    public RootTaintedSymbol resolve(String name) {
    	return symbolsRootTainted.get(name);
    }

    public TaintedTable copyTaintedTable() {
        TaintedTable tab = new TaintedTable("aux");
        for(Iterator <Symbol> it = this.getTaintedMembers().values().iterator(); it.hasNext();){
		Symbol cs = it.next();
            try {
                tab.getTaintedMembers().put(cs.getName(), cs.clone());
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(TaintedTable.class.getName()).log(Level.SEVERE, null, ex);
            }
	 }
    	return tab;
        
    }
    
    public void copyToMTS(TaintedTable m, UntaintedTable mu) { // m = mts
        Iterator <RootTaintedSymbol> it = this.getTaintedMembers().values().iterator(); // mts_aux
        RootTaintedSymbol rts, rts_m;
        RelatedTaintedSymbol rtt=null, rtt_m=null;
        VariableTaintedSymbol vts = null, vts_m;
        for(;it.hasNext();){//mts_aux
            rts = it.next();
            if (m.getTaintedMembers().containsKey(rts.getScopeTaintedName()) == false)
                m.getTaintedMembers().put(rts.getScopeTaintedName(), rts);
            else{
                rts_m = (RootTaintedSymbol) m.getTaintedMembers().get(rts.getScopeTaintedName());
                Iterator <Integer> it1;
                Iterator <String> it2 = rts.getFilesList().iterator();
                int i;
                String s;
                for (it1 = rts.getLinesList().iterator(); it1.hasNext();){
                    i = it1.next();
                    s = it2.next();
                    if (i != 0){ // as var globais em mts_aux tem linha = 0
                        if (rts_m.getLinesList().contains(i) == false ||
                            rts_m.getLinesList().contains(i) == true && rts_m.getFilesList().contains(s) == false){
                            rts_m.getLinesList().add(i);
                            rts_m.getFilesList().add(s);
                            for (Iterator <RelatedTaintedSymbol> it3 = rts.getListTaintedMembers().iterator(); it3.hasNext();){
                                rtt = it3.next();
                                if (rtt.getLineRts() == i && rtt.getFileRts().equals(s)){
                                    rts_m.define(rtt);
                                    break;
                                }
                            }
                        }
                        else{
                            // Obter RelatedTaintedSymbol de mts_princ de i e s
                            for (Iterator <RelatedTaintedSymbol> it3 = rts_m.getListTaintedMembers().iterator(); it3.hasNext();){
                                rtt_m = it3.next();
                                if (rtt_m.getLineRts() == i && rtt_m.getFileRts().equals(s))
                                    break;
                            }
                            // Obter RelatedTaintedSymbol de mts_aux de i e s para copiar os vts para mts_princ
                            for (Iterator <RelatedTaintedSymbol> it3 = rts.getListTaintedMembers().iterator(); it3.hasNext();){
                                rtt = it3.next();
                                if (rtt.getLineRts() == i && rtt.getFileRts().equals(s))
                                    break;
                            }
                            
                            Iterator <VariableTaintedSymbol> it3 = rtt.getTaintedMembers().values().iterator();
                            for (;it3.hasNext();){
                                vts = it3.next();
                                if (rtt_m.getTaintedMembers().containsKey(vts.getName()) == false){
                                    rtt_m.define(vts);
                                }
                                else{
                                    vts_m = (VariableTaintedSymbol) rtt_m.getTaintedMembers().get(vts.getName());
                                    Iterator <Integer> it4 = vts.getVariableLines().iterator();
                                    Iterator <String> it5 = vts.getVariableFiles().iterator();
                                    for (; it4.hasNext();){
                                        int ii = it4.next();
                                        String ss = it5.next();
                                        if (vts_m.getVariableLines().contains(ii) == false ||
                                            vts_m.getVariableLines().contains(ii) == true && vts_m.getVariableFiles().contains(ss) == false){
                                            vts_m.getVariableLines().add(ii);
                                            vts_m.getVariableFiles().add(ss);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                
                // Se rts passou de untainted (vindo de mus) para tainted (em mts_aux), retirar rts de mus
                Symbol sym = rts.getSymbol();
                if (mu.existSymbol(sym.getName()) == true) // verify if symbol pass to untaint to taint
                    mu.removeUntaintSymbol(sym);
            }
        }
    }
    
    public void copyGlobalsToMTS(TaintedTable mts_princ , UntaintedTable mus_princ , UntaintedTable mus_aux, MethodSymbol meth_sym_clone){
        for(Iterator <Symbol> it = meth_sym_clone.getGlobalVarsOfFunction().values().iterator(); it.hasNext();){
            Symbol sym = it.next();
            if (this.getTaintedMembers().containsKey(sym.getName()) == true && mus_aux.existSymbol(sym.getName()) == false){
                if (mts_princ.getTaintedMembers().containsKey(sym.getName()) == true){
                    // Se passou de untainted para tainted, retirar de untainted
                    if(mus_princ.existSymbol(sym.getName()) == true)
                        mus_princ.removeUntaintSymbol(sym);                   
                else{
                    RootTaintedSymbol rts_aux = (RootTaintedSymbol) this.getTaintedMembers().get(sym.getName());
                    RootTaintedSymbol rts_princ = (RootTaintedSymbol) mts_princ.getTaintedMembers().get(sym.getName());
                    int index = rts_aux.getLinesList().size()-1;
                    int i = (Integer) rts_aux.getLinesList().get(index);
                    String s = (String) rts_aux.getFilesList().get(index);
                    RelatedTaintedSymbol rtt_aux = (RelatedTaintedSymbol) rts_aux.getListTaintedMembers().get(index);
                    if (rts_princ.getLinesList().contains(i) == false){
                        rts_princ.getLinesList().add(i);
                        rts_princ.getFilesList().add(s);
                        rts_princ.getListTaintedMembers().add(rtt_aux);
                    }
                    else{
                        int index_princ = rts_princ.getLinesList().indexOf(i);
                        if (rts_princ.getFilesList().get(index_princ).equals(s) == false){
                            rts_princ.getLinesList().add(i);
                            rts_princ.getFilesList().add(s);
                            rts_princ.getListTaintedMembers().add(rtt_aux);
                        }
                        else{
                            rts_princ.getListTaintedMembers().set(index_princ, rtt_aux);
                        }
                    }
                }
                }
            }
        }
    }

public void removeDuplicates(Symbol sym){
    if (this.getTaintedMembers().containsKey(sym.getScope().getScopeName()) == true){
        RootTaintedSymbol Rrt = (RootTaintedSymbol) this.getTaintedMembers().get(sym.getScope().getScopeName());
        if (Rrt.getLinesList().size() > 1){
            int last_i = (Integer) Rrt.getLinesList().get(Rrt.getLinesList().size()-1);
            String last_s = (String) Rrt.getFilesList().get(Rrt.getFilesList().size()-1);
            
            int penultimate_i = (Integer) Rrt.getLinesList().get(Rrt.getLinesList().size()-2);
            String penultimate_s = (String) Rrt.getFilesList().get(Rrt.getFilesList().size()-2);
            if (last_i == penultimate_i && last_s.equals(penultimate_s) == true){
                Rrt.getLinesList().remove(Rrt.getLinesList().size()-1);
                Rrt.getFilesList().remove(Rrt.getFilesList().size()-1);
            }
        }
     }
}    
    
    
    public void printMTS(){
        TaintedTable mts = this;
        Iterator <RootTaintedSymbol> it = mts.getTaintedMembers().values().iterator();
        System.out.println("\n\nTainted File = "+mts.getScopeTaintedName()+"\n");
        System.out.println("Nº de Vars/funcoes tainted = "+mts.getTaintedMembers().size()+"\n");
        System.out.println("Mapa de Vars/funcoes tainted e suas dependencias:\n");
        System.out.println("**************************************************\n");
        VariableTaintedSymbol aux1;
        RelatedTaintedSymbol aux;
        RootTaintedSymbol raux;
        for(; it.hasNext();){
            raux = it.next();
            System.out.println("\nROOT_VAR: "+raux.getName());
            for(Iterator <RelatedTaintedSymbol> it2 = raux.getListTaintedMembers().iterator(); it2.hasNext();){
                aux = it2.next();
                System.out.println("\tLine: "+aux.getLineRts()+"  FILE: "+aux.getFileRts());
                Iterator <VariableTaintedSymbol> it3 = aux.getTaintedMembers().values().iterator();
                for(;it3.hasNext(); ){
                    aux1 = it3.next();
                    System.out.println("\t\tName: "+aux1.getName()+"  Lines: "+aux1.getVariableLines().toString()+
                                       "  FILES: "+aux1.getVariableFiles().toString());
                }
            }
        }
    }    
    
    
    public void cleanAll(){
        Collection <RootTaintedSymbol> c = symbolsRootTainted.values();
    	c.removeAll(c);
    	symbolsRootTainted.clear();
    }
    
    @Override
    public String toString() {
    	return getScopeTaintedName()+":"+symbolsRootTainted;
    }

    public void define(Symbol sym) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List getListTaintedMembers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
