package square;

import java.util.Scanner;

public class MagicSquare {

	private int square[][];
	private int x = 0;
	private int y = 0;
	private int length;

	public MagicSquare(int sideLength) {
		square = new int[sideLength][sideLength];
		length = sideLength;

	}

	public void add(int num) {
		int newNumber = num;

		if (!(y < length)) {
			y = 0;
			x++;
		}

		square[x][y] = newNumber;
		y++;

	}

	public boolean isMagic() {
		int[] rowSum = new int[length];
		int[] colSum = new int[length];
		int[] diagonalSum = new int[length];

		for (int a = 0; a < length; a++) {
			for (int b = 0; b < length; b++) {
				rowSum[a] = rowSum[a] + square[a][b];
				colSum[a] = colSum[a] + square[b][a];

			}
			diagonalSum[1] = diagonalSum[1] + square[a][a];
			diagonalSum[2] = diagonalSum[2] + square[a][length - a - 1];
		}

		if (diagonalSum[1] != diagonalSum[2])
			return false;
		for (int a = 1; a < length; a++) {
			for (int b = 1; b < length; b++) {
				if (rowSum[a - 1] != colSum[b - 1]
						|| diagonalSum[1] != rowSum[a - 1]
						|| rowSum[a - 1] != rowSum[a]
						|| colSum[b] != colSum[b - 1])
					return false;
			}
		}

		return true;

	}
}
