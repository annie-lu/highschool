package listnodew5_2;

import listnodew2.ListNode;
import listnodew4.HistoNode;
import listnodew5_1.ThingCount;

public class HistoList {
	private ListNode front;

	public HistoList() {
	}

	// ADDS NEW NODE TO THE FRONT OF THE LIST FOR LET IF IT DOES NOT EXIST.
	// IF IT EXISTS, IT BUMPS UP LET'S COUNT BY ONE
	public void add(Object obj) { //💩
		if (front != null) {
			ListNode temp = front;
			ThingCount tempThing = ((ThingCount) temp.getValue());
			if (tempThing.equals(obj)) { //maybe make a private method so its not as bad?
				tempThing.setCount(tempThing.getCount() + 1);
				return; // idk if this a decent way to stop
			}
			while (temp.getNext() != null && !tempThing.equals(obj)) {
				temp = temp.getNext();
				tempThing = ((ThingCount) temp.getValue());
				if (tempThing.equals(obj)) {
					tempThing.setCount(tempThing.getCount() + 1);
					return; // idk if this a decent way
				}
			}
			ListNode z = front;
			front = new ListNode(new ThingCount(obj, 1), z);
		} else
			front = new ListNode(new ThingCount(obj, 1), null);
	}

	// RETURNS THE INDEX POSITION OF LET IN THE LIST
	public int indexOf(Object obj) {
		int spot = -1;
		return -1;
	}

	// RETURNS A REFERENCE TO THE NODE AT SPOT
	private ListNode nodeAt(int spot) {
		ListNode current = front;
		return current;
	}

	// RETURNS THE LIST AS A BIG STRING
	public String toString() {

		ThingCount x = (ThingCount) (front.getValue()); 
		String histoList = x.getThing() + ": " + x.getCount();
		ListNode temp = front.getNext();
		while (temp != null) {
			x = (ThingCount) (temp.getValue());
			histoList += "\t" + x.getThing() + ": " + x.getCount();
			temp = temp.getNext();
		}
		return histoList;
	}
}