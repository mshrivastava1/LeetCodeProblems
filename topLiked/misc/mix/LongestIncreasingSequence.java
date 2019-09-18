package mix;

import java.sql.Array;
import java.util.Arrays;

public class LongestIncreasingSequence {

	public int lengthOfLIS(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		if (nums.length == 1) {
			return 1;
		}

		int[] dp = new int[nums.length];

		Arrays.fill(dp, 1);
		int longestSequence = 1;
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}

				longestSequence = Math.max(longestSequence, dp[i]);
			}
		}
		return longestSequence;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };

		int[] nums = { 4,10,4,3,8,9};
		LongestIncreasingSequence obj = new LongestIncreasingSequence();

		System.out.println(obj.lengthOfLIS(nums));
	}

}
