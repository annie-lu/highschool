package maze;

public class NewClassTester {

	public static void main(String[] args)
	{
		String[][] arr = new String[5][7];
		Newclass.fillarray(arr);
		
		for(String[] a : arr)
		{
			for(String x : a)
			{
				System.out.println(x);
			}
		}
	}
}
