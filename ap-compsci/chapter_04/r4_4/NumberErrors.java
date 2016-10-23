package r4_4;

public class NumberErrors {

	public static void main(String[] args) {
		//integer overflow
		int x=2147483647;
		System.out.println(x+10);
		// yes it would work if you used floating-point
		//floating point round off
		double y=4.35;
		System.out.println(100*y);
		
		
	}

}
