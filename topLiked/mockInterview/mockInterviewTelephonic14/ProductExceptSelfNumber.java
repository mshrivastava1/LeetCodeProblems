package mockInterviewTelephonic14;

public class ProductExceptSelfNumber {

	public int[] productExceptSelf(int[] nums) {

		if(nums==null || nums.length==0){
			return nums;
		}
		
		int temp =1;
		
		int[] tempArray = new int[nums.length];
		
		tempArray[0] = 1;
		
		for(int i=1;i<nums.length;i++){
			tempArray[i] = temp*nums[i-1];
			temp = temp*nums[i];
		}
		
		temp =1;
		
		for(int i=nums.length-1;i>=0;i--){
			tempArray[i]*=temp;
			temp = temp*nums[i];
		}
		
		return tempArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4 };
		
		ProductExceptSelfNumber obj = new ProductExceptSelfNumber();
		
		obj.productExceptSelf(nums);
	}

}
