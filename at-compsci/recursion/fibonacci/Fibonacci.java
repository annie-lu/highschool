package fibonacci;

public class Fibonacci {
	public static int fib(int num){
		if(num<=2)
			return 1;
		return fib(num-2)+fib(num-1);
		
	}

}
