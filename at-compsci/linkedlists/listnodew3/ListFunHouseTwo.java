package listnodew3;

import static java.lang.System.*;
//implements doubly linked lists

public class ListFunHouseTwo {
	private ListNode theList;
	private ListNode firstNode;

	public ListFunHouseTwo() {
		theList = new ListNode();
	}
	
	private void reset(){
		while (theList != null && theList != firstNode) {
			theList = theList.getPrev();
		}
	}
	public void add(Comparable data) {
		ListNode prev = theList;
		theList.setNext(new ListNode());
		theList = theList.getNext();
		theList.setValue(data);
		theList.setPrev(prev);
		if (firstNode == null)
			firstNode = theList;
		else
			theList.setNext(firstNode);
	}

	// this method will return the number of nodes present in list
	public int nodeCount() {

		int count = 0;
		reset();

		return count;
	}

	// this method will create a new node with the same value as the first node
	// and add this
	// new node at the front of the list. Once finished, the first node will
	// occur twice.
	public void doubleFirst() {

	}

	// this method will create a new node with the same value as the last node
	// and add this
	// new node at the end. Once finished, the last node will occur twice.
	public void doubleLast() {

	}

	// method skipEveryOther will remove every other node
	public void skipEveryOther() {

	}

	// this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value) {
		if (theList != null) {
			int count = nodeCount();

			for (int y = 0; y < count; y++) {
				if (theList != null && y % x == 0)
					theList.setValue(value);
				theList = theList.getNext();
			}
		}

	}

	// this method will remove every xth node in the list
	public void removeXthNode(int x) {

	}

	// this method will return a String containing the entire list
	public String toString() {
		String output = "";

		reset();

		output += theList.getValue() + " ";
		theList = theList.getNext();

		while (theList != null && theList != firstNode) { // you can't run
															// methods on null
			output += theList.getValue() + " ";
			theList = theList.getNext();

		}
		return output;
	}

}