package amazonMockInterviewOnline;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FindMostFrequentWord {

	public String mostCommonWord(String paragraph, String[] banned) {

		if(paragraph== null || paragraph.isEmpty()){
			return "";
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		String[] strings = paragraph.split("[\\p{Punct}\\s]+");
		
		for(String str: strings){
			String newString = (str.replaceAll("\\W", "")).toLowerCase();
			
			map.put(newString, map.getOrDefault(newString, 0)+1);
		}
		
		PriorityQueue<String> pQueue = new PriorityQueue<String>((o1,o2)->map.get(o2)-map.get(o1));
		
		for(String str : map.keySet()){
			pQueue.add(str);
		}
		
		String result = "";
		while(!pQueue.isEmpty()){
			
			String temp = pQueue.poll();
			if(!checkIfPresent(temp, banned)){
				result = temp;
				break;
			}
		}
		
		return result;
	}
	
	public boolean checkIfPresent(String temp, String[] banned){
		
		if(banned==null || banned.length==0){
			return false;
		}
		
		for(int i=0;i<banned.length;i++){
			if(temp.toLowerCase().equalsIgnoreCase(banned[i])){
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String paragraph = "a, a, a, a, b,b,b,c, c";
		String[] banned = {"hit"};
		
		
		FindMostFrequentWord obj = new FindMostFrequentWord();
		
		System.out.println(obj.mostCommonWord(paragraph, banned));
	}

}
