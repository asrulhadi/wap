// $ANTLR 3.4 Php__.g 2015-10-03 23:49:42

package org.homeunix.wap.php.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PhpLexer extends Lexer {
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


    // delegates
    public Php_Lex gLex;
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {gLex};
    }

    public PhpLexer() {} 
    public PhpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PhpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
        gLex = new Php_Lex(input, state, this);
    }
    public String getGrammarFileName() { return "Php__.g"; }

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Php__.g:37:8: ( 'AND' )
            // Php__.g:37:10: 'AND'
            {
            match("AND"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Php__.g:38:8: ( 'OR' )
            // Php__.g:38:10: 'OR'
            {
            match("OR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Php__.g:39:8: ( 'XOR' )
            // Php__.g:39:10: 'XOR'
            {
            match("XOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Php__.g:40:8: ( 'and' )
            // Php__.g:40:10: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Php__.g:41:8: ( 'final' )
            // Php__.g:41:10: 'final'
            {
            match("final"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Php__.g:42:8: ( 'list' )
            // Php__.g:42:10: 'list'
            {
            match("list"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Php__.g:43:8: ( 'null' )
            // Php__.g:43:10: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Php__.g:44:8: ( 'or' )
            // Php__.g:44:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Php__.g:45:8: ( 'static' )
            // Php__.g:45:10: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Php__.g:46:8: ( 'xor' )
            // Php__.g:46:10: 'xor'
            {
            match("xor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__123"

    public void mTokens() throws RecognitionException {
        // Php__.g:1:8: ( T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | Lex. Tokens )
        int alt1=11;
        switch ( input.LA(1) ) {
        case 'A':
            {
            int LA1_1 = input.LA(2);

            if ( (LA1_1=='N') ) {
                int LA1_12 = input.LA(3);

                if ( (LA1_12=='D') ) {
                    int LA1_22 = input.LA(4);

                    if ( ((LA1_22 >= '0' && LA1_22 <= '9')||(LA1_22 >= 'A' && LA1_22 <= 'Z')||LA1_22=='_'||(LA1_22 >= 'a' && LA1_22 <= 'z')) ) {
                        alt1=11;
                    }
                    else {
                        alt1=1;
                    }
                }
                else {
                    alt1=11;
                }
            }
            else {
                alt1=11;
            }
            }
            break;
        case 'O':
            {
            int LA1_2 = input.LA(2);

            if ( (LA1_2=='R') ) {
                int LA1_13 = input.LA(3);

                if ( ((LA1_13 >= '0' && LA1_13 <= '9')||(LA1_13 >= 'A' && LA1_13 <= 'Z')||LA1_13=='_'||(LA1_13 >= 'a' && LA1_13 <= 'z')) ) {
                    alt1=11;
                }
                else {
                    alt1=2;
                }
            }
            else {
                alt1=11;
            }
            }
            break;
        case 'X':
            {
            int LA1_3 = input.LA(2);

            if ( (LA1_3=='O') ) {
                int LA1_14 = input.LA(3);

                if ( (LA1_14=='R') ) {
                    int LA1_24 = input.LA(4);

                    if ( ((LA1_24 >= '0' && LA1_24 <= '9')||(LA1_24 >= 'A' && LA1_24 <= 'Z')||LA1_24=='_'||(LA1_24 >= 'a' && LA1_24 <= 'z')) ) {
                        alt1=11;
                    }
                    else {
                        alt1=3;
                    }
                }
                else {
                    alt1=11;
                }
            }
            else {
                alt1=11;
            }
            }
            break;
        case 'a':
            {
            int LA1_4 = input.LA(2);

            if ( (LA1_4=='n') ) {
                int LA1_15 = input.LA(3);

                if ( (LA1_15=='d') ) {
                    int LA1_25 = input.LA(4);

                    if ( ((LA1_25 >= '0' && LA1_25 <= '9')||(LA1_25 >= 'A' && LA1_25 <= 'Z')||LA1_25=='_'||(LA1_25 >= 'a' && LA1_25 <= 'z')) ) {
                        alt1=11;
                    }
                    else {
                        alt1=4;
                    }
                }
                else {
                    alt1=11;
                }
            }
            else {
                alt1=11;
            }
            }
            break;
        case 'f':
            {
            int LA1_5 = input.LA(2);

            if ( (LA1_5=='i') ) {
                int LA1_16 = input.LA(3);

                if ( (LA1_16=='n') ) {
                    int LA1_26 = input.LA(4);

                    if ( (LA1_26=='a') ) {
                        int LA1_35 = input.LA(5);

                        if ( (LA1_35=='l') ) {
                            int LA1_40 = input.LA(6);

                            if ( ((LA1_40 >= '0' && LA1_40 <= '9')||(LA1_40 >= 'A' && LA1_40 <= 'Z')||LA1_40=='_'||(LA1_40 >= 'a' && LA1_40 <= 'z')) ) {
                                alt1=11;
                            }
                            else {
                                alt1=5;
                            }
                        }
                        else {
                            alt1=11;
                        }
                    }
                    else {
                        alt1=11;
                    }
                }
                else {
                    alt1=11;
                }
            }
            else {
                alt1=11;
            }
            }
            break;
        case 'l':
            {
            int LA1_6 = input.LA(2);

            if ( (LA1_6=='i') ) {
                int LA1_17 = input.LA(3);

                if ( (LA1_17=='s') ) {
                    int LA1_27 = input.LA(4);

                    if ( (LA1_27=='t') ) {
                        int LA1_36 = input.LA(5);

                        if ( ((LA1_36 >= '0' && LA1_36 <= '9')||(LA1_36 >= 'A' && LA1_36 <= 'Z')||LA1_36=='_'||(LA1_36 >= 'a' && LA1_36 <= 'z')) ) {
                            alt1=11;
                        }
                        else {
                            alt1=6;
                        }
                    }
                    else {
                        alt1=11;
                    }
                }
                else {
                    alt1=11;
                }
            }
            else {
                alt1=11;
            }
            }
            break;
        case 'n':
            {
            int LA1_7 = input.LA(2);

            if ( (LA1_7=='u') ) {
                int LA1_18 = input.LA(3);

                if ( (LA1_18=='l') ) {
                    int LA1_28 = input.LA(4);

                    if ( (LA1_28=='l') ) {
                        int LA1_37 = input.LA(5);

                        if ( ((LA1_37 >= '0' && LA1_37 <= '9')||(LA1_37 >= 'A' && LA1_37 <= 'Z')||LA1_37=='_'||(LA1_37 >= 'a' && LA1_37 <= 'z')) ) {
                            alt1=11;
                        }
                        else {
                            alt1=7;
                        }
                    }
                    else {
                        alt1=11;
                    }
                }
                else {
                    alt1=11;
                }
            }
            else {
                alt1=11;
            }
            }
            break;
        case 'o':
            {
            int LA1_8 = input.LA(2);

            if ( (LA1_8=='r') ) {
                int LA1_19 = input.LA(3);

                if ( ((LA1_19 >= '0' && LA1_19 <= '9')||(LA1_19 >= 'A' && LA1_19 <= 'Z')||LA1_19=='_'||(LA1_19 >= 'a' && LA1_19 <= 'z')) ) {
                    alt1=11;
                }
                else {
                    alt1=8;
                }
            }
            else {
                alt1=11;
            }
            }
            break;
        case 's':
            {
            int LA1_9 = input.LA(2);

            if ( (LA1_9=='t') ) {
                int LA1_20 = input.LA(3);

                if ( (LA1_20=='a') ) {
                    int LA1_30 = input.LA(4);

                    if ( (LA1_30=='t') ) {
                        int LA1_38 = input.LA(5);

                        if ( (LA1_38=='i') ) {
                            int LA1_43 = input.LA(6);

                            if ( (LA1_43=='c') ) {
                                int LA1_45 = input.LA(7);

                                if ( ((LA1_45 >= '0' && LA1_45 <= '9')||(LA1_45 >= 'A' && LA1_45 <= 'Z')||LA1_45=='_'||(LA1_45 >= 'a' && LA1_45 <= 'z')) ) {
                                    alt1=11;
                                }
                                else {
                                    alt1=9;
                                }
                            }
                            else {
                                alt1=11;
                            }
                        }
                        else {
                            alt1=11;
                        }
                    }
                    else {
                        alt1=11;
                    }
                }
                else {
                    alt1=11;
                }
            }
            else {
                alt1=11;
            }
            }
            break;
        case 'x':
            {
            int LA1_10 = input.LA(2);

            if ( (LA1_10=='o') ) {
                int LA1_21 = input.LA(3);

                if ( (LA1_21=='r') ) {
                    int LA1_31 = input.LA(4);

                    if ( ((LA1_31 >= '0' && LA1_31 <= '9')||(LA1_31 >= 'A' && LA1_31 <= 'Z')||LA1_31=='_'||(LA1_31 >= 'a' && LA1_31 <= 'z')) ) {
                        alt1=11;
                    }
                    else {
                        alt1=10;
                    }
                }
                else {
                    alt1=11;
                }
            }
            else {
                alt1=11;
            }
            }
            break;
        default:
            alt1=11;
        }

        switch (alt1) {
            case 1 :
                // Php__.g:1:10: T__114
                {
                mT__114(); 


                }
                break;
            case 2 :
                // Php__.g:1:17: T__115
                {
                mT__115(); 


                }
                break;
            case 3 :
                // Php__.g:1:24: T__116
                {
                mT__116(); 


                }
                break;
            case 4 :
                // Php__.g:1:31: T__117
                {
                mT__117(); 


                }
                break;
            case 5 :
                // Php__.g:1:38: T__118
                {
                mT__118(); 


                }
                break;
            case 6 :
                // Php__.g:1:45: T__119
                {
                mT__119(); 


                }
                break;
            case 7 :
                // Php__.g:1:52: T__120
                {
                mT__120(); 


                }
                break;
            case 8 :
                // Php__.g:1:59: T__121
                {
                mT__121(); 


                }
                break;
            case 9 :
                // Php__.g:1:66: T__122
                {
                mT__122(); 


                }
                break;
            case 10 :
                // Php__.g:1:73: T__123
                {
                mT__123(); 


                }
                break;
            case 11 :
                // Php__.g:1:80: Lex. Tokens
                {
                gLex.mTokens(); 


                }
                break;

        }

    }


 

}