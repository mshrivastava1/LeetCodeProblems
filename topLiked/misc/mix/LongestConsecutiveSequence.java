package mix;

import java.util.Arrays;

public class LongestConsecutiveSequence {
	
	public int longestConsecutive(int[] nums) {
		
		if(nums==null || nums.length==0){
			return 0;
		}
		
		if(nums.length==1){
			return 1;
		}
				
		int[] dp = new int[nums.length];
		
		Arrays.fill(dp, 1);
		int longestSequence = 1;
		for(int i=1;i<nums.length;i++){
			for(int j=0;j<i;j++){
				if(nums[j]<nums[i]){
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
				
				longestSequence = Math.max(longestSequence, dp[i]);
			}
		}
		return longestSequence;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] nums = {100, 4, 200, 1, 3, 2};
		
		//int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
		//int[] nums = {1,2,0,1};
		
		int[] nums ={-2,-1};
		LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
		
		System.out.println(obj.longestConsecutive(nums));
	}

}
