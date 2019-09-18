package mockInterviewOnlineTest2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElements {

	public List<Integer> majorityElement(int[] nums) {

		List<Integer> resultList = new ArrayList<Integer>();
		
		if(nums==null || nums.length==0){
			return resultList;
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++){
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		int n = nums.length;
		for(Entry<Integer, Integer> entry: map.entrySet()){
			
			if(entry.getValue()>(n/3)){
				resultList.add(entry.getKey());
				System.out.print(entry.getKey()+" ");
			}
		}
		
		return resultList;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1,1,1,3,3,2,2,2};
		
		MajorityElements obj = new MajorityElements();
		
		obj.majorityElement(nums);
	}

}
