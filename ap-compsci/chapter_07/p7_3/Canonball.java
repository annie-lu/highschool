package p7_3;

public class Canonball {
	public static final double DELTAT=0.01;
	public static final double GRAVITY=9.78;
	private double initial=0;
	private double distance=0;
	private double velocity=0;
	private double time;

	
	public Canonball(double initialVelocity) {
		velocity = initialVelocity;
		initial = initialVelocity;
	}

	public void update() {
		distance = distance + velocity * DELTAT;
		velocity = velocity - GRAVITY * DELTAT;
		time = time + 0.01;
	}

	public double getDistance() {
		return distance;
	}

	public double getExactDistance() {
		return -0.5 * GRAVITY * Math.pow(time, 2) + initial * time;
	}
}
