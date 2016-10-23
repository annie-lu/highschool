package math;

public class PolynomialTester {

	public static void main(String[] args)

	{

		Polynomial p = new Polynomial();
		Term x = new Term(3, 4);
		Term y = new Term(6, 3);
		Term z = new Term(-2, 2);

		p.addTerm(x);
		p.addTerm(y);
		p.addTerm(z);

		Polynomial m = new Polynomial();
		Term a = new Term(5, 5);
		Term b = new Term(2, 3);
		Term c = new Term(3, 4);

		m.addTerm(a);
		m.addTerm(b);
		m.addTerm(c);

		System.out.println("P:");
		AlgebraCalc.print(p);
		p = AlgebraCalc.simplify(p);
		AlgebraCalc.print(p);
		System.out.println("");
		System.out.println("M:");
		AlgebraCalc.print(m);
		m = AlgebraCalc.simplify(m);
		AlgebraCalc.print(m);
		System.out.println("");
		System.out.println("Multiply:");
		AlgebraCalc.print(AlgebraCalc.multiply(p, m));
		System.out.println("");
		System.out.println("Add:");
		AlgebraCalc.print(AlgebraCalc.add(p, m));
		System.out.println("");
		System.out.println("Derivative:");
		AlgebraCalc.print(AlgebraCalc.findDerivative(p));

	}
}
