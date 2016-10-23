package p3_6;

public class Car {
	private double efficiency;
	private double fuelLevel;

	public Car() {
		efficiency = 0;
		fuelLevel = 0.0;
	}

	public Car(double afishandsea) {
		efficiency = afishandsea;
		fuelLevel = 0.0;
	}

	public void Drive(double distance) {
		fuelLevel = fuelLevel - distance * efficiency;
	}

	public double getGas() {
		return fuelLevel;
	}

	public void addGas(double gas) {
		fuelLevel = fuelLevel + gas;
	}
}
