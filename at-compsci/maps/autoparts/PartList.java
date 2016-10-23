package autoparts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class PartList {
	private TreeMap<Part, Integer> partsMap;

	public PartList() {
		partsMap = new TreeMap<Part, Integer>();
	}

	public PartList(String fileName) throws FileNotFoundException, IOException {
		partsMap = new TreeMap<Part, Integer>();
		try (BufferedReader br = new BufferedReader(new FileReader("Files/" + fileName))) {
			String line = br.readLine();
			
		while (line != null) {
				Part x = new Part(line);
				if (!partsMap.containsKey(x))
					partsMap.put(x, 1);
				else
					partsMap.replace(x, partsMap.get(x) + 1);
			
				line = br.readLine();
			}
		}
	}

	public String toString() {
		return partsMap.toString().replaceAll("\\,", "\n");
	}
	
}