package validatedInput;

public class RangeIntegerValidator implements Validator<Integer>{
	
	private int maximum;
	private int minimum;
	public RangeIntegerValidator(int min,int max){
		maximum=max;
		minimum=min;
	}

	public String prompt() {
		// TODO Auto-generated method stub
		return "Enter an integer that is greater than "+minimum+" and less than "+maximum+ " (inclusive)";
	}

	public String error() {
		// TODO Auto-generated method stub
		return "Input is not an integer OR is not greater than "+minimum+" and less than "+maximum+ " (inclusive)";
	}

	public boolean isValid(String value) {
		// TODO Auto-generated method stub
		try
		{
			int input=Integer.parseInt(value);
			return (input>minimum && maximum>input);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}

}
