package blackjack;


public class Player extends User {

	private double money;
	private double bet;
	private double insurance;

	/**
	 * initializes player
	 * @param cash
	 */
	public Player(double cash) {
		money = cash;
	}
	/**
	 * sets how much the player will bet
	 * if the bet is greater than the amount of money they have, the bet is automatically set to the amount of money they have
	 * @param cash amount of money for bet
	 */
	public void setBet(double cash) {
		if (cash < money)
			bet = cash;
		else
			bet = money;
	}
	/**
	 * gets the amount player bets
	 * @return the amount of money of bet
	 */
	public double getBet() {
		return bet;
	}
	/**
	 * the player loses the amount they bet
	 */
	public void lose() {
		money -= bet;
	}
	/**
	 * the player wins the amount they bet
	 */
	public void win() {
		money += bet;
	}
	
	/**
	 * the player loses the amount they bet
	 */
	public void loseInsurance() {
		money -= insurance;
	}
	/**
	 * the player wins the amount they bet
	 */
	public void winInsurance() {
		money =money+2*insurance;
	}
	/**
	 * gets the amount of money player has
	 * @return money the player owns
	 */
	public double getMoney() {
		return money;
	}
	
	/**
	 * sets how much the player will bet
	 * if the insurance is greater than the bet/2 they have, the insurance is automatically set to max insurance amount
	 * precondition: cash is greater than 0
	 * @param cash amount of money for bet
	 */
	public void setInsurance(double cash){
		if (cash <= bet/2)
			insurance=cash;
		else
			insurance = bet/2;
	}
	
	/**
	 * gets the amount player insurance
	 * @return the amount of money of insurance
	 */
	public double getInsurance() {
		return insurance;
	}

}
