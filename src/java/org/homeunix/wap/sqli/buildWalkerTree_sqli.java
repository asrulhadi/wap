/*
 * Class that build the AST and make walker tree to SQLI
 */

package org.homeunix.wap.sqli;

import org.homeunix.wap.php.parser.Sqli;
import org.homeunix.wap.table.tainted.UntaintedTable;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iberia Medeiros
 */
public class buildWalkerTree_sqli {
       
    // *** CONSTRUCTORS
    public buildWalkerTree_sqli(CommonTreeNodeStream nodes, String filename, Map mst, Map mift, Map mft, Map mftt, Map mtt, UntaintedTable mus, Map mlct, Map mct, Map mobjt, List files) throws IOException, RecognitionException {
        try {           
            // Navegate into AST by walker tree
            Sqli def = new Sqli(nodes, mst, mift, mft, mftt, mtt, mus, mlct, mct, mobjt, filename, files);
            Sqli.prog_return prog = def.prog(); 
        } catch (RecognitionException ex) {
            Logger.getLogger(buildWalkerTree_sqli.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {}

    }

}
