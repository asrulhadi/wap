/*
 * Grammar specification file for PHP 5.3
 * 
 * Copyright (C) 2008 Sidharth Kuruvila
 * Copyright (C) 2010 Ibéria Medeiros
 *
 */

/*
 * This grammar was builded, in October of 2008, by Sidharth Kuruvila for PHP 4.3 
 * Ibéria Medeiros corrected and completed this grammar for PHP 5.3 or higther
 */


grammar Php;

options {
    language = Java;
    backtrack = true; 
    memoize = true;
    k=2;
    output = AST;
    ASTLabelType = CommonTree;
}

import Lex;

/* List of tokens that represent nodes of tree walkers */
tokens{
    Modifiers;
    Field;
    Method;
    Array;
    Block;
    Params;
    Apply;
    Prefix;
    Postfix;
    IfExpression;
    Cast;
    ForeachVar;
    List;
    ListAssign;
}

@header{
package org.homeunix.wap.php.parser; 
}

@lexer::members {
    // Handle the first token, which will always be a BodyString.
    public Token nextToken(){
        //The following code was pulled out from super.nextToken()
        if (input.index() == 0) {
            try {
                state.token = null;
                state.channel = Token.DEFAULT_CHANNEL;
                state.tokenStartCharIndex = input.index();
                state.tokenStartCharPositionInLine = input.getCharPositionInLine();
                state.tokenStartLine = input.getLine();
                state.text = null;
                gLex.mFirstBodyString();
                state.type = BodyString;
                emit();
                return state.token;
            } catch (NoViableAltException nva) {
                reportError(nva);
                recover(nva); // throw out current char and try again
            } catch (RecognitionException re) {
                reportError(re); // match() routine has already called recover()
            } catch (Exception e){
			 System.out.println("Invalid character");
		  }   
        }
        return super.nextToken();
    }
}

@parser::members {
	/** Override this method to change where error messages go */
	@Override
	public void emitErrorMessage(String msg) {}

	@Override
	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		RecognitionException e = null;
		// if next token is what we are looking for then "delete" this token
		try{
		if ( mismatchIsUnwantedToken(input, ttype) ) {
			e = new UnwantedTokenException(ttype, input);
			beginResync();
			input.consume(); // simply delete extra token
			endResync();
			reportError(e); // report after consuming so AW sees the token in the exception
			// we want to return the token we're actually matching
			Object matchedSymbol = getCurrentInputSymbol(input);
			input.consume(); // move past ttype token as if all were ok
			return matchedSymbol;
		}
		} catch (Exception ee){}

		try{
		// can't recover with single token deletion, try insertion
		if ( mismatchIsMissingToken(input, follow) ) {
			Object inserted = getMissingSymbol(input, e, ttype, follow);
			e = new MissingTokenException(ttype, input, inserted);
			reportError(e); // report after inserting so AW sees the token in the exception
			return inserted;
		}
		} catch (Exception ee){} 
			// even that didn't work; must throw the exception
			e = new MismatchedTokenException(ttype, input);
			throw e;
	}
	
	@Override
	public void reportError(RecognitionException e) {
		try{
		// if we've already reported an error and have not matched a token
		// yet successfully, don't report any errors.
		if ( state.errorRecovery ) {
			return;
		}
		state.syntaxErrors++; // don't count spurious
		state.errorRecovery = true;

		//displayRecognitionError(this.getTokenNames(), e);
		} catch (Exception ee){} 
	}		
}




compilationUnit
    :   prog
    ;

prog : statement*;

statement
    : ignoreStatement
    | simpleStatement? BodyString
    | '{' statement '}' (';')? -> statement
    | bracketedBlock (';'!)?
    | classDefinition
    | complexStatement
    | simpleStatement (';'!)*
    ;

bracketedBlock
    : '{' statement* '}' -> ^(Block statement*)
    ;

classDefinition
    : classModifier? 
      CLASS className
      extendsclass? 
      classImplements?
	 '{'
      classMember*
	 '}'
      -> ^(CLASS ^(Modifiers classModifier?) className extendsclass? classImplements? classMember*)
    ;
 
className
    : UnquotedString
    ; 

extendsclass
    : Extends^ UnquotedString
    ; 
    
classImplements
    :  ignoreStatement
    ;

classMember
    : fieldModifier* FUNCTION UnquotedString parametersDefinition (bracketedBlock | ';')
        -> ^(Method ^(Modifiers fieldModifier*) UnquotedString parametersDefinition bracketedBlock?)
    | definitionAttribute
    ;
    
