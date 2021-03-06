package translate;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

import static java.lang.System.*;

public class SpanishToEnglish {
	private Map<String, String> pairs;

	public SpanishToEnglish() {
		pairs = new TreeMap<String, String>();
	}

	public void putEntry(String entry) {
		String[] list = entry.split(" ");
		pairs.put(list[0], list[1]);
	}

	public String translate(String sent) {
		String output = "";
		String[] list = sent.split(" ");
		for (String x : list) {
			output += pairs.get(x) + " ";
		}
		return output;
	}

	public String toString() {
		return pairs.toString().replaceAll("\\,", "\n");
	}
}