package chapter_13;

public class TimeDepositAccount extends BankAccount {
	private int rate, months;
	private final int PENALTY = 100;
	private double balance;
	
	public TimeDepositAccount(int rate, int months)
	{
		this.rate = rate;
		this.months = months;
		balance = getBalance();
	}
	
	/**
	 * Adds the earned interest to the account balance.
	 */
	public void addInterest()
	{
		deposit(getBalance() * rate / 100);
		months--;
	}
	
	/**
   	 * Withdraws money from the bank account.
     * @param amount the amount to withdraw
	 */
	public void withdraw(double amount) 
	{  
		balance = balance - amount;
		if(months > 0)
			balance -= PENALTY;
	}
}
