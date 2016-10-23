package savings;

public class SavingsAccount {
	public double balance, interest;

	public SavingsAccount(double initialBalance, double interestRate) {
		initialBalance = balance;
		interestRate = interest;
	}

	public void addInterest() {
		balance = this.balance + this.balance * this.interest;

	}

}
