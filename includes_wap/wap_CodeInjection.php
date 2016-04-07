<?php
/*
 * @file    : wap_CodeInjection.php
 * @created : Apr 28, 2014
 * @author  : Ibéria Medeiros <ibemed at gmail.com>
 * @version : v1.0
 * @license : GNU Public License v2.0 http://www.gnu.org/licenses/gpl-2.0.html
 * @desc    : PHP WAP include file with fixes to correct input validation vulnerabilities (code injection)).
 */
 
	    /*
     * @function   : RLfiDt
     * @return     : Integer
     * @parameters : valueInc: Content you want to filter
     *								 : func: sensitive sink
     *		//						 : indexInput: index of the user input into valueInc
     *								 : baseDir: directory in analysis 
     * @description: Filter the content by method and verify if exists RFI, LFI, DT, SCD
     */	 
	//function RLfiDt($valueInc, $func, $indexInput, $baseDir){
	function RLfiDt($valueInc, $func, $baseDir){	
		if (ini_get('open_basedir') == null){
			$valueInc = trim($valueInc);
			$documentRoot = $baseDir;
			$absPath = realpath($valueInc);
			
			// Detect LFI/DT/Source code disclosure
			if ($absPath != ""){
				$pos = stripos($absPath, $documentRoot);
				if ($pos !== false) {			
					if ($func == 'readfile' || $func == 'highlight_file'){
						$extensions = array('php', 'phps', 'php3', 'php4', 'php5', 'phtml', 'inc');
						$path_parts = pathinfo($absPath);
						if (in_array($path_parts['extension'], $extensions, TRUE) ) {					
							echo '<script>';
							echo 'alert("Source Code Disclosure detected!!!\n\nAttempt to access file:\n'.htmlentities($absPath).'");';
							echo '</script>';											

							return 1;	
						}
					}
					else{
						//echo "<p>Access to file: " . $absPath . "</p>";
						return 0;
					}					
				}
				else{
							echo '<script>';
							echo 'alert("Local File Inclusion or Directory Traversal detected!!!\n\nAttempt to access file:\n'.htmlentities($absPath).'");';
							echo '</script>';
						return 1;
				}
			}
			else{ // Detect RFI
				$protocols = array('http', 'ftp', 'php', 'zlib', 'data', 'glob', 'phar', 'ssh2', 'rar', 'ogg', 'expect', 'file');
				$findProt = false;
				$components = parse_url($valueInc);
		    		foreach ($components as &$component){
			   		$component = urldecode($component);
					if (in_array($component, $protocols, TRUE) ) {
						$findProt = true;
						break;
					}
			   	}
			   		   	
				   	if ($findProt == true){
				   		if ($component === 'file' || $component === 'php'){
									echo '<script>';
									echo 'alert("Local File Inclusion or Directory Traversal detected!!!\n\nAttempt to access URI:\n'.htmlentities($valueInc).'");';
									echo '</script>';				   			
									return 1;
						}
						else{
									echo '<script>';
									echo 'alert("Remote File Inclusion detected!!!\n\nAttempt to access URI:\n'.htmlentities($valueInc).'");';
									echo '</script>';								

									return 1;						
						}
				   	}
				   	else{
								//echo "<p>Access to file: " . $valueInc . "</p>";
								return 0;
					}		
			}
		}	
		else{
			//echo "<p>Access to file: " . $valueInc . "</p>";
			return 0;		
		}
	}


	    /*
     * @function   : OSCmd
     * @return     : Integer
     * @parameters : valueInc: Content you want to filter
     * @description: Filter the content by method and verify if OSCI
     */		
	function OSCmd($valueInc){
		$metachars = array('!', '-', '#', '&', ';', '`', '|', '*', '?', '~', '<', '>', '^', '(', ')', '[', ']', '{', '}', '$', '\\', ',', ' ', '\x0A', '\xFF', '\x2a');
		
		$findMetachar = false;
		
		foreach ($metachars as &$metachar){
			$pos = stripos($valueInc, $metachar);
			if ($pos !== false){
				$findMetachar = true;
				break;
			}
		}
		
	   	if ($findMetachar == true){
						echo '<script>';
						echo 'alert("OS Command Injection detected!!!\n\nAttempt to execute:\n'.htmlentities($valueInc).'");';
						echo '</script>';
			return 1;
	   	}
	   	else{
					//echo "<p>Execute command line: " . $valueInc . "</p>";
					return 0;
		}		
	}


	    /*
     * @function   : EvalFunc
     * @return     : String
     * @parameters : valueInc: Content you want to filter
     * @description: Filter the content by method and verify if PHP code injection
     */	
	function EvalFunc($valueInc){
		// newline check
		$nl_1 = chr(10);
		$nl_2 = chr(13);
		
		if (strpos($valueInc, $nl_1) || strpos($valueInc, $nl_2)){
			echo "<p>PHP Code Injection detected!!! Attempt to execute: " . htmlentities($valueInc) . "</p>";
			return 1;
		}
		
		$metachars = array('$', '{', '}', '[', ']', '`', ';');
		$escaped = array('&#36', '&#123', '&#125', '&#91', '&#93', '&#96', '&#59');
		
		// addslashes for quotes and backslashes
		$out = addslashes($valueInc);
		
		// str_replace for php metacharacters
		$out = str_replace($metachars, $escaped, $out); 
		$lineVul = str_replace($valueInc, $out, $lineVul);
		return $lineVul;	
	}


	
