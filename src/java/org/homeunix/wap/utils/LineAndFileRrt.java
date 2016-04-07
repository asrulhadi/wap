/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.homeunix.wap.utils;

import org.homeunix.wap.table.tainted.RootTaintedSymbol;
import org.homeunix.wap.table.tainted.TaintedTable;
import org.homeunix.wap.table.tainted.VariableTaintedSymbol;
import org.homeunix.wap.table.tainted.RelatedTaintedSymbol;
import org.homeunix.wap.table.symbol.Symbol;


/**
 *
 * @author iberiam
 */
public class LineAndFileRrt {
    Integer linhaRrt;
    String fileRrt;
    
    public LineAndFileRrt(){
        this.fileRrt = null;
        this.linhaRrt = null;
    }
    
    public String getFileRrt(){
        return this.fileRrt;
    }
    
    public Integer getLinhaRrt(){
        return this.linhaRrt;
    }
    
    public void setLinhaFileRrt(Integer linha, String file){
        this.linhaRrt = linha;
        this.fileRrt = file;
    }

   public Boolean foundLineAndFileRrt(Symbol sym, String nameScopeSymbol, int indiceScopeSymbol, TaintedTable mts_aux){
       RootTaintedSymbol Rrt=null;
       RelatedTaintedSymbol rtt;
       VariableTaintedSymbol vts;
       int i, j;

       if (sym.getIsFunction() == true){
           if (mts_aux.getTaintedMembers().containsKey("return"))
               Rrt = (RootTaintedSymbol) mts_aux.getTaintedMembers().get("return");
       }
       else{
           if (mts_aux.getTaintedMembers().containsKey(sym.getName()))
                Rrt = (RootTaintedSymbol) mts_aux.getTaintedMembers().get(sym.getName());
       }

       if(Rrt != null){
           for(i=0; i < Rrt.getLinesList().size(); i++){
                rtt = (RelatedTaintedSymbol) Rrt.getListTaintedMembers().get(i);
                if(rtt.getTaintedMembers().containsKey(nameScopeSymbol)){
                    vts = (VariableTaintedSymbol) rtt.getTaintedMembers().get(nameScopeSymbol);
                    if(vts.getVariableLines().contains(indiceScopeSymbol)){
                        // Analisar os membros do Scope

                        // remove duplicate indexes
                        for(j=0; j < Rrt.getLinesList().size()-1; j++){
                            if (Rrt.getLinesList().get(j) == Rrt.getLinesList().get(j+1)){
                                Rrt.getLinesList().remove(j+1);
                                j--;
                            }
                        }


                        this.linhaRrt = (Integer) Rrt.getLinesList().get(i);
                        this.fileRrt = (String) Rrt.getFilesList().get(i);
                        return true;
                    }
                }
           }
       }
       return false;
   }
}
