package balancedTree;


public class BalancedTree extends BinarySearchTree {

		public BalancedTree(int[] data){
			setRoot((balance(data)));
		}
		
		public TreeNode balance(int arr[])
		{
			return balance(arr, 0, arr.length-1);
		}
		private TreeNode balance(int[] arr, int start, int end)
		{
		  if (start > end)
		  {
			  return null;
		  }
		  
		  int middle = start + (end-start)/2;
	      TreeNode newNode = new TreeNode(arr[middle]);
		  
	    	  newNode.setLeft(balance(arr, start, middle-1));
		      newNode.setRight(balance(arr, middle + 1, end));
		  
		    return newNode;
	    }
		
		
		public static void main(String[] args)
		{
			int[] data = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
			BalancedTree x = new BalancedTree(data);
			System.out.println("InOrder");
			x.inOrder();
		//	TreeNode temp = x.getRoot();
//			System.out.println("Right Branch");
//			while(temp!=null)
//			{
//				System.out.print(temp+" ");
//				temp=temp.getRight();
//			}
			System.out.println();

			System.out.println();
			System.out.println("level order");
			x.levOrder();
			
		}
	
}
