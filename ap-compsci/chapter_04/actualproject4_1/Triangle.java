package actualproject4_1;

import java.awt.Point;


public class Triangle {
	private Point a;
	private Point b;
	private Point  c;

	public Triangle() {
		 a.setLocation(0.0, 0.0);
		 b.setLocation(0.0, 0.0);
		 c.setLocation(0.0, 0.0);

	}

	public Triangle(double x,double y,double x1,double y1, double x2, double y2) {
		 a.setLocation(x,y);
		 b.setLocation(x1,y1);
		 c.setLocation(x2,y2);
	}

	public double getLengthAB() {
		return a.distance(b);
	}

	public double getLengthBC() {
		return b.distance(c);
	}

	public double getLengthAC() {
		return a.distance(c);
	}

	public double getAnglesABC() {
		double ABC=Math.acos((Math.pow(getLengthAB(), 2)
				+Math.pow(getLengthBC(), 2)
				-Math.pow(getLengthAC(), 2))/(2*getLengthAB()*getLengthBC())
				);
		return ABC;
	}
	
	public double getAnglesBCA() {
		double BCA=Math.acos((Math.pow(getLengthAC(), 2)
				+Math.pow(getLengthBC(), 2)
				-Math.pow(getLengthAB(), 2))/(2*getLengthAC()*getLengthBC())
				);
		return BCA;
	}
	
	public double getAnglesCAB() {
	double CAB=Math.acos((Math.pow(getLengthAC(), 2)
				+Math.pow(getLengthAB(), 2)
				-Math.pow(getLengthBC(), 2))/(2*getLengthAC()*getLengthAB())
				);
	return CAB;
	}

	public double getPerimeter() {
		double perimeter=getLengthAB()+getLengthBC()+getLengthAC();
		return perimeter;
	}

	public double getArea() {
		double s=getPerimeter()/2;
		double area=Math.sqrt(s*(s-getLengthAB())*(s-getLengthBC())*(s-getLengthAC()));
		return area;

	}
}
