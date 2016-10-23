package palindrome;

// PalinLins.java

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList {
	private Queue<String> queue;
	private Stack<String> stack;
	private String list;

	public PalinList() {
		stack = new Stack<String>();
		queue = new LinkedList<String>();
		setList("");
	}

	public PalinList(String list) {
		stack = new Stack<String>();
		queue = new LinkedList<String>();
		setList(list);

	}

	public String toString() {

		return list;
	}

	public void setList(String list) {
		stack = new Stack<String>();
		queue = new LinkedList<String>();
		this.list = list;
		list = list.trim();
		int start = -1;
		for (int i = 0; i < list.length(); i++) {
			if (list.charAt(i) == ' ') {
				queue.add(list.substring(start + 1, i));
				start = i;
			}
		}

		queue.add(list.substring(start + 1, list.length()));

	}

	public boolean isPalin() {

		int size = queue.size();
		for (int i = 0; i < size / 2; i++) {

			stack.push(queue.poll());
		}

		if (size % 2 != 0) {
			queue.poll();
		}

		while (!stack.isEmpty()) {
			if (!stack.pop().equals(queue.poll())) {
				return false;
			}
		}
		return true;

	}

	// write a toString method
}