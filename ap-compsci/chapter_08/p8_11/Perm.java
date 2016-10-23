package p8_11;

import java.util.ArrayList;

public class Perm {

	public static void main(String[] args) {
		PermutationGenerator perm = new PermutationGenerator();

		for (int x = 1; x <= 10; x++) {
			int[] random = perm.nextPermutation();
			System.out.println();
			for (int z = 0; z < random.length; z++) {
				System.out.println(random[z]);
			}
		}
	}
}
