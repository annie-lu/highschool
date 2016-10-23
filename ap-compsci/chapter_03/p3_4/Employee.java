package p3_4;

public class Employee {

	private String person;
	private double salary;

	public Employee() {
		person = null;
		salary = 0;
	}

	public Employee(String name, double celery) {
		person = name;
		salary = celery;
	}

	public String getName() {
		return person;
	}

	public double getSalary() {
		return salary;
	}

}
