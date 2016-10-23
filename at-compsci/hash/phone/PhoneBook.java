package phone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class PhoneBook {

	Hashtable<Integer, LinkedList<PhoneEntry>> phoneEntries;
	int numBuckets;
	int numEntries;

	public PhoneBook() {
		phoneEntries = new Hashtable<Integer, LinkedList<PhoneEntry>>();
		numBuckets = 26;
	}

	public PhoneBook(int numSlots) {
		phoneEntries = new Hashtable<Integer, LinkedList<PhoneEntry>>();
		numBuckets = numSlots;
	}

	public void add(PhoneEntry entry) {
		int x = Math.abs(entry.getName().hashCode() % numBuckets);
		LinkedList<PhoneEntry> temp;
		if (phoneEntries.containsKey(x)) {
			temp = phoneEntries.get(x);
		} else {
			temp = new LinkedList<PhoneEntry>();
		}
		temp.add(entry);
		phoneEntries.put(x, temp);

		numEntries++;

	}

	public void display() {
		int x = 0;
		while (x < numBuckets) {
			System.out.println(x);
			LinkedList<PhoneEntry> entry = phoneEntries.get(x);
			Iterator y = entry.iterator();
			while (y.hasNext()) {
				System.out.println(((PhoneEntry) y.next()).getName());
			}
			x++;
		}
	}

	public int getCapacity() {
		return numBuckets;

	}

	public int getSize() {
		return numEntries;

	}

	public void load() throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(
				"Files/phone.txt"))) {
			String x = br.readLine();
			while (x != null) {
				String[] line = x.split("\\s+");

				add(new PhoneEntry(line[0], line[1]));
				x = br.readLine();
			}
		}
	}

	public int getNumberOfNulls() {
		int x = 0;
		int numNulls = 0;
		while (x < numBuckets) {
			if (phoneEntries.get(x) == null)
				numNulls++;
			x++;
		}
		return numNulls;

	}

	public int getLongestList() {
		int x = 0;
		int longestList = 0;
		int max = 0;
		while (x < numBuckets) {
			if (phoneEntries.get(x) != null) {
				if (phoneEntries.get(x).size() > max) {
					max = phoneEntries.get(x).size();
					longestList = x;
				}
			}

			x++;
		}
		return longestList;

	}

	private PhoneEntry find(String lookFor) {

		LinkedList<PhoneEntry> x = phoneEntries.get(Math.abs(lookFor.hashCode()
				% numBuckets));

		if (x != null) {
			ListIterator<PhoneEntry> iter = x.listIterator();
			PhoneEntry entry;
			while (iter.hasNext()) {
				entry = iter.next();

				if (lookFor.equals(entry.getName())) {
					return entry;
				}

			}

		}
		return null;
	}

	public String lookup(String lookFor) {
		PhoneEntry x = find(lookFor);
		if (x != null) {
			return x.getNumber();
		}
		return "";

	}

	public boolean changeNumber(String lookFor, String newNum) {
		PhoneEntry x = find(lookFor);
		if (x != null) {
			x.setNumber(newNum);
		}
		return false;
	}
}
