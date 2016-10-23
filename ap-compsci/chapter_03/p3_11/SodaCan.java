package p3_11;

public class SodaCan {
	private String person;
	private double height,radius;

		public SodaCan() {
		height=0;
		radius=0;
		}
		

		public SodaCan(double tall, double rad) {
			height=tall;
			radius=rad;
		}
		
		public double getSurfaceArea() {
			return 2*3.14*radius*height+2*3.14*radius*radius; // i forgot the Math.Powah thing
		}
		
		public double getVolume() {
			return 3.14*radius*radius*height;
		}
}
