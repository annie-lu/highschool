package validatedInputExtension;

public class Tester
{
	public static void main(String[] args)
	{
		ExtendedValidatedInput vi = new ExtendedValidatedInput();
	
		// get any integer
		if(vi.repeats(new SimplePasswordValidator("Hello"), 3))
		System.out.println("true");
		else
		System.out.println("false");
		
		// get integer x such that: 10 <= x <= 50
	
		
		// TODO: make a new implementation of validator that validates
		//		 input with your choice of criteria (ex: divisible by
		//		 a specified number. Use it to test the method below.
		//int mine = vi.getInt(/* TODO: appropriate parameter */);
		//System.out.println("User entered: " + mine);
	}
}