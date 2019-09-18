package amazonMockInterviewOnline2;

import java.util.Arrays;

public class SumOfTwoNumbers {

	public int[] twoSum(int[] nums, int target) {

		if(nums==null || nums.length==0){
			return nums;
		}
		
		for(int i=0; i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				
				if(nums[i]+nums[j]==target){
					return (new int[]{i,j});
				}
			}
		}
		
		return (new int[]{-1,-1});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {2, 7, 11, 15};
		
		int target = 9;
		
		SumOfTwoNumbers obj = new SumOfTwoNumbers();
		
		System.out.println(obj.twoSum(nums, target));
	}

}