definitionAttribute    
    : VAR DOLLAR UnquotedString (EQUALS value)? ';' -> ^(VAR ^(DOLLAR UnquotedString) value?) 
    | CONST UnquotedString (EQUALS value)? ';' -> ^(CONST UnquotedString value?)
    | fieldModifier* (DOLLAR UnquotedString) (EQUALS value)? ';' -> ^(Field ^(Modifiers fieldModifier*) ^(DOLLAR UnquotedString) value?)
    ;
   
classModifier
    : 'abstract';
    
fieldModifier
    : AccessModifier | 'abstract' | 'static' | 'final'
    ;

value
    : 'null'
    | UnquotedString
    | atom
    ;

complexStatement
    : ifStatement
    | (FOR)=> forHeader statement -> ^(FOR forHeader statement)
    | (FOR_EACH)=> forHeader statement -> ^(FOR_EACH forHeader statement)
    | (WHILE)=> whileCondition statement -> ^(WHILE whileCondition statement)
    | DO statement whileCondition -> ^(DO statement whileCondition)
    | SWITCH '(' expression ')' '{'cases'}' -> ^(SWITCH expression cases)
    | functionDefinition
    | TRY statement catchStatement -> ^(TRY statement catchStatement)   
    ;

catchStatement
	: (CATCH)=> whileCondition statement -> ^(CATCH whileCondition statement)
	;


simpleStatement
    : GLOBAL^ name (','! name)*
    | RETURN^ expression?
    | simpleRequire
    | (ECHO | PRINT | PRINTF | DIE)=> outputFunctions   
    | (BREAK | CONTINUE | THROW | USE )=> ignoreOthers  
    | expression
    ;

simpleRequire
    : RequireOperator^ expression
    ;

ifStatement
options { backtrack = true; }
    : IF '(' expression ')' statement conditional? -> ^(IF expression statement conditional?)
    ;

conditional
    : (ELSE)=> ELSE statement -> ^(ELSE statement)
    | (ELSE_IF)=> ELSE_IF '(' expression ')' statement conditional? -> ^(IF expression statement conditional?)
    ;

forHeader
    : ignoreStatement
    ;

whileCondition
    : ignoreStatement
    ;

ignoreOthers
    : ignoreStatement
    ;

cases 
    : casestatement*  defaultcase?
    ;

casestatement
    : CASE^ expression ':'! statement*
    ;

defaultcase 
    : (DEFAULT^ ':'! statement*)
    ;

functionDefinition
    : FUNCTION UnquotedString parametersDefinition bracketedBlock -> 
        ^(FUNCTION UnquotedString parametersDefinition bracketedBlock)
    ;

parametersDefinition
    : OPEN_BRACE (paramDef (COMMA paramDef)*)? CLOSE_BRACE -> ^(Params paramDef*) 
    ;

paramDef
    : (UnquotedString | ArrayWord)? paramName (EQUALS^ atomOrReference)?
    ;

paramName
    : DOLLAR^ UnquotedString
    | AMPERSAND DOLLAR UnquotedString -> ^(AMPERSAND ^(DOLLAR UnquotedString))
    ;

outputFunctions
    : ECHO^ commaList
    | PRINT^ commaList
    | PRINTF^ '('! commaList ')'!
    | DIE^ '('! commaList ')'!
    ;

commaList
    : expression (','! expression)* 
    ;
    
expression
    : weakLogicalOr
    ;

weakLogicalOr
    : weakLogicalXor (('or'|'OR')^ weakLogicalXor)*
    ;

weakLogicalXor
    : weakLogicalAnd (('xor'|'XOR')^ weakLogicalAnd)*    
    ;
    
weakLogicalAnd
    : assignment (('and'|'AND')^ assignment)*
    ;

assignment
    : name EQUALS^ ((RequireOperator)=> simpleRequire | assignment) 
    | name ((AssignmentOperator | ConcatAssigmentOperator)^ assignment)
    | ternary
    ;

ternary
    : logicalOr QUESTION_MARK expression COLON expression -> ^(IfExpression logicalOr expression expression) 
    | logicalOr
    ;
    
logicalOr
    : logicalAnd (LOGICAL_OR^ logicalAnd)*
    ;

logicalAnd
    : bitwiseOr (LOGICAL_AND^ bitwiseOr)*
    ;
    
bitwiseOr
    : bitWiseAnd (PIPE^ bitWiseAnd)*
    ;

