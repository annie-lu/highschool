package oddeven;

import java.util.Set;
import java.util.TreeSet;


public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
		odds= new TreeSet<Integer>();
		evens= new TreeSet<Integer>();
	}

	public OddEvenSets(String line)
	{
		odds= new TreeSet<Integer>();
		evens= new TreeSet<Integer>();
		
		String[] numbers = line.split(" ");
		for(String x:numbers){
		if(Integer.parseInt(x)%2==0)
			evens.add(Integer.parseInt(x));
		else
			odds.add(Integer.parseInt(x));
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}