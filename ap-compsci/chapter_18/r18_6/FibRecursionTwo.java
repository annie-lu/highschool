package r18_6;

public class FibRecursionTwo {
	public int fibonacci(int n) {
	 if(n==0)
		  return 0;
		  
		   if(n==1)
		  return 1;
		   
		  
		 
		  return fibonacci((n-2),false)+fibonacci((n-2),false)+ fibonacci((n-1),true);
	}
	
	private int fibonacci(int n,boolean second){
		
	
		if(n==0)
			  return 0;
			  
		if(n==1)
			  return 1;
		if(second)
			return fibonacci(n-2);
			   
			 
			  return fibonacci(n-1)+ fibonacci(n-2);
	}
}