bitWiseAnd
    : equalityCheck (AMPERSAND^ equalityCheck)*
    ;

equalityCheck
    : comparisionCheck (EqualityOperator^ comparisionCheck)?
    ;
    
comparisionCheck
    : bitWiseShift (ComparisionOperator^ bitWiseShift)?
    ;

bitWiseShift
    : addition (ShiftOperator^ addition)*
    ;
    
addition
    : multiplication ((PLUS | MINUS | DOT)^ multiplication)*
    ;

multiplication
    : logicalNot ((ASTERISK | FORWARD_SLASH | PERCENT)^ logicalNot)*
    ;

logicalNot
    : BANG^ logicalNot (EQUALS^ logicalNot)?
    | instanceOf
    ;

instanceOf
    : negateOrCast (INSTANCE_OF^ negateOrCast)?
    ;

negateOrCast
    : (TILDE | MINUS | SUPPRESS_WARNINGS)^ increment
    | OPEN_BRACE UnquotedString CLOSE_BRACE expression -> ^(Cast UnquotedString expression)         
    | OPEN_BRACE! weakLogicalAnd CLOSE_BRACE!
    | increment
    ;

increment
    : IncrementOperator name -> ^(Prefix IncrementOperator name)
    | name IncrementOperator -> ^(Postfix IncrementOperator name)
    | newOrClone
    ;

newOrClone
    : NEW^ nameOrFunctionCall
    | CLONE^ name
    | atomOrReference
    | outputFunctions
    ;

atomOrReference
    : atom
    | reference
    ;

arrayDeclaration
    : ArrayWord OPEN_BRACE (arrayEntry (COMMA arrayEntry)*)? CLOSE_BRACE -> ^(Array arrayEntry*)
    ;

arrayEntry
    : (keyValuePair | expression)
    ;

keyValuePair
//    : (expression ARRAY_ASSIGN expression) -> ^(ARRAY_ASSIGN expression+)
    : (expression ARRAY_ASSIGN expression) -> ^(ARRAY_ASSIGN expression*)
    ;

listDefinition
    : 'list' OPEN_BRACE (atomOrReference (COMMA atomOrReference)*)? CLOSE_BRACE (EQUALS listEntry)? -> ^(List atomOrReference* (^(EQUALS listEntry))?)
    ;    

listEntry
    : expression
    | OPEN_BRACE expression (COMMA expression)* CLOSE_BRACE -> ^(ListAssign expression*)
    ;

atom: SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration | listDefinition | 'null'
    ;

reference
    : AMPERSAND^ nameOrFunctionCall
    | nameOrFunctionCall
    ;

nameOrFunctionCall
    : name OPEN_BRACE (expression (COMMA expression)*)? CLOSE_BRACE -> ^(Apply name expression*)
    | name
    ;

name
    : staticMemberAccess
    | memberAccess
    | variable
    ;
    
staticMemberAccess
    : UnquotedString '::'^ nameOrFunctionCall
    ;

memberAccess
    : arrayAccess (INSTANCE_MEMBER UnquotedString)?
	| variable INSTANCE_MEMBER arrayOrUnquotedStringOrFunctionCall -> ^(INSTANCE_MEMBER variable arrayOrUnquotedStringOrFunctionCall)
    ;

arrayOrUnquotedStringOrFunctionCall
    : arrayAccess (EQUALS^ assignment)?
    | name (EQUALS | AssignmentOperator | ConcatAssigmentOperator)^ assignment  
    | objectNameOrMethod INSTANCE_MEMBER arrayOrUnquotedStringOrFunctionCall -> ^(INSTANCE_MEMBER objectNameOrMethod arrayOrUnquotedStringOrFunctionCall)
    | nameOrFunctionCall
    ;

arrayAccess
    : variable OPEN_SQUARE_BRACE expression? CLOSE_SQUARE_BRACE ((OPEN_SQUARE_BRACE expression CLOSE_SQUARE_BRACE)*)? -> ^(OPEN_SQUARE_BRACE variable expression*)
    ;

objectNameOrMethod
	: nameOrFunctionCall
	;
  
variable
    : DOLLAR^ variable
    | UnquotedString
    ;

instanceMember
   : INSTANCE_MEMBER arrayOrUnquotedStringOrFunctionCall -> ^(INSTANCE_MEMBER arrayOrUnquotedStringOrFunctionCall)
    ;

ignoreStatement
    : PhpStatement
    ;


