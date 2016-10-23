package soda;

public class SodaCan {
	double radius, height;

	public SodaCan(double radiusCan, double radiusHeight) {
		radiusCan = radius;
		radiusHeight = height;
	}

	public double getSurfaceArea() {
		double surfaceArea = (this.radius * 3.14 * this.radius * 2)
				+ ((2 * 3.14 * this.radius) * this.height);
		return surfaceArea;
	}

	public double getVolume() {
		double volume = (this.radius * 3.14 * this.radius * 2) * this.height;
		return volume;
	}
}
