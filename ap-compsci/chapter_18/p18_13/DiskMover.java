package p18_13;

public class DiskMover {
	
	public static void main(String[] args) {
		move(1, 3, 3);
		System.out.println("You're FINISHED");
	}

	public static void move(int source, int target, int disks) {
		int newTarget = 0;
		if (disks == 1)
			System.out.println("move a disk from peg " +source+" to peg "+ target);
		else {
				for (int x = 1; x < 4; x++) {
					if (target != x && source != x)
						newTarget = x;
				}

			move(source, newTarget, disks - 1);
			move(source, target, 1);
			move(newTarget, target, disks - 1);
		}

	}
}