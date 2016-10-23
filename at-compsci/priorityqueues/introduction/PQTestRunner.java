package introduction;


public class PQTestRunner
{
	public static void main ( String[] args )
	{
		

		PQTester pq = new PQTester("one two three four five six seven");
		System.out.println(pq);
		System.out.println(pq.getMin());
		System.out.println(pq.getNaturalOrder());
		System.out.println();
		pq = new PQTester("1 3 2 4 5 three five two four one");
		System.out.println(pq);
		System.out.println(pq.getMin());
		System.out.println(pq.getNaturalOrder());
		
	}
}