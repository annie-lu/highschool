package blackjack;

import java.util.Scanner;

import cards.Card;

public class Blackjack {

	Dealer dealer;
	Player player;
	Scanner keyboard;
	Card hiddenCard;
	boolean play;
	boolean firstAction;
	double originalBet;

	/**
	 * plays entire blackjack game
	 */
	public Blackjack() {
		firstAction=true;
		setUp();
		round();	
	}
	

	private void round(){
		while (play && player.getMoney() > 0) {
			reset();
			game();
			hiddenCard.changeShow();
			displayText();
			System.out.println("Money: "+player.getMoney());
			System.out.println("Do you want to play again?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			play = (Integer.parseInt((keyboard.nextLine())) == 1);
	}}
	/**
	 * initializes dealer and player
	 * sets bet
	 */
	private void reset(){
		for(int x=player.getHand().size()-1;x>=0;x--)
			player.removeCard(x);
		for(int x=dealer.getHand().size()-1;x>=0;x--)
			dealer.removeCard(x);	
		dealer.addCard(dealer.dealCard());
		hiddenCard=dealer.dealCard();
		hiddenCard.changeShow();
		dealer.addCard(hiddenCard);
		player.addCard(dealer.dealCard());
		player.addCard(dealer.dealCard());
		displayText();
		player.setBet(originalBet);
		player.setInsurance(0);
	}
	private void setUp() {

		keyboard = new Scanner(System.in);
		
		System.out.println("How many decks in shoe?");
		dealer = new Dealer(Integer.parseInt((keyboard.nextLine())));
		
		System.out.println("How much money do you have?");
		player = new Player(Double.parseDouble(keyboard.nextLine()));
		
		System.out.println("How much money do you bet?");
		player.setBet(Double.parseDouble(keyboard.nextLine()));
		originalBet=player.getBet();
		play = true;
	}

	/**
	 * plays basic blackjack game
	 * has game logic
	 */
	private void game() {
		if (dealer.getHandValue() == 21) {
			if (player.getHandValue() == 21)
				System.out.println("push");
			else{
				player.lose();
				System.out.println("dealer wins");
			}
			return;
		}

		System.out.println("1) hit");
		System.out.println("2) stand");
		System.out.println("3) double");
		System.out.println("4) surrender");
		
		if(dealer.containsAce())
			System.out.println("5) insure");
		
		int result=Integer.parseInt((keyboard.nextLine()));
		boolean hitCard = result == 1;
		
		if(!hitCard){
			if(result==3){
				//double
				System.out.println("add up to double your original bet:");
				player.setBet(player.getBet()+Integer.parseInt((keyboard.nextLine())));
				player.addCard(dealer.dealCard());
			}
			else if(result==4){
				//surrender
				player.setBet(player.getBet()/2.0);
				player.lose();
				System.out.println("dealer wins");
				return;
			//player loses
			}
			else if(result==5){
				System.out.println("insure up to half your original bet:");
				player.setInsurance(Integer.parseInt((keyboard.nextLine())));
				if (dealer.getHandValue() == 21) {
					player.winInsurance();
					player.lose();
					System.out.println("wins insurance, player loses");
					return;
				}

				else
					player.loseInsurance();
					System.out.println("loses insurance");
					System.out.println("1) hit");
					System.out.println("2) stand");
			
					result=Integer.parseInt((keyboard.nextLine()));
					hitCard = result == 1;
				}
			}
				
			
		
		while (player.getHandValue() < 21 && hitCard) {
			player.addCard(dealer.dealCard());
			displayText();
			if(player.getHandValue() < 21){
			System.out.println("1) hit");
			System.out.println("2) stand");
			hitCard = Integer.parseInt((keyboard.nextLine())) == 1;}
			else
				hitCard=false;
		}
		
		
		if (player.getHandValue() == 21) {
			player.win();
			System.out.println("player wins");
			return;
		}

		if (player.getHandValue() > 21) {
			player.lose();
			System.out.println("dealer wins");
			return;
		}

		while (dealer.getHandValue() < 17) {
			dealer.addCard(dealer.dealCard());
		}

	//	displayText();
		if (dealer.getHandValue() > 21) {;
			player.win();
			System.out.println("player wins");
			return;
		}
		
		if (dealer.getHandValue() >= player.getHandValue()) {
			player.lose();
			System.out.println("dealer wins");
			return;
		} else {
			player.win();
			System.out.println("player wins");
			return;
		}

	}
	
	/**
	 * displays the cards and the points
	 */

	private void displayText() {
		System.out.println("player:");
		System.out.println(player.getCardNames() + " " + player.getshownHandValue());
		System.out.println("dealer:");
		System.out.println(dealer.getCardNames() + " "
				+ dealer.getshownHandValue());
	}
}
