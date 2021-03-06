package validatedInput;

public class AnyIntegerValidator implements Validator<Integer>
{
	public String error()
	{
		return "Input is not an integer.";
	}

	public String prompt()
	{
		return "Enter an integer.";
	}

	public boolean isValid(String value,int min, int max)
	{
		try
		{
			int x=Integer.parseInt(value);
			if(x>min&&x<max)
			return true;
			else
			return false;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}
	
	public boolean isValid(String value)
	{
		try
		{
			Integer.parseInt(value);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}
}
