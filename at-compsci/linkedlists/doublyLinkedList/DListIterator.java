package doublyLinkedList;

public class DListIterator {

	private DListNode current;
	private DListNode previous;
	private DLinkedList myList;

	public DListIterator(DLinkedList list) {

		myList = list;
		current = list.getFirstNode();
		previous = null;

	}
	public DListNode current(){
		return current;
	}
	public DListNode next()
	{
		previous = current;
		current = current.getNext();
		return previous;
		
	}

	public String toString() 
	{
		return myList.toString();
	}

	public boolean hasPrevious() {
		return previous!=null;
	}

	public boolean hasNext() {
		return (current!=null && current.getNext()!=null);
	}

	public DListNode previous() 
	{
		if(hasPrevious()){
			current = previous;
			previous = previous.getPrevious();
			return previous;
		}
		return null; 
	
	}

	public void remove() // ;-;
	{
		previous.getPrevious().setNext(current);
		current.setPrevious(previous.getPrevious());
	}

	public void add(Object element)
	{
		DListNode n = new DListNode(element, current, previous);
		previous.setNext(n);
	}

	public void set(Object element) {
		current.setValue(element);
	}
}