package r8_7;

public class Ints {
	public static void main(String[] args) {
		//this is more like prealgebra ._.
		//i probably made some stupid mistake though :1
		int[] vals= new int[10];
		
		for(int x=0;x<vals.length;x++)
			vals[x]=x+1;
		
		
		for(int x=0;x<vals.length;x++)
			vals[x]=2*x;
		
		
		for(int x=0;x<vals.length;x++)
			vals[x]=(int) Math.pow((x+1),2);
		
		
		for(int x=0;x<vals.length;x++)
			vals[x]=0;
		
		
		//wao theres probably a better way
		vals[0]=1;
		vals[1]=4;
		vals[2]=9;
		vals[3]=16;
		vals[4]=9;
		vals[5]=7;
		vals[6]=4;
		vals[7]=9;
		vals[8]=11;
		vals[9]=0;
	}
}
