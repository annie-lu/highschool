package r8_3;

public class MaxMin {
	public static void main(String[] args) {
		int[] vals={3,5,8,9,10,11,13,2,4,5};
		int max=vals[1];
		int min=vals[1];
		
		for(int x=0;x<vals.length;x++){
			if(vals[x]>max)
				max=vals[x];
			else if (vals[x]<min)
				min=vals[x];
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
	}
}
