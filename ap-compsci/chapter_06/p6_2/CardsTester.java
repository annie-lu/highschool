package p6_2;

import java.util.Scanner;

public class CardsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter your card");
		String notation= keyboard.nextLine();
		
		Cards playingCard=new Cards(notation);
		playingCard.getDescription();
	}

}
