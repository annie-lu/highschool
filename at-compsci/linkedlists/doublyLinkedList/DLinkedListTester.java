package doublyLinkedList;

import java.util.ListIterator;

public class DLinkedListTester {

	public static void main(String[] args) {
		
		// i like froot :D
		
		// testing linkedlist methods
		System.out.println("LINKED LIST");
		DLinkedList bowl=new DLinkedList();
		
		System.out.println("testing addFirst and addLast methods");
		bowl.addFirst("coconut");
		bowl.addLast("apple");
		bowl.addLast("banana");
		bowl.addLast("cherry");
		bowl.addLast("lemon");
		bowl.addLast("lime");
		bowl.addFirst("mango"); //yas
		
		System.out.println("returns original list");
		System.out.println(bowl);
		
		System.out.println("\nreturn first value/ removed value");
		System.out.println(bowl.removeFirst().getValue());
		System.out.println(bowl);
		System.out.println("\nreturn removed value");
		System.out.println(bowl.removeLast().getValue());
		System.out.println(bowl);
		
		// testing iterator methods
		
		DListIterator iter = bowl.iterator(); //initialize after finished adding/removing elements
		
		System.out.println("\nITERATOR");
		System.out.println("\n"+iter);
		System.out.println("hasPrevious: "+iter.hasPrevious());
		System.out.println("previous: "+iter.next().getValue()); 
		System.out.println("previous: "+iter.next().getValue());
		// testing add method
		System.out.println("add grape");
		iter.add("grape");
		System.out.println(iter);
		// testing remove method
		System.out.println("previous: "+iter.next().getValue()); //should remove this element
		iter.remove();
		System.out.println(iter);
		System.out.println("hasNext: "+iter.hasNext());
		System.out.println("current: "+iter.current().getValue()); // checks if current is in correct position
		
		System.out.println("previous: "+iter.next().getValue());
		System.out.println("previous: "+iter.next().getValue());
		System.out.println("hasPrevious: "+iter.hasPrevious());
		System.out.println("hasNext: "+iter.hasNext());
		
		System.out.println(iter);

	}

}
