package arithmetic;

public class ParenthesesTester {
	public static void main(String[] args) {
	ArithmeticOperationsParentheses x = new ArithmeticOperationsParentheses("3 * (4 + 2) + 5");
	System.out.println(x.evaluate());
	}
}
