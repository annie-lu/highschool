package p11_3;

public class Person implements Measurable {

	private String lame;
	private double tallness;
	
	public Person (String name, double height){
		lame=name;
		tallness=height;
	}
	
	public String getName(){
		return lame;
	}

	public double getMeasure() {
		// TODO Auto-generated method stub
		return tallness;
	}

	
}
