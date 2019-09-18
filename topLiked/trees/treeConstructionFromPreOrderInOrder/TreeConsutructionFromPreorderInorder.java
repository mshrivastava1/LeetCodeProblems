package treeConstructionFromPreOrderInOrder;

import com.sun.javafx.geom.AreaOp.IntOp;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x){
		this.val = x;
		this.left = this.right = null;
	}
}
public class TreeConsutructionFromPreorderInorder {

	 int pre =0;
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			if(preorder.length!=inorder.length){
				return null;
			}
			TreeNode root = createBinaryTree(preorder,inorder,0,inorder.length-1);
			return root;
		}

		private TreeNode createBinaryTree(int[] preorder, int[] inorder, int start, int end) {
			
			if(start>end){
				return null;
			}
			
			TreeNode root = new TreeNode(preorder[pre]);
			pre++;
			
			if(start==end){
				return root;
			}
			
			int inorderIndex = findInorderIndex(inorder,start,end, root.val);
			
			root.left = createBinaryTree(preorder, inorder, start, inorderIndex-1);
			root.right = createBinaryTree(preorder, inorder, inorderIndex+1, end);
			
			return root;
		}

		private int findInorderIndex(int[] inorder, int start, int end, int val) {

			for(int i=start;i<=end;i++){
				if(inorder[i]==val){
					return i;
				}
			}
			
			return 0;
		}

	public void printTree(TreeNode root){
		
		if(root!=null){
			printTree(root.left);
			System.out.println(root.val);
			printTree(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		
		TreeConsutructionFromPreorderInorder tree = new TreeConsutructionFromPreorderInorder();
		
		TreeNode root = tree.buildTree(preorder, inorder);
		
		tree.printTree(root);
	}

}
