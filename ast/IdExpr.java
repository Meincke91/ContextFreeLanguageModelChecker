package ContextFreeLanguageModelChecker.ast;

import ContextFreeLanguageModelChecker.Environment;
import ContextFreeLanguageModelChecker.VariableNotDefinedException;

public class IdExpr extends ArithExpr {

	private String name;
	
	public IdExpr(String name) {
		this.name = name;
	}
	
	@Override
	public int evaluate(Environment env) throws VariableNotDefinedException {
		return env.getVariable(name);
	}

}
