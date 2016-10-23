package factorial;

public class FactorialOne {

public static int factorial(int num) {
		// TODO Auto-generated method stub
	int x=1;
	for(int i=num; i>0 ; i--)
		x*=i;
	return x;
	}

}
