package cards;

public class CardTester {
	public static void main(String[] args) {
		Card a = new Card(14, 2);
		Card b = new Card();

		System.out.println(b.toString());
		System.out.println(a.toString());

		for (int x = 1; x <= 14; x++) {
			for (int y = 1; y <= 4; y++) {
				Card z = new Card(x, y);
				System.out.println(z.toString());
			}
		}
	}
}
