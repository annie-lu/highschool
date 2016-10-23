package binaryTree;


import static java.lang.System.*;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
 		//add test cases here
 		
 		
 		BinarySearchTree x=new BinarySearchTree();
 		x.add(90);
 		x.add(80);
 		x.add(70);
 		x.add(85);
 		x.add(100);
 		x.add(120);
 		x.add(98);
 		

 		System.out.println("inorder");
 		x.inOrder();
 		System.out.println("");
 		System.out.println("preorder");
 		x.preOrder();
 		System.out.println("");
 		System.out.println("postorder");
 		x.postOrder();
 		System.out.println("");
 		System.out.println("revorder");
 		x.revOrder();
 		System.out.println("");
 		System.out.println("");
 		
 		
 		System.out.println("Height "+x.getHeight());
 		//System.out.println("Width "+x.getWidth());
 		System.out.println("Levels "+x.getNumLevels());
 		System.out.println("Leaves "+x.getNumLeaves());
 		System.out.println("Nodes "+x.getNumNodes());
 		System.out.println("Max Node "+x.maxNode());
 		System.out.println("Min Node "+x.minNode().getValue());
 		System.out.println("Has 10 "+x.search(10));
 		System.out.println("Is full "+x.isFull());
 		System.out.println("to string");
 		System.out.println(x);
 		System.out.println();
 		System.out.println("display");
 		x.levOrder();
 		System.out.println("remove 98");
 		System.out.println();
 		x.remove(98);
 		x.levOrder();
 		System.out.println("search for 70 "+x.search(70));
 		System.out.println("search for 1 "+x.search(1));
 		
 
   }
}