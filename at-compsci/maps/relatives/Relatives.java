package relatives;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

import static java.lang.System.*;

public class Relatives {
	private Map<String, Set<String>> map;

	public Relatives() {
		map = new TreeMap<String, Set<String>>();
	}

	public void setPersonRelative(String line) {
		String[] personRelative = line.split(" ");
		Set<String> relatives = new TreeSet<String>();
		if (!map.containsKey(personRelative[0])) {

			relatives.add(personRelative[1]);

			map.put(personRelative[0], relatives);
		} else {
			map.get(personRelative[0]).add(personRelative[1]);

		}

	}

	public String getRelatives(String person) {

		Iterator<String> a = map.get(person).iterator();
		String output = "";
		while (a.hasNext()) {
			output += a.next() + " ";
		}
		return output;
	}

	public String toString() {

		Iterator<String> a = map.keySet().iterator();
		String output = "";
		while (a.hasNext()) {
			String person = a.next();
			output += person + " is related to " + getRelatives(person) + "\n";
		}
		return output;
	}
}