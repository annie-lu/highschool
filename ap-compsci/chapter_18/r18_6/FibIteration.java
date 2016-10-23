package r18_6;

public class FibIteration {
	public int fibonacci(int n) {
		int number=0;
		int previousNumber=1;
		int previousNumberTwo=0; //wao think of not so stupid variable names
			  
		 for(int x=1;x<n;x++){
			 number=previousNumber+previousNumberTwo;
			 previousNumberTwo=previousNumber;
			 previousNumber=number;
		 }
			  return number;
	}
}
