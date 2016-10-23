package secondMagic;

public class Magic {
	private int square[][];
	private int x = 0;
	private int y = 0;
	private int length;

	public Magic(int sideLength) {
		square = new int[sideLength][sideLength];
		length = sideLength;
		x = (length - 1);
		y = length / 2;

		for (int a = 1; a <= length * length; a++) {
			if (x >= length)
				x = 0;
			if (y >= length)
				y = 0;

			while (square[x][y] != 0) {
				x++;

				if (x >= length)
					x = 0;

			}

			square[x][y] = a;
			x++;
			y++;

		}
	}

	public String toString() {
		String printedSquare = "";
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				printedSquare += square[i][j] + " ";
			}
			printedSquare += "\n";
		}
		return printedSquare;
	}

}
