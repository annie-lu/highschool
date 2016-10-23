package p4_18;

public class EasterSundayTester {
	public static void main (String args[])
	{
		EasterSunday x = new EasterSunday(2001);
		x.getCalculations();
		
		System.out.println();
		System.out.println("Month: " + x.getEasterSundayMonth());
		System.out.println("Day " + x.getEasterSundayDay());
		
	}
}
