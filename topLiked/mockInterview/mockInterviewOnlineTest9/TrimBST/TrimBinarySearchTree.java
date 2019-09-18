package mockInterviewOnlineTest9.TrimBST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		this.val = x;
		this.left = this.right = null;
	}
}

public class TrimBinarySearchTree {

	TreeNode root;

	public TreeNode trimBST(TreeNode root, int L, int R) {

		if (root == null) {
			return root;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);

		List<Integer> list = new ArrayList<Integer>();

		while (!queue.isEmpty()) {

			TreeNode node = queue.poll();
			if (node.val >= L && node.val <= R) {
				list.add(node.val);
			}
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}

		if (list.isEmpty()) {
			return null;
		}

		TreeNode resultNode = null;
		for (int i = 0; i < list.size(); i++) {

			if (resultNode == null) {
				resultNode = new TreeNode(list.get(i));
			} else {
				TreeNode currentNode = resultNode;
				int newVal = list.get(i);
				while (true) {
					if (newVal < currentNode.val) {
						if (currentNode.left == null) {
							currentNode.left = new TreeNode(newVal);
							break;
						} else {
							currentNode = currentNode.left;
						}
					} else if (currentNode.right == null) {
						currentNode.right = new TreeNode(newVal);
						break;
					} else {
						currentNode = currentNode.right;
					}
				}
			}
		}

		return resultNode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrimBinarySearchTree tree = new TrimBinarySearchTree();

		tree.root = new TreeNode(2);
		tree.root.left = new TreeNode(1);
		tree.root.right = new TreeNode(3);

		tree.trimBST(tree.root, 1, 4);
	}

}
