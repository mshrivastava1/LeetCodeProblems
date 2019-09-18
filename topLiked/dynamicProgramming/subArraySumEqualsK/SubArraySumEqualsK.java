package subArraySumEqualsK;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class SubArraySumEqualsK {

	public int subarraySum(int[] nums, int k) {

		Map<Integer, Integer> hm = new HashMap<>();
		int[] sum = new int[nums.length + 1];
		int count = 0;
		hm.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum[i + 1] = sum[i] + nums[i];
			if (hm.containsKey(sum[i + 1] - k)) {
				count += hm.get(sum[i + 1] - k);
			}
			hm.put(sum[i + 1], hm.getOrDefault(sum[i + 1], 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {

		int[] nums = { 2, 2, 3, 5, 5 };

		int k = 5;

		SubArraySumEqualsK obj = new SubArraySumEqualsK();
		System.out.println(obj.subarraySum(nums, k));

	}

}
