package stack;

import java.util.Iterator;
import java.util.Stack;

import cards.Card;

public class StackMethods {

	public static double getAverage(Stack<Integer> one) {
		double avg = 0;
		int x = 0;
		for (Integer n : one) {
			avg += n;
			x++;
		}

		return avg / x;
	}

	public static Stack<String> alternateStack(Stack<String> one,
			Stack<String> two) {
		int lengthOne = 0;
		int lengthTwo = 0;

		for (String x : one)
			lengthOne++;

		for (String x : two)
			lengthTwo++;

		Stack<String> altStack = new Stack<String>();

		if (lengthOne > lengthTwo) {
			Iterator<String> i = one.iterator();
			Iterator<String> i2 = two.iterator();

			for (int y = 0; y < lengthOne; y++) {
				altStack.push(i.next());

				if (y < lengthTwo)
					altStack.push(i2.next());
			}

		} else {
			Iterator<String> i = one.iterator();
			Iterator<String> i2 = two.iterator();

			for (int y = 0; y < lengthTwo; y++) {
				if (y < lengthOne)
					altStack.push(i.next());

				altStack.push(i2.next());
			}

		}

		return altStack;
	}

	// Good Question: For alternating stacks, are they the same size??…Do they
	// have to be???

	public static Stack<String> removeEveryOther(Stack<String> one) {
		int lengthOne = 0;
		Stack<String> temp = new Stack<String>();
		Iterator<String> i = one.iterator();
		for (String x : one)
			lengthOne++;
		for (int y = 0; y < lengthOne; y++) {
			if (y % 2 == 0)
				temp.push(i.next());
			else
				i.next();
		}

		return temp;
	}

	// Removes every other element in the stack – but the order of others
	// shouldn’t change.

	public static void display(Stack<String> one) {
		while (!one.empty())
			System.out.println(one.pop());
	}

	// We want to print in the order that it comes off the stack
}