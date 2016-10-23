package arithmetic;

import java.util.Stack;

public class ArithmeticOperationsParentheses {

	private String[] expression;
	
	//maybe use inheritance?
	public ArithmeticOperationsParentheses(String x) {
		expression = x.trim().split(" ");
	}
	
	//precondition: contains both parentheses
	public double evaluate() {
		String entire="";
		
		for (int x = 0; x<expression.length; x++){
			String inner = "";
			if(expression[x].contains("(")) {
				expression[x] = expression[x].substring(1); //deletes "("
				
				while(x < expression.length && !expression[x].contains(")")){
					inner += expression[x] + " ";
					x++;
				}
				
				expression[x] = expression[x].substring(0,expression[x].length()-1); //deletes ")"
				inner += expression[x];
				ArithmeticOperations a = new ArithmeticOperations(inner);
				entire += a.evaluate()+" ";
			}
			else
				entire += expression[x]+" ";
		}
		
		ArithmeticOperations b = new ArithmeticOperations(entire);
		return b.evaluate();
				
	}
	
}
