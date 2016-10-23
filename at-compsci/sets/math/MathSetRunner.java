package math;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MathSetRunner {
	public static void main(String args[]) throws IOException {
		MathSet x;
		String line;
		
		try (BufferedReader br = new BufferedReader(new FileReader(
				"Files/mathsetdata.dat"))) {
			while ((line = br.readLine()).matches(".*\\d+.*")) {
				// process the line.
				x = new MathSet(line,br.readLine());
				System.out.println(x);
				System.out.println("union - "+x.union());
				System.out.println("diff a-b - "+x.differenceAMinusB());
				System.out.println("diff b-a - "+x.differenceBMinusA());
				System.out.println("symmetrical diff - "+x.symmetricDifference());
				System.out.println();
				System.out.println();
			}
		}
	}
}
