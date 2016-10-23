package monty;

import java.util.Scanner;

public class MontyHallGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		MontyHall Monty = new MontyHall();
		String play = "yes";
		boolean change;
		
		while (play.equals("yes")) {
			change = false;
			Monty.displayDoor();
			
			System.out.println("Choose a door(1,2,or 3)");
			int guessedDoor = Integer.parseInt(keyboard.nextLine());
			Monty.setGuess(guessedDoor, change);
			Monty.showIncorrectDoor();
	 		
			System.out.println("Do you want to change answer?(yes or no)");
			String changing = keyboard.nextLine();
			
			if (changing.equals("yes")) {
				change = true;
				System.out.println("Choose a door(1,2,or 3)");
				guessedDoor = Integer.parseInt(keyboard.nextLine());
				Monty.setGuess(guessedDoor, change);
				
				if (Monty.checkAnswer()) 
					System.out.println("you won");
				else 
					System.out.println("you lost");
				Monty.updateStats();
				Monty.showAnswer();
			} 
			else {
				change = false;
				
				if (Monty.checkAnswer()) 
					System.out.println("you won");
				else 
					System.out.println("you lost");
			
				Monty.updateStats();
			Monty.showAnswer();
			}

			System.out.println("play again?(yes or no)");
			play = keyboard.nextLine();
			
		}

		Monty.showStats();
	}

}
