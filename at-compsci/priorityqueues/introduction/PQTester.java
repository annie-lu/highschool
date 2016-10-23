package introduction;

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private PriorityQueue<String> pQueue;

	public PQTester()
	{
		pQueue=new PriorityQueue<String>();
	}

	public PQTester(String list)
	{
		pQueue=new PriorityQueue<String>();
		String data[]=list.split(" ");
		int x=0;
		while(x<data.length){
		pQueue.add(data[x]);
		x++;
		}
	}

	public void setPQ(String list)
	{
		String data[]=list.split(" ");
		int x=0;
		while(data.length>0){
		pQueue.add(data[x]);
		x++;
		}
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		while(!pQueue.isEmpty()){
			output+=pQueue.remove()+" ";
		}
		return output;		
	}

	public String toString(){
		return pQueue+"";
	}
	//write a toString method
}