package anothermonty;

public class AnotherMonty {
	private int guess;
	private int incorrectDoor;
	private int correctDoor;
	
	private int changeWon;
	private int changeLost;
	private int stayWon;
	private int stayLost;
	
	private boolean change;
	

	

	/** sets the guess 
	 * @param userGuess the number the user guesses
	 * @param changing checks if you are changing a guess or making a new guess
	 */
	
	public void setGuess(int userGuess){
		guess=userGuess;
		correctDoor = (int) (Math.random() * 3 + 1);
		change=false;
	}
	public void changeGuess() { //change
		if(guess!=1 && incorrectDoor!=1)
			guess= 1;
		else if(guess!=2 && incorrectDoor!=2)
			guess = 2;
		else
			guess= 3;
		
		change = true;
		
	}
	
	
	/**checks if guess is correct
	 * @return if you won or not
	 */
	public boolean checkAnswer() {
		return (guess == correctDoor);


	}

	//updates the statistics every time you finish a game/trial
	public void updateStats() {
		if (checkAnswer()) {
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
		boolean other=false; 
		incorrectDoor = (int) (Math.random() * 3 + 1);
		while (!other){
			if (incorrectDoor == correctDoor || incorrectDoor == guess) 
		
				incorrectDoor = (int) (Math.random() * 3 + 1);
			else
				other=true;} //is there a better way o_o
		
		
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
