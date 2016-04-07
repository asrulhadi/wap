/*
 * Grammar specification file for PHP 5.3
 * 
 * Copyright (C) 2008 Sidharth Kuruvila
 * Copyright (C) 2010 Ibéria Medeiros
 *
 */

/*
 * This lexer was builded, in October of 2008, by Sidharth Kuruvila for PHP 4.3 
 * Ibéria Medeiros corrected and completed this lexer for PHP 5.3 or higther
 */

lexer grammar Lex;

@lexer::header {
package org.homeunix.wap.php.parser;
}

@lexer::members {
	/** Override this method to change where error messages go */
	@Override
	public void emitErrorMessage(String msg) {}
}

    SEMICOLON: ';';
    COMMA: ',';
    OPEN_BRACE: '(';
    CLOSE_BRACE: ')';
    OPEN_SQUARE_BRACE: '[';
    CLOSE_SQUARE_BRACE: ']';
    OPEN_CURLY_BRACE: '{';
    CLOSE_CURLY_BRACE: '}';
    ARRAY_ASSIGN: '=>';
    LOGICAL_OR: '||';
    LOGICAL_AND: '&&';
    CLASS_MEMBER: '::';
    INSTANCE_MEMBER: '->';
    SUPPRESS_WARNINGS: '@';
    QUESTION_MARK: '?';
    DOLLAR: '$';
    COLON: ':';
    DOT: '.';
    AMPERSAND: '&';
    PIPE: '|';
    BANG: '!';
    PLUS: '+';
    MINUS: '-';
    ASTERISK: '*';
    PERCENT: '%';
    FORWARD_SLASH: '/'; 
    TILDE: '~';
    EQUALS: '=';
    NEW: 'new';
    CLONE: 'clone';
    ECHO: 'echo';
    PRINT: 'print';
    PRINTF: 'printf';
    DIE: 'die';    
    IF: 'if';
    ELSE: 'else';
    ELSE_IF: 'elseif';
    FOR: 'for';
    FOR_EACH: 'foreach';
    WHILE: 'while';
    DO: 'do';
    SWITCH: 'switch';
    CASE: 'case';
    DEFAULT: 'default';
    FUNCTION: 'function';
    RETURN: 'return';
    GLOBAL: 'global';
    INSTANCE_OF: 'instanceof';
    TRY: 'try';
    CATCH: 'catch';
    CLASS: 'class';
    Extends: 'extends';
    ABSTRACT: 'abstract';
    VAR: 'var';
    CONST: 'const';
    THROW: 'throw';
    USE: 'use';
    BREAK: 'break';
    CONTINUE: 'continue';



// ------------------------------------------------ LEXER ---------------------------------

BodyString 
    : '?>' (('<' ~ '?')=> '<' | ~'<' )* ('<?' ('php'?))?
    ;

fragment
FirstBodyString
    : (('<' ~ '?')=> '<' | ~'<' )* '<?' ('php'?)
    ;

PhpStatement
    : IgnoreStmContents 
    | ('break' | 'continue' | 'throw' | 'use' ) IgnoreStmContents 
    | 'interface' IgnoreStmInterface
    | 'implements' IgnoreStmImplements
    | 'declare' IgnoreStmDeclare
    | ('catch' | 'for' | 'while' | 'foreach') ' '? '(' IgnoreConditions
    ;

fragment
IgnoreStmContents
    : {
    try{

		char a = (char)input.LA(1);	
        while(a!=';' || input.LA(1)!='\n'){
	    a = (char)input.LA(1);
            input.consume();
        }
        input.consume();
       } catch (Exception e){}
      }
    ;


fragment
IgnoreStmInterface
    : {
	try{
	char a;
	int openCurlyBrace = 0;
        while(input.LA(1)!='{'){
            input.consume();
        }
	input.consume();
	openCurlyBrace++;

        while(openCurlyBrace != 0){
	    a = (char)input.LA(1);
	    if (a == '}')
		openCurlyBrace--;
	    else{
		if (a == '{')
			openCurlyBrace++;
	    }
            input.consume();
        }

	a = (char)input.LA(1);
        if (a == '\n')
		input.consume();
	} catch (Exception e){}
      }
    ;

fragment
IgnoreStmImplements
    : {
	try{
	char a;
     while(input.LA(1)!='{')
 	    input.consume();
	} catch (Exception e){}
      }
    ;

