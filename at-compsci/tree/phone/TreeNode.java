package phone;

import binaryTree.Treeable;
import phone.PhoneEntryTwo;


public class TreeNode 
{
	private PhoneEntryTwo treeNodeValue;
	private TreeNode leftTreeNode;
	private TreeNode rightTreeNode;

	public TreeNode( )
	{
		treeNodeValue = null;
		leftTreeNode = null;
		rightTreeNode = null;
	}

	public TreeNode(PhoneEntryTwo val)
	{
		treeNodeValue = val;
		leftTreeNode = null;
		rightTreeNode = null;
	}

	public TreeNode(PhoneEntryTwo value, TreeNode left, TreeNode right)
	{
		treeNodeValue = value;
		leftTreeNode = left;
		rightTreeNode = right;
	}

	public PhoneEntryTwo getValue()
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

	public void setValue(PhoneEntryTwo value)
	{
		treeNodeValue = value;
	}

	public void setLeft(TreeNode treeNode)
	{
		leftTreeNode = (TreeNode)treeNode;
	}

	public void setRight(TreeNode right)
	{
		rightTreeNode = (TreeNode)right;
	}
}