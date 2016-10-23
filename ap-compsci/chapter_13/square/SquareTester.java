package square;

import java.util.Scanner;

public class SquareTester {

	public static void main(String[] args) {
		int sideLength;
		int x;
		int y;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("sidelength");
		sideLength=Integer.parseInt(keyboard.nextLine());
		System.out.println("x");
		x=Integer.parseInt(keyboard.nextLine());
		System.out.println("y");
		y=Integer.parseInt(keyboard.nextLine());
		Square square=new Square(x,y,sideLength);
		System.out.println(square.toString()+"area:"+square.getArea());

	}

}
