package doublyLinkedList;

public class DLinkedList {

	private DListNode firstNode;

	private DListNode lastNode;

	/**
	 * 
	 * Construct an empty list
	 */

	public DLinkedList() {

		firstNode = null;

		lastNode = null;

	}

	public DListNode getFirstNode() 
	{
		return firstNode;
	}

	public void setFirstNode(DListNode firstNode) 
	{
		this.firstNode = firstNode;
	}

	public DListNode getLastNode() 
	{
		return lastNode;
	}

	public void setLastNode(DListNode lastNode) 
	{
		this.lastNode = lastNode;
	}

	/**
	 * 
	 * Returns true if the list contains no elements
	 */

	public boolean isEmpty() 
	{
		return (firstNode==null);
	}

	/**
	 * 
	 * Inserts the argument as the first element of this list.
	 */

	public void addFirst(Object o) 
	{
		if(isEmpty()){
			firstNode=new DListNode(o,null,null);
			lastNode=firstNode;
		}
		else{
			firstNode=new DListNode(o, firstNode,null);
			firstNode.getNext().setPrevious(firstNode);
		}
	}

	/**
	 * 
	 * Inserts the argument as the last element of this list.
	 */

	public void addLast(Object o) 
	{
		if(isEmpty()){
			lastNode=new DListNode(o,null,null);
			firstNode=lastNode;
		}
		else{
			lastNode=new DListNode(o, null,lastNode);
			lastNode.getPrevious().setNext(lastNode);
		}
	}

	/**
	 * 
	 * Removes and returns the first element of this list.
	 */

	public DListNode removeFirst() 
	{
		DListNode temp = firstNode;
		firstNode = firstNode.getNext();
		firstNode.setPrevious(null);
		return temp;
	}

	/**
	 * 
	 * Removes and returns the last element of this list.
	 */

	public DListNode removeLast() 
	{
		DListNode temp = lastNode;
		lastNode = lastNode.getPrevious();
		lastNode.setNext(null);
		return temp;
	}

	/**
	 * 
	 * Returns a String representation of the list.
	 */

	public String toString() 
	{
		DListNode temp = firstNode;
		String s = "";
		while(temp != null)
		{
			s += temp.getValue() + " ";
			temp = temp.getNext();
		}
		return s;
	}

	/**
	 * 
	 * Returns the number of elements in the list as an int.
	 */

	public int size() 
	{
		DListNode temp = firstNode;
		int count = 0;
		while(temp != null)
		{
			count++;
			temp = temp.getNext();
		}
		return count;
	}

	/**
	 * 
	 * Removes all of the elements from this list.
	 */

	private void clear() 
	{
		firstNode = null;
		lastNode = null;
	}

	/**
	 * 
	 * Returns a DListIterator.
	 */
	

	public DListIterator iterator() 
	{ 
		return new DListIterator(this);
	}
}