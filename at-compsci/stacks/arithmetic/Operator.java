package arithmetic;

public class Operator implements Comparable {

	String operator;
	public Operator(String x){
		operator=x;
	}
	
	public int compareTo(Object other) //assume its a string
	{
		String a = (String) other;
		 switch (operator) 
		 {
		 
         case "+": case "-":
        	 switch(a){
        	 case "+": case "-":
        		 return 0;
        	 case "*": case "/": case "^":
        		 return 1;
        	 }
        	break;
                 
         case "*": case "/":
        	 switch(a){
        	 case "+": case "-":
        		 return -1;
        	 case "*": case "/": 
        		 return 0;
        	 case "^":
        		 return 1;
        	 }
        	 break;
         
         case "^":
        	 if(operator.equals("^"))
        		 return 0;
        	 return -1;
        	 
        default:
        	return 0;
        	 
		 }
		return 0;
	}

	public double operate(double a, double b)
	{
		double y;
		
		 switch (operator) 
		 {
		 
         case "+":
        	 y = a + b;
        	 return y;
                
         case "-":  
        	 y = a - b;
        	 return y;
                  
         case "*": 
        	 y = a * b;
        	 return y;
        	 
         case "/":
        	 y = a / b;
        	 return y;
         case "^":
        	 y = Math.pow(a, b);
        	 return y;
        default:
        	return 0;
        	 
		 }
	}	
	
}
