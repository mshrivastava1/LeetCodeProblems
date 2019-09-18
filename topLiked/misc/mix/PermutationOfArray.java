package mix;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {

	public List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (nums == null || nums.length == 0) {
			return result;
		}

		// List<Integer> temp = new ArrayList<Integer>();
		findPermutation(nums, 0, result);

		return result;
	}

	public void findPermutation(int[] nums, int index, List<List<Integer>> result) {

		if (index == nums.length - 1) {
			List<Integer> temp = new ArrayList<Integer>();

			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + " ");
				temp.add(nums[i]);
			}
			System.out.println("");
			result.add(temp);
		}

		for (int i = index; i < nums.length; i++) {
			swap(index, i, nums);
			findPermutation(nums, index+1, result);
			swap(index, i, nums);
		}
	}

	public void swap(int i, int j, int[] nums) {

		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] arg) {

		PermutationOfArray permute = new PermutationOfArray();

		int nums[] = { 1, 2, 3 };

		permute.permute(nums);
	}
}
