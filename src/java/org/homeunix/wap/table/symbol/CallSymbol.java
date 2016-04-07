/*
 * Class that implement the scope for assign/callfunction instructions
 */

package org.homeunix.wap.table.symbol;

import java.util.*;

/**
 *
 * @author Iberia Medeiros
 */
public class CallSymbol extends ScopedSymbol{
    List<Symbol> att_func;


    // *** CONSTRUCTORS
    public CallSymbol(String name, int line, Scope parent, int tainted, String file) {
        super(name, line, tainted, parent, file);
        att_func = new ArrayList<Symbol>();
    }


    // *** METHODS

    // give the members of the map
    //public Map getMembers() {
    public List getMembers() {
        return att_func;
    }

    // print the members of the map
        public void print(Scope scp){
        Symbol aux1 = null;
        Scope s;
        
        if (!scp.getMembers().isEmpty()){
            System.out.println("Scope: "+scp.getScopeName()+"\tsize="+scp.getMembers().size());
            Iterator <Symbol> it = scp.getMembers().iterator();
            for(; it.hasNext();){
                aux1 = it.next();
                //System.out.println("Name: "+aux1.getName()+"\t\tline: "+aux1.getCodeLine()+"\t\ttainted: "
                //                +aux1.getTainted()+"\t\tScope: "+aux1.getScope().getScopeName()+"\n");
                if ( aux1.getRootScope() != null ) { // is a root of a new scope?
                        s = aux1.getRootScope();
                        s.print(s);
                }else{
                    //aux1 = scp.getScopeSymbol();
                    System.out.println("MemberName: "+aux1.getName()+"\tline: "+aux1.getCodeLine()+"\ttainted: "
                                +aux1.getTainted()+"\tScope: "+aux1.getScope().getScopeName());
                }
            }
        }
         else{
            aux1 = scp.getScopeSymbol();
             System.out.println("MemberName: "+aux1.getName()+"\tline: "+aux1.getCodeLine()+"\ttainted: "
                                +aux1.getTainted()+"\tScope: "+aux1.getScope().getScopeName());
         }
    }


}
