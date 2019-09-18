package checkCompleteBinaryTree;

import java.util.LinkedList;
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

public class CheckCompleteBinaryTree {

	TreeNode root;
	public boolean isCompleteTree(TreeNode root) {

		if(root==null){
			return true;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.add(root);
		
		boolean end = false;
		
		while(!queue.isEmpty()){
			
			TreeNode temp = queue.poll();
			
			if(temp==null){
				end = true;
			}else{
				if(end){
					return false;
				}
				queue.add(temp.left);
				queue.add(temp.right);
			}
		}
		
		return end;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckCompleteBinaryTree tree = new CheckCompleteBinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.right = new TreeNode(6);
		
		System.out.println(tree.isCompleteTree(tree.root));
		//tree.isCompleteTree(tree.root);
	}

}
