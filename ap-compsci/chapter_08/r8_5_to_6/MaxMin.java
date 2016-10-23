package r8_5_to_6;

import bank.BankAccount;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount largetYet=accounts.get(0);
for(int i=1;i<accounts.size();i++)
{
	BankAccount a=accounts.get(i);
	if(a.getBalance()>largestYet.getBalance())
		largestYet=a;
}
return largestYet;
	}

}
