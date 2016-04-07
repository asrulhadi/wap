/*
 * This class will represent method or user defined function category.
 */

package org.homeunix.wap.table.symbol;

import org.homeunix.wap.table.tainted.MethodTaintedTable;
import org.homeunix.wap.table.tainted.UntaintedTable;
import org.homeunix.wap.table.tainted.TaintedTable;
import java.util.Iterator;

/**
 *
 * @author Iberia Medeiros
 */
public class Instance implements Cloneable{
    String nameInstance;
    int createLine;
    int tainted = 0;
    String fileInstance;
    String classObject;
    String fileClass;
    SymbolTable instanceAttributes;
    //List <CallSymbol> instanceAttributes;
    TaintedTable mtsInstanceAttributes;
    UntaintedTable musInstanceAttributes;;
    MethodTableCalls methodCallInstance;
    MethodTaintedTable methTaintedInstance;
    InstanceTable objtsOfInstance; // objects que sao criados na instancia
    
    // ****** CONSTRUCTORS ***********
     public Instance(String nameInst, int line, String filename, String class_name, String file_class, ClassSymbol cl, Boolean isMysqli) {
        this.nameInstance = nameInst;
        this.createLine = line;
        this.fileInstance = filename;
        this.classObject = class_name;
        this.fileClass = file_class;

        if (isMysqli == false){
            // copiar da class
            instanceAttributes = cl.copyListAttributes(null);
            // Cria a taintedTable para os atributos da instancia.
            // Esta vai sendo actualizada 'a medida que os metodos vao sendo chamados
            mtsInstanceAttributes = new TaintedTable(nameInst);
            musInstanceAttributes = new UntaintedTable();
            
            // cria uma tabela de objectos que pertencem ao objecto em analise
            objtsOfInstance = new InstanceTable(nameInst);
         }
        // cria a tabela para as st dos metodos que serao chamados
        methodCallInstance = new MethodTableCalls(nameInst);

        // cria a tainted table para as chamadas dos metodos da instancia
        methTaintedInstance = new MethodTaintedTable(nameInst);


    }

     public Instance(Instance inst, ClassSymbol inst_cl) {
        this.nameInstance = inst.getInstanceName();
        this.createLine = inst.getCreateLineInstance();
        this.fileInstance = inst.getFileInstance();
        this.classObject = inst.getInstanceClass();
        this.fileClass = inst.getFileOfClass();
        this.tainted = inst.getTainted();

        // copiar atributos da instancia de input
        instanceAttributes = inst_cl.copyListAttributes(inst.getInstanceAttributes());

        // copiar mts_att e mus_att da instancia de input
        // Esta vai sendo actualizada 'a medida que os metodos vao sendo chamados
        mtsInstanceAttributes = new TaintedTable(inst.getInstanceName());
        mtsInstanceAttributes = inst.getMtsInstanceAttributes().copyTaintedTable();
        musInstanceAttributes = new UntaintedTable();
        musInstanceAttributes = inst.getMusInstanceAttributes().copyUntaintedTable();

        // cria uma tabela de objectos que pertencem ao objecto em analise
        objtsOfInstance = new InstanceTable(inst.getInstanceName());

        // cria a tabela para as st dos metodos que serao chamados
        methodCallInstance = new MethodTableCalls(inst.getInstanceName());

        // cria a tainted table para as chamadas dos metodos da instancia
        methTaintedInstance = new MethodTaintedTable(inst.getInstanceName());
    }
    
    // *** METHODS ********
    public String getInstanceName() {
        return this.nameInstance;
    }

    public int getCreateLineInstance() {
        return this.createLine;
    }

    public int getTainted() {
        return this.tainted;
    }

    public String getFileInstance() {
        return this.fileInstance;
    }

    public String getInstanceClass() {
        return this.classObject;
    }

    public String getFileOfClass() {
        return this.fileClass;
    }
    
    public SymbolTable getInstanceAttributes() {
        return this.instanceAttributes;
    }
       
    public TaintedTable getMtsInstanceAttributes() {
        return this.mtsInstanceAttributes;
    }

    public UntaintedTable getMusInstanceAttributes() {
        return this.musInstanceAttributes;
    }

    public MethodTableCalls getMethodCallInstance() {
        return this.methodCallInstance;
    }

    public MethodTaintedTable getMethodTaintedInstance() {
        return this.methTaintedInstance;
    }

    public InstanceTable getObjectsOfInstance() {
        return this.objtsOfInstance;
    }

    public Instance getInstanceOfReturn(String methName, int line, MethodSymbolCall mscAnaliseMeth, Scope sc, Boolean inAnaliseMeth) {
        Instance inst_final = null;
        MethodSymbolCall msc = mscAnaliseMeth;

        if (inAnaliseMeth == false){
            Iterator <MethodSymbolCall> it;
            for (it = this.methodCallInstance.getListMethodsMembers().iterator(); it.hasNext();){
                msc = it.next();
                if (msc.getFunctionNameCall().equals(methName) == true && msc.getLineNumberCall() == line)
                    break;
            }
        }

        try{
            Scope scp = sc;
            Iterator <Symbol> it1;
            if (inAnaliseMeth == false){
                for (it1 = msc.getCallFunctionSymbols().iterator(); it1.hasNext();){
                    scp = (Scope) it1.next();
                    if (scp.getScopeName().equals("return")){
                        break;
                    }
                }
            }
            
            Symbol sy = (Symbol) scp.getMembers().get(0);

            if (sy.getRootScope() != null){
                scp = (Scope) sy;
                String s = scp.getScopeSymbol().getName();
                Instance inst = getInstanceFromAliases(s, msc);
                if (inst != null){
                    scp = (Scope) scp.getMembers().get(0);
                    String methName_aux = scp.getScopeSymbol().getName();
                    inst.getInstanceOfReturn(methName_aux, scp.getScopeSymbol().getCodeLine(), null, null, false);
                }
            }
            else{
                Instance inst = getInstanceFromAliases(sy.getName(), msc);
                inst_final = inst;
            }
        } catch (Exception e){}

        return inst_final;
    }

    private static Instance getInstanceFromAliases(String s, MethodSymbolCall methSymCall){
        Instance inst = null;
        boolean found = false;
        while (found == false){
            if (methSymCall.getObjectsOfMethod().containsInstance(s) == true){
                inst = (Instance) methSymCall.getObjectsOfMethod().getInstanceOfListInstances(s);
                found = true;
            }
            else{
                if (methSymCall.getAliases().containsKey(s)){
                    Symbol sym = (Symbol) methSymCall.getAliases().get(s);
                    s = sym.getName();
                }
                else
                    break;
            }
        }

        return inst;
    }


    public void setTainted(int t) {
        this.tainted = t;
    }


    public void updateTainted(Scope cs_att, Symbol sym) {
        cs_att.getScopeSymbol().setTainted(sym.getTainted());
        cs_att.resolveSymbol(cs_att, sym, this.getMtsInstanceAttributes(), this.getMusInstanceAttributes(), sym.getFileSymbol());
        if (cs_att.getScopeSymbol().getTainted() == 1)
            this.setTainted(1);
        else{
            if (this.getTainted() == 1){
                Symbol sy;
                int numTaints = 0;
                for (int j = 0; j < this.getInstanceAttributes().getMembers().size(); j++){
                    sy = (Symbol) this.getInstanceAttributes().getMembers().get(j);
                    if (sy.getTainted() == 1)
                        numTaints++;
                }
                if (numTaints == 0)
                    this.setTainted(0);
            }
        }
    }
}
