package blackjack;

import java.util.ArrayList;

import cards.Card;

public class Dealer extends User{
	
	private ArrayList<Deck> shoe=new ArrayList<Deck>();
	
	/**
	 * creates a shoe of decks of cards
	 * @param numOfDecks the number 
	 */
	public Dealer(int numOfDecks){
		for(int x=0; x<numOfDecks; x++)
		shoe.add(new Deck());
	}
	
	/**
	 * deals cards until there are none left
	 * @return random card
	 */
	public Card dealCard(){
		if(shoe==null){
			System.out.println("no more cards");
			return null;
		}
		Card dealedCard=shoe.get(0).get(0);
		shoe.get(0).remove(dealedCard);
		if (shoe.get(0).size()==0)
			shoe.remove(0);
		return dealedCard;
	}
	
	

}
