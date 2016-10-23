package p10_25;

public class ArcSin {
	
	public static int factorial(int n) { int fact = 1; 
	for (int i = 1; i <= n; i++) { fact *= i; } return fact; }

	public static double arcSin(double radians){
	double x=radians;
	int counter=1;
	while(Math.pow(10,-6)>x){
	x=(Math.pow(x,2)*x)/(factorial(counter));
	counter=counter+2;}
	return x;}

}
