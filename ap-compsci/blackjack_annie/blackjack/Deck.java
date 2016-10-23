package blackjack;

import java.util.ArrayList;
import java.util.Collections;

import cards.Card;

public class Deck {
	private ArrayList<Card> Cards = new ArrayList<Card>();

	/**
	 * creates an arraylist/deck of cards
	 */
	public Deck() {

		String suitStr = "";

		for (int suitNum = 1; suitNum <= 4; suitNum++) // each suit
		{
			switch (suitNum) {
			case 1:
				suitStr = "spades";
				break;
			case 2:
				suitStr = "hearts";
				break;
			case 3:
				suitStr = "diamonds";
				break;
			case 4:
				suitStr = "clubs";
				break;
			}

			Cards.add(new Card(2, suitStr));
			Cards.add(new Card(3, suitStr));
			Cards.add(new Card(4, suitStr));
			Cards.add(new Card(5, suitStr));
			Cards.add(new Card(6, suitStr));
			Cards.add(new Card(7, suitStr));
			Cards.add(new Card(8, suitStr));
			Cards.add(new Card(9, suitStr));
			Cards.add(new Card(10, suitStr));
			Cards.add(new Card("A", suitStr));
			Cards.add(new Card("K", suitStr));
			Cards.add(new Card("Q", suitStr));
			Cards.add(new Card("J", suitStr));
		}
		shuffle();
	}
	
	/**
	 * removes chosen card from deck
	 * @param card is the card removed
	 */

	public void remove(Card card) {
		Cards.remove(card);
	}

	/**
	 * gets the size of the deck
	 * @return size of deck
	 */
	public int size() {
		return Cards.size();
	}

	/**
	 * gets specific card at deck index
	 * @param index of card want to get
	 * @return card 
	 */
	public Card get(int index) {
		return Cards.get(index);
	}
	/**
	 * shuffles the deck
	 */
	public void shuffle() {
		Collections.shuffle(Cards);
	}
}
