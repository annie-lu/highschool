package introduction;

import java.util.*;
public class Students {

	public static void main(String[] args) {
		
		LinkedList<String> roster= new LinkedList<String>();
		roster.addLast("Priya");
		roster.addLast("Dan");
		roster.addFirst("Jason");
		roster.addFirst("Vishal");
		roster.addLast("Teja");
		System.out.println(roster);
		roster.add("Ashay"); //by default goes to end
		System.out.println(roster);
		//traverse through with iterators
		//System.out.println(roster.remove());
		
	//System.out.println(roster.remove()); //removes first
	//System.out.println(roster);
	
	//roster.removeFirst();
	//System.out.println(roster);
	
	System.out.println(roster.removeLast());
	System.out.println(roster);
	
	
	
	ListIterator<String> iter = roster.listIterator();
	//you don't know number index of object, only knows next and previous
	//know the position of the cursor starts at front
	iter.add("Koushik"); //adds koushik at the cursor
	
	System.out.println(roster);
	iter.add("Viren");
	System.out.println(roster);
	iter.next();
	iter.add("Aditya");
	iter.remove();
	
	System.out.println(roster);
	System.out.println(iter.next());
	System.out.println(iter.previous());
	
	System.out.println("TESTING REMOVE");
	iter.next();
	iter.next();
	iter.previous();
	iter.next();
	iter.next();
	iter.next();
	iter.next();
	
	
	//iter.remove(); //depends on the last thing you did > remove last next()
	//System.out.println(roster);
	//
	//iter.previous();
	
	while(iter.hasNext())
		iter.next();
	
	while(iter.hasPrevious())
	System.out.println(iter.previous());
	}

}
