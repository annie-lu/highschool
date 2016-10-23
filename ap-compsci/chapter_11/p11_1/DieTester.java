package p11_1;

public class DieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSet dieData= new DataSet();
		
		dieData.add(new Die(4));
		dieData.add(new Die(5));
		dieData.add(new Die(6));
		dieData.add(new Die(7));
		System.out.println("Average: "+dieData.getAverage());
		
	}

}
