package listnodew5_2;

import static java.lang.System.*;

public class HistogramListRunner
{
	public static void main(String[] args)
	{
		HistoList test = new HistoList();
		String testString = "ABCDEFABCDEFFEDCBAAAAABBBBBCCCDAAAAAAAEEFFF";
		for(char c : testString.toCharArray())
		{
			test.add(c);
		}

		System.out.println(test);

	}
}