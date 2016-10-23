package r8_4;
import java.util.Scanner;
public class Strings {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		String[] words= new String[10];
		
		for(int x=0;x<words.length;x++){
			System.out.println("Enter String:");
			words[x]=keyboard.nextLine();
		}
		
		for(int x=words.length-1;x>=0;x--)
			System.out.println(words[x]);
		
	}
}
