package math;
import java.util.ListIterator;


public class AlgebraCalc {
	//Supply methods to add, multiply, and print polynomials, 
	//and to compute the derivative of a single polynomial 
	//(if you don�t know the Power Rule in Calculus, just ask.)
	
	public static Polynomial add(Polynomial x, Polynomial y){
		ListIterator<Term> xIterator = x.getPolynomial().listIterator();
		ListIterator<Term> yIterator = y.getPolynomial().listIterator();
		while (xIterator.hasNext()) {
			y.addTerm(xIterator.next());
				}
		return AlgebraCalc.simplify(y);
	}

	public static Polynomial multiply(Polynomial x, Polynomial y){
		Polynomial z=new Polynomial();
		ListIterator<Term> xIterator = x.getPolynomial().listIterator();
		ListIterator<Term> yIterator = y.getPolynomial().listIterator();
		
		while (xIterator.hasNext()) {
			Term term=xIterator.next();
			while (yIterator.hasNext()) {
				z.addTerm(yIterator.next().multiply(term));
			}
			while(yIterator.hasPrevious()){
				yIterator.previous();
			}
				}
		return AlgebraCalc.simplify(z);
	}

	public static void print(Polynomial x){
		ListIterator<Term> iterator = x.getPolynomial().listIterator();
		if(iterator.hasNext()){
			Term term=iterator.next();
		String list=term.getConstant() + "x^"+term.getExponent();
		
		while(iterator.hasNext()){
			term=iterator.next();
			list+="+"+term.getConstant() + "x^"+term.getExponent();
		}

		
		System.out.println(list);
		
		}
		
	}

	public static Polynomial findDerivative(Polynomial x){
		ListIterator<Term> iterator = x.getPolynomial().listIterator();
		while(iterator.hasNext()){
			Term term=iterator.next();
			iterator.set(new Term(term.getExponent()*term.getConstant(),term.getExponent()-1));
		}
		return x;
	}
	
	public static Polynomial simplify(Polynomial x){
		ListIterator<Term> iterator = x.getPolynomial().listIterator();
		
		while (iterator.hasNext()) {
			Term term = (Term) iterator.next();
			if(iterator.hasNext()){
				if(iterator.next().getExponent()==term.getExponent()){
					iterator.previous();
					Term compareTerm = (Term) iterator.next();
					iterator.previous();
					iterator.set(term.add(compareTerm));
					iterator.previous();
					iterator.remove();}
				else
					iterator.previous();
			}
		}
		while(iterator.hasPrevious()){
			iterator.previous();
		}
		while(iterator.hasNext()){
			if(iterator.next().getConstant()==0)
				iterator.remove();
		}
		return x;
	}}


