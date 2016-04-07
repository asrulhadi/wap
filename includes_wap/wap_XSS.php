<?php
/*
 * @file    : wap_XSS.php
 * @created : Apr 28, 2014
 * @author  : Ibéria Medeiros <ibemed at gmail.com>
 * @version : v1.0
 * @license : GNU Public License v2.0 http://www.gnu.org/licenses/gpl-2.0.html
 * @desc    : PHP WAP include file with fixes to correct input validation vulnerabilities (XSS)).
 */
 
	include('AntiXSS.php');
	
    
    /*
     * @function   : san_out
     * @return     : String
     * @parameters : str: Content you want to change the character encoding
     * @newEncoding: Character encoding you want set
     * @description: Convert the character encoding of the string
     *               to newEncoding from currentEncoding. currentEncoding
     *               detecting by function so you only need give str and
     *               newEncoding to the setEncoding function.
     */	
	function san_out($str, $newEncoding){
		return AntiXSS::setEncoding($str, $newEncoding);
	}
	
	
	    /*
     * @function   : san_wdata
     * @return     : String
     * @parameters : str: Content you want to filter and to sanitize
     * @description: Filter the content by method and encoding the result 
     */	
	function san_wdata($str){
		$str1 = AntiXSS::setFilter($str, "white", $filterPattern = NULL, $noHTMLTag = 1);
		if ($str1 == AntiXSS::$err)
			echo "<p>".$str1."</p>";

		return htmlentities($str, 1, "UTF-8", FALSE);
	}

	    /*
     * @function   : san_rdata
     * @return     : String
     * @parameters : str: Content you want to filter
     * @description: Filter the content by method and encoding the result 
     */		
	function san_rdata($str){
		$str1 = trim($str);
		$str1 = AntiXSS::whitelistFilter($str1, '');
		if ($str1 == AntiXSS::$err)
			echo "<p>".$str1."</p>";

		return htmlentities($str, 1, "UTF-8", FALSE);
	}
?>

