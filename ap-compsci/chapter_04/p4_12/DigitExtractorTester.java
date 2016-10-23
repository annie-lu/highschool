package p4_12;

public class DigitExtractorTester {

	public static void main(String[] args) {

		DigitExtractor apple = new DigitExtractor(67891);
		int reverse = 0;
		int z = 0;

		while (z <= 5) {
			reverse = reverse + (int) (apple.nextDigit() * Math.pow(10, z));
			z++;
		}
		System.out.println(reverse);

	}

}
