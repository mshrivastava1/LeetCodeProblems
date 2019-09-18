package sortedArrayToBinaryTree;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x){
		this.val = x;
		this.left = this.right = null;
	}
}
public class SortedArrayToBinaryTree {

	
	public TreeNode sortedArrayToBST(int[] nums) {
        
		if(nums==null || nums.length==0){
			return null;
		}
		
		return createBST(nums, 0, nums.length-1);
    }
	
	public TreeNode createBST(int[] nums, int start, int end){
		
		if(start>end){
			return null;
		}
		
		if(start==end){
			return (new TreeNode(nums[start]));
		}
		
		int mid = (start + end)/2;
		
		TreeNode root = new TreeNode(nums[mid]);
		
		root.left = createBST(nums, start, mid-1);
		root.right = createBST(nums, mid+1, end);
		
		return root;
	}
	
	public void printTree(TreeNode root){
		if(root==null){
			System.out.print("null"+" ");
			return;
		}
		
			System.out.print(root.val+" ");
			
			printTree(root.left);
			printTree(root.right);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-10,-3,0,5,9};
		
		SortedArrayToBinaryTree obj = new SortedArrayToBinaryTree();
		
		TreeNode root = obj.sortedArrayToBST(nums);
		
		obj.printTree(root);
	}
}