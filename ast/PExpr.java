package ContextFreeLanguageModelChecker.ast;

import ContextFreeLanguageModelChecker.Environment;
import ContextFreeLanguageModelChecker.VariableNotDefinedException;

public class PExpr extends ArithExpr {

	private String name;
	
	public PExpr(String name) {
		this.name = name;
	}
	
	@Override
	public int evaluate(Environment env) throws VariableNotDefinedException {
		return env.getVariable(name);
	}

}
