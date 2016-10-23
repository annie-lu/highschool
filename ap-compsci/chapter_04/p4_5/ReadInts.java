package p4_5;

import p3_13.RabbitPopulation;

public class ReadInts {

	public static void main(String[] args) {
		int x=0;
		DataSet Data = new DataSet(2,3,4,5);
		while(x<5){
			Data.addValue(2);
			System.out.println(Data.getSum());
			System.out.println(Data.getAverage());
			x++;
		}
	}

}
