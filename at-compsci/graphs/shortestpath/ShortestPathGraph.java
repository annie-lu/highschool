package shortestpath;

import java.util.Iterator;
import java.util.TreeMap;

public class ShortestPathGraph {
	private TreeMap<String, String> map;

	public ShortestPathGraph(String line) {
		if (map == null)
			map = new TreeMap();
		for (int x = 0; x < line.length(); x = x + 3) {
			if (!map.containsKey(line.substring(x, x + 1))) {
				map.put(line.substring(x, x + 1), line.substring(x + 1, x + 2));
			} else {
				map.replace(
						line.substring(x, x + 1),
						map.get(line.substring(x, x + 1))
								+ line.substring(x + 1, x + 2));
			}
			if (!map.containsKey(line.substring(x + 1, x + 2))) {
				map.put(line.substring(x + 1, x + 2), line.substring(x, x + 1));
			} else {
				map.replace(
						line.substring(x + 1, x + 2),
						map.get(line.substring(x + 1, x + 2))
								+ line.substring(x, x + 1));
			}
		}
	}

	public boolean contains(String letter) {
		return map.containsKey(letter);
	}

	public boolean directCheck(String first, String second) {
		if (first.equals(second))
			return true;
		if (!map.containsKey(first) || !map.containsKey(second)) {
			return false;
		} else {
			CharSequence x = second;
			return (map.get(first)).contains(x);
		}
	}


	public String findShortest(String first, String second, String placesUsed) {

		if (directCheck(first, second))
			return first + second;
		
		String connections = map.get(first);
		
		String pathOne="";
		String pathTwo="";
		
		for(int i=0; i<connections.length(); i++){
			if(!placesUsed.contains(connections.substring(i,i+1)) && check(connections.substring(i,i+1),second,placesUsed+first)){
				if(pathOne=="")
					pathOne=findShortest(connections.substring(i,i+1),second,placesUsed+first);
				else
					pathTwo=findShortest(connections.substring(i,i+1),second,placesUsed+first);
			}
		}
		
		
			if(pathOne!=""&&pathTwo!=""){
				if(pathOne.length()<pathTwo.length())
					return first+pathOne;
				else
					return second+pathTwo;
			}
			else if(pathTwo!="")
				return second+pathTwo;
			else
				return first+pathOne;
			
	}

	public boolean check(String first, String second, String placesUsed) {
		
		if (directCheck(first, second)) {
			return true;
		} else {
			String x = map.get(first);
			if (x == null) {
				//System.out.println(first + " " + second);
				return false;
			}

			for (int i = 0; i < x.length(); i++) {
				if (!placesUsed.contains(x.substring(i, i + 1))) {
					if (check(x.substring(i, i + 1), second, placesUsed + first)) {
						return true;
					}

				}

			}
			return false;
		}
	}

	public String toString() {
		String output = "";
		Iterator<String> a = map.keySet().iterator();
		while (a.hasNext()) {
			String character = a.next();
			output += character + "\t";
			String lim = map.get(character + "");

			output += lim + "\n";
		}
		return output;
	}
}