//--------------------------

	    /*
     * @function   : san_mix
     * @return     : int
     * @parameters : valueInc: Content you want to filter
     *								 : func: sensitive sink
     *								 : baseDir: directory in analysis
     * @description: Filter the content by method and verify if exists RFI, LFI, DT, SCD
     */	
	function san_mix($valueInc, $func, $baseDir){
		return RLfiDt($valueInc, $func, $baseDir);
	}


	    /*
     * @function   : san_osci
     * @return     : int
     * @parameters : valueInc: Content you want to filter  
     * @description: Filter the content by method and verify if exists OSCI
     */
	function san_osci($valueInc){
		return OScmd($valueInc);
	}	

	    /*
     * @function   : san_eval
     * @return     : string
     * @parameters : valueInc: Content you want to filter
     *								 : lineVuln: line of code that was reached     
     * @description: Filter the content by method and verify if exists PHP code injection
     */	
	function san_eval($valueInc, $lineVul){
		return EvalFunc($valueInc, $lineVul);
	}


	    /*
     * @function   : san_sqli
     * @return     : String
     * @parameters : indexEscFunc: index of the escape function to be applied
     *								 : input: Content you want to sanitize
     * @description: Sanitize the user input
     */		
	function san_sqli($indexEscFunc, $input){
	 /*   
   * 0 - mysql_real_escape_string
   * 1 - mysqli_real_escape_string
   * 2 - real_escape_string (mysqli oo)
   * ---- DB2
   * 3 - db2_escape_string
   * ---- PostgreSQL
   * 4 - pg_escape_string
   */
 
		$dec = base64_decode($input);
		$value = strcmp($input, $dec);
		if ($value !== 0)
				$final = $dec;	
		else {
				if(strpos($input, '/*') && strpos($input, '*/')){
								$final = str_replace('/*', '', $input);
								$final = str_replace('*/', '', $final);
				}	
				else {
								if (preg_match("/<(.*)s(.*)c(.*)r(.*)i(.*)p(.*)t(.*)>(.*)/i", $input) > 0 ||
								    preg_match("/<(.*)S(.*)C(.*)R(.*)I(.*)P(.*)T(.*)>(.*)/i", $input) > 0))
								    $final = htmlentities($input);	
								else {
										 $final = $input;
								}
				}
		}
		
   		
		if ($indexEscFunc == 0)
			return mysql_real_escape_string($final);		
		
		if ($indexEscFunc == 1)
			return mysqli_real_escape_string($final);
			
		if ($indexEscFunc == 2)
			return real_escape_string($final);						

		if ($indexEscFunc == 3)
			return db2_escape_string($final);	

		if ($indexEscFunc == 4)
			return pg_escape_string($final);
	}		
	
?>

