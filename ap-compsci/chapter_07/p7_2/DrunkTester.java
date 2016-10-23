package p7_2;

public class DrunkTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrunkDude Gary=new DrunkDude();
		for(int x=1;x<=10;x++){
		Gary.walk();
		System.out.println(Gary.printPoint());}
		System.out.println(Gary.getDistance());
		
	}

}
