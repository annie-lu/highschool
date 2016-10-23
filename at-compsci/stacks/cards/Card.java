package cards;
public final class Card implements Comparable<Card> {
	private final int value;
	private final int suite;

	public Card() {
		value = 3;
		suite = 1;
	}

	public Card(int value, int suite) {
		this.value = value;
		this.suite = suite;
	}

	public String getValue() {
		if (value < 11)
			return value + "";
		else {
			switch (value) {
			case 11:
				return "J";

			case 12:
				return "Q";

			case 13:
				return "K";

			case 14:
				return "A";
			}

			return "-";
		}
	}

	public String getSuite() {
		switch (suite) {
		case 1:
			return "Clubs";

		case 2:
			return "Diamonds";

		case 3:
			return "Hearts";

		case 4:
			return "Spades";
		}

		return "-";
	}

	public boolean equals(Object other) {
		if (!(other instanceof Card))
			return false;

		return equals((Card) other);
	}

	public boolean equals(Card otherCard) {
		return this.getValue() == otherCard.getValue()
				&& this.getSuite() == otherCard.getSuite();
	}

	public String toString() {
		return getValue() + " of " + getSuite();
	}

	public int compareTo(Card arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}