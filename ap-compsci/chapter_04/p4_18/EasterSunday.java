package p4_18;

public class EasterSunday {
	private int a = 0;
	private int b = 0; 
	private int c = 0;
	private int d = 0;
	private int e = 0;
	private int g = 0;
	private int h = 0;
	private int j = 0;
	private int k = 0;
	private int m = 0;
	private int r = 0;
	private int n = 0;
	private int p = 0;
	
	
	public EasterSunday(int y)
	{
		a = y % 19;
		b = y / 100;
		c = y % 100;
		d = b / 4;
		e = b % 4;
		g = (8 * b + 13) / 25;
		h = (19 * a + b - d - g + 15) % 30;
		j = c / 4;
		k = c % 4;
		m = (a + 11 * h) / 319;
		r = (2 * e + 2 * j - k - h + m + 32) % 7;
		n = (h - m + r + 90) / 25;
		p = (h - m + r + n + 19) % 32;
	}
	
	public int getEasterSundayMonth()
	{

		
		return n;
	}
	public int getEasterSundayDay()
	{

		return p;
	}
	
	public void getCalculations()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(g);
		System.out.println(h);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		System.out.println(r);
		System.out.println(n);
		System.out.println(p);
	}
}
