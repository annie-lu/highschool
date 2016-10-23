package r4_13;

public class FindThings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=23456;

int length=0;
int x=n;
while(x>0){
	x=x/10;
	length++;
}
//this is a weird thing where you figure out the number of digits
	
System.out.println(n%10);
System.out.println((int)(n/(Math.pow(10, length-1))));
	}

}
