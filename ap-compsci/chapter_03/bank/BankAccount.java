package bank;

public class BankAccount {
	private double balance;
	private double fee;
	private int deposit;
	private int withdraw;

	public BankAccount() {
		balance = 0.0;
	}

	public BankAccount(double initialbalance) {
		balance = initialbalance;
	}

	public void deposit(double amount) {
		double newBalance = balance + amount;
		balance = newBalance;
		deposit++;
		if ((deposit + withdraw) > 10) {
			fee++;}
	}

	public void withdraw(double amount) {
		double newBalance = balance - amount;
		balance = newBalance;
		withdraw++;
		if ((deposit + withdraw) > 10) {
			fee++;}
	}

	public double getBalance() {
		return balance;
	}

	public void deductMonthlyCharge() {
		balance = balance - fee;
		fee = 0;
		deposit = 0;
		withdraw = 0;
	}

}
