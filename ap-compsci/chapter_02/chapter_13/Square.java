package chapter_13;

import java.awt.Rectangle;

public class Square extends Rectangle
{
	private int side;
	
	/**
	 * Constructor for Square
	 * @param x Center x.
	 * @param y Center y.
	 * @param s Side length.
	 */
	public Square(int x, int y, int s)
	{
		side = s;
		setLocation(x, y);
		setSize(s, s);
	}
	
	/**
	 * Calculates the area of the square and returns it.
	 * @return the area
	 */
	public double getArea()
	{
		return side*side;
	}
}