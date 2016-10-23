package p4_5;

public class DataSet {
	private int numberOne;
	private int numberTwo;
	private int numberThree;
	private int numberFour;
	
	public DataSet() {
		numberOne=0;
		numberTwo=0;
		numberThree=0;
		numberFour=0;
	}
	public DataSet(int n, int o, int p, int q) {
		numberOne=n;
		numberTwo=o;
		numberThree=p;
		numberFour=q;
	}
		
public void addValue(int x){
	numberOne=numberOne+x;
	numberTwo=numberTwo+x;
	numberThree=numberThree+x;
	numberFour=numberFour+x;
}
public int getSum(){
	return numberOne+numberTwo+numberThree+numberFour;
}
public double getAverage(){
	return (double)getSum()/4;
}
}
