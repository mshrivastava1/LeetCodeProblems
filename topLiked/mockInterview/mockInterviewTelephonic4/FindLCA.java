package mockInterviewTelephonic4;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		this.val = x;
		this.left = this.right = null;
	}
}

public class FindLCA {

	TreeNode root;

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if(root==null){
			return root;
		}
		
		if(root == p || root==q){
			return root;
		}
		
		TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
		TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
		
		if(leftNode!=null && rightNode!=null){
			return root;
		}
		
		if(leftNode==null){
			return rightNode;
		}else{
			return leftNode;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
