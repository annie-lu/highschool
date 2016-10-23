package combination;

import java.util.Scanner;

public class LockTester {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		Lock combination = new Lock();
		boolean locked = true;

		System.out.println("Combination Lock");
		System.out.println("Randomly generated password: "+ combination.getPassword());

		int choice = 5;
		
		while (choice != 0) {
			System.out.println("");
			System.out.println("choose 1, 2, or 3");
			System.out.println("1.unlock 2.set lock 3.lock 4.done");
	
			choice = Integer.parseInt(keyboard.nextLine());

			switch (choice) {
			case 1:
				System.out.println("\nUnlock");

				if (locked) {
					System.out.println("first letter:");
					String one = keyboard.nextLine();
					System.out.println("second letter:");
					String two = keyboard.nextLine();
					System.out.println("third letter:");
					String three = keyboard.nextLine();
					
					if (combination.checkLock(one, two, three)) {
						locked = false;
						System.out.println("unlocked");
					} else
						System.out.println("incorrect. still locked :c");
				} else
					System.out.println("already unlocked");
				break;

			case 2:
				System.out.println("\nSet lock");
				if (!locked) {
					System.out.println("It is unlocked so you can set the lock.");
					System.out.println("new first letter:");
					String first = keyboard.nextLine();
					System.out.println("new second letter:");
					String second = keyboard.nextLine();
					System.out.println("new third letter:");
					String third = keyboard.nextLine();
					combination.SetLock(first, second, third);
					System.out.println("set!");
				} else
					System.out.println("you need to unlock first");
				break;
			case 3:
				System.out.println("\nLock");
				if (!locked) {
					locked = true;
					System.out.println("locked");
				} else
					System.out.println("already locked :P");
				break;
			case 4:
				System.out.println("done");
				break;
			default:
				System.out.println("invalid input");
				break;
			}
		}
		keyboard.close();
	
	}
}
