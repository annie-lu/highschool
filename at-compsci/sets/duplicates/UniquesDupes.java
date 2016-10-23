package duplicates;

import java.util.Set;
import java.util.TreeSet;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		
		//Set<String> words = new TreeSet<String>(Arrays.asList(input.split(" ")));
		String[] words = input.split(" ");
		boolean duplicate=false;
		
		for(String x:words){
			for(String y:uniques){
				if(x.equals(y))
					duplicate=true;
			}
			if(!duplicate){
				uniques.add(x);
			}
				
			duplicate=false;
		}

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		//add code
		Set<String> dupes = new TreeSet<String>();
		String[] words = input.split(" ");
		boolean duplicate=false;
		Set<String> uniques = new TreeSet<String>();

		for(String x:words){
			for(String y:uniques){
				if(x.equals(y))
					duplicate=true;
			}
			
			if(!duplicate)
				uniques.add(x);
			else
				dupes.add(x);
				
			duplicate=false;
		}

		return dupes;
	}
}