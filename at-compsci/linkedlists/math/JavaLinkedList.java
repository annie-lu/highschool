package math;

import java.util.LinkedList;
import java.util.ListIterator;

import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{double total=0;
	ListIterator<Integer> iterator = list.listIterator();
		while (iterator.hasNext()) {
		total+=iterator.next();
		}
		return total;
	}

	public double getAvg(  )
	{
		double total=0;
		double amount=0;
		ListIterator<Integer> iterator = list.listIterator();
			while (iterator.hasNext()) {
			total+=iterator.next();
			amount++;
			}
			return total/amount;
		
	}

	public int getLargest()
	{
		ListIterator<Integer> iterator = list.listIterator();
		int largest=Integer.MIN_VALUE;
		while (iterator.hasNext()) {
			if(largest<iterator.next()){
				iterator.previous();
				largest=iterator.next();
			}
		}
		
		return largest;
	}

	public int getSmallest()
	{
		int smallest =Integer.MAX_VALUE;
		ListIterator<Integer> iterator = list.listIterator();
		while (iterator.hasNext()) {
			if(smallest>iterator.next()){
				iterator.previous();
				smallest=iterator.next();
			}
		}
		return smallest;
	}

	public String toString()
	{
		String output=" SUM:"+getSum()+" AVG:"+getAvg()+" SMALLEST:"+getSmallest()+" LARGEST:"+getLargest();
		return output;
	}
}