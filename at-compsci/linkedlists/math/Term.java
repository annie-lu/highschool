package math;

public class Term {
	private int constant;
	private int exponent;
	
	public Term(int x, int y){
		constant=x;
		exponent=y;
	}
	public int getConstant(){
		return constant;
		
	}
	public int getExponent(){
		return exponent;
	}
	public Term add(Term x){
		if(exponent==x.getExponent())
		 return new Term(constant+x.getConstant(),exponent);
		else
			return null;
	}
	public Term multiply(Term x){
		return new Term(constant*x.getConstant(),exponent+x.getExponent());
	}
}
