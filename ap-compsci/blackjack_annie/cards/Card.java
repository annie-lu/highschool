package cards;

public class Card {
	//public array of suits
	String[] suits;
	int points;
	boolean show;
	String rank;
	String suit;
	
	/**
	 * initializes instance fields
	 * @param number card number/rank
	 * @param cardSuit the suit
	 */
	public Card(int number, String cardSuit){
		points=number;
		rank=number+"";
		suit=cardSuit;
		show=true;
	}
	
	/**
	 * initializes instance fields
	 * @param number card number/rank
	 * @param cardSuit the suit
	 */
	public Card(String face, String cardSuit){
		points=10;
		rank=face;
		suit=cardSuit;
		show=true;
	}
	
	/**
	 * gets the rank of the card object
	 * @return rank of card
	 */
	public String getRank(){
		return rank;
	}
	
	/**
	 * gets the suit of the card object
	 * @return suit of card
	 */
	public String getSuit(){
		return suit;
	}
	
	/**
	 * gets the value of the card object
	 * @return value of card
	 */
	public int getPoints() {
		return points;
	}
	
	/**
	 * creates a string of the card
	 * if it is hidden, will replace rank and suit with "X"
	 * @return rank of card
	 */
	public String toString()
	{
		if (show)
			return rank+" of "+suit;
		else
			return "X of X";
	}
	
	/**
	 * determines if card is hidden or not
	 * @return true if card is shown otherwise false
	 */
	public boolean show(){
		return show;
	}
	/**
	 * flips the card
	 */
	public void changeShow()
	{
		show=!show;	}
}
