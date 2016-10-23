package morse;

import static java.lang.System.*;
import balancedTree.TreeNode;


public class BinarySearchTree {
	private TreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	public void add(Comparable val) {
		root = add(val, root);
	}

	public void setRoot(TreeNode x){
		root=x;
	}
	private TreeNode add(Comparable val, TreeNode tree) {
		if (tree == null)
			tree = new TreeNode(val);
		else {
			Comparable treeValue = tree.getValue();
			int dirTest = val.compareTo(treeValue);

			if (dirTest <= 0)
				tree.setLeft(add(val, tree.getLeft()));
			else if (dirTest > 0)
				tree.setRight(add(val, tree.getRight()));
		}

		return tree;
	}

	public void inOrder() {
		inOrder(root);
	}

	public TreeNode getRoot(){
		return root;
	}
	private void inOrder(TreeNode tree) {
		if (tree != null) {
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(TreeNode tree) {
		if (tree != null) {
			System.out.print(tree.getValue() + " ");
			preOrder(tree.getLeft());
			preOrder(tree.getRight());
		}
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(TreeNode tree) {
		if (tree != null) {
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
		}
	}

	public void revOrder() {
		revOrder(root);
	}

	private void revOrder(TreeNode tree) {
		if (tree != null) {
			revOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
			revOrder(tree.getLeft());
		}
	}

	public int getNumLevels() {
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree) {
		System.out.println("save me");
		if (tree == null)
			return 0;
		else if (getNumLevels(tree.getLeft()) < getNumLevels(tree.getRight()))
			return 1 + getNumLevels(tree.getLeft());
		else
			return 1 + getNumLevels(tree.getRight());
	}

	public int getNumLeaves() {
		return getNumLeaves(root);
	}

	public int getNumLeaves(TreeNode tree) {
		if (tree == null)
			return 0;
		else if (tree.getLeft() == null && tree.getRight() == null)
			return 1;
		else
			return getNumLeaves(tree.getLeft()) + getNumLeaves(tree.getRight());
	}

//	public int getWidth() {
//		int max = 0;
//		for (int x = 0; x <= getNumLevels(); x++) {
//			int temp = getWidth(root, x);
//			if (temp > max)
//				max = temp;
//		}
//		return max;
//	}
//
//	private int getWidth(TreeNode tree, int level) {
//		if (tree == null)
//			return 0;
//		else if (level == 0)
//			return 1;
//		else
//			return getWidth(tree.getLeft(), level - 1)
//					+ getWidth(tree.getRight(), level - 1);
//	}

	public int getHeight() {
		return getHeight(root);
	}

	private int getHeight(TreeNode tree) {
		if (tree == null)
			return -1;
		else
			return 1 + Math.max(getHeight(tree.getLeft()),
					getHeight(tree.getRight()));
	}

	public int getNumNodes() {
		return getNumNodes(root);
	}

	private int getNumNodes(TreeNode tree) {
		if (tree == null)
			return 0;
		else if (tree.getLeft() == null && tree.getRight() == null)
			return 1;
		else
			return 1 + getNumNodes(tree.getLeft())
					+ getNumNodes(tree.getRight());
	}

	public boolean isFull() {
		return isFull(root);
	}

	private boolean isFull(TreeNode tree) {
		if (tree == null)
			return false;
		else if (tree.getLeft() == null && tree.getRight() == null)
			return true;
		else if (tree.getLeft() != null && tree.getRight() != null) {
			return (isFull(tree.getLeft()) && isFull(tree.getRight()));

		} else
			return false;
	}

	public boolean search(Comparable val) {
		return search(val, root);
	}

	private boolean search(Comparable val, TreeNode tree) {
		if (tree == null)
			return false;
		if (tree.getValue().equals(val))
			return true;
		else if (tree.getLeft() == null && tree.getRight() == null) {
			return false;
		} else {
			if (val.compareTo(tree.getValue()) > 0)
				return search(val, tree.getRight());
			else
				return search(val, tree.getLeft());
		}

	}

	public Comparable maxNode() {
		return maxNode(root.getValue(), root);
	}

	private Comparable maxNode(Comparable x, TreeNode tree) {
		Comparable max;
		if (tree == null)
			return 0;
		else if (tree.getLeft() == null && tree.getRight() == null) {
			if (tree.getValue().compareTo(x) > 0)
				max = tree.getValue();
			else
				max = x;

			return max;
		}

		else {
			if (tree.getValue().compareTo(x) > 0)
				max = tree.getValue();
			else
				max = x;

			if (maxNode(max, tree.getLeft()).compareTo(
					maxNode(max, tree.getRight())) > 0)
				return maxNode(max, tree.getLeft());
			else
				return maxNode(max, tree.getRight());
		}

	}

	public TreeNode minNode() {
		return minNode(root, root);
	}

	private TreeNode minNode(TreeNode x, TreeNode tree) {
		TreeNode min;
		if (tree == null)
			return null;
		else if (tree.getLeft() == null && tree.getRight() == null) {
			if (tree.getValue().compareTo(x.getValue()) < 0)
				min = tree;
			else
				min = x;

			return tree;
		}

		else {
			if (tree.getValue().compareTo(x.getValue()) < 0)
				min = tree;
			else
				min = x;

			if (minNode(min, tree.getLeft()).getValue().compareTo(
					minNode(min, tree.getRight()).getValue()) < 0)
				return minNode(min, tree.getLeft());
			else
				return minNode(min, tree.getRight());
		}
	}

	// displays like a tree
	public void levOrder() {
		
		for (int x = 0; x <= getNumLevels(); x++) {

			levOrder(root, x);
		}
	}

	private void levOrder(TreeNode tree, int level) {
		if (tree == null)
			System.out.print("");
		else if (level == 0)
			System.out.print(" " + ((Morse)tree.getValue()).getLetter());
		else {
			levOrder(tree.getLeft(), level - 1);
			levOrder(tree.getRight(), level - 1);

		}

	}

	public void remove(Comparable val) {
		root = remove(val, root);
	}

	private TreeNode remove(Comparable val, TreeNode tree) {
		if (tree != null) {
			int dirTest = val.compareTo(tree.getValue());

			if (dirTest < 0) {
				tree.setLeft(remove(val, tree.getLeft()));
			} else if (dirTest > 0)
				tree.setRight(remove(val, tree.getRight()));
			else {
				if (tree.getRight() == null) {
					tree = tree.getLeft();
				} else {
					TreeNode successor = minNode(tree.getRight(),
							tree.getRight());
					tree.setValue(successor.getValue());
					tree.setRight(remove(successor.getValue(), tree.getRight()));
				}

			}

		}
		return tree;
	}

	// displays all the different orders
	public String toString() {
		return toString(root);
	}

	private String toString(TreeNode tree) {
		String x = "";
		if (tree != null) {
			x += tree.getValue() + " ";
			x += toString(tree.getLeft());
			x += toString(tree.getRight());

		}
		return x;
	}
}