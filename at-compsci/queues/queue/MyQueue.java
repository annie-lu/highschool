package queue;

import java.util.ArrayList;

public class MyQueue {
	private ArrayList<Object> a=new ArrayList();

	public Object offer(Object item){
		a.add(item);
		return item;
	}; //similar to push with Stacks 

	public Object poll(){
		Object temp=a.get(0);
		a.remove(0);
		return temp;
		
	};  //similar to pop with Stacks 

	public Object peek(){
		return a.get(0);
	};

	public boolean isEmpty(){
		return a==null || a.size()==0;
	};

	public int size(){
		return a.size();
	}; 

	public int search (Object z){
		if(a.indexOf(z)<0)
			return a.indexOf(z);
		else
			return a.indexOf(z)+1;
	}; 

	public String toString(){
		String x="";
		for(Object z: a)
			x+=z+" ";
		return x;
	};
}
