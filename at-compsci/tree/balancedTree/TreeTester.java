package balancedTree;

public class TreeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		BalancedTree x= new BalancedTree(data);
		System.out.println("InOrder");
		x.inOrder();
		TreeNode temp=x.getRoot();
		System.out.println("Right Branch");
		while(temp!=null){
			System.out.print(temp.getValue()+ " ");
			temp=temp.getRight();
		}
	}

}
