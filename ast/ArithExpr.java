package ContextFreeLanguageModelChecker.ast;

import ContextFreeLanguageModelChecker.Environment;
import ContextFreeLanguageModelChecker.VariableNotDefinedException;

public abstract class ArithExpr {

	public abstract int evaluate(Environment env) throws VariableNotDefinedException;
	
}
