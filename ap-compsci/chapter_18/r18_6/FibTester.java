package r18_6;

public class FibTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long Start=System.currentTimeMillis();
		FibIteration fib=new FibIteration();
		int fibonacci=fib.fibonacci(46);
		Long End=System.currentTimeMillis();
		Long Difference=End-Start;
		System.out.println(fibonacci+" "+Difference);
		
		 Start=System.currentTimeMillis();
		FibRecursion feb=new FibRecursion();
		int feburary=feb.fibonacci(46);
		End=System.currentTimeMillis();
		Difference=End-Start;
		System.out.println(feburary+" "+Difference);
		
		Start=System.currentTimeMillis();
		FibRecursionTwo fab=new FibRecursionTwo();
		int fabulous=fab.fibonacci(46);
		End=System.currentTimeMillis();
		Difference=End-Start;
		System.out.println(fabulous+" "+Difference);
		
		
	}

}
