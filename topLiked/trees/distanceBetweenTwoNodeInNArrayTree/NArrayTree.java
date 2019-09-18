package distanceBetweenTwoNodeInNArrayTree;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
	int val;
	List<TreeNode> children;
	
	TreeNode(int x){
		this.val = x;
		children = new ArrayList<TreeNode>();
	}
}
public class NArrayTree {

	TreeNode root;
	public static int findDist(TreeNode root, TreeNode src, TreeNode dst) {
	    TreeNode lca = findLCA(root, src, dst);
	    return dist(lca, src, 0) + dist(lca, dst, 0);
	}

	private static int dist(TreeNode p, TreeNode c, int h) {
	    if (p == c) {
	        return h;
	    } else if (p == null) {
	        return Integer.MAX_VALUE;
	    }
	    for (TreeNode n : p.children) {
	        int d = dist(n, c, h + 1);
	        if (d != Integer.MAX_VALUE) {
	            return d;
	        }
	    }
	    return Integer.MAX_VALUE;
	}

	private static TreeNode findLCA(TreeNode root, TreeNode src, TreeNode dst) {
	    if (root == src || root == dst || root == null) {
	        return root;
	    }
	    TreeNode ans = null;
	    for (TreeNode node : root.children) {
	        TreeNode lca = findLCA(node, src, dst);
	        if (lca == null) {
	            continue;
	        } else if (lca != src && lca != dst) {
	            return node;
	        } else if (lca == src || lca == dst) {
	            if (ans == src || ans == dst) {
	                return root;
	            } else {
	                ans = lca;
	            }
	        }
	    }
	    return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NArrayTree tree = new NArrayTree();
		
		tree.root = new TreeNode(1);
		tree.root.children.add(new TreeNode(2));
		tree.root.children.add(new TreeNode(3));
		tree.root.children.add(new TreeNode(4));
		tree.root.children.get(0).children.add(new TreeNode(5));
		tree.root.children.get(1).children.add(new TreeNode(6));
		
		TreeNode src = new TreeNode(5);
		TreeNode dst = new TreeNode(6);
		
		TreeNode res = findLCA(tree.root, src, dst);
		System.out.println(res);
	}

}
