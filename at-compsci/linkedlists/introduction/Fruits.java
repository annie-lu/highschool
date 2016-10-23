package introduction;
import java.util.LinkedList;
import java.util.ListIterator;

public class Fruits {
	LinkedList<String> bowl;
	
	//1. Default constructor
	public Fruits(){
		
		// bowl=new LinkedList();
		
		bowl=new LinkedList<String>();
		bowl.addLast("apple");
		bowl.addLast("banana");
		bowl.addLast("cherry");
		bowl.addLast("lemon");
		bowl.addLast("lime");
		bowl.addLast("orange");
		bowl.addLast("papaya");
		bowl.addLast("strawberry");
		//bowl.addLast("watermelon");
	}
	
	public void displayFruit(){
		ListIterator<String> iter = bowl.listIterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
			if(iter.hasNext())
			iter.next();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits fruitSalad=new Fruits();
		fruitSalad.displayFruit();

	}

}
