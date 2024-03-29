package mockInterviewOnlineTest4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {


		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(target-nums[i])){
				result[1] = i;
				result[0] = map.get(target-nums[i]);
				break;
			}
			map.put(nums[i], i);
		}
		
		return result;

	}
	
	public static void main(String[] arg){
		int[] nums = {3,4,2};
		
		int target = 6;
		
		TwoSum obj = new TwoSum();
		
		System.out.println(obj.twoSum(nums, target));
	}
}
