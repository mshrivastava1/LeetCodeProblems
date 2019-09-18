package mockInterviewTelephonic14.tree;


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

	
	 public boolean isValidBST(TreeNode root) {
	  
		 return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	  }
	private boolean validateBST(TreeNode root, int minValue, int maxValue) {
		
		if(root==null){
			return true;
		}
		
		if(root.val<minValue || root.val>maxValue){
			return false;
		}
		return (validateBST(root.left, minValue, root.val) && validateBST(root.right, root.val, maxValue));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
