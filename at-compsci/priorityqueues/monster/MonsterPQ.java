package monster;

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class MonsterPQ  
{
	private PriorityQueue<Monster> pQueue;

	public MonsterPQ()
	{
		pQueue=new PriorityQueue<Monster>();
	}

	public void add(Monster obj)
	{
		pQueue.add(obj);
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public Object removeMin()
	{
		return pQueue.remove();
	}
	
	public String getNaturalOrder()
	{
		Object[] temp = pQueue.toArray();
		String output="";
			for( Object x: temp)
			output+=x+" ";
		
		return output;			
	}

	public String toString(){
		return pQueue+"";
	}
	//write a toString method
}