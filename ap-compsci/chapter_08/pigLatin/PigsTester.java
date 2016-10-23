package pigLatin;

import java.util.Scanner;

public class PigsTester {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String repeat, sentence;		
			
		System.out.println("I can translate English sentences and phrases into Pig Latin.");
		do
		{
			Pigs bacon = new Pigs(); 	

			System.out.println("\nPlease type an English sentence or phrase and then press <Enter>."); 		
			sentence = keyboard.nextLine(); 		 		
			System.out.println("In Pig Latin that would be: "+bacon.translateSentence(sentence));
			System.out.println("\nWould you like to translate another phrase? (yes/no)");
			repeat = keyboard.nextLine();
			
		} while (repeat.equals("yes"));

		keyboard.close();
	}

}
