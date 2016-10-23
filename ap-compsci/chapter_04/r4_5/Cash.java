package r4_5;


public class Cash {

	public static void main(String[] args) {
		
		CashRegister register = new CashRegister();
		register.recordPurchase(19.93);
		register.enterPayment(20, 0, 0, 0, 0);
		System.out . print("Your change is ");
		System.out.println(register.giveChange());
		
//	The program prints the total as 0.07000000000000028. Explain why. Give a recommendation
//	to improve the program so that users will not be confused.
		//Floating point types (float, double) suffer from rounding error
		//You can create a final for tolerance
		//then use an if statement to see if it is within the tolerance
		//and round
	}

}
