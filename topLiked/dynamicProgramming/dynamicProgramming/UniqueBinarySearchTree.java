package dynamicProgramming;

public class UniqueBinarySearchTree {

	public int numTrees(int n) {

		int[] dp = new int[n+1];
		
		dp[0]=dp[1]=1;
		
		for(int i=2;i<dp.length;i++){
			for(int j=1;j<=i;j++){
				dp[i]+=dp[j-1]*dp[i-j];
			}
		}
		
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
