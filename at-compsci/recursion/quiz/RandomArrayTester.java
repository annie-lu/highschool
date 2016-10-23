package quiz;

public class RandomArrayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomArray arr = new RandomArray();

		String[][] array = arr.getArray();

		for (String[] a : array) {
			
			for (String y : a) {
				
				System.out.print(y + " ");
				
			}

			System.out.println();

		}

		System.out.println();
		System.out.println("sum: "+arr.getSum());

	}

}
