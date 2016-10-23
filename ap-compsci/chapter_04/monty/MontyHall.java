package monty;

public class MontyHall {
	private int guess;

	private int changeWon;
	private int changeLost;
	private int stayWon;
	private int stayLost;
	
	private boolean change;
	private boolean won;
	private boolean incorrectDoor;

	private int correctDoor;

	/** sets the guess 
	 * @param userGuess the number the user guesses
	 * @param changing checks if you are changing a guess or making a new guess
	 */
	public void setGuess(int userGuess, boolean changing) {
		guess = userGuess;
		change = changing;
		if(!change)
			correctDoor = (int) (Math.random() * 3 + 1);
	}
	
	// prints out the ascii door
	public void displayDoor() {
		System.out.println("_______________  _______________  _______________");

		for (int x = 0; x < 3; x++)
			System.out.println("|             |  |             |  |             |");
		System.out.println("|      1      |  |      2      |  |      3      |");
		for (int x = 0; x < 8; x++)
			System.out.println("|             |  |             |  |             |");

		System.out.println("");
	}
	
	/**checks if guess is correct
	 * @return if you won or not
	 */
	public boolean checkAnswer() {
		if (guess == correctDoor) {
			won = true;
		}

		else {
			won = false;
		}

		return won;

	}

	//updates the statistics every time you finish a game/trial
	public void updateStats() {
		if (won) {
			if (change) 
				changeWon++;
			 else 
				stayWon++;	
		} 
		else {
			if (change) 
				changeLost++;
			else 
				stayLost++;
			}
		}
	
	//prints out a goat in one of the incorrect doors
	public void showIncorrectDoor() {
		incorrectDoor=false;
		int show;
		show = (int) (Math.random() * 3 + 1);
		while (!incorrectDoor){
			if (show == correctDoor || show == guess) 
		
			show = (int) (Math.random() * 3 + 1);
		else
			incorrectDoor=true;}
		
		System.out.println("_______________  _______________  _______________");
		
		for (int x = 0; x < 3; x++)
			System.out.println("|             |  |             |  |             |");

		if (show == 3) 
			System.out.println("|      1      |  |      2      |  |  ('I') baaa |");
		 else if (show == 1) 
			System.out.println("|  ('I') baaa |  |      2      |  |      3      |");
		 else 
			System.out.println("|      1      |  | ('I') baaa  |  |      3      |");

		
		
		for (int x = 0; x < 8; x++)
			System.out.println("|             |  |             |  |             |");

		System.out.println("");
	}

	//prints out statistics at the end of the game
	public void showStats() {
		System.out.println("Won by Staying:" + stayWon);
		System.out.println("Lost by Staying:" + stayLost);
		System.out.println("Won by Changing:" + changeWon);
		System.out.println("Lost by Changing:" + changeLost);

	}
	
	//prints out your guess and the answer
	public void showAnswer(){
		
		System.out.println("Your Guess:" + guess);
		System.out.println("Answer:" + correctDoor);
	}
}
