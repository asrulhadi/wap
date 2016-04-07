// $ANTLR 3.4 Lex.g 2015-10-03 23:49:42

package org.homeunix.wap.php.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Php_Lex extends Lexer {
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int ABSTRACT=4;
    public static final int AMPERSAND=5;
    public static final int ARRAY_ASSIGN=6;
    public static final int ASTERISK=7;
    public static final int AccessModifier=8;
    public static final int Apply=9;
    public static final int Array=10;
    public static final int ArrayWord=11;
    public static final int AssignmentOperator=12;
    public static final int BANG=13;
    public static final int BREAK=14;
    public static final int Block=15;
    public static final int BodyString=16;
    public static final int Boolean=17;
    public static final int CASE=18;
    public static final int CATCH=19;
    public static final int CLASS=20;
    public static final int CLASS_MEMBER=21;
    public static final int CLONE=22;
    public static final int CLOSE_BRACE=23;
    public static final int CLOSE_CURLY_BRACE=24;
    public static final int CLOSE_SQUARE_BRACE=25;
    public static final int COLON=26;
    public static final int COMMA=27;
    public static final int COMMENT=28;
    public static final int CONST=29;
    public static final int CONTINUE=30;
    public static final int Cast=31;
    public static final int ComparisionOperator=32;
    public static final int ConcatAssigmentOperator=33;
    public static final int DEFAULT=34;
    public static final int DIE=35;
    public static final int DNum=36;
    public static final int DO=37;
    public static final int DOLLAR=38;
    public static final int DOT=39;
    public static final int Decimal=40;
    public static final int Digits=41;
    public static final int DoubleQuotedString=42;
    public static final int ECHO=43;
    public static final int ELSE=44;
    public static final int ELSE_IF=45;
    public static final int EQUALS=46;
    public static final int EqualityOperator=47;
    public static final int EscapeCharector=48;
    public static final int Exponent_DNum=49;
    public static final int Extends=50;
    public static final int FOR=51;
    public static final int FORWARD_SLASH=52;
    public static final int FOR_EACH=53;
    public static final int FUNCTION=54;
    public static final int Field=55;
    public static final int FirstBodyString=56;
    public static final int ForeachVar=57;
    public static final int GLOBAL=58;
    public static final int HEX_DIGIT=59;
    public static final int HereDoc=60;
    public static final int HereDocContents=61;
    public static final int Hexadecimal=62;
    public static final int IF=63;
    public static final int INSTANCE_MEMBER=64;
    public static final int INSTANCE_OF=65;
    public static final int IfExpression=66;
    public static final int IgnoreConditions=67;
    public static final int IgnoreStmContents=68;
    public static final int IgnoreStmDeclare=69;
    public static final int IgnoreStmImplements=70;
    public static final int IgnoreStmInterface=71;
    public static final int IncrementOperator=72;
    public static final int Integer=73;
    public static final int LOGICAL_AND=74;
    public static final int LOGICAL_OR=75;
    public static final int List=76;
    public static final int ListAssign=77;
    public static final int MINUS=78;
    public static final int Method=79;
    public static final int Modifiers=80;
    public static final int NEW=81;
    public static final int OCTAL_ESC=82;
    public static final int OPEN_BRACE=83;
    public static final int OPEN_CURLY_BRACE=84;
    public static final int OPEN_SQUARE_BRACE=85;
    public static final int Octal=86;
    public static final int PERCENT=87;
    public static final int PIPE=88;
    public static final int PLUS=89;
    public static final int PRINT=90;
    public static final int PRINTF=91;
    public static final int Params=92;
    public static final int PhpStatement=93;
    public static final int Postfix=94;
    public static final int Prefix=95;
    public static final int QUESTION_MARK=96;
    public static final int RETURN=97;
    public static final int Real=98;
    public static final int RequireOperator=99;
    public static final int SEMICOLON=100;
    public static final int SUPPRESS_WARNINGS=101;
    public static final int SWITCH=102;
    public static final int ShiftOperator=103;
    public static final int SingleQuotedString=104;
    public static final int THROW=105;
    public static final int TILDE=106;
    public static final int TRY=107;
    public static final int UNICODE_ESC=108;
    public static final int USE=109;
    public static final int UnquotedString=110;
    public static final int VAR=111;
    public static final int WHILE=112;
    public static final int WhiteSpace=113;
    public static final int Tokens=124;

    	/** Override this method to change where error messages go */
    	@Override
    	public void emitErrorMessage(String msg) {}


    // delegates
    // delegators
    public PhpLexer gPhp;
    public PhpLexer gParent;
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Php_Lex() {} 
    public Php_Lex(CharStream input, PhpLexer gPhp) {
        this(input, new RecognizerSharedState(), gPhp);
    }
    public Php_Lex(CharStream input, RecognizerSharedState state, PhpLexer gPhp) {
        super(input,state);
        this.gPhp = gPhp;
        gParent = gPhp;
    }
    public String getGrammarFileName() { return "Lex.g"; }

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:26:14: ( ';' )
            // Lex.g:26:16: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:27:10: ( ',' )
            // Lex.g:27:12: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "OPEN_BRACE"
    public final void mOPEN_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:28:15: ( '(' )
            // Lex.g:28:17: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_BRACE"

    // $ANTLR start "CLOSE_BRACE"
    public final void mCLOSE_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:29:16: ( ')' )
            // Lex.g:29:18: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_BRACE"

    // $ANTLR start "OPEN_SQUARE_BRACE"
    public final void mOPEN_SQUARE_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_SQUARE_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:30:22: ( '[' )
            // Lex.g:30:24: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_SQUARE_BRACE"

    // $ANTLR start "CLOSE_SQUARE_BRACE"
    public final void mCLOSE_SQUARE_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_SQUARE_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:31:23: ( ']' )
            // Lex.g:31:25: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_SQUARE_BRACE"

    // $ANTLR start "OPEN_CURLY_BRACE"
    public final void mOPEN_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:32:21: ( '{' )
            // Lex.g:32:23: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_CURLY_BRACE"

    // $ANTLR start "CLOSE_CURLY_BRACE"
    public final void mCLOSE_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:33:22: ( '}' )
            // Lex.g:33:24: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_CURLY_BRACE"

    // $ANTLR start "ARRAY_ASSIGN"
    public final void mARRAY_ASSIGN() throws RecognitionException {
        try {
            int _type = ARRAY_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:34:17: ( '=>' )
            // Lex.g:34:19: '=>'
            {
            match("=>"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARRAY_ASSIGN"

    // $ANTLR start "LOGICAL_OR"
    public final void mLOGICAL_OR() throws RecognitionException {
        try {
            int _type = LOGICAL_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:35:15: ( '||' )
            // Lex.g:35:17: '||'
            {
            match("||"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGICAL_OR"

    // $ANTLR start "LOGICAL_AND"
    public final void mLOGICAL_AND() throws RecognitionException {
        try {
            int _type = LOGICAL_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:36:16: ( '&&' )
            // Lex.g:36:18: '&&'
            {
            match("&&"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGICAL_AND"

    // $ANTLR start "CLASS_MEMBER"
    public final void mCLASS_MEMBER() throws RecognitionException {
        try {
            int _type = CLASS_MEMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:37:17: ( '::' )
            // Lex.g:37:19: '::'
            {
            match("::"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS_MEMBER"

    // $ANTLR start "INSTANCE_MEMBER"
    public final void mINSTANCE_MEMBER() throws RecognitionException {
        try {
            int _type = INSTANCE_MEMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:38:20: ( '->' )
            // Lex.g:38:22: '->'
            {
            match("->"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSTANCE_MEMBER"

    // $ANTLR start "SUPPRESS_WARNINGS"
    public final void mSUPPRESS_WARNINGS() throws RecognitionException {
        try {
            int _type = SUPPRESS_WARNINGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:39:22: ( '@' )
            // Lex.g:39:24: '@'
            {
            match('@'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUPPRESS_WARNINGS"

    // $ANTLR start "QUESTION_MARK"
    public final void mQUESTION_MARK() throws RecognitionException {
        try {
            int _type = QUESTION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:40:18: ( '?' )
            // Lex.g:40:20: '?'
            {
            match('?'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION_MARK"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:41:11: ( '$' )
            // Lex.g:41:13: '$'
            {
            match('$'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:42:10: ( ':' )
            // Lex.g:42:12: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:43:8: ( '.' )
            // Lex.g:43:10: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:44:14: ( '&' )
            // Lex.g:44:16: '&'
            {
            match('&'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:45:9: ( '|' )
            // Lex.g:45:11: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "BANG"
    public final void mBANG() throws RecognitionException {
        try {
            int _type = BANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:46:9: ( '!' )
            // Lex.g:46:11: '!'
            {
            match('!'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BANG"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:47:9: ( '+' )
            // Lex.g:47:11: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:48:10: ( '-' )
            // Lex.g:48:12: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:49:13: ( '*' )
            // Lex.g:49:15: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:50:12: ( '%' )
            // Lex.g:50:14: '%'
            {
            match('%'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "FORWARD_SLASH"
    public final void mFORWARD_SLASH() throws RecognitionException {
        try {
            int _type = FORWARD_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:51:18: ( '/' )
            // Lex.g:51:20: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FORWARD_SLASH"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:52:10: ( '~' )
            // Lex.g:52:12: '~'
            {
            match('~'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:53:11: ( '=' )
            // Lex.g:53:13: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:54:8: ( 'new' )
            // Lex.g:54:10: 'new'
            {
            match("new"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "CLONE"
    public final void mCLONE() throws RecognitionException {
        try {
            int _type = CLONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:55:10: ( 'clone' )
            // Lex.g:55:12: 'clone'
            {
            match("clone"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLONE"

    // $ANTLR start "ECHO"
    public final void mECHO() throws RecognitionException {
        try {
            int _type = ECHO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:56:9: ( 'echo' )
            // Lex.g:56:11: 'echo'
            {
            match("echo"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ECHO"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:57:10: ( 'print' )
            // Lex.g:57:12: 'print'
            {
            match("print"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "PRINTF"
    public final void mPRINTF() throws RecognitionException {
        try {
            int _type = PRINTF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:58:11: ( 'printf' )
            // Lex.g:58:13: 'printf'
            {
            match("printf"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINTF"

    // $ANTLR start "DIE"
    public final void mDIE() throws RecognitionException {
        try {
            int _type = DIE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:59:8: ( 'die' )
            // Lex.g:59:10: 'die'
            {
            match("die"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:60:7: ( 'if' )
            // Lex.g:60:9: 'if'
            {
            match("if"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:61:9: ( 'else' )
            // Lex.g:61:11: 'else'
            {
            match("else"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELSE_IF"
    public final void mELSE_IF() throws RecognitionException {
        try {
            int _type = ELSE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:62:12: ( 'elseif' )
            // Lex.g:62:14: 'elseif'
            {
            match("elseif"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE_IF"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:63:8: ( 'for' )
            // Lex.g:63:10: 'for'
            {
            match("for"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FOR_EACH"
    public final void mFOR_EACH() throws RecognitionException {
        try {
            int _type = FOR_EACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:64:13: ( 'foreach' )
            // Lex.g:64:15: 'foreach'
            {
            match("foreach"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR_EACH"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:65:10: ( 'while' )
            // Lex.g:65:12: 'while'
            {
            match("while"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:66:7: ( 'do' )
            // Lex.g:66:9: 'do'
            {
            match("do"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "SWITCH"
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:67:11: ( 'switch' )
            // Lex.g:67:13: 'switch'
            {
            match("switch"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SWITCH"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:68:9: ( 'case' )
            // Lex.g:68:11: 'case'
            {
            match("case"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:69:12: ( 'default' )
            // Lex.g:69:14: 'default'
            {
            match("default"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:70:13: ( 'function' )
            // Lex.g:70:15: 'function'
            {
            match("function"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:71:11: ( 'return' )
            // Lex.g:71:13: 'return'
            {
            match("return"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "GLOBAL"
    public final void mGLOBAL() throws RecognitionException {
        try {
            int _type = GLOBAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:72:11: ( 'global' )
            // Lex.g:72:13: 'global'
            {
            match("global"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GLOBAL"

    // $ANTLR start "INSTANCE_OF"
    public final void mINSTANCE_OF() throws RecognitionException {
        try {
            int _type = INSTANCE_OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:73:16: ( 'instanceof' )
            // Lex.g:73:18: 'instanceof'
            {
            match("instanceof"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSTANCE_OF"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:74:8: ( 'try' )
            // Lex.g:74:10: 'try'
            {
            match("try"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "CATCH"
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:75:10: ( 'catch' )
            // Lex.g:75:12: 'catch'
            {
            match("catch"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CATCH"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:76:10: ( 'class' )
            // Lex.g:76:12: 'class'
            {
            match("class"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "Extends"
    public final void mExtends() throws RecognitionException {
        try {
            int _type = Extends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:77:12: ( 'extends' )
            // Lex.g:77:14: 'extends'
            {
            match("extends"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Extends"

    // $ANTLR start "ABSTRACT"
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:78:13: ( 'abstract' )
            // Lex.g:78:15: 'abstract'
            {
            match("abstract"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABSTRACT"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:79:8: ( 'var' )
            // Lex.g:79:10: 'var'
            {
            match("var"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:80:10: ( 'const' )
            // Lex.g:80:12: 'const'
            {
            match("const"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "THROW"
    public final void mTHROW() throws RecognitionException {
        try {
            int _type = THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:81:10: ( 'throw' )
            // Lex.g:81:12: 'throw'
            {
            match("throw"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THROW"

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:82:8: ( 'use' )
            // Lex.g:82:10: 'use'
            {
            match("use"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:83:10: ( 'break' )
            // Lex.g:83:12: 'break'
            {
            match("break"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:84:13: ( 'continue' )
            // Lex.g:84:15: 'continue'
            {
            match("continue"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "BodyString"
    public final void mBodyString() throws RecognitionException {
        try {
            int _type = BodyString;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:91:5: ( '?>' ( ( '<' ~ '?' )=> '<' |~ '<' )* ( '<?' ( ( 'php' )? ) )? )
            // Lex.g:91:7: '?>' ( ( '<' ~ '?' )=> '<' |~ '<' )* ( '<?' ( ( 'php' )? ) )?
            {
            match("?>"); if (state.failed) return ;



            // Lex.g:91:12: ( ( '<' ~ '?' )=> '<' |~ '<' )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='<') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='?') ) {
                        int LA1_4 = input.LA(3);

                        if ( (synpred1_Lex()) ) {
                            alt1=1;
                        }


                    }
                    else if ( (LA1_1=='<') && (synpred1_Lex())) {
                        alt1=1;
                    }
                    else if ( ((LA1_1 >= '\u0000' && LA1_1 <= ';')||(LA1_1 >= '=' && LA1_1 <= '>')||(LA1_1 >= '@' && LA1_1 <= '\uFFFF')) && (synpred1_Lex())) {
                        alt1=1;
                    }

                    else {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= ';')||(LA1_0 >= '=' && LA1_0 <= '\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // Lex.g:91:13: ( '<' ~ '?' )=> '<'
            	    {
            	    match('<'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // Lex.g:91:33: ~ '<'
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ';')||(input.LA(1) >= '=' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // Lex.g:91:41: ( '<?' ( ( 'php' )? ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='<') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Lex.g:91:42: '<?' ( ( 'php' )? )
                    {
                    match("<?"); if (state.failed) return ;



                    // Lex.g:91:47: ( ( 'php' )? )
                    // Lex.g:91:48: ( 'php' )?
                    {
                    // Lex.g:91:48: ( 'php' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='p') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Lex.g:91:48: 'php'
                            {
                            match("php"); if (state.failed) return ;



                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BodyString"

    // $ANTLR start "FirstBodyString"
    public final void mFirstBodyString() throws RecognitionException {
        try {
            // Lex.g:96:5: ( ( ( '<' ~ '?' )=> '<' |~ '<' )* '<?' ( ( 'php' )? ) )
            // Lex.g:96:7: ( ( '<' ~ '?' )=> '<' |~ '<' )* '<?' ( ( 'php' )? )
            {
            // Lex.g:96:7: ( ( '<' ~ '?' )=> '<' |~ '<' )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='<') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='?') ) {
                        int LA4_3 = input.LA(3);

                        if ( (LA4_3=='p') ) {
                            int LA4_6 = input.LA(4);

                            if ( (LA4_6=='h') ) {
                                int LA4_8 = input.LA(5);

                                if ( (LA4_8=='p') ) {
                                    int LA4_9 = input.LA(6);

                                    if ( (LA4_9=='<') && (synpred2_Lex())) {
                                        alt4=1;
                                    }
                                    else if ( ((LA4_9 >= '\u0000' && LA4_9 <= ';')||(LA4_9 >= '=' && LA4_9 <= '\uFFFF')) && (synpred2_Lex())) {
                                        alt4=1;
                                    }


                                }
                                else if ( (LA4_8=='<') && (synpred2_Lex())) {
                                    alt4=1;
                                }
                                else if ( ((LA4_8 >= '\u0000' && LA4_8 <= ';')||(LA4_8 >= '=' && LA4_8 <= 'o')||(LA4_8 >= 'q' && LA4_8 <= '\uFFFF')) && (synpred2_Lex())) {
                                    alt4=1;
                                }


                            }
                            else if ( (LA4_6=='<') && (synpred2_Lex())) {
                                alt4=1;
                            }
                            else if ( ((LA4_6 >= '\u0000' && LA4_6 <= ';')||(LA4_6 >= '=' && LA4_6 <= 'g')||(LA4_6 >= 'i' && LA4_6 <= '\uFFFF')) && (synpred2_Lex())) {
                                alt4=1;
                            }


                        }
                        else if ( (LA4_3=='<') && (synpred2_Lex())) {
                            alt4=1;
                        }
                        else if ( ((LA4_3 >= '\u0000' && LA4_3 <= ';')||(LA4_3 >= '=' && LA4_3 <= 'o')||(LA4_3 >= 'q' && LA4_3 <= '\uFFFF')) && (synpred2_Lex())) {
                            alt4=1;
                        }


                    }
                    else if ( (LA4_1=='<') && (synpred2_Lex())) {
                        alt4=1;
                    }
                    else if ( ((LA4_1 >= '\u0000' && LA4_1 <= ';')||(LA4_1 >= '=' && LA4_1 <= '>')||(LA4_1 >= '@' && LA4_1 <= '\uFFFF')) && (synpred2_Lex())) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ';')||(LA4_0 >= '=' && LA4_0 <= '\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // Lex.g:96:8: ( '<' ~ '?' )=> '<'
            	    {
            	    match('<'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // Lex.g:96:28: ~ '<'
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ';')||(input.LA(1) >= '=' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match("<?"); if (state.failed) return ;



            // Lex.g:96:41: ( ( 'php' )? )
            // Lex.g:96:42: ( 'php' )?
            {
            // Lex.g:96:42: ( 'php' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='p') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Lex.g:96:42: 'php'
                    {
                    match("php"); if (state.failed) return ;



                    }
                    break;

            }


            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FirstBodyString"

    // $ANTLR start "PhpStatement"
    public final void mPhpStatement() throws RecognitionException {
        try {
            int _type = PhpStatement;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:100:5: ( IgnoreStmContents | ( 'break' | 'continue' | 'throw' | 'use' ) IgnoreStmContents | 'interface' IgnoreStmInterface | 'implements' IgnoreStmImplements | 'declare' IgnoreStmDeclare | ( 'catch' | 'for' | 'while' | 'foreach' ) ( ' ' )? '(' IgnoreConditions )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 'b':
            case 't':
            case 'u':
                {
                alt9=2;
                }
                break;
            case 'c':
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3=='o') ) {
                    alt9=2;
                }
                else if ( (LA9_3=='a') ) {
                    alt9=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'i':
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4=='n') ) {
                    alt9=3;
                }
                else if ( (LA9_4=='m') ) {
                    alt9=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;

                }
                }
                break;
            case 'd':
                {
                alt9=5;
                }
                break;
            case 'f':
            case 'w':
                {
                alt9=6;
                }
                break;
            default:
                alt9=1;
            }

            switch (alt9) {
                case 1 :
                    // Lex.g:100:7: IgnoreStmContents
                    {
                    mIgnoreStmContents(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // Lex.g:101:7: ( 'break' | 'continue' | 'throw' | 'use' ) IgnoreStmContents
                    {
                    // Lex.g:101:7: ( 'break' | 'continue' | 'throw' | 'use' )
                    int alt6=4;
                    switch ( input.LA(1) ) {
                    case 'b':
                        {
                        alt6=1;
                        }
                        break;
                    case 'c':
                        {
                        alt6=2;
                        }
                        break;
                    case 't':
                        {
                        alt6=3;
                        }
                        break;
                    case 'u':
                        {
                        alt6=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;

                    }

                    switch (alt6) {
                        case 1 :
                            // Lex.g:101:8: 'break'
                            {
                            match("break"); if (state.failed) return ;



                            }
                            break;
                        case 2 :
                            // Lex.g:101:18: 'continue'
                            {
                            match("continue"); if (state.failed) return ;



                            }
                            break;
                        case 3 :
                            // Lex.g:101:31: 'throw'
                            {
                            match("throw"); if (state.failed) return ;



                            }
                            break;
                        case 4 :
                            // Lex.g:101:41: 'use'
                            {
                            match("use"); if (state.failed) return ;



                            }
                            break;

                    }


                    mIgnoreStmContents(); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // Lex.g:102:7: 'interface' IgnoreStmInterface
                    {
                    match("interface"); if (state.failed) return ;



                    mIgnoreStmInterface(); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // Lex.g:103:7: 'implements' IgnoreStmImplements
                    {
                    match("implements"); if (state.failed) return ;



                    mIgnoreStmImplements(); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // Lex.g:104:7: 'declare' IgnoreStmDeclare
                    {
                    match("declare"); if (state.failed) return ;



                    mIgnoreStmDeclare(); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // Lex.g:105:7: ( 'catch' | 'for' | 'while' | 'foreach' ) ( ' ' )? '(' IgnoreConditions
                    {
                    // Lex.g:105:7: ( 'catch' | 'for' | 'while' | 'foreach' )
                    int alt7=4;
                    switch ( input.LA(1) ) {
                    case 'c':
                        {
                        alt7=1;
                        }
                        break;
                    case 'f':
                        {
                        int LA7_2 = input.LA(2);

                        if ( (LA7_2=='o') ) {
                            int LA7_4 = input.LA(3);

                            if ( (LA7_4=='r') ) {
                                int LA7_5 = input.LA(4);

                                if ( (LA7_5=='e') ) {
                                    alt7=4;
                                }
                                else if ( (LA7_5==' '||LA7_5=='(') ) {
                                    alt7=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 7, 5, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 'w':
                        {
                        alt7=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;

                    }

                    switch (alt7) {
                        case 1 :
                            // Lex.g:105:8: 'catch'
                            {
                            match("catch"); if (state.failed) return ;



                            }
                            break;
                        case 2 :
                            // Lex.g:105:18: 'for'
                            {
                            match("for"); if (state.failed) return ;



                            }
                            break;
                        case 3 :
                            // Lex.g:105:26: 'while'
                            {
                            match("while"); if (state.failed) return ;



                            }
                            break;
                        case 4 :
                            // Lex.g:105:36: 'foreach'
                            {
                            match("foreach"); if (state.failed) return ;



                            }
                            break;

                    }


                    // Lex.g:105:47: ( ' ' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==' ') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Lex.g:105:47: ' '
                            {
                            match(' '); if (state.failed) return ;

                            }
                            break;

                    }


                    match('('); if (state.failed) return ;

                    mIgnoreConditions(); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PhpStatement"

    // $ANTLR start "IgnoreStmContents"
    public final void mIgnoreStmContents() throws RecognitionException {
        try {
            // Lex.g:110:5: ()
            // Lex.g:110:7: 
            {
            if ( state.backtracking==0 ) {
                try{

            		char a = (char)input.LA(1);	
                    while(a!=';' || input.LA(1)!='\n'){
            	    a = (char)input.LA(1);
                        input.consume();
                    }
                    input.consume();
                   } catch (Exception e){}
                  }

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IgnoreStmContents"

    // $ANTLR start "IgnoreStmInterface"
    public final void mIgnoreStmInterface() throws RecognitionException {
        try {
            // Lex.g:126:5: ()
            // Lex.g:126:7: 
            {
            if ( state.backtracking==0 ) {
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

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IgnoreStmInterface"

    // $ANTLR start "IgnoreStmImplements"
    public final void mIgnoreStmImplements() throws RecognitionException {
        try {
            // Lex.g:156:5: ()
            // Lex.g:156:7: 
            {
            if ( state.backtracking==0 ) {
            	try{
            	char a;
                 while(input.LA(1)!='{')
             	    input.consume();
            	} catch (Exception e){}
                  }

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IgnoreStmImplements"

    // $ANTLR start "IgnoreStmDeclare"
    public final void mIgnoreStmDeclare() throws RecognitionException {
        try {
            // Lex.g:167:5: ()
            // Lex.g:167:7: 
            {
            if ( state.backtracking==0 ) {
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

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IgnoreStmDeclare"

    // $ANTLR start "IgnoreConditions"
    public final void mIgnoreConditions() throws RecognitionException {
        try {
            // Lex.g:201:5: ()
            // Lex.g:201:7: 
            {
            if ( state.backtracking==0 ) {
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

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IgnoreConditions"

    // $ANTLR start "RequireOperator"
    public final void mRequireOperator() throws RecognitionException {
        try {
            int _type = RequireOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:227:5: ( 'require' | 'require_once' | 'include' | 'include_once' )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='r') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='e') ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3=='q') ) {
                        int LA10_5 = input.LA(4);

                        if ( (LA10_5=='u') ) {
                            int LA10_7 = input.LA(5);

                            if ( (LA10_7=='i') ) {
                                int LA10_9 = input.LA(6);

                                if ( (LA10_9=='r') ) {
                                    int LA10_11 = input.LA(7);

                                    if ( (LA10_11=='e') ) {
                                        int LA10_13 = input.LA(8);

                                        if ( (LA10_13=='_') ) {
                                            alt10=2;
                                        }
                                        else {
                                            alt10=1;
                                        }
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 10, 11, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 10, 9, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 7, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA10_0=='i') ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2=='n') ) {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4=='c') ) {
                        int LA10_6 = input.LA(4);

                        if ( (LA10_6=='l') ) {
                            int LA10_8 = input.LA(5);

                            if ( (LA10_8=='u') ) {
                                int LA10_10 = input.LA(6);

                                if ( (LA10_10=='d') ) {
                                    int LA10_12 = input.LA(7);

                                    if ( (LA10_12=='e') ) {
                                        int LA10_14 = input.LA(8);

                                        if ( (LA10_14=='_') ) {
                                            alt10=4;
                                        }
                                        else {
                                            alt10=3;
                                        }
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 10, 12, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 10, 10, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // Lex.g:227:7: 'require'
                    {
                    match("require"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // Lex.g:227:19: 'require_once'
                    {
                    match("require_once"); if (state.failed) return ;



                    }
                    break;
                case 3 :
                    // Lex.g:227:36: 'include'
                    {
                    match("include"); if (state.failed) return ;



                    }
                    break;
                case 4 :
                    // Lex.g:227:48: 'include_once'
                    {
                    match("include_once"); if (state.failed) return ;



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RequireOperator"

    // $ANTLR start "Decimal"
    public final void mDecimal() throws RecognitionException {
        try {
            // Lex.g:232:2: ( ( '1' .. '9' ( '0' .. '9' )* ) | '0' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0 >= '1' && LA12_0 <= '9')) ) {
                alt12=1;
            }
            else if ( (LA12_0=='0') ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // Lex.g:232:3: ( '1' .. '9' ( '0' .. '9' )* )
                    {
                    // Lex.g:232:3: ( '1' .. '9' ( '0' .. '9' )* )
                    // Lex.g:232:4: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); if (state.failed) return ;

                    // Lex.g:232:13: ( '0' .. '9' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Lex.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // Lex.g:232:28: '0'
                    {
                    match('0'); if (state.failed) return ;

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Decimal"

    // $ANTLR start "Hexadecimal"
    public final void mHexadecimal() throws RecognitionException {
        try {
            // Lex.g:236:2: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // Lex.g:236:4: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('0'); if (state.failed) return ;

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Lex.g:236:18: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'F')||(LA13_0 >= 'a' && LA13_0 <= 'f')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Lex.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Hexadecimal"

    // $ANTLR start "Octal"
    public final void mOctal() throws RecognitionException {
        try {
            // Lex.g:241:2: ( '0' ( '0' .. '7' )+ )
            // Lex.g:241:4: '0' ( '0' .. '7' )+
            {
            match('0'); if (state.failed) return ;

            // Lex.g:241:7: ( '0' .. '7' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= '0' && LA14_0 <= '7')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Lex.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Octal"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:245:2: ( Octal | Decimal | Hexadecimal )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt15=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt15=1;
                    }
                    break;
                default:
                    alt15=2;
                }

            }
            else if ( ((LA15_0 >= '1' && LA15_0 <= '9')) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // Lex.g:245:3: Octal
                    {
                    mOctal(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // Lex.g:245:9: Decimal
                    {
                    mDecimal(); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // Lex.g:245:17: Hexadecimal
                    {
                    mHexadecimal(); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Integer"

    // $ANTLR start "Digits"
    public final void mDigits() throws RecognitionException {
        try {
            // Lex.g:250:2: ( ( '0' .. '9' )+ )
            // Lex.g:250:4: ( '0' .. '9' )+
            {
            // Lex.g:250:4: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Lex.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Digits"

    // $ANTLR start "DNum"
    public final void mDNum() throws RecognitionException {
        try {
            // Lex.g:255:2: ( ( ( '.' Digits )=> ( '.' Digits ) | ( Digits '.' ( Digits )? ) ) )
            // Lex.g:255:3: ( ( '.' Digits )=> ( '.' Digits ) | ( Digits '.' ( Digits )? ) )
            {
            // Lex.g:255:3: ( ( '.' Digits )=> ( '.' Digits ) | ( Digits '.' ( Digits )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='.') && (synpred3_Lex())) {
                alt18=1;
            }
            else if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // Lex.g:255:4: ( '.' Digits )=> ( '.' Digits )
                    {
                    // Lex.g:255:18: ( '.' Digits )
                    // Lex.g:255:19: '.' Digits
                    {
                    match('.'); if (state.failed) return ;

                    mDigits(); if (state.failed) return ;


                    }


                    }
                    break;
                case 2 :
                    // Lex.g:255:31: ( Digits '.' ( Digits )? )
                    {
                    // Lex.g:255:31: ( Digits '.' ( Digits )? )
                    // Lex.g:255:32: Digits '.' ( Digits )?
                    {
                    mDigits(); if (state.failed) return ;


                    match('.'); if (state.failed) return ;

                    // Lex.g:255:43: ( Digits )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // Lex.g:255:43: Digits
                            {
                            mDigits(); if (state.failed) return ;


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DNum"

    // $ANTLR start "AccessModifier"
    public final void mAccessModifier() throws RecognitionException {
        try {
            int _type = AccessModifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:260:5: ( 'public' | 'private' | 'protected' )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='p') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='u') ) {
                    alt19=1;
                }
                else if ( (LA19_1=='r') ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3=='i') ) {
                        alt19=2;
                    }
                    else if ( (LA19_3=='o') ) {
                        alt19=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // Lex.g:260:7: 'public'
                    {
                    match("public"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // Lex.g:260:18: 'private'
                    {
                    match("private"); if (state.failed) return ;



                    }
                    break;
                case 3 :
                    // Lex.g:260:30: 'protected'
                    {
                    match("protected"); if (state.failed) return ;



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AccessModifier"

    // $ANTLR start "ArrayWord"
    public final void mArrayWord() throws RecognitionException {
        try {
            int _type = ArrayWord;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:264:5: ( 'array' | 'Array' | 'ARRAY' )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='a') ) {
                alt20=1;
            }
            else if ( (LA20_0=='A') ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2=='r') ) {
                    alt20=2;
                }
                else if ( (LA20_2=='R') ) {
                    alt20=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // Lex.g:264:7: 'array'
                    {
                    match("array"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // Lex.g:264:17: 'Array'
                    {
                    match("Array"); if (state.failed) return ;



                    }
                    break;
                case 3 :
                    // Lex.g:264:27: 'ARRAY'
                    {
                    match("ARRAY"); if (state.failed) return ;



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ArrayWord"

    // $ANTLR start "Exponent_DNum"
    public final void mExponent_DNum() throws RecognitionException {
        try {
            // Lex.g:270:2: ( ( ( Digits | DNum ) ( 'e' | 'E' ) ( '+' | '-' )? Digits ) )
            // Lex.g:270:3: ( ( Digits | DNum ) ( 'e' | 'E' ) ( '+' | '-' )? Digits )
            {
            // Lex.g:270:3: ( ( Digits | DNum ) ( 'e' | 'E' ) ( '+' | '-' )? Digits )
            // Lex.g:270:4: ( Digits | DNum ) ( 'e' | 'E' ) ( '+' | '-' )? Digits
            {
            // Lex.g:270:4: ( Digits | DNum )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // Lex.g:270:5: Digits
                    {
                    mDigits(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // Lex.g:270:12: DNum
                    {
                    mDNum(); if (state.failed) return ;


                    }
                    break;

            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Lex.g:270:28: ( '+' | '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='+'||LA22_0=='-') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Lex.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            mDigits(); if (state.failed) return ;


            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent_DNum"

    // $ANTLR start "Real"
    public final void mReal() throws RecognitionException {
        try {
            int _type = Real;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:274:5: ( DNum | Exponent_DNum )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // Lex.g:274:7: DNum
                    {
                    mDNum(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // Lex.g:274:12: Exponent_DNum
                    {
                    mExponent_DNum(); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Real"

    // $ANTLR start "Boolean"
    public final void mBoolean() throws RecognitionException {
        try {
            int _type = Boolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:278:5: ( 'true' | 'false' | 'TRUE' | 'FALSE' | 'True' | 'False' )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt24=1;
                }
                break;
            case 'f':
                {
                alt24=2;
                }
                break;
            case 'T':
                {
                int LA24_3 = input.LA(2);

                if ( (LA24_3=='R') ) {
                    alt24=3;
                }
                else if ( (LA24_3=='r') ) {
                    alt24=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'F':
                {
                int LA24_4 = input.LA(2);

                if ( (LA24_4=='A') ) {
                    alt24=4;
                }
                else if ( (LA24_4=='a') ) {
                    alt24=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // Lex.g:278:7: 'true'
                    {
                    match("true"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // Lex.g:278:16: 'false'
                    {
                    match("false"); if (state.failed) return ;



                    }
                    break;
                case 3 :
                    // Lex.g:278:26: 'TRUE'
                    {
                    match("TRUE"); if (state.failed) return ;



                    }
                    break;
                case 4 :
                    // Lex.g:278:35: 'FALSE'
                    {
                    match("FALSE"); if (state.failed) return ;



                    }
                    break;
                case 5 :
                    // Lex.g:278:45: 'True'
                    {
                    match("True"); if (state.failed) return ;



                    }
                    break;
                case 6 :
                    // Lex.g:278:54: 'False'
                    {
                    match("False"); if (state.failed) return ;



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Boolean"

    // $ANTLR start "SingleQuotedString"
    public final void mSingleQuotedString() throws RecognitionException {
        try {
            int _type = SingleQuotedString;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:282:5: ( '\\'' ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' |~ ( '\\'' | '\\\\' ) )* '\\'' )
            // Lex.g:282:7: '\\'' ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' |~ ( '\\'' | '\\\\' ) )* '\\''
            {
            match('\''); if (state.failed) return ;

            // Lex.g:282:12: ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' |~ ( '\\'' | '\\\\' ) )*
            loop25:
            do {
                int alt25=5;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\\') ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2=='\'') ) {
                        int LA25_4 = input.LA(3);

                        if ( (LA25_4=='\'') && (synpred4_Lex())) {
                            alt25=1;
                        }
                        else if ( (LA25_4=='\\') && (synpred4_Lex())) {
                            alt25=1;
                        }
                        else if ( ((LA25_4 >= '\u0000' && LA25_4 <= '&')||(LA25_4 >= '(' && LA25_4 <= '[')||(LA25_4 >= ']' && LA25_4 <= '\uFFFF')) && (synpred4_Lex())) {
                            alt25=1;
                        }

                        else {
                            alt25=3;
                        }


                    }
                    else if ( (LA25_2=='\\') ) {
                        int LA25_5 = input.LA(3);

                        if ( (synpred5_Lex()) ) {
                            alt25=2;
                        }
                        else if ( (true) ) {
                            alt25=3;
                        }


                    }
                    else if ( ((LA25_2 >= '\u0000' && LA25_2 <= '&')||(LA25_2 >= '(' && LA25_2 <= '[')||(LA25_2 >= ']' && LA25_2 <= '\uFFFF')) ) {
                        alt25=3;
                    }


                }
                else if ( ((LA25_0 >= '\u0000' && LA25_0 <= '&')||(LA25_0 >= '(' && LA25_0 <= '[')||(LA25_0 >= ']' && LA25_0 <= '\uFFFF')) ) {
                    alt25=4;
                }


                switch (alt25) {
            	case 1 :
            	    // Lex.g:282:13: ( '\\\\' '\\'' )=> '\\\\' '\\''
            	    {
            	    match('\\'); if (state.failed) return ;

            	    match('\''); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // Lex.g:283:15: ( '\\\\' '\\\\' )=> '\\\\' '\\\\'
            	    {
            	    match('\\'); if (state.failed) return ;

            	    match('\\'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // Lex.g:284:15: '\\\\'
            	    {
            	    match('\\'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // Lex.g:284:22: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SingleQuotedString"

    // $ANTLR start "EscapeCharector"
    public final void mEscapeCharector() throws RecognitionException {
        try {
            // Lex.g:289:5: ( 'n' | 'r' | 't' | '\\\\' | '$' | '\"' | Digits | 'x' | UNICODE_ESC | OCTAL_ESC )
            int alt26=10;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt26=1;
                }
                break;
            case 'r':
                {
                alt26=2;
                }
                break;
            case 't':
                {
                alt26=3;
                }
                break;
            case '\\':
                {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt26=9;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt26=10;
                    }
                    break;
                default:
                    alt26=4;
                }

                }
                break;
            case '$':
                {
                alt26=5;
                }
                break;
            case '\"':
                {
                alt26=6;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt26=7;
                }
                break;
            case 'x':
                {
                alt26=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // Lex.g:289:7: 'n'
                    {
                    match('n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Lex.g:289:13: 'r'
                    {
                    match('r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Lex.g:289:19: 't'
                    {
                    match('t'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Lex.g:289:25: '\\\\'
                    {
                    match('\\'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // Lex.g:289:32: '$'
                    {
                    match('$'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // Lex.g:289:38: '\"'
                    {
                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // Lex.g:289:44: Digits
                    {
                    mDigits(); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // Lex.g:289:53: 'x'
                    {
                    match('x'); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // Lex.g:290:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // Lex.g:291:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); if (state.failed) return ;


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EscapeCharector"

    // $ANTLR start "DoubleQuotedString"
    public final void mDoubleQuotedString() throws RecognitionException {
        try {
            int _type = DoubleQuotedString;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:295:5: ( '\"' ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' |~ ( '\\\\' | '\"' ) )* '\"' )
            // Lex.g:295:7: '\"' ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // Lex.g:295:12: ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' |~ ( '\\\\' | '\"' ) )*
            loop27:
            do {
                int alt27=4;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='\\') ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2=='n') ) {
                        int LA27_4 = input.LA(3);

                        if ( (synpred6_Lex()) ) {
                            alt27=1;
                        }
                        else if ( (true) ) {
                            alt27=2;
                        }


                    }
                    else if ( (LA27_2=='r') ) {
                        int LA27_5 = input.LA(3);

                        if ( (synpred6_Lex()) ) {
                            alt27=1;
                        }
                        else if ( (true) ) {
                            alt27=2;
                        }


                    }
                    else if ( (LA27_2=='t') ) {
                        int LA27_6 = input.LA(3);

                        if ( (synpred6_Lex()) ) {
                            alt27=1;
                        }
                        else if ( (true) ) {
                            alt27=2;
                        }


                    }
                    else if ( (LA27_2=='\\') ) {
                        int LA27_7 = input.LA(3);

                        if ( (synpred6_Lex()) ) {
                            alt27=1;
                        }
                        else if ( (true) ) {
                            alt27=2;
                        }


                    }
                    else if ( (LA27_2=='$') ) {
                        int LA27_8 = input.LA(3);

                        if ( (synpred6_Lex()) ) {
                            alt27=1;
                        }
                        else if ( (true) ) {
                            alt27=2;
                        }


                    }
                    else if ( (LA27_2=='\"') ) {
                        int LA27_9 = input.LA(3);

                        if ( (LA27_9=='\"') && (synpred6_Lex())) {
                            alt27=1;
                        }
                        else if ( (LA27_9=='\\') && (synpred6_Lex())) {
                            alt27=1;
                        }
                        else if ( ((LA27_9 >= '\u0000' && LA27_9 <= '!')||(LA27_9 >= '#' && LA27_9 <= '[')||(LA27_9 >= ']' && LA27_9 <= '\uFFFF')) && (synpred6_Lex())) {
                            alt27=1;
                        }

                        else {
                            alt27=2;
                        }


                    }
                    else if ( ((LA27_2 >= '0' && LA27_2 <= '9')) ) {
                        int LA27_10 = input.LA(3);

                        if ( (synpred6_Lex()) ) {
                            alt27=1;
                        }
                        else if ( (true) ) {
                            alt27=2;
                        }


                    }
                    else if ( (LA27_2=='x') ) {
                        int LA27_11 = input.LA(3);

                        if ( (synpred6_Lex()) ) {
                            alt27=1;
                        }
                        else if ( (true) ) {
                            alt27=2;
                        }


                    }
                    else if ( ((LA27_2 >= '\u0000' && LA27_2 <= '!')||LA27_2=='#'||(LA27_2 >= '%' && LA27_2 <= '/')||(LA27_2 >= ':' && LA27_2 <= '[')||(LA27_2 >= ']' && LA27_2 <= 'm')||(LA27_2 >= 'o' && LA27_2 <= 'q')||LA27_2=='s'||(LA27_2 >= 'u' && LA27_2 <= 'w')||(LA27_2 >= 'y' && LA27_2 <= '\uFFFF')) ) {
                        alt27=2;
                    }


                }
                else if ( ((LA27_0 >= '\u0000' && LA27_0 <= '!')||(LA27_0 >= '#' && LA27_0 <= '[')||(LA27_0 >= ']' && LA27_0 <= '\uFFFF')) ) {
                    alt27=3;
                }


                switch (alt27) {
            	case 1 :
            	    // Lex.g:295:14: ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector
            	    {
            	    match('\\'); if (state.failed) return ;

            	    mEscapeCharector(); if (state.failed) return ;


            	    }
            	    break;
            	case 2 :
            	    // Lex.g:296:7: '\\\\'
            	    {
            	    match('\\'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // Lex.g:297:7: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DoubleQuotedString"

    // $ANTLR start "HereDoc"
    public final void mHereDoc() throws RecognitionException {
        try {
            int _type = HereDoc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:301:5: ( '<<<' HereDocContents )
            // Lex.g:301:7: '<<<' HereDocContents
            {
            match("<<<"); if (state.failed) return ;



            mHereDocContents(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HereDoc"

    // $ANTLR start "UnquotedString"
    public final void mUnquotedString() throws RecognitionException {
        try {
            int _type = UnquotedString;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:305:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Lex.g:305:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Lex.g:305:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0 >= '0' && LA28_0 <= '9')||(LA28_0 >= 'A' && LA28_0 <= 'Z')||LA28_0=='_'||(LA28_0 >= 'a' && LA28_0 <= 'z')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Lex.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UnquotedString"

    // $ANTLR start "HereDocContents"
    public final void mHereDocContents() throws RecognitionException {
        try {
            // Lex.g:310:5: ()
            // Lex.g:310:7: 
            {
            if ( state.backtracking==0 ) {   
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

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HereDocContents"

    // $ANTLR start "AssignmentOperator"
    public final void mAssignmentOperator() throws RecognitionException {
        try {
            int _type = AssignmentOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:345:5: ( '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
            int alt29=10;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt29=1;
                }
                break;
            case '-':
                {
                alt29=2;
                }
                break;
            case '*':
                {
                alt29=3;
                }
                break;
            case '/':
                {
                alt29=4;
                }
                break;
            case '%':
                {
                alt29=5;
                }
                break;
            case '&':
                {
                alt29=6;
                }
                break;
            case '|':
                {
                alt29=7;
                }
                break;
            case '^':
                {
                alt29=8;
                }
                break;
            case '<':
                {
                alt29=9;
                }
                break;
            case '>':
                {
                alt29=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // Lex.g:345:7: '+='
                    {
                    match("+="); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // Lex.g:345:14: '-='
                    {
                    match("-="); if (state.failed) return ;



                    }
                    break;
                case 3 :
                    // Lex.g:345:21: '*='
                    {
                    match("*="); if (state.failed) return ;



                    }
                    break;
                case 4 :
                    // Lex.g:345:28: '/='
                    {
                    match("/="); if (state.failed) return ;



                    }
                    break;
                case 5 :
                    // Lex.g:345:35: '%='
                    {
                    match("%="); if (state.failed) return ;



                    }
                    break;
                case 6 :
                    // Lex.g:345:42: '&='
                    {
                    match("&="); if (state.failed) return ;



                    }
                    break;
                case 7 :
                    // Lex.g:345:49: '|='
                    {
                    match("|="); if (state.failed) return ;



                    }
                    break;
                case 8 :
                    // Lex.g:345:56: '^='
                    {
                    match("^="); if (state.failed) return ;



                    }
                    break;
                case 9 :
                    // Lex.g:345:63: '<<='
                    {
                    match("<<="); if (state.failed) return ;



                    }
                    break;
                case 10 :
                    // Lex.g:345:71: '>>='
                    {
                    match(">>="); if (state.failed) return ;



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AssignmentOperator"

    // $ANTLR start "ConcatAssigmentOperator"
    public final void mConcatAssigmentOperator() throws RecognitionException {
        try {
            int _type = ConcatAssigmentOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:349:5: ( '.=' )
            // Lex.g:349:7: '.='
            {
            match(".="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ConcatAssigmentOperator"

    // $ANTLR start "EqualityOperator"
    public final void mEqualityOperator() throws RecognitionException {
        try {
            int _type = EqualityOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:353:5: ( '==' | '!=' | '===' | '!==' )
            int alt30=4;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='=') ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1=='=') ) {
                    int LA30_3 = input.LA(3);

                    if ( (LA30_3=='=') ) {
                        alt30=3;
                    }
                    else {
                        alt30=1;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA30_0=='!') ) {
                int LA30_2 = input.LA(2);

                if ( (LA30_2=='=') ) {
                    int LA30_4 = input.LA(3);

                    if ( (LA30_4=='=') ) {
                        alt30=4;
                    }
                    else {
                        alt30=2;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // Lex.g:353:7: '=='
                    {
                    match("=="); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // Lex.g:353:14: '!='
                    {
                    match("!="); if (state.failed) return ;



                    }
                    break;
                case 3 :
                    // Lex.g:353:21: '==='
                    {
                    match("==="); if (state.failed) return ;



                    }
                    break;
                case 4 :
                    // Lex.g:353:29: '!=='
                    {
                    match("!=="); if (state.failed) return ;



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EqualityOperator"

    // $ANTLR start "ComparisionOperator"
    public final void mComparisionOperator() throws RecognitionException {
        try {
            int _type = ComparisionOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:357:5: ( '<' | '<=' | '>' | '>=' | '<>' )
            int alt31=5;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='<') ) {
                switch ( input.LA(2) ) {
                case '=':
                    {
                    alt31=2;
                    }
                    break;
                case '>':
                    {
                    alt31=5;
                    }
                    break;
                default:
                    alt31=1;
                }

            }
            else if ( (LA31_0=='>') ) {
                int LA31_2 = input.LA(2);

                if ( (LA31_2=='=') ) {
                    alt31=4;
                }
                else {
                    alt31=3;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // Lex.g:357:7: '<'
                    {
                    match('<'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Lex.g:357:13: '<='
                    {
                    match("<="); if (state.failed) return ;



                    }
                    break;
                case 3 :
                    // Lex.g:357:20: '>'
                    {
                    match('>'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Lex.g:357:26: '>='
                    {
                    match(">="); if (state.failed) return ;



                    }
                    break;
                case 5 :
                    // Lex.g:357:33: '<>'
                    {
                    match("<>"); if (state.failed) return ;



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ComparisionOperator"

    // $ANTLR start "ShiftOperator"
    public final void mShiftOperator() throws RecognitionException {
        try {
            int _type = ShiftOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:361:5: ( '<<' | '>>' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='<') ) {
                alt32=1;
            }
            else if ( (LA32_0=='>') ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // Lex.g:361:7: '<<'
                    {
                    match("<<"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // Lex.g:361:14: '>>'
                    {
                    match(">>"); if (state.failed) return ;



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ShiftOperator"

    // $ANTLR start "IncrementOperator"
    public final void mIncrementOperator() throws RecognitionException {
        try {
            int _type = IncrementOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:365:5: ( '--' | '++' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='-') ) {
                alt33=1;
            }
            else if ( (LA33_0=='+') ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // Lex.g:365:7: '--'
                    {
                    match("--"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // Lex.g:365:14: '++'
                    {
                    match("++"); if (state.failed) return ;



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IncrementOperator"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // Lex.g:370:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\\') ) {
                int LA34_1 = input.LA(2);

                if ( ((LA34_1 >= '0' && LA34_1 <= '3')) ) {
                    int LA34_2 = input.LA(3);

                    if ( ((LA34_2 >= '0' && LA34_2 <= '7')) ) {
                        int LA34_4 = input.LA(4);

                        if ( ((LA34_4 >= '0' && LA34_4 <= '7')) ) {
                            alt34=1;
                        }
                        else {
                            alt34=2;
                        }
                    }
                    else {
                        alt34=3;
                    }
                }
                else if ( ((LA34_1 >= '4' && LA34_1 <= '7')) ) {
                    int LA34_3 = input.LA(3);

                    if ( ((LA34_3 >= '0' && LA34_3 <= '7')) ) {
                        alt34=2;
                    }
                    else {
                        alt34=3;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // Lex.g:370:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // Lex.g:371:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // Lex.g:372:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // Lex.g:376:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // Lex.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // Lex.g:380:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // Lex.g:380:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); if (state.failed) return ;

            match('u'); if (state.failed) return ;

            mHEX_DIGIT(); if (state.failed) return ;


            mHEX_DIGIT(); if (state.failed) return ;


            mHEX_DIGIT(); if (state.failed) return ;


            mHEX_DIGIT(); if (state.failed) return ;


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:384:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' | '#' ( ( '?' ~ '>' )=> '?' |~ ( '\\n' | '?' ) )* )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='/') ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1=='/') ) {
                    alt39=1;
                }
                else if ( (LA39_1=='*') ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA39_0=='#') ) {
                alt39=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // Lex.g:384:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); if (state.failed) return ;



                    // Lex.g:384:14: (~ ( '\\n' | '\\r' ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0 >= '\u0000' && LA35_0 <= '\t')||(LA35_0 >= '\u000B' && LA35_0 <= '\f')||(LA35_0 >= '\u000E' && LA35_0 <= '\uFFFF')) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // Lex.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    // Lex.g:384:28: ( '\\r' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='\r') ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // Lex.g:384:28: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }


                    match('\n'); if (state.failed) return ;

                    if ( state.backtracking==0 ) {_channel=HIDDEN;}

                    }
                    break;
                case 2 :
                    // Lex.g:385:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); if (state.failed) return ;



                    // Lex.g:385:14: ( options {greedy=false; } : . )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0=='*') ) {
                            int LA37_1 = input.LA(2);

                            if ( (LA37_1=='/') ) {
                                alt37=2;
                            }
                            else if ( ((LA37_1 >= '\u0000' && LA37_1 <= '.')||(LA37_1 >= '0' && LA37_1 <= '\uFFFF')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\u0000' && LA37_0 <= ')')||(LA37_0 >= '+' && LA37_0 <= '\uFFFF')) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // Lex.g:385:42: .
                    	    {
                    	    matchAny(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    match("*/"); if (state.failed) return ;



                    if ( state.backtracking==0 ) {_channel=HIDDEN;}

                    }
                    break;
                case 3 :
                    // Lex.g:386:7: '#' ( ( '?' ~ '>' )=> '?' |~ ( '\\n' | '?' ) )*
                    {
                    match('#'); if (state.failed) return ;

                    // Lex.g:386:11: ( ( '?' ~ '>' )=> '?' |~ ( '\\n' | '?' ) )*
                    loop38:
                    do {
                        int alt38=3;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0=='?') && (synpred7_Lex())) {
                            alt38=1;
                        }
                        else if ( ((LA38_0 >= '\u0000' && LA38_0 <= '\t')||(LA38_0 >= '\u000B' && LA38_0 <= '>')||(LA38_0 >= '@' && LA38_0 <= '\uFFFF')) ) {
                            alt38=2;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // Lex.g:386:12: ( '?' ~ '>' )=> '?'
                    	    {
                    	    match('?'); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // Lex.g:386:30: ~ ( '\\n' | '?' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '>')||(input.LA(1) >= '@' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {_channel=HIDDEN;}

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WhiteSpace"
    public final void mWhiteSpace() throws RecognitionException {
        try {
            int _type = WhiteSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;

                _channel=HIDDEN;

            // Lex.g:393:2: ( ( ' ' | '\\t' | '\\n' | '\\r' )* )
            // Lex.g:393:4: ( ' ' | '\\t' | '\\n' | '\\r' )*
            {
            // Lex.g:393:4: ( ' ' | '\\t' | '\\n' | '\\r' )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0 >= '\t' && LA40_0 <= '\n')||LA40_0=='\r'||LA40_0==' ') ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // Lex.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WhiteSpace"

    public void mTokens() throws RecognitionException {
        // Lex.g:1:8: ( SEMICOLON | COMMA | OPEN_BRACE | CLOSE_BRACE | OPEN_SQUARE_BRACE | CLOSE_SQUARE_BRACE | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | ARRAY_ASSIGN | LOGICAL_OR | LOGICAL_AND | CLASS_MEMBER | INSTANCE_MEMBER | SUPPRESS_WARNINGS | QUESTION_MARK | DOLLAR | COLON | DOT | AMPERSAND | PIPE | BANG | PLUS | MINUS | ASTERISK | PERCENT | FORWARD_SLASH | TILDE | EQUALS | NEW | CLONE | ECHO | PRINT | PRINTF | DIE | IF | ELSE | ELSE_IF | FOR | FOR_EACH | WHILE | DO | SWITCH | CASE | DEFAULT | FUNCTION | RETURN | GLOBAL | INSTANCE_OF | TRY | CATCH | CLASS | Extends | ABSTRACT | VAR | CONST | THROW | USE | BREAK | CONTINUE | BodyString | PhpStatement | RequireOperator | Integer | AccessModifier | ArrayWord | Real | Boolean | SingleQuotedString | DoubleQuotedString | HereDoc | UnquotedString | AssignmentOperator | ConcatAssigmentOperator | EqualityOperator | ComparisionOperator | ShiftOperator | IncrementOperator | COMMENT | WhiteSpace )
        int alt41=79;
        alt41 = dfa41.predict(input);
        switch (alt41) {
            case 1 :
                // Lex.g:1:10: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;


                }
                break;
            case 2 :
                // Lex.g:1:20: COMMA
                {
                mCOMMA(); if (state.failed) return ;


                }
                break;
            case 3 :
                // Lex.g:1:26: OPEN_BRACE
                {
                mOPEN_BRACE(); if (state.failed) return ;


                }
                break;
            case 4 :
                // Lex.g:1:37: CLOSE_BRACE
                {
                mCLOSE_BRACE(); if (state.failed) return ;


                }
                break;
            case 5 :
                // Lex.g:1:49: OPEN_SQUARE_BRACE
                {
                mOPEN_SQUARE_BRACE(); if (state.failed) return ;


                }
                break;
            case 6 :
                // Lex.g:1:67: CLOSE_SQUARE_BRACE
                {
                mCLOSE_SQUARE_BRACE(); if (state.failed) return ;


                }
                break;
            case 7 :
                // Lex.g:1:86: OPEN_CURLY_BRACE
                {
                mOPEN_CURLY_BRACE(); if (state.failed) return ;


                }
                break;
            case 8 :
                // Lex.g:1:103: CLOSE_CURLY_BRACE
                {
                mCLOSE_CURLY_BRACE(); if (state.failed) return ;


                }
                break;
            case 9 :
                // Lex.g:1:121: ARRAY_ASSIGN
                {
                mARRAY_ASSIGN(); if (state.failed) return ;


                }
                break;
            case 10 :
                // Lex.g:1:134: LOGICAL_OR
                {
                mLOGICAL_OR(); if (state.failed) return ;


                }
                break;
            case 11 :
                // Lex.g:1:145: LOGICAL_AND
                {
                mLOGICAL_AND(); if (state.failed) return ;


                }
                break;
            case 12 :
                // Lex.g:1:157: CLASS_MEMBER
                {
                mCLASS_MEMBER(); if (state.failed) return ;


                }
                break;
            case 13 :
                // Lex.g:1:170: INSTANCE_MEMBER
                {
                mINSTANCE_MEMBER(); if (state.failed) return ;


                }
                break;
            case 14 :
                // Lex.g:1:186: SUPPRESS_WARNINGS
                {
                mSUPPRESS_WARNINGS(); if (state.failed) return ;


                }
                break;
            case 15 :
                // Lex.g:1:204: QUESTION_MARK
                {
                mQUESTION_MARK(); if (state.failed) return ;


                }
                break;
            case 16 :
                // Lex.g:1:218: DOLLAR
                {
                mDOLLAR(); if (state.failed) return ;


                }
                break;
            case 17 :
                // Lex.g:1:225: COLON
                {
                mCOLON(); if (state.failed) return ;


                }
                break;
            case 18 :
                // Lex.g:1:231: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;
            case 19 :
                // Lex.g:1:235: AMPERSAND
                {
                mAMPERSAND(); if (state.failed) return ;


                }
                break;
            case 20 :
                // Lex.g:1:245: PIPE
                {
                mPIPE(); if (state.failed) return ;


                }
                break;
            case 21 :
                // Lex.g:1:250: BANG
                {
                mBANG(); if (state.failed) return ;


                }
                break;
            case 22 :
                // Lex.g:1:255: PLUS
                {
                mPLUS(); if (state.failed) return ;


                }
                break;
            case 23 :
                // Lex.g:1:260: MINUS
                {
                mMINUS(); if (state.failed) return ;


                }
                break;
            case 24 :
                // Lex.g:1:266: ASTERISK
                {
                mASTERISK(); if (state.failed) return ;


                }
                break;
            case 25 :
                // Lex.g:1:275: PERCENT
                {
                mPERCENT(); if (state.failed) return ;


                }
                break;
            case 26 :
                // Lex.g:1:283: FORWARD_SLASH
                {
                mFORWARD_SLASH(); if (state.failed) return ;


                }
                break;
            case 27 :
                // Lex.g:1:297: TILDE
                {
                mTILDE(); if (state.failed) return ;


                }
                break;
            case 28 :
                // Lex.g:1:303: EQUALS
                {
                mEQUALS(); if (state.failed) return ;


                }
                break;
            case 29 :
                // Lex.g:1:310: NEW
                {
                mNEW(); if (state.failed) return ;


                }
                break;
            case 30 :
                // Lex.g:1:314: CLONE
                {
                mCLONE(); if (state.failed) return ;


                }
                break;
            case 31 :
                // Lex.g:1:320: ECHO
                {
                mECHO(); if (state.failed) return ;


                }
                break;
            case 32 :
                // Lex.g:1:325: PRINT
                {
                mPRINT(); if (state.failed) return ;


                }
                break;
            case 33 :
                // Lex.g:1:331: PRINTF
                {
                mPRINTF(); if (state.failed) return ;


                }
                break;
            case 34 :
                // Lex.g:1:338: DIE
                {
                mDIE(); if (state.failed) return ;


                }
                break;
            case 35 :
                // Lex.g:1:342: IF
                {
                mIF(); if (state.failed) return ;


                }
                break;
            case 36 :
                // Lex.g:1:345: ELSE
                {
                mELSE(); if (state.failed) return ;


                }
                break;
            case 37 :
                // Lex.g:1:350: ELSE_IF
                {
                mELSE_IF(); if (state.failed) return ;


                }
                break;
            case 38 :
                // Lex.g:1:358: FOR
                {
                mFOR(); if (state.failed) return ;


                }
                break;
            case 39 :
                // Lex.g:1:362: FOR_EACH
                {
                mFOR_EACH(); if (state.failed) return ;


                }
                break;
            case 40 :
                // Lex.g:1:371: WHILE
                {
                mWHILE(); if (state.failed) return ;


                }
                break;
            case 41 :
                // Lex.g:1:377: DO
                {
                mDO(); if (state.failed) return ;


                }
                break;
            case 42 :
                // Lex.g:1:380: SWITCH
                {
                mSWITCH(); if (state.failed) return ;


                }
                break;
            case 43 :
                // Lex.g:1:387: CASE
                {
                mCASE(); if (state.failed) return ;


                }
                break;
            case 44 :
                // Lex.g:1:392: DEFAULT
                {
                mDEFAULT(); if (state.failed) return ;


                }
                break;
            case 45 :
                // Lex.g:1:400: FUNCTION
                {
                mFUNCTION(); if (state.failed) return ;


                }
                break;
            case 46 :
                // Lex.g:1:409: RETURN
                {
                mRETURN(); if (state.failed) return ;


                }
                break;
            case 47 :
                // Lex.g:1:416: GLOBAL
                {
                mGLOBAL(); if (state.failed) return ;


                }
                break;
            case 48 :
                // Lex.g:1:423: INSTANCE_OF
                {
                mINSTANCE_OF(); if (state.failed) return ;


                }
                break;
            case 49 :
                // Lex.g:1:435: TRY
                {
                mTRY(); if (state.failed) return ;


                }
                break;
            case 50 :
                // Lex.g:1:439: CATCH
                {
                mCATCH(); if (state.failed) return ;


                }
                break;
            case 51 :
                // Lex.g:1:445: CLASS
                {
                mCLASS(); if (state.failed) return ;


                }
                break;
            case 52 :
                // Lex.g:1:451: Extends
                {
                mExtends(); if (state.failed) return ;


                }
                break;
            case 53 :
                // Lex.g:1:459: ABSTRACT
                {
                mABSTRACT(); if (state.failed) return ;


                }
                break;
            case 54 :
                // Lex.g:1:468: VAR
                {
                mVAR(); if (state.failed) return ;


                }
                break;
            case 55 :
                // Lex.g:1:472: CONST
                {
                mCONST(); if (state.failed) return ;


                }
                break;
            case 56 :
                // Lex.g:1:478: THROW
                {
                mTHROW(); if (state.failed) return ;


                }
                break;
            case 57 :
                // Lex.g:1:484: USE
                {
                mUSE(); if (state.failed) return ;


                }
                break;
            case 58 :
                // Lex.g:1:488: BREAK
                {
                mBREAK(); if (state.failed) return ;


                }
                break;
            case 59 :
                // Lex.g:1:494: CONTINUE
                {
                mCONTINUE(); if (state.failed) return ;


                }
                break;
            case 60 :
                // Lex.g:1:503: BodyString
                {
                mBodyString(); if (state.failed) return ;


                }
                break;
            case 61 :
                // Lex.g:1:514: PhpStatement
                {
                mPhpStatement(); if (state.failed) return ;


                }
                break;
            case 62 :
                // Lex.g:1:527: RequireOperator
                {
                mRequireOperator(); if (state.failed) return ;


                }
                break;
            case 63 :
                // Lex.g:1:543: Integer
                {
                mInteger(); if (state.failed) return ;


                }
                break;
            case 64 :
                // Lex.g:1:551: AccessModifier
                {
                mAccessModifier(); if (state.failed) return ;


                }
                break;
            case 65 :
                // Lex.g:1:566: ArrayWord
                {
                mArrayWord(); if (state.failed) return ;


                }
                break;
            case 66 :
                // Lex.g:1:576: Real
                {
                mReal(); if (state.failed) return ;


                }
                break;
            case 67 :
                // Lex.g:1:581: Boolean
                {
                mBoolean(); if (state.failed) return ;


                }
                break;
            case 68 :
                // Lex.g:1:589: SingleQuotedString
                {
                mSingleQuotedString(); if (state.failed) return ;


                }
                break;
            case 69 :
                // Lex.g:1:608: DoubleQuotedString
                {
                mDoubleQuotedString(); if (state.failed) return ;


                }
                break;
            case 70 :
                // Lex.g:1:627: HereDoc
                {
                mHereDoc(); if (state.failed) return ;


                }
                break;
            case 71 :
                // Lex.g:1:635: UnquotedString
                {
                mUnquotedString(); if (state.failed) return ;


                }
                break;
            case 72 :
                // Lex.g:1:650: AssignmentOperator
                {
                mAssignmentOperator(); if (state.failed) return ;


                }
                break;
            case 73 :
                // Lex.g:1:669: ConcatAssigmentOperator
                {
                mConcatAssigmentOperator(); if (state.failed) return ;


                }
                break;
            case 74 :
                // Lex.g:1:693: EqualityOperator
                {
                mEqualityOperator(); if (state.failed) return ;


                }
                break;
            case 75 :
                // Lex.g:1:710: ComparisionOperator
                {
                mComparisionOperator(); if (state.failed) return ;


                }
                break;
            case 76 :
                // Lex.g:1:730: ShiftOperator
                {
                mShiftOperator(); if (state.failed) return ;


                }
                break;
            case 77 :
                // Lex.g:1:744: IncrementOperator
                {
                mIncrementOperator(); if (state.failed) return ;


                }
                break;
            case 78 :
                // Lex.g:1:762: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;


                }
                break;
            case 79 :
                // Lex.g:1:770: WhiteSpace
                {
                mWhiteSpace(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_Lex
    public final void synpred1_Lex_fragment() throws RecognitionException {
        // Lex.g:91:13: ( '<' ~ '?' )
        // Lex.g:91:14: '<' ~ '?'
        {
        match('<'); if (state.failed) return ;

        if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '>')||(input.LA(1) >= '@' && input.LA(1) <= '\uFFFF') ) {
            input.consume();
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred1_Lex

    // $ANTLR start synpred2_Lex
    public final void synpred2_Lex_fragment() throws RecognitionException {
        // Lex.g:96:8: ( '<' ~ '?' )
        // Lex.g:96:9: '<' ~ '?'
        {
        match('<'); if (state.failed) return ;

        if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '>')||(input.LA(1) >= '@' && input.LA(1) <= '\uFFFF') ) {
            input.consume();
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred2_Lex

    // $ANTLR start synpred3_Lex
    public final void synpred3_Lex_fragment() throws RecognitionException {
        // Lex.g:255:4: ( '.' Digits )
        // Lex.g:255:5: '.' Digits
        {
        match('.'); if (state.failed) return ;

        mDigits(); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred3_Lex

    // $ANTLR start synpred4_Lex
    public final void synpred4_Lex_fragment() throws RecognitionException {
        // Lex.g:282:13: ( '\\\\' '\\'' )
        // Lex.g:282:14: '\\\\' '\\''
        {
        match('\\'); if (state.failed) return ;

        match('\''); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Lex

    // $ANTLR start synpred5_Lex
    public final void synpred5_Lex_fragment() throws RecognitionException {
        // Lex.g:283:15: ( '\\\\' '\\\\' )
        // Lex.g:283:16: '\\\\' '\\\\'
        {
        match('\\'); if (state.failed) return ;

        match('\\'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Lex

    // $ANTLR start synpred6_Lex
    public final void synpred6_Lex_fragment() throws RecognitionException {
        // Lex.g:295:14: ( '\\\\' EscapeCharector )
        // Lex.g:295:15: '\\\\' EscapeCharector
        {
        match('\\'); if (state.failed) return ;

        mEscapeCharector(); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred6_Lex

    // $ANTLR start synpred7_Lex
    public final void synpred7_Lex_fragment() throws RecognitionException {
        // Lex.g:386:12: ( '?' ~ '>' )
        // Lex.g:386:13: '?' ~ '>'
        {
        match('?'); if (state.failed) return ;

        if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '=')||(input.LA(1) >= '?' && input.LA(1) <= '\uFFFF') ) {
            input.consume();
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred7_Lex

    public final boolean synpred1_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Lex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Lex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA21_eotS =
        "\4\uffff";
    static final String DFA21_eofS =
        "\4\uffff";
    static final String DFA21_minS =
        "\2\56\2\uffff";
    static final String DFA21_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA21_specialS =
        "\4\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "270:4: ( Digits | DNum )";
        }
    }
    static final String DFA23_eotS =
        "\3\uffff\2\6\2\uffff\1\6";
    static final String DFA23_eofS =
        "\10\uffff";
    static final String DFA23_minS =
        "\1\56\1\60\1\56\2\60\2\uffff\1\60";
    static final String DFA23_maxS =
        "\2\71\3\145\2\uffff\1\145";
    static final String DFA23_acceptS =
        "\5\uffff\1\2\1\1\1\uffff";
    static final String DFA23_specialS =
        "\10\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\1\uffff\12\2",
            "\12\3",
            "\1\4\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
            "\12\3\13\uffff\1\5\37\uffff\1\5",
            "\12\7\13\uffff\1\5\37\uffff\1\5",
            "",
            "",
            "\12\7\13\uffff\1\5\37\uffff\1\5"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "273:1: Real : ( DNum | Exponent_DNum );";
        }
    }
    static final String DFA41_eotS =
        "\1\50\10\uffff\1\70\1\72\1\74\1\76\1\101\1\uffff\1\103\1\uffff\1"+
        "\105\1\107\1\110\1\111\1\112\1\113\1\uffff\20\61\1\uffff\2\151\3"+
        "\61\2\uffff\1\163\2\uffff\1\163\30\uffff\12\61\1\u0082\1\61\1\u0085"+
        "\20\61\1\uffff\2\151\6\61\1\u00a1\1\uffff\1\u00a1\1\u00a2\13\61"+
        "\1\u00b0\1\uffff\2\61\1\uffff\4\61\1\u00b8\7\61\1\u00c0\4\61\1\u00c5"+
        "\1\u00c6\7\61\3\uffff\2\61\1\u00d0\3\61\1\u00d4\1\u00d6\5\61\1\uffff"+
        "\7\61\1\uffff\7\61\1\uffff\1\u00ea\3\61\2\uffff\3\61\2\u00ea\2\61"+
        "\1\u00f3\1\u00f4\1\uffff\1\u00f5\1\u00f6\1\61\1\uffff\1\61\1\uffff"+
        "\1\61\1\u00fb\13\61\1\u00ea\1\u0107\4\61\1\uffff\1\u010c\1\61\1"+
        "\u010e\1\u010f\2\u010e\2\u00ea\4\uffff\1\61\1\u0111\1\61\1\u0113"+
        "\1\uffff\2\61\1\u0116\10\61\1\uffff\1\u011f\1\u0120\1\61\1\u0122"+
        "\1\uffff\1\61\2\uffff\1\61\1\uffff\1\u0125\1\uffff\1\u0116\1\61"+
        "\1\uffff\1\u0127\1\50\2\61\1\u012b\1\61\1\u012d\1\61\2\uffff\1\u012b"+
        "\1\uffff\1\61\1\u0131\1\uffff\1\61\1\uffff\3\61\1\uffff\1\61\1\uffff"+
        "\1\u0137\1\61\1\u0139\1\uffff\1\u0116\1\61\1\50\2\61\1\uffff\1\61"+
        "\1\uffff\1\u013e\1\61\1\50\1\61\1\uffff\2\61\2\u012b";
    static final String DFA41_eofS =
        "\u0143\uffff";
    static final String DFA41_minS =
        "\1\11\10\uffff\2\75\1\46\1\72\1\55\1\uffff\1\76\1\uffff\1\60\1\75"+
        "\1\53\2\75\1\52\1\uffff\1\145\1\141\1\143\1\162\1\145\1\146\1\141"+
        "\1\150\1\167\1\145\1\154\1\150\1\142\1\141\1\163\1\162\1\uffff\2"+
        "\56\2\122\1\101\2\uffff\1\74\2\uffff\1\76\30\uffff\1\167\1\141\1"+
        "\163\1\156\1\150\1\163\1\164\1\151\1\142\1\145\1\60\1\143\1\60\1"+
        "\143\1\160\1\162\1\156\1\154\2\151\1\161\1\157\1\165\1\162\1\163"+
        "\2\162\2\145\1\uffff\2\56\1\162\1\122\1\125\1\165\1\114\1\154\1"+
        "\74\1\uffff\1\75\1\60\1\156\1\163\1\145\1\143\1\163\1\157\2\145"+
        "\1\156\1\164\1\154\1\60\1\uffff\1\141\1\154\1\uffff\1\164\1\145"+
        "\2\154\1\40\1\143\1\163\1\154\1\164\2\165\1\142\1\60\1\145\1\157"+
        "\1\164\1\141\2\60\2\141\1\101\1\105\1\145\1\123\1\163\3\uffff\1"+
        "\145\1\163\1\60\1\150\1\164\1\151\2\60\1\156\1\164\1\141\1\145\1"+
        "\151\1\uffff\1\165\2\141\1\162\1\165\1\145\1\141\1\uffff\1\164\2"+
        "\145\1\143\1\162\1\151\1\141\1\uffff\1\60\1\167\1\162\1\171\2\uffff"+
        "\1\153\1\171\1\131\2\60\1\105\1\145\2\60\1\uffff\1\40\1\60\1\156"+
        "\1\uffff\1\146\1\uffff\1\144\1\60\1\164\2\143\1\154\1\162\1\156"+
        "\1\146\1\144\1\155\1\143\1\151\1\60\1\40\1\150\1\156\1\162\1\154"+
        "\1\uffff\1\60\1\141\6\60\4\uffff\1\165\1\60\1\163\1\60\1\uffff\1"+
        "\145\1\164\1\60\1\164\1\145\1\143\1\141\2\145\1\150\1\157\1\uffff"+
        "\2\60\1\145\1\60\1\uffff\1\143\2\uffff\1\145\1\uffff\1\60\1\uffff"+
        "\1\60\1\145\1\uffff\2\60\1\145\1\143\1\60\1\156\1\40\1\156\2\uffff"+
        "\1\60\1\uffff\1\164\1\60\1\uffff\1\144\1\uffff\1\157\1\145\1\157"+
        "\1\uffff\1\164\1\uffff\1\60\1\157\1\60\1\uffff\1\60\1\146\1\60\1"+
        "\156\1\163\1\uffff\1\156\1\uffff\1\60\1\143\1\60\1\143\1\uffff\2"+
        "\145\2\60";
    static final String DFA41_maxS =
        "\1\176\10\uffff\1\76\1\174\1\75\1\72\1\76\1\uffff\1\76\1\uffff\6"+
        "\75\1\uffff\1\145\1\157\1\170\1\165\1\157\1\156\1\165\1\150\1\167"+
        "\1\145\1\154\2\162\1\141\1\163\1\162\1\uffff\2\145\2\162\1\141\2"+
        "\uffff\1\74\2\uffff\1\76\30\uffff\1\167\1\157\1\164\1\156\1\150"+
        "\1\163\1\164\1\157\1\142\1\145\1\172\1\146\1\172\1\164\1\160\1\162"+
        "\1\156\1\154\2\151\1\164\1\157\1\171\1\162\1\163\2\162\2\145\1\uffff"+
        "\2\145\1\162\1\122\1\125\1\165\1\114\1\154\1\75\1\uffff\1\75\1\172"+
        "\1\156\1\163\1\145\1\143\1\164\1\157\2\145\1\166\1\164\1\154\1\172"+
        "\1\uffff\1\141\1\154\1\uffff\1\164\1\145\2\154\1\172\1\143\1\163"+
        "\1\154\1\164\2\165\1\142\1\172\1\145\1\157\1\164\1\141\2\172\2\141"+
        "\1\101\1\105\1\145\1\123\1\163\3\uffff\1\145\1\163\1\172\1\150\1"+
        "\164\1\151\2\172\1\156\1\164\1\141\1\145\1\151\1\uffff\1\165\2\141"+
        "\1\162\1\165\1\145\1\141\1\uffff\1\164\2\145\1\143\1\162\1\151\1"+
        "\141\1\uffff\1\172\1\167\1\162\1\171\2\uffff\1\153\1\171\1\131\2"+
        "\172\1\105\1\145\2\172\1\uffff\2\172\1\156\1\uffff\1\146\1\uffff"+
        "\1\144\1\172\1\164\2\143\1\154\1\162\1\156\1\146\1\144\1\155\1\143"+
        "\1\151\2\172\1\150\1\156\1\162\1\154\1\uffff\1\172\1\141\6\172\4"+
        "\uffff\1\165\1\172\1\163\1\172\1\uffff\1\145\1\164\1\172\1\164\1"+
        "\145\1\143\1\141\2\145\1\150\1\157\1\uffff\2\172\1\145\1\172\1\uffff"+
        "\1\143\2\uffff\1\145\1\uffff\1\172\1\uffff\1\172\1\145\1\uffff\2"+
        "\172\1\145\1\143\1\172\1\156\1\172\1\156\2\uffff\1\172\1\uffff\1"+
        "\164\1\172\1\uffff\1\144\1\uffff\1\157\1\145\1\157\1\uffff\1\164"+
        "\1\uffff\1\172\1\157\1\172\1\uffff\1\172\1\146\1\172\1\156\1\163"+
        "\1\uffff\1\156\1\uffff\1\172\1\143\1\172\1\143\1\uffff\2\145\2\172";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\5\uffff\1\16\1\uffff\1"+
        "\20\6\uffff\1\33\20\uffff\1\75\5\uffff\1\104\1\105\1\uffff\1\107"+
        "\1\110\1\uffff\1\116\1\117\1\11\1\112\1\34\1\12\1\24\1\13\1\23\1"+
        "\14\1\21\1\15\1\115\1\27\1\74\1\17\1\111\1\22\1\102\1\25\1\26\1"+
        "\30\1\31\1\32\35\uffff\1\77\11\uffff\1\113\16\uffff\1\51\2\uffff"+
        "\1\43\32\uffff\1\106\1\114\1\35\15\uffff\1\42\7\uffff\1\46\7\uffff"+
        "\1\61\4\uffff\1\66\1\71\11\uffff\1\53\3\uffff\1\37\1\uffff\1\44"+
        "\23\uffff\1\103\10\uffff\1\36\1\63\1\62\1\67\4\uffff\1\40\13\uffff"+
        "\1\50\4\uffff\1\70\1\uffff\1\101\1\72\1\uffff\1\45\1\uffff\1\41"+
        "\2\uffff\1\100\10\uffff\1\52\1\56\1\uffff\1\57\2\uffff\1\64\1\uffff"+
        "\1\54\3\uffff\1\76\1\uffff\1\47\3\uffff\1\73\5\uffff\1\55\1\uffff"+
        "\1\65\4\uffff\1\60\4\uffff";
    static final String DFA41_specialS =
        "\u0143\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\65\2\uffff\1\65\22\uffff\1\65\1\22\1\57\1\64\1\20\1\25\1"+
            "\13\1\56\1\3\1\4\1\24\1\23\1\2\1\15\1\21\1\26\1\51\11\52\1\14"+
            "\1\1\1\60\1\11\1\63\1\17\1\16\1\53\4\61\1\55\15\61\1\54\6\61"+
            "\1\5\1\uffff\1\6\1\62\1\61\1\uffff\1\44\1\47\1\31\1\34\1\32"+
            "\1\36\1\42\1\61\1\35\4\61\1\30\1\61\1\33\1\61\1\41\1\40\1\43"+
            "\1\46\1\45\1\37\3\61\1\7\1\12\1\10\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\1\66",
            "\1\62\76\uffff\1\71",
            "\1\73\26\uffff\1\62",
            "\1\75",
            "\1\100\17\uffff\1\62\1\77",
            "",
            "\1\102",
            "",
            "\12\106\3\uffff\1\104",
            "\1\67",
            "\1\100\21\uffff\1\62",
            "\1\62",
            "\1\62",
            "\1\64\4\uffff\1\64\15\uffff\1\62",
            "",
            "\1\114",
            "\1\116\12\uffff\1\115\2\uffff\1\117",
            "\1\120\10\uffff\1\121\13\uffff\1\122",
            "\1\123\2\uffff\1\124",
            "\1\127\3\uffff\1\125\5\uffff\1\126",
            "\1\130\6\uffff\1\132\1\131",
            "\1\135\15\uffff\1\133\5\uffff\1\134",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\143\11\uffff\1\142",
            "\1\144\17\uffff\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\106\1\uffff\10\152\2\106\13\uffff\1\106\37\uffff\1\106",
            "\1\106\1\uffff\12\153\13\uffff\1\106\37\uffff\1\106",
            "\1\155\37\uffff\1\154",
            "\1\156\37\uffff\1\157",
            "\1\160\37\uffff\1\161",
            "",
            "",
            "\1\162",
            "",
            "",
            "\1\164",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\165",
            "\1\167\15\uffff\1\166",
            "\1\170\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176\5\uffff\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0084\2\uffff\1\u0083",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0088\17\uffff\1\u0086\1\u0087",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u0090\2\uffff\1\u008f",
            "\1\u0091",
            "\1\u0093\3\uffff\1\u0092",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\106\1\uffff\10\152\2\106\13\uffff\1\106\37\uffff\1\106",
            "\1\106\1\uffff\12\153\13\uffff\1\106\37\uffff\1\106",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0\1\62",
            "",
            "\1\62",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\7\uffff\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\50\7\uffff\1\50\7\uffff\12\61\7\uffff\32\61\4\uffff\1\61"+
            "\1\uffff\4\61\1\u00b7\25\61",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00d5\21"+
            "\61",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f1",
            "\1\u00f2",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\50\7\uffff\1\50\7\uffff\12\61\7\uffff\32\61\4\uffff\1\61"+
            "\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\5\61\1\u00fa\24\61",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\50\7\uffff\1\50\7\uffff\12\61\7\uffff\32\61\4\uffff\1\61"+
            "\1\uffff\32\61",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u010d",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "\1\u0110",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0112",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0114",
            "\1\u0115",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0121",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0123",
            "",
            "",
            "\1\u0124",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0126",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0128",
            "\1\u0129",
            "\12\61\7\uffff\32\61\4\uffff\1\u012a\1\uffff\32\61",
            "\1\u012c",
            "\1\50\7\uffff\1\50\7\uffff\12\61\7\uffff\32\61\4\uffff\1\61"+
            "\1\uffff\32\61",
            "\1\u012e",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\u012f\1\uffff\32\61",
            "",
            "\1\u0130",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0132",
            "",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "",
            "\1\u0136",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0138",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u013a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u013b",
            "\1\u013c",
            "",
            "\1\u013d",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u013f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0140",
            "",
            "\1\u0141",
            "\1\u0142",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61"
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SEMICOLON | COMMA | OPEN_BRACE | CLOSE_BRACE | OPEN_SQUARE_BRACE | CLOSE_SQUARE_BRACE | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | ARRAY_ASSIGN | LOGICAL_OR | LOGICAL_AND | CLASS_MEMBER | INSTANCE_MEMBER | SUPPRESS_WARNINGS | QUESTION_MARK | DOLLAR | COLON | DOT | AMPERSAND | PIPE | BANG | PLUS | MINUS | ASTERISK | PERCENT | FORWARD_SLASH | TILDE | EQUALS | NEW | CLONE | ECHO | PRINT | PRINTF | DIE | IF | ELSE | ELSE_IF | FOR | FOR_EACH | WHILE | DO | SWITCH | CASE | DEFAULT | FUNCTION | RETURN | GLOBAL | INSTANCE_OF | TRY | CATCH | CLASS | Extends | ABSTRACT | VAR | CONST | THROW | USE | BREAK | CONTINUE | BodyString | PhpStatement | RequireOperator | Integer | AccessModifier | ArrayWord | Real | Boolean | SingleQuotedString | DoubleQuotedString | HereDoc | UnquotedString | AssignmentOperator | ConcatAssigmentOperator | EqualityOperator | ComparisionOperator | ShiftOperator | IncrementOperator | COMMENT | WhiteSpace );";
        }
    }
 

}