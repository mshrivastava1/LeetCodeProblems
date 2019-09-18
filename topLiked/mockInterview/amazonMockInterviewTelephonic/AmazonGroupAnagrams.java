package amazonMockInterviewTelephonic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmazonGroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> result = new ArrayList<List<String>>();
		
		if(strs == null || strs.length==0){
			return result;
		}
		
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		for(String str : strs){
			
			int[] temp = new int[26];
			
			for(char c:str.toCharArray()){
				temp[c-'a']++;
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<26;i++){
				sb.append(temp[i]);
			}
			
			String key = sb.toString();
			if(!map.containsKey(key)){
				map.put(key, new ArrayList<String>());
			}
			
			map.get(key).add(str);
		}
		
		result.addAll(map.values());
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmazonGroupAnagrams obj = new AmazonGroupAnagrams();
		
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(obj.groupAnagrams(strs));
	}

}
