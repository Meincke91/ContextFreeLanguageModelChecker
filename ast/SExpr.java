package ContextFreeLanguageModelChecker.ast;

import ContextFreeLanguageModelChecker.Environment;
import ContextFreeLanguageModelChecker.VariableNotDefinedException;

public class SExpr extends ArithExpr {

	private int value;
	
	public SExpr(int value) {
		this.value = value;
	}
	
	@Override
	public int evaluate(Environment env) throws VariableNotDefinedException {
		return value;
	}

}
