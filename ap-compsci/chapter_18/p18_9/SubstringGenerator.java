package p18_9;

import java.util.ArrayList;

public class SubstringGenerator {
	public static void main(String[] args) {
		System.out.println(getSubstrings("cake"));
	}

	public static ArrayList<String> getSubstrings(String x) {

		if (x.length() == 0) {
			ArrayList<String>string = new ArrayList<String>();
			string.add(x);
			return string;
		}

		ArrayList<String> string = getSubstrings(x.substring(0,x.length() - 1));

		for (int y = 0; y < x.length(); y++) {
			string.add(x.substring(y));
		}

		return string;
	}
}
