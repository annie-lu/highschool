package phone;



public class PhoneBookTwo {
	private TreeNode root;

	public PhoneBookTwo() {
		root = null;
	}

	public void add(PhoneEntryTwo val) {
		root = add(val, root);
	}

	private TreeNode add(PhoneEntryTwo val, TreeNode tree) {
		if (tree == null)
			tree = new TreeNode(val);
		else {
			PhoneEntryTwo treeValue = tree.getValue();
			int dirTest = val.compareTo(treeValue);

			if (dirTest <= 0)
				tree.setLeft(add(val, tree.getLeft()));
			else if (dirTest > 0)
				tree.setRight(add(val, tree.getRight()));
		}

		return tree;
	}

	public String display() {
		return display(root);
	}

	private String display(TreeNode tree) {
		String x = "";
		if (tree != null) {
			x += tree.getValue() + " ";
			x += display(tree.getLeft());
			x += display(tree.getRight());

		}
		return x;
	}

	public PhoneEntryTwo lookupNumber(String name) {
		return search(name, root);
	}

	private PhoneEntryTwo search(String name, TreeNode tree) {
		if (tree == null)
			return null;
		if (tree.getValue().getName().equals(name))
			return tree.getValue();
		else if (tree.getLeft() == null && tree.getRight() == null) {
			return null;
		} else {
			if (name.compareTo(tree.getValue().getName()) > 0)
				return search(name, tree.getRight());
			else
				return search(name, tree.getLeft());
		}

	}

	public PhoneEntryTwo reverseSearch(String number, TreeNode tree) {
		if (tree == null) {
			return null;
		}
		if (tree.getValue().getNumber().equals(number)) {
			return tree.getValue();
		} else {
			if (reverseSearch(number, tree.getRight()) != null) {
				return reverseSearch(number, tree.getRight());
			} else {
				return reverseSearch(number, tree.getLeft());
			}

		}

	}

	public PhoneEntryTwo reverseLookup(String phoneNumber) {
		return reverseSearch(phoneNumber, root);

	}

	public TreeNode remove(PhoneEntryTwo val)
	{
		return remove(val, root);
	}
	
	private TreeNode remove(PhoneEntryTwo val, TreeNode tree)
	{
	
		if(tree!=null)
		{
			int dirTest = val.compareTo(tree.getValue());
			if (dirTest<0)
				tree.setLeft(remove(val, tree.getLeft()));
			else if (dirTest>0)
				tree.setRight(remove(val, tree.getRight()));
			else
			{
				if (tree.getRight()==null)
				{
					tree = tree.getLeft();
					
				}
				else
				{
					TreeNode successor = (getSmallest(tree.getRight()));
					tree.setValue(successor.getValue());
					tree.setRight(remove(successor.getValue(), tree.getRight()));
				}
			}
		}
		return tree;
	}
	
	public TreeNode getSmallest()
	{
		return getSmallest(root);
	}
	private TreeNode getSmallest(TreeNode tree)
	{
		if (tree.getLeft() == null)
			return tree;
		else
			return getSmallest(tree.getLeft());
	}

}
