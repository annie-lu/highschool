package numbers;

import java.util.LinkedList;
import java.util.ListIterator;

public class HashTable {
	private LinkedList<Number>[] table;

	@SuppressWarnings("unchecked")
	public HashTable() {
		table = new LinkedList[10];
		for (int x = 0; x < 10; x++) {
			table[x] = new LinkedList();
		}
	}

	public void add(Object obj) {

		Number x = new Number(Integer.parseInt(((String) obj).trim()));

		int i = x.hashCode();
		if (!table[i].contains(x))
			table[i].add(x);

	}

	public String toString() {
		String output = "HASHTABLE\n";
		int x = 0;
		while (x < table.length) {
			ListIterator<Number> iter = table[x].listIterator();
			output += "bucket " + x + ": ";
			while (iter.hasNext())
				output += iter.next() + " ";
			output += "\n";
			x++;
		}

		return output;
	}
}