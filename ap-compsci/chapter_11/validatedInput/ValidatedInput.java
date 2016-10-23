package validatedInput;

import java.util.Scanner;

public class ValidatedInput
{
	private Scanner scan = new Scanner(System.in);;
	
	// prompt is validator.prompt(), error on invalid input is validator.error()
	// validity check is validator.isValid(...)
	// continues prompting and displaying error until valid input is obtained
	// returns valid input
	public int getInt(Validator<Integer> validator)
	{
		System.out.println(validator.prompt());
		String validatedInput=null;
		while(validatedInput==null){
			String input=scan.nextLine();
			if(!validator.isValid(input))
				System.out.println(validator.error());
			else
				validatedInput=input;
		}
		return Integer.parseInt(validatedInput); // TODO: implement method
	}
	
	// same as above
	// accepts any integer as valid input
	// hint: use AnyIntegerValidator with the above method
	public int getInt()
	{
		return getInt(new AnyIntegerValidator());
	}

	// same as above
	// accepts any integer x such that: min <= x <= max
	// precondition: min <= max
	// hint: define a class IntegerRangeValidator to use with the first method
	public int getInt(int min, int max)
	{
		return getInt(new RangeIntegerValidator(min,max));
		}
}