package p8_2;

import java.util.ArrayList;

public class Purse {

	ArrayList<String> coins;

	/**
	 * Constructs a empty Purse object
	 */
	public Purse() {
		coins = new ArrayList<String>();
	}

	/**
	 * Adds a coin in String form to the purse
	 * 
	 * @param coinName
	 *            the name of the coin the user wants to add
	 */
	public void addCoin(String coinName) {

		if (coinName.equalsIgnoreCase("Quarter")
				|| coinName.equalsIgnoreCase("Dime")
				|| coinName.equalsIgnoreCase("Nickel")
				|| coinName.equalsIgnoreCase("Penny"))
			coins.add(coinName);

	}

	/**
	 * Reverses the order of the coins in purse
	 */
	public void reverse() {
		ArrayList<String> original = new ArrayList<String>();
		for (int i = 0; i < coins.size(); i++)
			original.add(coins.get(i));

		for (int i = 1; i <= coins.size(); i++)
			coins.set(coins.size() - i, original.get(i));

	}

	/**
	 * Adds the coins of one purse to another
	 * 
	 * @param other
	 *            the other purse
	 */
	public void transfer(Purse other) {

		for (int i = 0; i < other.getCoins().size(); i++)
			this.addCoin(other.getCoins().get(i));

	}

	/**
	 * Checks if the order of the coins and the coins are the same for two
	 * purses
	 * 
	 * @param other
	 *            the other purse
	 * @return whether the contents are the same
	 */
	public boolean sameContents(Purse other) {
		boolean same = true;

		if (coins.size() == other.getCoins().size()) {
			for (int i = 0; i < coins.size(); i++) {
				if (!coins.get(i).equalsIgnoreCase(other.getCoins().get(i)))
					same = false;
			}
		} else
			same = false;

		return same;
	}

	public boolean sameCoins(Purse other) {

		return (this.calcCoins().equals(other.calcCoins()));

	}

	private String calcCoins() {
		int quarters, pennies, nickels, dimes;
		quarters = 0;
		pennies = 0;
		nickels = 0;
		dimes = 0;

		for (int i = 0; i < this.getCoins().size(); i++) {

			if (coins.get(i).equalsIgnoreCase("Quarters"))
				quarters++;
			else if (coins.get(i).equalsIgnoreCase("Nickels"))
				nickels++;
			else if (coins.get(i).equalsIgnoreCase("Dimes"))
				dimes++;
			else
				pennies++;

		}

		return quarters + " " + dimes + " " + nickels + " " + pennies;

	}

	/**
	 * Returs the contents of the purse in String form
	 */
	public String toString() {
		String str = "Purse[";

		for (int i = 0; i < coins.size(); i++)
			str += coins.get(i) + ",";

		str = str.substring(0, str.length() - 1);
		str += "]";

		return str;

	}

	/**
	 * Returns the ArrayList of the contents
	 * 
	 * @return the ArrayList of the contents
	 */
	public ArrayList<String> getCoins() {
		return coins;
	}

}

