package p11_10;

/**
A coin with a monetary value.
*/
public class Coin implements Comparable
{
/**
   Constructs a coin.
   @param aValue the monetary value of the coin
   @param aName the name of the coin
*/
public Coin(double aValue, String aName) 
{ 
   value = aValue; 
   name = aName;
}

/**
   Gets the coin value.
   @return the value
*/
public double getValue() 
{
   return value;
}

/**
   Gets the coin name.
   @return the name
*/
public String getName() 
{
   return name;
}

private double value;
private String name;

	public int compareTo(Object o) {
		((Coin) o).getValue();
		if (((Coin) o).getValue() == (this.getValue()))
			return 0;
		else
			return (int) ((((Coin) o).getValue() - this.getValue())*100);
	}

}