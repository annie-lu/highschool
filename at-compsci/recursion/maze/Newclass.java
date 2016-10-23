package maze;

import java.util.Arrays;

public class Newclass {

	public static void fillarray(String[][] arr) {
		fillarray(arr, arr.length-1);
	}

	public static void fillarray(String[][] arr,int row) {
		if (row >= 0) {
			for (int x = 0; x < arr[0].length; x++) {
				arr[row][x] = "*";
			}
			fillarray(arr, row-1);
		}
	}
}
