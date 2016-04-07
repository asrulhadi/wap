/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.homeunix.wap.table.tainted;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iberiam
 */
public class ListVulners {
    String nameFile;
    List<Vulner> LVulners;

    /* CONSTRUCTOR */
    public ListVulners(String f) {
        this.nameFile = f;
        LVulners = new ArrayList<Vulner>();
    }


    /* METHODS */
    public List getListOfVulners(){
        return LVulners;
    }

    public String getFilename(){
        return this.nameFile;
    }
}
