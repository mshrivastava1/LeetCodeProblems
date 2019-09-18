package inorderTraversalWithoutRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x){
		this.val = x;
		this.left = this.right = null;
	}
}
public class InorderTraversal {

	public List<Integer> inorderTraversal(TreeNode root){
		
		List<Integer> result = new ArrayList<Integer>();
		
		if(root==null){
			return result;
		}
		TreeNode temp = root;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(temp!=null || stack.size()>0){
			
			while(temp!=null){
				stack.push(temp);
				temp = temp.left;
			}
			
			temp = stack.pop();
			result.add(temp.val);
			temp = temp.right;
		}
		return result;
	}
	
	public static void main(String[] arg){
		
	}
}
