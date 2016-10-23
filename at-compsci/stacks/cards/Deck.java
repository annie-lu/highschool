package cards;
import java.util.Iterator;
import java.util.Stack;

public class Deck {

	Stack<Card> deck;

	public Deck() {
		deck = new Stack<Card>();
	}

	public Stack<Card> getDeck() {
		return deck;
	}

	// Load the stack with 52 cards in order

	public void loadDeck() {
		for (int y = 1; y <= 4; y++) {
			for (int x = 2; x <= 14; x++) {
				Card z = new Card(x, y);
				deck.push(z);
			}
		}
	}

	public String toString() {
		String s = "";
		int c = 0;

		Iterator<Card> i = deck.iterator();

		while (i != null && i.hasNext()) {
			c++;
			s += (i.next() + "\t");
			if (c % 4 == 0)
				s += "\n";
		}

		return s;
	}

	// Return and remove the top card

	public Card deal() {
		return deck.pop();
	}

	// Take the top half of the deck (26 cards) and alternate card by card with

	// the bottom half

	public void bridgeShuffle() {
		Iterator<Card> i = deck.iterator();
		Iterator<Card> i2 = deck.iterator();
		Stack<Card> temp = new Stack<Card>();
		for (int x = 0; x < 26; x++)
			i.next();

		for (int y = 0; y < 26; y++) {
			temp.push(i.next());
			temp.push(i2.next());
		}

		deck = temp;

	}

	// split the deck at a random spot. Put the stack of cards above the random

	// spot below the other cards

	public void cut() {
		int toCut = (int) (Math.random() * 52);
		Iterator<Card> i = deck.iterator();
		Iterator<Card> i2 = deck.iterator();
		Stack<Card> temp = new Stack<Card>();
		for (int x = 0; x < toCut; x++)
			i.next();

		for (int x = 0; x < 52; x++) {
			if (x < 52 - toCut)
				temp.push(i.next());
			else
				temp.push(i2.next());
		}

		deck = temp;

	}

	// complete a bridge shuffle and then cut the deck. Repeat 7 times

	public void completeShuffle() {
		for (int x = 0; x < 7; x++) {
			bridgeShuffle();

			cut();

		}

	}

	public static void main(String[] args) {

		Deck a = new Deck();
		a.loadDeck();
		System.out.println(a);

		// a.bridgeShuffle();

		// a.cut();

		a.completeShuffle();

		System.out.println(a);

		for (int i = 1; i <= 5; i++)

			System.out.println(a.deal());

	}

}