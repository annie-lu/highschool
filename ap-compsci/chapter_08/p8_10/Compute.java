package p8_10;

import java.util.Scanner;

public class Compute {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		int[] vals= new int[10];
		int sum=0;
		
		for(int x=0;x<vals.length;x++){
			System.out.println("Enter Input:");
			vals[x]=Integer.parseInt(keyboard.nextLine());
		}
		
		for(int x=0;x<vals.length;x++){
			if(x%2==0)
				sum+=vals[x];
			else
				sum-=vals[x];
			}
		
		System.out.println("sum: "+sum);
	}
}
