package mix;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

	public String mostCommonWord(String paragraph, String[] banned) {

		if(paragraph==null || paragraph.isEmpty()){
			return paragraph;
		}
		
		int maxCount = Integer.MIN_VALUE;
		String[] words  = paragraph.toLowerCase().trim().split("\\W+");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String result = "";
		for(String word: words){
			
			if(!checkIfBanned(word, banned)){
				map.put(word, map.getOrDefault(word, 0)+1);
				if(maxCount<map.get(word)){
					maxCount = map.get(word);
					result = word;
				}
				
			}
			
		}
		
		
		return result;
	}

	public boolean checkIfBanned(String word, String[] banned){
		
		for(String str: banned){
			if(str.equals(word)){
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		
		String[] banned = {"hit"};
		
		MostCommonWord obj = new MostCommonWord();
		
		System.out.println(obj.mostCommonWord(paragraph, banned));
		
		
	}

}
