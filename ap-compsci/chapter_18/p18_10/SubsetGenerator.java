package p18_10;

import java.util.ArrayList;

public class SubsetGenerator
{
	public static void main(String[] args)
	{
		System.out.println(getSubsets("cake"));
	}

	public static ArrayList<String> getSubsets(String x)
	{
		if (x.length() == 0) {
			ArrayList<String> subsets = new ArrayList<String>();
			subsets.add(x);
			return subsets;
		}

		ArrayList<String> subsets = getSubsets(x.substring(0,x.length() - 1));

		for (int y = 0; y < x.length(); y++) {
			subsets.add(x.substring(y));
		}

		return subsets;
		
	}
}