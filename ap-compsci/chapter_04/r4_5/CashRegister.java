package r4_5;

public class CashRegister {
	public static final double QUARTER_VALUE = 0.25 ;
	public static final double DIME_VALUE = 0.1 ;
	
	 public static final double NICKEL_VALUE = 0.05 ;
	 public static final double PENNY_VALUE = 0.01;
	
	 private double purchase;
	private double payment;
	private double change;

	public CashRegister()
	{
		purchase = 0 ;
		payment = 0 ;
	}
	
	
	public void recordPurchase(double amount)
	{
		purchase = purchase + amount;
	}
	

	
	public void enterPayment(int dollars, int quarters,
	int dimes, int nickels, int pennies)
	{
		payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
				+ nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
	}
	
	public double giveChange()
	{
		change= payment - purchase;
		purchase = 0 ;
		payment = 0 ;
		return change;
	}
	
	public int giveDollars(){
		int dollars=(int) (change/1);
		change=change%1;
		return dollars;
	}
	
	public int giveQuarters(){
		int quarters=(int) (change/0.25);
		change=change%0.25;
		return quarters;
	}
	
	public int giveDimes(){
		int dimes=(int) (change/0.15);
		change=change%0.15;
		return dimes;
	}
	
	public int giveNickels(){
		int nickels=(int) (change/1);
		change=change%0.05;
		return nickels;
	}
	
	public int givePennies(){
		int pennies=(int) (change/0.01);
		change=change%0.01;
		return pennies;
	}


}
