package mockInterviewOnlineTest11;

import java.util.Arrays;

public class ArrayPairSum {

	public int arrayPairSum(int[] nums) {

		if(nums.length==0){
			return 0;
		}
		
		if(nums.length==2){
			return Math.min(nums[0],nums[1]);
		}
		
		Arrays.sort(nums);
		
		int result = 0;
		
		int i = 0;
		
		while(i<nums.length-1){
			
			result = result + Math.min(nums[i], nums[i+1]);
			i = i +2;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
