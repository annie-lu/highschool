package p2_3;

import java.awt.Rectangle;

public class Rectangible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangible=new Rectangle(100,100,50,60);
		rectangible.translate((int) rectangible.getWidth(), 0);
		rectangible.translate(0, (int)rectangible.getHeight());
		rectangible.translate((int) rectangible.getWidth(), (int)rectangible.getHeight());
	}

}
