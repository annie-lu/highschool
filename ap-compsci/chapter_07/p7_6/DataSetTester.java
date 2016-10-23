package p7_6;

import java.util.Scanner;

public class DataSetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("write \" done \" when you are done typing numbers");
		DataSet number=new DataSet();
		Scanner keyboard = new Scanner (System.in);
//		boolean done=false;
//		String input;
//		while(!done){
//			input=keyboard.nextLine();
//			if(input.equals("done")){
//				done=true;
//		continue;}
//				number.inputNumber(Double.parseDouble(input));}
		
		number.inputNumber(0);
		number.inputNumber(1);
		number.inputNumber(4);
		number.inputNumber(9);
		number.inputNumber(16);
		number.inputNumber(25);
		number.inputNumber(36);
		number.inputNumber(49);
		number.inputNumber(64);
		number.inputNumber(81);
		System.out.println("number of values: "+number.getNumofValues());
		System.out.println("average: "+number.getAverage());
		System.out.println("standard deviation: "+number.getStandardDeviation());
		keyboard.close();
			
		}

	}


