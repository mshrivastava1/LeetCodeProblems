package mockInterviewOnlineTest6;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PatternMatch {

	public boolean wordPattern(String pattern, String str) {

		if(pattern==null &&str==null){
			return true;
		}
		
		if(pattern.isEmpty() && str.isEmpty()){
			return true;
		}
		
		String[] strArray = str.split(" ");
		char[] patternArray = pattern.toCharArray();
		Map<Character, String> map = new HashMap<Character, String>();
		
		if(strArray.length!=patternArray.length){
			return false;
		}
		
		for(int i=0;i<strArray.length;i++){
			
			char c = patternArray[i];
			
			if(map.containsKey(c)){
				if(!map.get(c).equals(strArray[i])){
					return false;
				}
			}else{
				if(map.containsValue(strArray[i])){
					return false;
				}
				
				map.put(c, strArray[i]);
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
