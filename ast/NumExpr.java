package ContextFreeLanguageModelChecker.ast;

import ContextFreeLanguageModelChecker.Environment;
import ContextFreeLanguageModelChecker.VariableNotDefinedException;

public class NumExpr extends ArithExpr {

	private int value;
	
	public NumExpr(int value) {
		this.value = value;
	}
	
	@Override
	public int evaluate(Environment env) throws VariableNotDefinedException {
		return value;
	}

}
