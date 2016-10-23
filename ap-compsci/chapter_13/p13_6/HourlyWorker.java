package p13_6;

public class HourlyWorker extends Worker {

	public HourlyWorker(String name, double celeryRate){
		super(name,celeryRate);
	}
	public double computePay(int hours){
		if(hours>40)
			return getSalaryRate()*40+getSalaryRate()*(hours-40);
		else
			return hours*salaryRate;
	}
} 
