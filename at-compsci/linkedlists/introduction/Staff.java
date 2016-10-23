package introduction;
import java.util.*;

import listnodew1.ListMethods;
public class Staff {
public static void main(String[] args) {
		
		LinkedList<String> staff= new LinkedList<String>();
		staff.add("Harry");
		staff.add("Tom");
		staff.add("Jane");
		staff.add("Romeo");
		
		ListMethods.duplicate(staff);
		System.out.println("");
		ListMethods.repeat(staff);
		ListMethods.delete(staff,"Romeo");
		System.out.println("");
		ListMethods.duplicate(staff);
}
}