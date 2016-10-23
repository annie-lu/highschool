package p6_4;

import java.util.Scanner;

public class OrderNumbers {
	public static void main (String args[])
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter your first number");
		double num1 = keyboard.nextDouble();
		
		System.out.println("Enter your second number");
		double num2 = keyboard.nextDouble();
		
		System.out.println("Enter your third number");
		double num3 = keyboard.nextDouble();
		
		if((num1>num2)&&(num1>num3))
			if(num2>num3)
				System.out.println(num1+" "+num2+" "+num3);
			else
				System.out.println(num1+" "+num3+" "+num2);
		if((num2>num1)&&(num2>num3))
			if(num1>num3)
				System.out.println(num2+" "+num1+" "+num3);
			else
				System.out.println(num2+" "+num3+" "+num1);
		if((num3>num1)&&(num3>num2))
			if(num1>num2)
				System.out.println(num3+" "+num1+" "+num2);
			else 
				System.out.println(num3+" "+num2+" "+num1);
		
	}
	
	
	

}
