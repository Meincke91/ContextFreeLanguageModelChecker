package ContextFreeLanguageModelChecker.ast;

import ContextFreeLanguageModelChecker.Environment;
import ContextFreeLanguageModelChecker.VariableNotDefinedException;

public class TransitionSystemExpr extends Statement {

	private String stateName;
	private ArithExpr proposition;
	
	public TransitionSystemExpr(String stateName, ArithExpr proposition) {
		this.stateName = stateName;
		this.proposition = proposition;
	}
	
	@Override
	public void evaluate(Environment env) throws VariableNotDefinedException {
		int value = proposition.evaluate(env);
		env.setVariable(stateName, value);
	}

}