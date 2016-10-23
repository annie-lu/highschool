package p6_17;

import java.util.Scanner;

public class UnitConverterTester {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter your units");
		String unicorn= keyboard.nextLine();
		
		System.out.println("Enter the number");
		double num = Double.parseDouble(keyboard.nextLine());
		
		System.out.println("Enter the units you want to convert to");
		String unicycle = keyboard.nextLine();
		
		UnitConverter thing= new UnitConverter(unicorn, unicycle, num);
		System.out.println(thing.Conversion()+" "+unicycle);
	}
}
