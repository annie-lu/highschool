package balancedTree;


public class TreeNode
{
	private Comparable treeNodeValue;
	private TreeNode leftTreeNode;
	private TreeNode rightTreeNode;

	public TreeNode( )
	{
		treeNodeValue = null;
		leftTreeNode = null;
		rightTreeNode = null;
	}

	public TreeNode(Comparable val)
	{
		treeNodeValue = val;
		leftTreeNode = null;
		rightTreeNode = null;
	}

	public TreeNode(int value, TreeNode left, TreeNode right)
	{
		treeNodeValue = value;
		leftTreeNode = left;
		rightTreeNode = right;
	}

	public Comparable getValue()
	{
		return treeNodeValue;
	}

	public TreeNode getLeft()
	{
		return leftTreeNode;
	}

	public TreeNode getRight()
	{
		return rightTreeNode;
	}

	public void setValue(int value)
	{
		treeNodeValue = value;
	}

	public void setLeft(TreeNode left)
	{
		leftTreeNode = (TreeNode)left;
	}

	public void setRight(TreeNode right)
	{
		rightTreeNode = (TreeNode)right;
	}
}