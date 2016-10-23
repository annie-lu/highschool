package blackjack;

import java.util.ArrayList;

import cards.Card;

public abstract class User {
	private ArrayList<Card> hand = new ArrayList<Card>();

	
	/**
	 * gets the hand the user has
	 * @return the hand
	 */
	public ArrayList<Card> getHand() {
		return hand;
	}

	/**
	 * adds a random card to the hand
	 * @param card is random card
	 */
	public void addCard(Card card) {
		hand.add(card);
	}
	
	/**
	 * removes a random card to the hand
	 * @param index is the index of element to remove
	 */
	public void removeCard(int index){
		hand.remove(index);
	}
	
	
	/**
	 * gets the value of all shown cards
	 * @return points of shown cards
	 */
	public int getshownHandValue() {
		int value = 0;
		for (int x = 0; x < hand.size(); x++){
			if(hand.get(x).show())
			value += hand.get(x).getPoints();
		}
			

		for (int x = 0; x < hand.size(); x++) {
			if (hand.get(x).getRank().equals("A")) {
				if (value > 21)
					value = value - 9;
				else
					value++;
			}
		}
		return value;
	}
	
	/**
	 * gets the value of all shown cards
	 * @return points of shown cards
	 */
	public int getHandValue() {
		int value = 0;
		for (int x = 0; x < hand.size(); x++){
			value += hand.get(x).getPoints();
		}
			

		for (int x = 0; x < hand.size(); x++) {
			if (hand.get(x).getRank().equals("A")) {
				if (value > 21)
					value = value - 9;
				else
					value++;
			}
		}
		return value;
	}

	/**
	 * gets the names of the cards in hand
	 * @return a string of cards in hand
	 */
	public String getCardNames() {
		String result = "";
		for (Card card : hand)
			result = result + " | " + card.toString();
		return result;
	}
	
	/**
	 * flips over a chosen card
	 * @param card the card which is flipped over
	 */
	public void changeCardShow(Card card){
		hand.get(hand.indexOf(card)).changeShow();
	}
	
	public boolean containsAce(){
		return hand.get(0).getRank().equals("A");
	}
}
