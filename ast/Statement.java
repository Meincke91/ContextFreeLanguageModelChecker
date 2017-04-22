package ContextFreeLanguageModelChecker.ast;

import ContextFreeLanguageModelChecker.Environment;
import ContextFreeLanguageModelChecker.VariableNotDefinedException;

public abstract class Statement {

	public abstract void evaluate(Environment env) throws VariableNotDefinedException;
	
}
