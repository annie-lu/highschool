package p13_5;

public class Manager extends Employee {
	String department;
	public Manager(String name, double celery,String department){
	super(name,celery);
	this.department=department;}
	
	public String toString(){
		return getName()+" "+getSalary()+" "+department;
	}
}
