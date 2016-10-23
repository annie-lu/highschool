package phone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneTester {
	   public static void main( String args[] ) throws IOException
	   {
	PhoneBookTwo z= new PhoneBookTwo();
	try (BufferedReader br = new BufferedReader(new FileReader(
			"Files/phoneentries.txt"))) {
		String x = br.readLine();
		while (x != null) {
			String[] line = x.split("\\s+");

			z.add(new PhoneEntryTwo(line[0], line[1]));
			x = br.readLine();
		}
	}
	System.out.println(z.display());
	System.out.println(z.lookupNumber("Cecil"));
	System.out.println(z.reverseLookup("9810208"));
	z.remove(z.lookupNumber("Cecil"));
	System.out.println("CECIL DNE");
	System.out.println(z.display());
	}
}
