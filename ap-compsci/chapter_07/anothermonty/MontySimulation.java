package anothermonty;

import java.util.Scanner;

import monty.MontyHall;

public class MontySimulation {
	public static void main(String[] args) {
		
		AnotherMonty Monty = new AnotherMonty();  //dont name variables uppercase, otherwise it will look all weird O_O and like a static method
		boolean changing=false;
		int timesPlay=10000;
		
		for (int x=0;x<timesPlay;x++) {
			
			Monty.setGuess( (int) (Math.random() * 3 + 1)); 
			Monty.showIncorrectDoor();
	 		
			changing = !changing; //random true or false
			
			if (changing) {
				
				Monty.changeGuess();
				
//				if (Monty.checkAnswer()) 
//					System.out.println("you won");
//				else 
//					System.out.println("you lost");
				Monty.updateStats();
			//	Monty.showAnswer();
			} 
			else {
				
//				if (Monty.checkAnswer()) 
//					System.out.println("you won");
//				else 
//					System.out.println("you lost");
			
				Monty.updateStats();
			//Monty.showAnswer();
			}

			
		}

		Monty.showStats();
	}

}
