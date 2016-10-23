package p7_6;

public class DataSet {
	private double sum=0;
	private int values=0;
	private double squares = 0;
	
	public void inputNumber(double number){
		sum=sum+number;
		values++;
		squares += number * number;
	}
	
	public double getStandardDeviation(){
		
		double secondHalf = (sum*sum)/values;
		double numerator = squares - secondHalf;
		double equation = numerator / (values-1);
		return Math.sqrt(equation);
	
		
	}
	
	public double getAverage(){
		return sum/values;
	}
	
	public int getNumofValues(){
		return values;
	}

}
