package mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class FindKFrequentElements {

	public List<Integer> topKFrequent(int[] nums, int k) {

		List<Integer> result = new ArrayList<Integer>();
		if (nums == null || nums.length == 0 || k<=0 || k>nums.length) {
			return result;
		}
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int num: nums){
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>((o1,o2)->map.get(o2)-map.get(o1));
		
		for(int num : map.keySet()){
			pQueue.add(num);
		}
		
		for(int i=0;i<k;i++){
			result.add(pQueue.poll());
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 1, 1, 2, 2, 3, 3, 3, 3 };
		int k = 2;

		FindKFrequentElements obj = new FindKFrequentElements();

		System.out.println(obj.topKFrequent(nums, k));

	}

}
