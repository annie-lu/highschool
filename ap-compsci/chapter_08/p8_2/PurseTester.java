package p8_2;

public class PurseTester {
	public static void main(String[] args) {
	Purse x = new Purse();
	x.addCoin("quarter");
	x.addCoin("dime");
	x.addCoin("nickle");
	x.addCoin("nickle");
	x.addCoin("nickle");
	x.addCoin("dime");
	
	Purse y = new Purse();
	y.addCoin("nickle");
	y.addCoin("dime");
	
	System.out.println(x);
	x.reverse();
	System.out.println(x);
	
	x.transfer(y);
	System.out.println(x);
	
	System.out.println(x.sameCoins(y));
	System.out.println(x.sameContents(y));
	System.out.println(y);
}
}