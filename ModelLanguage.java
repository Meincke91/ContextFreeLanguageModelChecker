package ContextFreeLanguageModelChecker;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

import ContextFreeLanguageModelChecker.ast.Statement;
import ContextFreeLanguageModelChecker.parsing.ModelLanguageLexer;
import ContextFreeLanguageModelChecker.parsing.ModelLanguageParser;

public class ModelLanguage {

	public static void main(String args[]) throws Exception {
		if (args.length == 0) {
			System.out.println("Error: No program specified.");
			return;
		}
		
        ModelLanguageLexer lex = new ModelLanguageLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ModelLanguageParser parser = new ModelLanguageParser(tokens);
        Statement whileProgram = parser.program();

        try {
        	Environment env = new Environment();
        	whileProgram.evaluate(env);
        	System.out.println(env.toString());
        } catch (VariableNotDefinedException e) {
        	System.out.println("Error: " + e);
        } catch (NullPointerException e) {
        	System.out.println("Error parsing program.");
        }

	}
	
}
