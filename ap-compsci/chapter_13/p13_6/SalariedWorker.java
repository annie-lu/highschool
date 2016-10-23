package p13_6;

public class SalariedWorker extends Worker {
	public SalariedWorker(String name, double celeryRate){
		super(name,celeryRate);
	}
	public double computePay(int hours){
		return 40*getSalaryRate();
	}
}
