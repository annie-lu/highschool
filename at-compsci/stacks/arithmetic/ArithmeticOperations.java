package arithmetic;

import java.util.Stack;
import cards.Card;

public class ArithmeticOperations {
	private String[] expression;
	private Stack<Double> numbers;
	private Stack<String> operators;

	public ArithmeticOperations(String x) {
		expression = x.trim().split(" ");
		numbers = new Stack<Double>();
		operators = new Stack<String>();
	}

	public double evaluate() {
		int i= expression.length - 1;
		
		while (i >= 0) {
			if (i % 2 == 1) {
				Operator x = new Operator(expression[i]);

				if (!operators.isEmpty()) {
					if(x.compareTo(operators.peek()) <= 0){
						operators.push(expression[i]);
						i--;
					}
					else
						simplify(operators.peek());
				} 
				else {
					operators.push(expression[i]);
					i--;
				}
			} 
			else {
				numbers.push(Double.parseDouble(expression[i]));
				i--;
			}
		}
		simplify(operators.peek());
		return numbers.pop();
	}

	private void simplify(String y) {
		Operator x;

		while (!operators.isEmpty()) {
			x = new Operator(operators.pop());
			if (x.compareTo(y) >= 0)
				numbers.push(x.operate(numbers.pop(), numbers.pop()));
			else
				return;
		}
	}

}
