package review;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class review {

	public static void main(String[] args) {
		
		System.out.println("QUEUE");
		Queue x=new LinkedList<String>(); //implement as linked list
		x.add("apple");
		x.add("kiwi");
		x.add("mango");
		x.add("banana");
		x.add("dragonfruit");
		System.out.println(x);
		System.out.println(x.remove()); //nosuchelementexception if queue is empty
		System.out.println(x.peek()); //returns null if queue is empty
		System.out.println(x.poll()); //returns null if queue is empty
		System.out.println(x);
		System.out.println("");
		
		System.out.println("PRIORITY QUEUE");
		PriorityQueue y= new PriorityQueue<String>();
		y.add("apple");
		y.add("kiwi");
		y.add("mango");
		y.add("banana");
		System.out.println(y); //first element is first in alphabet
		System.out.println(y.peek());
		System.out.println(y.poll());
		System.out.println(y);
		System.out.println(y.peek());
		System.out.println(y.poll());
		System.out.println(y);
		System.out.println(y.peek());
		System.out.println(y.poll()); //fs
		System.out.println(y);
		System.out.println(y.peek());
		System.out.println(y.poll());
		
	
	}

}
