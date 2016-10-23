package r8_8;

public class Random {
	public static void main(String[] args) {

		int[] vals= new int[10];
		
		for(int x=0;x<vals.length;x++)
			vals[x]=(int)(Math.random()*100)+1;
		
	}
}
