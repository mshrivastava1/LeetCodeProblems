package mix;

public class RotateArray {

	public static void rotate(int[] nums, int k) {

		if(nums==null || nums.length==0){
			return;
		}
		
		for(int i=1;i<=k;i++){
			
			int temp = nums[nums.length-1];
			
			for(int j=nums.length-1;j>0;j--){
				nums[j] = nums[j-1];
			}
			nums[0] = temp;
		}
		
		for(int num:nums){
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] nums = {1,2,3,4,5,6,7};
		int[] nums = {-1,-100,3,99};
		int k =2;
		rotate(nums, k);
	}

}
