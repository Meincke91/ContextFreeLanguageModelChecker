// $ANTLR 3.5.2 ContextFreeLanguageModelChecker/parsing/ModelLanguage.g 2017-04-22 19:07:25

package ContextFreeLanguageModelChecker.parsing;

import ContextFreeLanguageModelChecker.ast.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ModelLanguageParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUM", "':='", "';'"
	};
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int ID=4;
	public static final int NUM=5;

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


		Statement s =null;

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
	// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:23:1: statement returns [Statement value] : s= base_statement ( ';' s= base_statement )* ;
	public final Statement statement() throws RecognitionException {
		Statement value = null;


		Statement s =null;

		try {
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:24:5: (s= base_statement ( ';' s= base_statement )* )
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:24:7: s= base_statement ( ';' s= base_statement )*
			{
			pushFollow(FOLLOW_base_statement_in_statement76);
			s=base_statement();
			state._fsp--;

			 value = s; 
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:25:7: ( ';' s= base_statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==7) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:25:9: ';' s= base_statement
					{
					match(input,7,FOLLOW_7_in_statement94); 
					pushFollow(FOLLOW_base_statement_in_statement98);
					s=base_statement();
					state._fsp--;

					 value = new SeqStatement(value,s); 
					}
					break;

				default :
					break loop1;
				}
			}

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
	// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:28:1: base_statement returns [Statement value] : ID ':=' e= arith_expr ;
	public final Statement base_statement() throws RecognitionException {
		Statement value = null;


		Token ID1=null;
		ArithExpr e =null;

		try {
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:29:5: ( ID ':=' e= arith_expr )
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:29:7: ID ':=' e= arith_expr
			{
			ID1=(Token)match(input,ID,FOLLOW_ID_in_base_statement125); 
			match(input,6,FOLLOW_6_in_base_statement127); 
			pushFollow(FOLLOW_arith_expr_in_base_statement131);
			e=arith_expr();
			state._fsp--;

			 value = new AssignStatement(ID1.getText(), e); 
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
	// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:32:1: arith_expr returns [ArithExpr value] : e= mult_arith_expr ;
	public final ArithExpr arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:33:5: (e= mult_arith_expr )
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:33:7: e= mult_arith_expr
			{
			pushFollow(FOLLOW_mult_arith_expr_in_arith_expr177);
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
	// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:36:1: mult_arith_expr returns [ArithExpr value] : e= base_arith_expr ;
	public final ArithExpr mult_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:37:5: (e= base_arith_expr )
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:37:7: e= base_arith_expr
			{
			pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr208);
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



	// $ANTLR start "base_arith_expr"
	// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:41:1: base_arith_expr returns [ArithExpr value] : ( NUM | ID );
	public final ArithExpr base_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		Token NUM2=null;
		Token ID3=null;

		try {
			// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:42:5: ( NUM | ID )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==NUM) ) {
				alt2=1;
			}
			else if ( (LA2_0==ID) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:42:7: NUM
					{
					NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_base_arith_expr238); 
					 value = new NumExpr(Integer.parseInt(NUM2.getText())); 
					}
					break;
				case 2 :
					// ContextFreeLanguageModelChecker/parsing/ModelLanguage.g:43:7: ID
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_base_arith_expr248); 
					 value = new IdExpr(ID3.getText()); 
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
	public static final BitSet FOLLOW_base_statement_in_statement76 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_7_in_statement94 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_base_statement_in_statement98 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ID_in_base_statement125 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_base_statement127 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_statement131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_base_arith_expr238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_base_arith_expr248 = new BitSet(new long[]{0x0000000000000002L});
}
