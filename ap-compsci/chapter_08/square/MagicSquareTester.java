package square;

import java.util.Scanner;

public class MagicSquareTester {

	public static void main(String args[]) {
		int newNumber;
		Scanner in = new Scanner(System.in);

		System.out.print("Num for Side :");
		int sideNum = in.nextInt();
		MagicSquare circle = new MagicSquare(sideNum);
		
		

		int[] vals = new int[(int) Math.pow(sideNum, 2)];

		for (int i = 0; i < vals.length; i++)
			vals[i] = i + 1;

		System.out.println("enter numbers");

		for (int x = 0; x < (int) Math.pow(sideNum, 2); x++) {
			newNumber = in.nextInt();
			if (vals[newNumber - 1] == 0) {
				System.out.println("repeated number, retry");
				x--;
			} else {
				circle.add(newNumber);
				vals[newNumber - 1] = 0;
			}
		}

		if (circle.isMagic())
			System.out.println("is magical");
		else
			System.out.println("its not magical");

	}

}
