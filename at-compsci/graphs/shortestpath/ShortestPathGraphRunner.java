package shortestpath;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("Files/graph1.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();
		for(int x=0; x<howManyTimes; x++)
		{
			ShortestPathGraph y=new ShortestPathGraph(file.nextLine());
			String z=file.nextLine();
			if(y.check(z.charAt(0)+"", z.charAt(1)+"", "")){
				System.out.println(z.charAt(0)+" "+z.charAt(1));
				System.out.println(y.findShortest(z.charAt(0)+"", z.charAt(1)+"", ""));
				System.out.println(y.findShortest(z.charAt(0)+"", z.charAt(1)+"", "").length()-1);
				System.out.println();
			}
			else
				System.out.println(z.charAt(0)+" and "+ z.charAt(1)+" are not connected :(");
			//add code here
			//System.out.println(y);
		}
	}
}