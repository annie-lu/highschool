package bank;

public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount harry= new  BankAccount(500000000);
		
		System.out.println(harry.getBalance());
		
		harry.withdraw(20);
		harry.withdraw(20);
		harry.withdraw(20);
		harry.withdraw(20);
		harry.withdraw(20);
		harry.deposit(20);
		harry.deposit(20);
		harry.deposit(20);
		harry.deductMonthlyCharge();
		
		System.out.println(harry.getBalance());
	}

}
