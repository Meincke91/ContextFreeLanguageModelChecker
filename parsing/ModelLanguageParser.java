// $ANTLR 3.5.2 ContextFreeLanguageModelChecker/parsing/ModelLanguage.g 2017-04-23 13:52:48

package ContextFreeLanguageModelChecker.parsing;

import ContextFreeLanguageModelChecker.ast.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ModelLanguageParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "P", "S", "WS", "':='", "'['", 
		"']'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int P=4;
	public static final int S=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ModelLanguageParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ModelLanguageParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ModelLanguageParser.tokenNames; }
	@Override public String getGrammarFileName() { return "ContextFreeLanguageModelChecker/parsing/ModelLanguage.g"; }



	// $ANTLR start "program"
	// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:19:1: program returns [Statement value] : s= statement EOF ;
	public final Statement program() throws RecognitionException {
		Statement value = null;


		String s =null;

		try {
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:20:5: (s= statement EOF )
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:20:7: s= statement EOF
			{
			pushFollow(FOLLOW_statement_in_program49);
			s=statement();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_program51); 
			 value = s; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:23:1: statement returns [String value] : '{' S ( '[' P ']' ) '}' ;
	public final String statement() throws RecognitionException {
		String value = null;


		Token P1=null;
		Token S2=null;

		try {
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:24:5: ( '{' S ( '[' P ']' ) '}' )
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:24:7: '{' S ( '[' P ']' ) '}'
			{
			match(input,10,FOLLOW_10_in_statement74); 
			S2=(Token)match(input,S,FOLLOW_S_in_statement76); 
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:25:7: ( '[' P ']' )
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:25:8: '[' P ']'
			{
			match(input,8,FOLLOW_8_in_statement85); 
			P1=(Token)match(input,P,FOLLOW_P_in_statement87); 
			 value = new PExpr(P1.getText()); 
			match(input,9,FOLLOW_9_in_statement92); 
			}

			match(input,11,FOLLOW_11_in_statement103); 
			 value = new NumExpr(Integer.parseInt(S2.getText())); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "statement"



	// $ANTLR start "base_statement"
	// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:29:1: base_statement returns [Statement value] : P ':=' e= arith_expr ;
	public final Statement base_statement() throws RecognitionException {
		Statement value = null;


		Token P3=null;
		ArithExpr e =null;

		try {
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:30:5: ( P ':=' e= arith_expr )
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:30:7: P ':=' e= arith_expr
			{
			P3=(Token)match(input,P,FOLLOW_P_in_base_statement143); 
			match(input,7,FOLLOW_7_in_base_statement145); 
			pushFollow(FOLLOW_arith_expr_in_base_statement149);
			e=arith_expr();
			state._fsp--;

			 value = new AssignStatement(P3.getText(), e); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "base_statement"



	// $ANTLR start "arith_expr"
	// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:33:1: arith_expr returns [ArithExpr value] : e= mult_arith_expr ;
	public final ArithExpr arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:34:5: (e= mult_arith_expr )
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:34:7: e= mult_arith_expr
			{
			pushFollow(FOLLOW_mult_arith_expr_in_arith_expr195);
			e=mult_arith_expr();
			state._fsp--;

			 value = e; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "arith_expr"



	// $ANTLR start "mult_arith_expr"
	// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:37:1: mult_arith_expr returns [ArithExpr value] : e= base_arith_expr ;
	public final ArithExpr mult_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:38:5: (e= base_arith_expr )
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:38:7: e= base_arith_expr
			{
			pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr226);
			e=base_arith_expr();
			state._fsp--;

			 value = e; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "mult_arith_expr"



	// $ANTLR start "base_state_expr"
	// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:41:1: base_state_expr returns [ArithExpr value] : S ;
	public final ArithExpr base_state_expr() throws RecognitionException {
		ArithExpr value = null;


		Token S4=null;

		try {
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:42:2: ( S )
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:42:4: S
			{
			S4=(Token)match(input,S,FOLLOW_S_in_base_state_expr252); 
			 value = new NumExpr(Integer.parseInt(S4.getText())); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "base_state_expr"



	// $ANTLR start "base_arith_expr"
	// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:45:1: base_arith_expr returns [ArithExpr value] : ( S | P );
	public final ArithExpr base_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		Token S5=null;
		Token P6=null;

		try {
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:46:5: ( S | P )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==S) ) {
				alt1=1;
			}
			else if ( (LA1_0==P) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:46:7: S
					{
					S5=(Token)match(input,S,FOLLOW_S_in_base_arith_expr272); 
					 value = new NumExpr(Integer.parseInt(S5.getText())); 
					}
					break;
				case 2 :
					// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:47:7: P
					{
					P6=(Token)match(input,P,FOLLOW_P_in_base_arith_expr282); 
					 value = new PExpr(P6.getText()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "base_arith_expr"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program49 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_statement74 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_S_in_statement76 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_statement85 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_P_in_statement87 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_statement92 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_statement103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_P_in_base_statement143 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_base_statement145 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_statement149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_in_base_state_expr252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_in_base_arith_expr272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_P_in_base_arith_expr282 = new BitSet(new long[]{0x0000000000000002L});
}
