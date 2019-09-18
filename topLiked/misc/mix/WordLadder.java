package mix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder {

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

		if(beginWord==null || beginWord.isEmpty() || endWord==null || endWord.isEmpty() || wordList==null || wordList.isEmpty()){
			return 0;
		}
		
		if(!wordList.contains(endWord)){
			return 0;
		}
	     Set<String> reached = new HashSet<String>();
	        reached.add(beginWord);
	       // wordList.add(endWord);
	        int distance = 1;
	        while (!reached.contains(endWord)) {
	            Set<String> toAdd = new HashSet<String>();
	            for (String each : reached) {
	                for (int i = 0; i < each.length(); i++) {
	                    char[] chars = each.toCharArray();
	                    for (char ch = 'a'; ch <= 'z'; ch++) {
	                        chars[i] = ch;
	                        String word = new String(chars);
	                        if (wordList.contains(word)) {
	                            toAdd.add(word);
	                            wordList.remove(word);
	                        }
	                    }
	                }
	            }
	            distance++;
	            if (toAdd.size() == 0) return 0;
	            reached = toAdd;
	        }
	        return distance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = new ArrayList<String>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot"); 
		wordList.add("log"); 
		wordList.add("cog"); 
		
		WordLadder ladder = new WordLadder();
		
		System.out.println(ladder.ladderLength(beginWord, endWord, wordList));
	}

}
