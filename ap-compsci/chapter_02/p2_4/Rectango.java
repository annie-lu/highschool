package p2_4;
import java.awt.Rectangle;
public class Rectango {

	public static void main(String[] args) {
		Rectangle rectangible=new Rectangle(100,100,50,60);
		Rectangle rectangerine=new Rectangle(30,100,50,60);
		Rectangle rectangle=rectangerine.intersection(rectangible);

	}

}