fragment
IgnoreStmDeclare
    : {
	try{
	char a;
	int openCurlyBrace = 0;
        while(input.LA(1)!=';'){
	    a = (char)input.LA(1);
	    if (a == '{'){
		openCurlyBrace++;
		break;
	    }
            input.consume();
        }
	input.consume();
	
        while(openCurlyBrace != 0){
	    a = (char)input.LA(1);
	    if (a == '}')
		openCurlyBrace--;
	    else{
		if (a == '{')
			openCurlyBrace++;
	    }
            input.consume();
        }

	a = (char)input.LA(1);
        if (a == '\n')
		input.consume();
	} catch (Exception e){}
      }
    ;

fragment
IgnoreConditions
    : {
	try{
	int openBrace = 1;
	char a;
	StringBuilder sb = new StringBuilder();

        while(openBrace != 0){
	    a = (char)input.LA(1);
		sb.append(a);
	    if (a == ')')
		openBrace--;
	    else{
		if (a == '(')
			openBrace++;
	    }
            input.consume();
        }

	a = (char)input.LA(1);
        if (a == '\n' || a==';')
		input.consume();
	} catch (Exception e){}
      }
    ;

RequireOperator
    : 'require' | 'require_once' | 'include' | 'include_once'
    ;

fragment
Decimal	
	:('1'..'9' ('0'..'9')*) | '0'
	;
fragment
Hexadecimal
	: '0'('x' | 'X')('0'..'9' | 'a'..'f' | 'A'..'F')+
	;
	
fragment
Octal
	: '0'('0'..'7')+
	;
	
Integer
	:Octal|Decimal|Hexadecimal
	;
	
fragment
Digits
	: '0'..'9'+
	;
	
fragment
DNum
	:(('.' Digits)=>('.' Digits)|(Digits '.' Digits?))
	;


AccessModifier
    : 'public' | 'private' | 'protected' 
    ;

ArrayWord
    : 'array' | 'Array' | 'ARRAY'
    ;

	
fragment
Exponent_DNum
	:((Digits|DNum)('e' | 'E')('+' | '-')?Digits)
	;
	
Real
    : DNum|Exponent_DNum
    ;

Boolean
    : 'true' | 'false' | 'TRUE' | 'FALSE' | 'True' | 'False'
    ;

SingleQuotedString
    : '\'' (('\\' '\'')=>'\\' '\''
    |         ('\\' '\\')=>'\\' '\\' 
    |         '\\' | ~ ('\'' | '\\'))* '\''
    ;

fragment
EscapeCharector
    : 'n' | 'r' | 't' | '\\' | '$' | '"' | Digits | 'x'
    |   UNICODE_ESC
    |   OCTAL_ESC    
    ;

DoubleQuotedString
    : '"'  ( ('\\' EscapeCharector)=> '\\' EscapeCharector 
    | '\\' 
    | ~('\\' | '"') )* '"'
    ;

HereDoc
    : '<<<' HereDocContents
    ;

UnquotedString
   : ('a'..'z' | 'A'..'Z' | '_')  ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
   ;
   
fragment 
HereDocContents
    : {   
    try{

        StringBuilder sb = new StringBuilder();
        while(input.LA(1)!='\n'){
            if ((char)input.LA(1) != ' ')
				sb.append((char)input.LA(1));
            input.consume();
        }
        input.consume();
        String hereDocName = sb.toString();
        int hdnl = hereDocName.length() - 1;     
        while(true){
            boolean matchEnd = true;
            for(int i = 0; i<hdnl; i++){
                if(input.LA(1)!=hereDocName.charAt(i)){
                    matchEnd=false;
                    break;
                }
                input.consume();
            }
            if(matchEnd==false){
                while(input.LA(1)!='\n'){
                    input.consume();
                }
                input.consume();
            }else{
                break;
            }
        }
        }catch (Exception e){}
    }
    ;

AssignmentOperator
    : '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>='
    ;

ConcatAssigmentOperator
    : '.='
    ;
    
EqualityOperator
    : '==' | '!=' | '===' | '!=='
    ;

ComparisionOperator
    : '<' | '<=' | '>' | '>=' | '<>'
    ;
    
ShiftOperator
    : '<<' | '>>'
    ;

IncrementOperator
    : '--' | '++'
    ;
  
fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    |	'#' (('?' ~'>')=>'?' | ~('\n'|'?'))* {$channel=HIDDEN;}
    ;  

WhiteSpace
@init{
    $channel=HIDDEN;
}
	: (' ' | '\t' | '\n' | '\r')*
	;

