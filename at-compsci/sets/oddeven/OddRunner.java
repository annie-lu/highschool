package oddeven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		OddEvenSets x;
		String line;
		
		try (BufferedReader br = new BufferedReader(new FileReader("Files/oddevendata.dat"))) {
			
		    while ((line = br.readLine()) != null) {
		       // process the line.
		    	x=new OddEvenSets(line);
		    	System.out.println(x);
		    }
		}
				
	}
}