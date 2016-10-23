package stack;

import java.util.Stack;

public class StackMethodsTester {
	public static void main(String[] args) {

		Stack<Integer> a = new Stack<Integer>();

		a.push(5);

		a.push(2);

		a.push(7);
		
		System.out.println("Average");
		System.out.println(StackMethods.getAverage(a));

		Stack<String> b = new Stack<String>();

		b.push("one");

		b.push("two");

		Stack<String> c = new Stack<String>();

		c.push("three");

		c.push("four");

		c.push("five");
		System.out.println("");
		System.out.println("alternating");
		//two different versions of alternating
		StackMethods.display(StackMethods.alternateStack(b, c));
		System.out.println("");
		StackMethods.display(StackMethods.alternateStack(c, b));

		System.out.println("");

		Stack<String> d = new Stack<String>();

		d.push("six");

		d.push("seven");

		d.push("eight");

		d.push("nine");

		d.push("ten");

		StackMethods.display(StackMethods.removeEveryOther(d));

	}
}
