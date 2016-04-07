What is WAP?
=============

WAP is a source code static analysis and data mining tool that automatically detects and corrects input validation vulnerabilities in web applications written in PHP Language (version 4.0 or higher) and with a low rate of false positives.

WAP detects the following vulnerabilities:
- SQL injection using MySQL, PostgreSQL and DB2 DBMS
- Reflected cross-site scripting (XSS)
- Stored XSS
- Remote file inclusion
- Local file inclusion
- Directory traversal
- Source code disclosure
- OS command injection
- PHP code injection


Copyright and Trademark notices
-------------------------------

  Java is trademark or registered trademark of Oracle, Inc.
  ANTLR is copyrighted by the Terence Parr, University of San Francisco, 1989-2014.


Downloading WAP
---------------

Further information on WAP and the latest version can be obtained at:

  https://awap.sourceforge.net


Documentation
-------------

The following documentation is available in the DEEEP distribution:

:README_:          This file
:COPYING_:         Copyright and license information
:`docs/CHANGES`:  Changes by release
:`docs/CREDITS`:  Project developers
:`docs/INSTALL`:  Installation instructions and notes


Directory Layout
----------------

- <toplevel> 
  - COPYING
  - README
  - wap
  - wap.bat
  - wap.jar
  
  - data
    - data sets with instances to train the machine learning classifiers

  - docs
    - documentation files

  - includes_wap
    - fixes to perform the correction of the source code

  - lib
    - libraries that are needed to run WAP tool

  - parser
    - php parser that can be used individually or included in a user project

  - src
    - grammar
      - grammar and tree grammar used to analyses files for PHP 5.3. and to detect input validation vulnerabilities

    - java
	 - source code java files from WAP tool


Installation
------------

Instructions for installing WAP can be found in the file INSTALL in the
``docs/`` directory of the WAP distribution.


Assistance
----------

Usage:

  wap [options] -p <project>
  wap [options] file(s) 

Options:

	* -a: detects vulnerabilities, without corrected them

	* -s: shows only global summary

	* -sqli: detects SQLI vulnerabilities. If not used with -a, also automatically corrects them

	* --dbms <dbms>: specifies DBMS used by the application. Available DBMS: MySql, DB2, PostgreSQL. This option is only used with -sqli option and by default 				  MySQL is selected. Options used to DBMS: mysql, db2, pg

	* -ci: detects RFI/LFI/DT/SCD/OS/PHP Injections vulnerabilities. If not used with -a, also automatically corrects them

	* -xss: detects Reflected and Stored XSS vulnerabilities. If not used with -a, also automatically corrects them

	* -all: detects all types of vulnerabilities. The same of "-sqli -ci -xss". If not used with -a, also automatically corrects them

	* -out <arg>: forwards the stdout to a file specified in arg

	* -p <project>: specifies full project location

	* file(s): specifies full path of php file or php files

	* -h, -help: display this information 


If you encounter problems with WAP, help is available! 

The WAP support page, available on the Web at
 
  https://awap.sourceforge.net

Lastly, WAP developer, Ibéria Medeiros
is available by email at

  <ibemed at gmail.com>


If you like this tool, please feel free to write a review of it at

	http://sourceforge.net/projects/awap/



Licensing
---------

For licensing and copyright information, please see the file COPYING in the
WAP distribution.

Thanks,

Ibéria Medeiros
