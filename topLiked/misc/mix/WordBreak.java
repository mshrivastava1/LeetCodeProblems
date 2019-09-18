package mix;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public boolean wordBreak(String s, List<String> wordDict) {

		if(s==null || s.isEmpty()){
			return false;
		}
		
		boolean[] dp = new boolean[s.length()+1];
		
		dp[0] = true;
		
		for(int i=0;i<s.length();i++){
			if(dp[i]){
				for(String word : wordDict){
					int j = word.length();
					if(i+j>s.length()){
						continue;
					}
					if(word.equals(s.substring(i, i+j))){
						dp[i+j]=true;
					}
				}
			}
		}
		
		return dp[s.length()];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "leetcode";
		List<String> wordDict = new ArrayList<String>();
		
		wordDict.add("leet");
		wordDict.add("code");
		
		WordBreak obj = new WordBreak();
		System.out.println(obj.wordBreak(s, wordDict));
	}

}
