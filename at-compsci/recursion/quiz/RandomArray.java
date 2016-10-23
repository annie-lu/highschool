package quiz;

public class RandomArray {

	String[][] array;
	String[] numbers;
	int sum;

	public RandomArray() {
		
		sum = 0;
		array = new String[10][10];
		numbers = new String[9];
		
		for (int x = 0; x < numbers.length; x++) {
			numbers[x] = "" + (x + 1);
		}
		
		fillarray(array.length - 1);
	}

	private void fillarray(int row) {
		
		if (row >= 0) {
			
			for (int x = 0; x < array.length; x++) {
				
				if ((int) (Math.random() * 10) < 3)
					array[row][x] = "*";
				else
					array[row][x] = numbers[(int) (Math.random() * 10 - 1)];
				
			}
			
			fillarray(row - 1);
		}
	}

	public int getSum() {
		
		return getSum(array.length - 1);
		
	}

	private int getSum(int row) {
		
		if (row >= 0) {
			
			for (int x = 0; x < array[0].length; x++) {

				if (array[row][x] != "*")
					sum += Integer.parseInt(array[row][x]);

			}
			getSum(row - 1);
		}

		return sum;

	}

	public String[][] getArray() {
		
		return array;
		
	}
}
