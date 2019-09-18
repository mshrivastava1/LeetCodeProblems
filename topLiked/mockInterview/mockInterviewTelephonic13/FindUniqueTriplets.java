package mockInterviewTelephonic13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindUniqueTriplets {

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(nums==null || nums.length<3){
			return result;
		}
		Arrays.sort(nums);
		
		
		for(int i=0;i<nums.length-2;i++){
			
			if(i==0 || (i>0 && nums[i-1]!=nums[i])){
				
				int start = i+1;
				int end = nums.length -1;
				
				int sum =0- nums[i];
				
				while(start<end){
					
					if(nums[start]+nums[end]==sum){
						result.add(Arrays.asList(nums[i],nums[start],nums[end]));
						while(start<end && nums[start]==nums[start+1]){
							start++;
						}
						
						while(end>start && nums[end]==nums[end-1]){
							end--;
						}
						start++;
						end--;
					}else if(nums[start]+nums[end]<sum){
						sum++;
					}else{
						end--;
					}
					
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
