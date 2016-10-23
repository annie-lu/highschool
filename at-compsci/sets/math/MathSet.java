package math;

import java.util.Set;
import java.util.TreeSet;

public class MathSet {
	
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet(String o, String t) {
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();

		String[] numbers = o.split(" ");

		for (String x : numbers) {
			one.add(Integer.parseInt(x));
		}

		numbers = t.split(" ");

		for (String x : numbers) {
			two.add(Integer.parseInt(x));
		}
	}

	public Set<Integer> union() {
		Set<Integer> union = new TreeSet<Integer>();

		for (int x : one) {
			union.add(x);
		}

		for (int x : two) {
			if (!union.contains(x))
				union.add(x);
		}

		return union;
	}

	public Set<Integer> intersection() {
		Set<Integer> intersection = new TreeSet<Integer>();
		for (int x : two) {
			if (one.contains(x))
				intersection.add(x);
		}
		return intersection;
	}

	public Set<Integer> differenceAMinusB() {
		return difference(one, two);
	}

	public Set<Integer> differenceBMinusA() {
		return difference(two, one);
	}

	public Set<Integer> symmetricDifference() {
		Set<Integer> difference = differenceAMinusB();
		difference.addAll(differenceBMinusA());

		return difference;
	}

	private Set<Integer> difference(Set<Integer> a, Set<Integer> b) {
		Set<Integer> difference = new TreeSet<Integer>();
		for (int x : a) {
			if (!b.contains(x))
				difference.add(x);
		}
		return difference;
	}

	public String toString() {
		return "Set one " + one + "\n" + "Set two " + two + "\n";
	}
	
}