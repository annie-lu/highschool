package sort;

public class SelectionSort {
	public static void sort(int[] x) {
		int minIndex;
		for (int start = 0; start < x.length-1; start++) {
			minIndex = start;
			for (int y = start+1; y < x.length; y++) {
				if (x[y]<x[minIndex])
					minIndex = y;
			}
			swap(x, start, minIndex);
		}

	}

	private static void swap(int[] x, int i, int j) {
		int temp = x[i];
		x[i] = x[j];
		x[j] = temp;
	}

	static void sort(int[] x, int start) {
		if (start < x.length - 1) {
			swap(x, x[start], x[indexOfMin(x, start)]);
			sort(x, start + 1);
		}
	}

	private static int indexOfMin(int[] x, int start) {
		if (start == x.length - 1)
			return x[start];
		int otherMin = indexOfMin(x, start + 1);
		if (x[start] < otherMin)
			return x[start];
		else
			return otherMin;

	}

}