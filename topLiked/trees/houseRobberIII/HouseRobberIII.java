package houseRobberIII;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		this.val = x;
		this.left = this.right = null;
	}
}

public class HouseRobberIII {

	TreeNode root;

	public int rob(TreeNode root) {

		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return root.val;
		}
		int left = 0;
		int right = 0;
		int subLeft = 0;
		int subRight = 0;
		if (root.left != null) {
			left = rob(root.left);
			subLeft = rob(root.left.left) + rob(root.left.right);
		}

		if (root.right != null) {
			right = rob(root.right);
			subRight = rob(root.right.left) + rob(root.right.right);
		}

		return Math.max((left + right), (subLeft + subRight + root.val));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HouseRobberIII robber = new HouseRobberIII();

		robber.root = new TreeNode(3);
		robber.root.left = new TreeNode(4);
		robber.root.left.left = new TreeNode(1);
		robber.root.left.right = new TreeNode(3);
		robber.root.right = new TreeNode(5);
		robber.root.right.right = new TreeNode(1);

		System.out.println(robber.rob(robber.root));
	}

}
