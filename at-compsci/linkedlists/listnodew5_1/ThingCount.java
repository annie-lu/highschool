package listnodew5_1;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -   
//Lab  -

public class ThingCount implements Comparable
{
	private int count;
	private Object thing;
	
	public ThingCount()
	{
	}
	
	public ThingCount(Object thang, int cnt)
	{
		thing=thang;
		count=cnt;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount(int cnt)
	{
		count=cnt;
	}

	public void setThing(Object obj)
	{
		thing=obj;
	}	
	
	public Object getThing()
	{
		return thing;
	}
	
	public boolean equals(Object obj)
	{
		return (thing.equals(obj));
		
	}
	
	public int compareTo(Object obj)
	{
		if(equals(obj))
			return 0;
		if(count<((ThingCount)obj).getCount())
			return -1;		
		else
			return 1;
	}
	
	public String toString()
	{
		return ""+ getThing() + " - " + getCount();
	}
}