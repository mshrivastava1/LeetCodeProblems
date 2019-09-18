package mockInterviewOnlineTest1;

public class ProductExceptItself {

	public int[] productExceptSelf(int[] nums) {

		if (nums == null || nums.length == 0) {
			return new int[0];
		}

		int[] result = new int[nums.length];

		int temp = 1;

		for (int i = 0; i < nums.length; i++) {
			result[i] = temp;
			temp *= nums[i];
		}

		temp = 1;

		for (int i = nums.length - 1; i >= 0; i--) {
			result[i] *= temp;
			temp *= nums[i];
			System.out.print(result[i] + " ");
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3, 4 };

		ProductExceptItself obj = new ProductExceptItself();

		System.out.println(obj.productExceptSelf(nums));
	}

}
