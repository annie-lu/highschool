package greg;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Cal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar cal = new GregorianCalendar();
	
		cal.add(Calendar.DAY_OF_MONTH, 100);
		cal.add(Calendar.DAY_OF_WEEK, 100);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"/"+cal.get(Calendar.DAY_OF_WEEK));
		
		GregorianCalendar myBirthday = new GregorianCalendar(1999,
		Calendar.MARCH, 7);
		
		System.out.println(myBirthday.get(myBirthday.DAY_OF_WEEK));
		
		
		myBirthday.add(myBirthday.DAY_OF_MONTH, 10000);
		myBirthday.add(myBirthday.DAY_OF_WEEK, 10000);
		myBirthday.add(myBirthday.DAY_OF_YEAR, 10000);
	System.out.println(myBirthday);
		
	}

}
