package introduction;
import java.util.Iterator;
import java.util.Stack;
public class CDStack {
	Stack <String> myStack;
	
	public CDStack(Stack <String> stack){
		myStack = stack;
			
	}
	
	public String nextCD(){
		return myStack.peek(); //does not remove any elements, returns value
	}
	
	public String playNextCD(){
		return myStack.pop(); //removes, returns removed value
	}
	
	public void printCD() { //uses empty method
		while(!myStack.empty())
			System.out.println(myStack.pop());
	}
	
	public void printCDIterator(){ //uses iterator
		Iterator<String>i=myStack.iterator();
		while(i!=null && i.hasNext())
			System.out.println(i.next());
	}
	
	public void printCDFor(){ //uses for each
		for(String x : myStack)
			System.out.println(x);
	}
	
	public void printCDRecursive(){ //recursively
		if(!myStack.empty()){
			System.out.println(myStack.pop());
			printCDRecursive();
		}
	}
	
	public void reverseStack(){
		Stack <String> temp = new <String> Stack();
		
		while(!myStack.empty())
			temp.push(myStack.pop());
		
		myStack=temp;	
	}
	
	public void convertBinary(int x){
		if(x>0){
			myStack.push(x%2+"");
			convertBinary(x/2);
		} 
		else
			reverseStack();
		
	}
	
	
	

}
