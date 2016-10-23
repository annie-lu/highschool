package queens;

//Victoria and Annie

public class Queenstester {
	
	public static void main(String[] args)
	{
		Queens queen = new Queens(8);
		queen.solve(8);
		queen.displayBoard();
	}

}