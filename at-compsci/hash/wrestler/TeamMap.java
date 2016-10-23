package wrestler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

import numbers.Number;

public class TeamMap {
	HashMap<Integer, Wrestler> team;

	public TeamMap() {
		team = new HashMap<Integer, Wrestler>();
	}

	public void add(Wrestler wrestler) {
		team.put(decideGroup(wrestler), wrestler);
	}

	private int decideGroup(Wrestler wrestler) {
		if (100 <= wrestler.getWeight() && wrestler.getWeight() <= 110) {
			return 0;
		} else if (110 <= wrestler.getWeight() && wrestler.getWeight() <= 120) {
			return 1;
		} else if (120 <= wrestler.getWeight() && wrestler.getWeight() <= 130) {
			return 2;
		} else if (130 <= wrestler.getWeight() && wrestler.getWeight() <= 140) {
			return 3;
		} else if (140 <= wrestler.getWeight() && wrestler.getWeight() <= 150) {
			return 4;
		} else if (150 <= wrestler.getWeight() && wrestler.getWeight() <= 160) {
			return 5;
		} else if (160 <= wrestler.getWeight() && wrestler.getWeight() <= 170) {
			return 6;
		} else if (170 <= wrestler.getWeight() && wrestler.getWeight() <= 180) {
			return 7;
		} else if (180 <= wrestler.getWeight() && wrestler.getWeight() <= 190) {
			return 8;
		} else if (190 <= wrestler.getWeight() && wrestler.getWeight() <= 200) {
			return 9;
		}
		return -1;
	}

	public void changeWeightGroup(Wrestler wrestler, int i) {
		team.remove(wrestler);
		team.put(i, wrestler);
	}

	public String get(Wrestler wrestler) {

		return decideGroup(wrestler) + "";
	}

	public String toString() {

		String output = "";

		int x = 0;
		Iterator iter = team.keySet().iterator();

		while (iter.hasNext()) {
			x = (int) iter.next();
			output += x + " " + team.get(x);
			output += "\n";

		}

		return output;

	}

}
