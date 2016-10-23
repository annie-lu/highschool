package p4_6;

public class ReadInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		DataSet Data = new DataSet(2,3,4,5);
		
		while(x<5){
			Data.addValue(2);
			System.out.println(Data.getLargest());
			System.out.println(Data.getSmallest());
			x++;}
	}

}
