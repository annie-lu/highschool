package p6_14;

import java.util.Scanner;

public class CompareNumbers {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		final double TOLERANCE=0.01;
		
		System.out.println("Enter your first number");
		double number1 = keyboard.nextDouble();
		
		System.out.println("Enter your second number");
		double number2 = keyboard.nextDouble();
		
		
		
			if(Math.abs(number1-number2)<TOLERANCE)
				System.out.println("ITS THE SAME NUMBER :D");
			else 
				System.out.println("no ew :c");
	
		}
	

}
