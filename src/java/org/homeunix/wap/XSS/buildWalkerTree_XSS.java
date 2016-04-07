/*
 * Class that build the AST and make walker tree to SQLI
 */

package org.homeunix.wap.XSS;

import org.homeunix.wap.php.parser.XSS;
import org.homeunix.wap.sqli.buildWalkerTree_sqli;
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
public class buildWalkerTree_XSS {
       
    // *** CONSTRUCTORS
    public buildWalkerTree_XSS(CommonTreeNodeStream nodes, String filename, Map mst, Map mift, Map mft, Map mftt, Map mtt, UntaintedTable mus, Map mlct, Map mct, Map mobjt, List files) throws IOException {
        try {
            // Navegate into AST by walker tree
            XSS def = new XSS(nodes, mst, mift, mft, mftt, mtt, mus, mlct, mct, mobjt, filename, files);
            XSS.prog_return prog = def.prog();
        } catch (RecognitionException ex) {
           Logger.getLogger(buildWalkerTree_sqli.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {}

    }

}
