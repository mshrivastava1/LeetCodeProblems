package mockInterview1;

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

public class LevelOrderTraversal {

	TreeNode root;

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(root==null){
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			
			int size = queue.size();
			
			List<Integer> temp = new ArrayList<Integer>();
			
			while(size>0){
				
				TreeNode tempNode = queue.remove();
				temp.add(tempNode.val);
				
				if(tempNode.left!=null){
					queue.add(tempNode.left);
				}
				if(tempNode.right!=null){
					queue.add(tempNode.right);
				}
				size--;
			}
			
			result.add(temp);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
