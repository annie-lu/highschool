package queue;

public class CircularArrayQueue {
	private int head;

	private int tail;

	private int theSize;

	private Object[] elements;

	public CircularArrayQueue(int capacity) {
		elements = new Object[capacity];
		theSize = 0;
		head = 0;
		tail = 0;
	}

	public void add(Object x) {
		
		if (theSize < elements.length - 1) {
			elements[tail] = x;

			if (tail < elements.length - 1)
				tail++;
			else
				tail = 0;

		} else {

			Object[] bigger = new Object[elements.length * 2];
			
			for (int i = 0; i < elements.length - head; i++)
				bigger[i] = elements[head + i];

			for (int i = 0; i < head; i++)
				bigger[i + (elements.length - head)] = elements[i];

			elements = bigger;
			head = 0;

			tail = theSize;
			elements[tail] = x;
			tail++;
		}
		
		theSize++;
	}

	public Object remove() {

		Object previous = elements[head];
		elements[head]=null;
		
		if (head < elements.length - 1)
			head++;
		else
			head = 0;
		
		theSize--;
		return previous;
	}

	public int size() {
		return theSize;

	}

	public String toString() {
		String array = "";
		for (Object x : elements)
				array += x + " ";

		return array;
	}

}
