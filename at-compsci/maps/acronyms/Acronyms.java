package acronyms;

import java.util.Map;
import java.util.TreeMap;

public class Acronyms {
	private Map<String, String> acronymTable;

	public Acronyms() {

		acronymTable = new TreeMap<String, String>();

	}

	public void putEntry(String entry) {
		String[] list = entry.split(" ");
		String a = "";
		for (int x = 2; x < list.length; x++)
			a += list[x] + " ";

		acronymTable.put(list[0], a);

	}

	public String convert(String sent) {
		String output = "";
		String[] list = sent.split(" ");
		
		for (String x : list) {
			String y = x.replace('.', ' ').trim();
			if (acronymTable.containsKey(y)) {
				if (x.contains(".")) {
					output += acronymTable.get(y).trim() + ".";
				} 
				else {
					output += acronymTable.get(y) + " ";
				}
			}
			else
				output += x + " ";
		}
		
		return output;

	}

	public String toString() {
		return acronymTable.toString().replaceAll("\\,", "\n");
	}
}