package binaryTreeRightSideView;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		this.val = x;
		this.left = this.right = null;
	}
}

public class BinaryTreeRightSideView {

	TreeNode root;

	public List<Integer> rightSideView(TreeNode root) {

		List<Integer> result = new ArrayList<Integer>();
		
		if(root==null){
			return result;
		}
		
		printRightSideView(root, result, 0);
		
		return result;
	}
	
	public void printRightSideView(TreeNode root, List<Integer> result, int level){
		
		if(root==null){
			return;
		}
		
		if(result.size()==level){
			System.out.println(root.val);
			result.add(root.val);
		}
		
		printRightSideView(root.right, result, level+1);
		printRightSideView(root.left, result, level+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeRightSideView tree = new BinaryTreeRightSideView();
		
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.left.right = new TreeNode(5);
		tree.root.right = new TreeNode(3);
		tree.root.right.right = new TreeNode(4);
		
		tree.rightSideView(tree.root);
	}

}
