package math;
import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial {
	LinkedList<Term> polynomial=new LinkedList<Term>();

	public void addTerm(Term x) {
		ListIterator<Term> iterator = polynomial.listIterator();
		while (iterator.hasNext()) {
			Term next = (Term) iterator.next();
			if (x.getExponent() > next.getExponent()) {
				iterator.previous();
				iterator.add(x);
				return;
			}
		}
		iterator.add(x);
	}
	
	public LinkedList<Term> getPolynomial(){
		return polynomial;
	}
	
	
}
