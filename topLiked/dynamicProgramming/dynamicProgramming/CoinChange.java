package dynamicProgramming;

public class CoinChange {

	public int coinChange(int[] coins, int amount){
		
		if(coins==null || amount ==0){
			return 0;
		}
		
		int[] dp = new int[amount+1];
		
	
		
		for(int i=0;i<=amount;i++){
			dp[i] = Integer.MAX_VALUE;
		}
		
		dp[0] = 0;
		for(int i=0;i<coins.length;i++){	
			for(int j=1;j<=amount;j++){	
				if(coins[i]<=j){
					int remaining = j - coins[i];
					if(dp[remaining]!=Integer.MAX_VALUE && dp[remaining]+1 < dp[j]){
						dp[j] = dp[remaining] + 1;
					}
				}
			}
		}
		
		if(dp[amount]!=Integer.MAX_VALUE){
			return dp[amount];
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] coins = {2};
		//int amount = 3;
		
		int[] coins = {1, 2, 5};
		
		int amount = 11;
		CoinChange obj = new CoinChange();
		
		System.out.println(obj.coinChange(coins, amount));
	}

}
