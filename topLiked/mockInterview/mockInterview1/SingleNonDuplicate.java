package mockInterview1;

public class SingleNonDuplicate {

	public int singleNonDuplicate(int[] nums) {

		if (nums == null || nums.length == 0) {
			return Integer.MAX_VALUE;
		}

		int i = 0;

		while (i <= nums.length - 1) {

			if(i+1>nums.length-1){
				return nums[i];
			}
			if (nums[i] != nums[i + 1]) {
				return nums[i];
			}

			i = i + 2;
		}

		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1,2};
		
		SingleNonDuplicate obj = new SingleNonDuplicate();
		
		System.out.println(obj.singleNonDuplicate(nums));
	}

}
