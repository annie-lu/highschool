package listnodew3;

import listnodew2.Linkable;

public class ListNode implements Linkable
{
	private Comparable listNodeValue;
	private ListNode nextListNode;
	private ListNode prevListNode;

	public ListNode()
	{
		listNodeValue = null;
		nextListNode = null;
		prevListNode=null;
	}

	public ListNode(Comparable value, ListNode next, ListNode prev)
	{
		listNodeValue=value;
		nextListNode=next;
		prevListNode=prev;
	}

	public Comparable getValue()
	{
		return listNodeValue;
	}

	public ListNode getNext()
	{
	   return nextListNode;
	}
	
	public ListNode getPrev()
	{
		return prevListNode;
	}
	public void setValue(Comparable value)
	{
		listNodeValue = value;
	}

	public void setNext(Linkable next)
	{
		nextListNode = (ListNode)next;
	}
	
	public void setPrev(Linkable prev)
	{
		prevListNode = (ListNode)prev;
	}
}