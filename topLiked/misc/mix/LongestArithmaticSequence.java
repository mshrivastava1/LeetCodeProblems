package mix;

import java.util.HashMap;

public class LongestArithmaticSequence {

	public int longestArithSeqLength(int[] A) {

		if(A==null || A.length==0){
			return 0;
		}
		
		
		HashMap<Integer,Integer>[] dp = new HashMap[A.length];
		
		int maxLenght = 2;
		for(int i=0;i<A.length;i++){
			
			dp[i] = new HashMap<Integer,Integer>();
			
			for(int j=0;j<i;j++){
				int diff = A[i] - A[j];
				dp[i].put(diff, dp[j].getOrDefault(diff, 1)+1);
				
				maxLenght = Math.max(maxLenght, dp[i].get(diff));
			}
		}
		
		
		return maxLenght;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//int[] A = {3,6,9,12};
		
		//int[] A = {9,4,7,2,10};
		//int[] A = {20,1,15,3,10,5,8};
		int[] A = {0,8,45,88,48,68,28,55,17,24};
		LongestArithmaticSequence obj = new LongestArithmaticSequence();
		
		System.out.println(obj.longestArithSeqLength(A));
	}

}
