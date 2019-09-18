package sufficientTree;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		this.val = x;
		this.left = this.right = null;
	}
}

public class InsufficientTree {

	TreeNode root;
	public TreeNode sufficientSubset(TreeNode root, int limit) {
		if (helper(root, limit, 0)) {
			return root;
		} else {
			return null;
		}
	}

	// Return true if there is any root to leave path intersected with this node
	// have sum >= limit
	private boolean helper(TreeNode root, int limit, int sum) {
		if (root == null) {
			return false;
		}

		if (root.left == null && root.right == null) {
			return sum + root.val >= limit;
		}

		boolean left = helper(root.left, limit, sum + root.val);
		boolean right = helper(root.right, limit, sum + root.val);

		if (!left) {
			root.left = null;
		}
		if (!right) {
			root.right = null;
		}

		return left || right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsufficientTree obj = new InsufficientTree();
		
		obj.root = new TreeNode(1);
		obj.root.left = new TreeNode(2);
		obj.root.right = new TreeNode(2);
		obj.root.left.left = new TreeNode(3);
		obj.root.left.right = new TreeNode(4);
		obj.root.right.left = new TreeNode(6);
		obj.root.right.left.left = new TreeNode(7);
		
	}

}
