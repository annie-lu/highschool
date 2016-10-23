package p4_14;

public class MilitaryTime {
	private String Start;
	private String End;
	private final int MINUTES_IN_DAY=1440;
	private final int MINUTES_IN_HOUR=60;
	private boolean switched;

	
	public MilitaryTime (int first, int second)
	{
		Start = Integer.toString(first);
		End = Integer.toString(second);;
		
	}

	public int getHours()
	{
		int firsthour=Integer.parseInt(Start.substring(0,2));
		int secondhour= Integer.parseInt(End.substring(0,2));
		int HourDiff;
		if (firsthour> secondhour)
			switched=true;
		if (switched)
		{
			 HourDiff = (24-firsthour) + secondhour;
			
		}
		
		else
		{
			 HourDiff = secondhour - firsthour;
		}
		
		return HourDiff;
	}
	public int getMinutes()
	{
		int firstmin=Integer.parseInt(Start.substring(2,4));
		int secondmin= Integer.parseInt(End.substring(2,4));
		int MinDiff;
		
		if (switched)
		{
			MinDiff = secondmin - firstmin;
			
		}
		else
		{
			MinDiff = secondmin + firstmin;

		}
		
		
		 return MinDiff;
	}
}
