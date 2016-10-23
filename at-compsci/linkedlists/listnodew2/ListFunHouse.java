package listnodew2;

import static java.lang.System.*;

public class ListFunHouse {
	
	// this method will print the entire list on the screen
	
	public static void print(ListNode list) {
		
		while (list != null) { // you can't run methods on null
			out.println(list.getValue());
			list = list.getNext();
		}
		
	}

	// this method will return the number of nodes present in list
	public static int nodeCount(ListNode list) {
		int count = 0;
		
		while (list != null) {
			count++;
			list = list.getNext();
		}
		
		return count;
	}

	// this method will create a new node with the same value as the first node
	// and add this
	// new node to the list. Once finished, the first node will occur twice.
	// first or last
	public static void doubleFirst(ListNode list) {
		
		if(list!=null){
			ListNode temp = new ListNode(list.getValue(), null);
			
			while (list.getNext() != null) {
				list = list.getNext();
			}
			
			list.setNext(temp);
		}
	}

	// this method will create a new node with the same value as the last node
	// and add this
	// new node at the end. Once finished, the last node will occur twice.
	// first or last
	public static void doubleLast(ListNode list) {
		if(list!=null){
			while (list.getNext() != null) {
				list = list.getNext();
			}
			
			list.setNext(new ListNode(list.getValue(), null));
		}
	}

	// method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list) {
		if(list!=null){
		removeXthNode(list, 2);
		}
	}

	// this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value) {
		if(list!=null){
		int count = nodeCount(list);

		for (int y = 0; y < count; y++) {
			if (list != null && y % x == 0)
				list.setValue(value);
			list = list.getNext();
		}
		}
	}

	// this method will remove every xth node in the list
	// no
	public static void removeXthNode(ListNode list, int x) {
		if(list!=null){
		int count = nodeCount(list);
		ListNode temp = new ListNode(list.getValue(), list.getNext());

		for (int y = 0; y < count; y++) {
			if (y == x * ((count - 1) / x)) {
				list.setValue(temp.getValue());
				list.setNext(null);
			} else if (y % x == 0) {
				list.setValue(temp.getValue());
				list = list.getNext();
			}
			
			temp = temp.getNext();
		}
	}
	}
}
