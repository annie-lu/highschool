package listnodew1;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListMethods {
	public static void print(LinkedList staff) {
		ListIterator iterator = staff.listIterator();
		String list = "";
		
		while (iterator.hasNext()) {
			list += (String) iterator.next() + " ";
		}
		
		System.out.print(list);
	}

	public static void duplicate(LinkedList staff) {
		ListIterator iterator = staff.listIterator();
		String name = "";
		
		while (iterator.hasNext()) {
			name = (String) iterator.next();
			System.out.print(name + " " + name + " ");
		}
		
	}

	public static void repeat(LinkedList staff) {
		ListIterator iterator = staff.listIterator();
		String list = "";
		
		while (iterator.hasNext()) {
			list += (String) iterator.next() + " ";
		}
		
		System.out.print(list + list);
	}

	public static void delete(LinkedList staff, String searchFor) {
		ListIterator iterator = staff.listIterator();
		
		while (iterator.hasNext()) {
			String next = (String) iterator.next();
			if (next.equals(searchFor)) {
				iterator.remove();
				return;
			}
		}
		
	}

	public static void alphabetOrder(LinkedList staff, String searchFor) {
		ListIterator iterator = staff.listIterator();
		
		while (iterator.hasNext()) {
			String next = (String) iterator.next();
			if (searchFor.compareTo(next) < 0) {
				iterator.previous();
				iterator.add(searchFor);
				return;
			}
		}
		
		iterator.add(searchFor);
	}
}
