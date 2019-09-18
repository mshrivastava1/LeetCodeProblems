package mockInterviewTelephonic6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {

	public List<String> topKFrequent(String[] words, int k) {

		List<String> result = new ArrayList<String>();
		
		if(words==null || words.length==0 || k<=0){
			return (new ArrayList<String>());
		}
		
		Map<String, int[]> map = new HashMap<String, int[]>();
		
		for(int i=0;i<words.length;i++){
			String str = words[i];
			if(map.containsKey(str)){
				int[] tempArray = map.get(str);
				tempArray[1] = tempArray[1]+1;
				map.put(str, tempArray);
			}else{
				
				int[] tempArray = new int[2];
				tempArray[0] =i;
				tempArray[1] = 1;
				
				map.put(str, tempArray);
			}
			
		}
		
		PriorityQueue<String> pQueue = new PriorityQueue<String>(new Comparator<String>() {
			
			public int compare(String o1,String o2){
				
				if(map.get(o1)[1]!=map.get(o2)[1]){
					return map.get(o2)[1] -map.get(o1)[1];
				}else{
					return o1.compareTo(o2);
				}
			}
		});
		
		for(String str: map.keySet()){
			pQueue.offer(str);
		}
		
		//String[] result = new String[k];
		for(int i=0;i<k;i++){
				result.add(pQueue.poll());
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
		
		//String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		int k = 3;
		//int k =4;
		TopKFrequentWords obj = new TopKFrequentWords();
		
		System.out.println(obj.topKFrequent(words, k));
	}

}
