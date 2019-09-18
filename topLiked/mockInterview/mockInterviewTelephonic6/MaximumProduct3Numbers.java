package mockInterviewTelephonic6;

import java.util.Arrays;

public class MaximumProduct3Numbers {

	 public int maximumProduct(int[] nums) {
	        
		 if(nums==null || nums.length==0 || nums.length<3){
			 return 0;
		 }
		 
        Arrays.sort(nums);
		int maxProduct = Integer.MIN_VALUE;
		 for(int i=0;i<nums.length-2;i++){
			 
			 int currentProduct = nums[i];
			 
			 int left = i+1;
			 int right = nums.length-1;
			 
			 while(left<right){
				 maxProduct = Math.max((currentProduct*nums[left]*nums[right]), maxProduct);
				 if(nums[left]>nums[right]){
					 right--;
				 }else{
					 left++;
				 }
			 }
		 }
		 
		 return maxProduct;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,4};
		
		MaximumProduct3Numbers obj = new MaximumProduct3Numbers();
		
		System.out.println(obj.maximumProduct(nums));
	}

}
