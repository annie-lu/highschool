package p13_6;

public class Worker {

	String name;
	double salaryRate;
	public Worker(String name, double celeryRate){
		this.name=name;
		salaryRate=celeryRate;
	}
	public double computePay(int hours){
		return hours*salaryRate;
	}
	public String getName(){
		return name;
	}
	public double getSalaryRate(){
		return salaryRate;
	}
}

