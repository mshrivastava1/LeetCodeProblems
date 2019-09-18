package mockInterviewTelephonic13;

public class NextPermutation {

	public void nextPermutation(int[] nums) {

		if(nums==null || nums.length==0){
			return;
		}
		
		int i= nums.length-1;
		
		for(;i>0;i--){
			if(nums[i]>nums[i-1]){
				break;
			}
		}
		
		if(i!=0){
			swap(nums,i-1);
		}
		
		reverse(nums,i);
	}
	
	
	public void reverse(int[] nums,int i){
		
		
		int start = i;
		int end = nums.length-1;
		
		while(start<end){
			int temp = nums[end];
			nums[end] = nums[start];
			nums[start] = temp;
			start++;
			end--;
		}
	}
	
	public void swap(int[] nums, int i){
		if(nums==null){
			return;
		}
		
		for(int j=nums.length-1;j>i;j--){
			if(nums[j]>nums[i]){
				int temp = nums[i];
				nums[i]=nums[j];
				nums[j] = temp;
				return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
