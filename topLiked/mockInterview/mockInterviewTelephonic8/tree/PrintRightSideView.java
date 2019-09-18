package mockInterviewTelephonic8.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import amazonMockInterviewOnline.CutOffTree;
import javafx.scene.shape.CubicCurve;

class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		this.val = x;
		this.left = this.right = null;
	}

}

public class PrintRightSideView {

		public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> result = new ArrayList<Integer>();
	        rightView(root, result, 0);
	        return result;
	    }
	    
	    public void rightView(TreeNode curr, List<Integer> result, int currDepth){
	        if(curr == null){
	            return;
	        }
	        if(currDepth == result.size()){
	            result.add(curr.val);
	        }
	        
	        rightView(curr.right, result, currDepth + 1);
	        rightView(curr.left, result, currDepth + 1);
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.left = new TreeNode(6);
	
		PrintRightSideView obj = new PrintRightSideView();
		
		obj.rightSideView(root);
	}

}
