package translate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SpanRunner {
	public static void main(String args[]) throws IOException {
		SpanishToEnglish x = new SpanishToEnglish();
		String line;
		int y = 0;

		try (BufferedReader br = new BufferedReader(new FileReader("Files/spantoeng.dat"))) {
			
			int num = Integer.parseInt(br.readLine());

			while (y < num) {
				x.putEntry(br.readLine());
				y++;
			}
			
			while ((line = br.readLine()) != null) {
				System.out.println(x.translate(line));
			}
			
		}
	}
}