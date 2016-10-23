package p4_12;

import java.lang.Math;

public class DigitExtractor {
	private int givenNumber;
	private int x = 5;

	public DigitExtractor() {
		givenNumber = 0;
	}

	public DigitExtractor(int anInteger) {
		givenNumber = anInteger;
	}

	public int nextDigit() {

		x = x - 1;
		
		if (x >= 0) {
			int digitPlace = (int) Math.pow(10, x);
			int digit = (int) givenNumber / digitPlace;
			givenNumber = givenNumber - digit * digitPlace;

			return digit;

		} 
		else
			return 0;

	}

}
