package listnodew1;
import java.util.LinkedList;


public class ListTester {
	public static void main(String[] args) {
		LinkedList<String> bowl=new LinkedList<String>();
		bowl.addLast("apple");
		bowl.addLast("banana");
		bowl.addLast("cherry");
		bowl.addLast("lemon");
		bowl.addLast("lime");
		bowl.addLast("orange");
		bowl.addLast("papaya");
		bowl.addLast("strawberry");
		
		ListMethods.duplicate(bowl);
		System.out.println("");
		ListMethods.alphabetOrder(bowl, "zebra");
		ListMethods.print(bowl);
		System.out.println("");
		ListMethods.delete(bowl, "strawberry");
		ListMethods.print(bowl);
		System.out.println("");
		ListMethods.repeat(bowl);
	}
}
