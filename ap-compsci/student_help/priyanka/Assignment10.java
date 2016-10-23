package priyanka;

import java.util.Scanner;

import jdk.internal.util.xml.impl.Input;
//classes and objects

public class Assignment10
{

	public static void main( String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees are there?");
		int numberemployees = Integer.parseInt(sc.nextLine());
		Employee [] employees = new Employee[numberemployees];

		for(int i = 0; i < numberemployees; i++)
		{
			System.out.println("Enter Employee First Name:");
    		String first =  sc.nextLine();
    		System.out.println("Enter Employee Last Name:");
        	String last = sc.nextLine();
        	System.out.println("Enter Employee Street:");
        	String street = sc.nextLine();
        	System.out.println("Enter Employee City:");
        	String city = sc.nextLine();
        	System.out.println(("Enter Employee State (Initials):"));
        	String state = sc.nextLine();
        	System.out.println("Enter Employee Zip Code (5 Digits):");
        	int zipCode= Integer.parseInt(sc.nextLine());
        	System.out.println("Enter Employee Hire Month (MM):");
        	int empMonth = Integer.parseInt(sc.nextLine());
        	System.out.println("Enter Employee Hire Day (DD):");
        	int empDay = Integer.parseInt(sc.nextLine());
        	System.out.println("Enter Employee Hire Year(YYYY):");
        	int empYear = Integer.parseInt(sc.nextLine());
    		Name name = new  Name(first, last);
    		Address address = new Address(street, city, state, zipCode);
    		Date hireDate = new  Date(empMonth, empDay,empYear);
   			employees[i] = new Employee(name,address,hireDate);
		}
		System.out.println(employees[1]);
    }
}


