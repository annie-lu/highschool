package r18_6;

public class FibRecursion {
 
	
	public int fibonacci(int n) {
//		Long Start=System.currentTimeMillis();
		  if(n==0 || n==1)
		  return n;
		 
		  return fibonacci(n-1)+ fibonacci(n-2);
//		  Long End=System.currentTimeMillis();
//		  Long Difference=End-Start;
		}
}
