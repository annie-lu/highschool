package acronyms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AcroRunner
{
	public static void main( String args[] ) throws IOException
	{
		Acronyms x = new Acronyms();
		String line;
		int y = 0;

		try (BufferedReader br = new BufferedReader(new FileReader("Files/acro.dat"))) {
			
			int num = Integer.parseInt(br.readLine());

			while (y < num) {
				x.putEntry(br.readLine());
				y++;
			}
			System.out.println(x);
			System.out.println(" ");
			while ((line = br.readLine()) != null) {
				System.out.println(x.convert(line));
			}
			
		}
	}
}