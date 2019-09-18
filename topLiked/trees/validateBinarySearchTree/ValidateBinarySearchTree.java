package validateBinarySearchTree;


class TreeNode{
	
	int val;
	
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x){
		this.val = x;
		this.left = this.right = null;
	}
}
public class ValidateBinarySearchTree {

	TreeNode root;
	
	 public boolean isValidBST(TreeNode root) {
		  
	        if(root==null){
	            return true;
	        }
				
			     return helpValid(root, null, null);
	    }
	    
	    private boolean helpValid(TreeNode root, Integer min, Integer max) {
	        if(root == null) return true;
	        // notice that even equal is not allowed for Binary Search Tree
	        if(min != null && root.val <= min) return false;
	        if(max != null && root.val >= max) return false;
	        return helpValid(root.left, min, root.val) && helpValid(root.right, root.val, max);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ValidateBinarySearchTree tree = new ValidateBinarySearchTree();
		
		tree.root = new TreeNode(5);
		tree.root.left = new TreeNode(1);
		tree.root.right = new TreeNode(8);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(9);
		
		System.out.println(tree.isValidBST(tree.root));
	}

}
