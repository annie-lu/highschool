package graph;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("Files/graph1.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();
		for(int x=0; x<howManyTimes; x++)
		{
			Graph y=new Graph(file.nextLine());
			String z=file.nextLine();
			if(y.check(z.charAt(0)+"", z.charAt(1)+"", "")){
				System.out.println(z.charAt(0)+" and "+ z.charAt(1)+" are connected :)");
				
				
			}
			else
				System.out.println(z.charAt(0)+" and "+ z.charAt(1)+" are not connected :(");
			//add code here
		}
	}
}