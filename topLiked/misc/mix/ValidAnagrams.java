package mix;

public class ValidAnagrams {

	public boolean isAnagram(String s, String t) {

		if(s==null && t==null){
			return true;
		}
		
		if(s.isEmpty() && t.isEmpty()){
			return true;
		}
		
		if(s.length()!=t.length()){
			return false;
		}
		
		int[] sArray = new int[26];
		int[] tArray = new int[26];
		for(int i=0;i<s.length();i++){
			sArray[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<t.length();i++){
			tArray[t.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++){
			if(sArray[i]!=tArray[i]){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
