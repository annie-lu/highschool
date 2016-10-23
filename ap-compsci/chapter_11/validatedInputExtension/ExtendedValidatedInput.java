package validatedInputExtension;

import java.util.Scanner;

public class ExtendedValidatedInput {

	private Scanner scan = new Scanner(System.in);

	// prompt is validator.prompt(), error on invalid input is validator.error()
	// validity check is validator.isValid(...)
	// continues prompting and displaying error until valid input is obtained
	// returns valid input
	public int getInt(Validator<Integer> validator) {
		System.out.println(validator.prompt());
		String validatedInput = null;
		while (validatedInput == null) {
			validatedInput = this.validation(validator);
		}
		return Integer.parseInt(validatedInput); // TODO: implement method
	}

	private String validation(Validator validator) {
		System.out.println(validator.prompt());
		String input = scan.nextLine();
		String validatedInput = null;
		if (!validator.isValid(input))
			System.out.println(validator.error());
		else
			validatedInput = input;
		return validatedInput;
	}

	// same as above
	// accepts any integer as valid input
	// hint: use AnyIntegerValidator with the above method
	public int getInt() {
		return getInt(new AnyIntegerValidator());
	}

	// same as above
	// accepts any integer x such that: min <= x <= max
	// precondition: min <= max
	// hint: define a class IntegerRangeValidator to use with the first method
	public int getInt(int min, int max) {
		return getInt(new RangeIntegerValidator(min, max));
	}

	public boolean repeats(Validator validator, int chances) {
		boolean validated = false;
		int redo = 0;
		while (!validated && redo < chances) {
			redo++;
			if (this.validation(validator) != null)
				validated = true;
		}

		return validated; // TODO: implement method
	}
}
