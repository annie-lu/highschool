package relatives;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RelativesRunner {
	public static void main(String args[]) throws IOException {
		Relatives x = new Relatives();
		int y = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(
				"Files/relatives.dat"))) {

			int num = Integer.parseInt(br.readLine());

			while (y < num) {
				x.setPersonRelative(br.readLine());
				y++;
			}

			System.out.println(x.toString());
			String person = br.readLine();
			System.out.println(person + " is related to "
					+ x.getRelatives(person));

		}
	}
}