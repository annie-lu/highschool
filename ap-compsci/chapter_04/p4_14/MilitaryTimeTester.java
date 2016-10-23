package p4_14;

import java.util.Scanner;

public class MilitaryTimeTester
{
	public static void main (String argsp[])
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter your first time: ");
		int firstTime = keyboard.nextInt();
		System.out.println("Enter your second time ");
		int secondTime = keyboard.nextInt();
		
		MilitaryTime x = new MilitaryTime (firstTime, secondTime);
		
		int minutes=x.getMinutes();
		int hours=x.getHours();
		if(minutes>60){
			hours++;
			minutes=minutes-60;
		}
		else if(minutes<0){
			hours--;
			minutes=minutes+60;
		}
		
		System.out.println(hours);
		System.out.println(minutes);
		
	}
}
