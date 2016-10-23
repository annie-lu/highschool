package p8_11;

import java.util.ArrayList;

public class PermutationGenerator {
	public int[] nextPermutation() {
	int[] vals= new int[10]; 
		
		for (int x = 0; x < 10; x++) 
			vals[x]=x+1;
		
		int[] random =new int[10];
		
		for (int x = 0; x < 10; x++) { 
			int y=(int) (Math.random() * (vals.length-x));
			random[x] = vals[y];
			int previous=vals[y];
			vals[y]=vals[9-x];
			vals[9-x]=previous;
			}
		
		return random;
}
}