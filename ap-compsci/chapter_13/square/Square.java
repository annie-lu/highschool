package square;

public class Square extends java.awt.Rectangle {
	int sideLength;
	public Square(int x,int y,int sideLength){
		setLocation(x-sideLength/2,y-sideLength/2);
		setSize(sideLength,sideLength);
		this.sideLength=sideLength;
	}
	public int getArea(){
		return sideLength*sideLength;
		
	}
	
}
