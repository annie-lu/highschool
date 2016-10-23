package introduction;
import java.util.Stack;


public class CDStackTester {

	public static void main(String[] args) {
		Stack <String> myStack=new Stack();
		myStack.push("Journey"); //last to play
		myStack.push("Iggy Pop");
		myStack.push("Hall & Oats");
		myStack.push("Genesis");
		myStack.push("Foreigner");
		myStack.push("Eagles");
		myStack.push("Deep Purple");
		myStack.push("Cheap Trick");
		myStack.push("Beatles");
		myStack.push("Aerosmith"); //first thing that will play
		CDStack cd1=new CDStack(myStack);
		cd1.printCDFor();
		//cd1.reverseStack();
		//cd1.printCD();
		System.out.println("");
		//cd1.reverseStack();
		//cd1.printCD();
		Stack <String> theStack=new Stack();
		theStack.push("AlphabetSong"); //last to play
		theStack.push("B");
		theStack.push("C");
		
		//cd.printCD();
		//cd.printCDIterator();
		//cd.printCDFor();
		
		//cd.printCDRecursive();
		
	}

}
