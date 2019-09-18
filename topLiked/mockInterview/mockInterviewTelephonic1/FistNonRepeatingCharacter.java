package mockInterviewTelephonic1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import mix.FirstAndLastPositionInSortedArray;

public class FistNonRepeatingCharacter {

	public int firstUniqChar(String s) {

		if(s==null || s.isEmpty()){
			return -1;
		}
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		int result = Integer.MAX_VALUE;
		for(int i=0;i<s.length();i++){
			char c= s.charAt(i);
			if(!map.containsKey(c)){
				map.put(c, i);
			}else{
				map.put(c, -5);
			}
		}
		
		for(Entry<Character, Integer> entry: map.entrySet()){
			
			if(entry.getValue()!=-5){
				result = Math.min(result, entry.getValue());
			}
		}
		
		if(result!=Integer.MAX_VALUE){
			return result;
		}else{
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "loveleetcode";
		
		FistNonRepeatingCharacter obj = new FistNonRepeatingCharacter();
		
		System.out.println(obj.firstUniqChar(s));
	}

}
