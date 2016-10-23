package numbers;


public class Number
{
	private int theValue; //would be better as static -_-
	
	public Number(int value)
	{
		theValue = value;

	}	
	
	public int getValue()
	{
		return theValue;
	}
	
	public boolean equals(Object obj)
	{
		return theValue==((Number)obj).getValue();
	} 
	
	public int hashCode()
	{
		return theValue%10;
	}

	public String toString()
	{
		return ""+theValue;
	}	
}