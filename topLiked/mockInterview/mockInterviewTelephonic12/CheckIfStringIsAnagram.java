package mockInterviewTelephonic12;

public class CheckIfStringIsAnagram {

	public boolean isAnagram(String s, String t) {

		if((s==null || s.isEmpty()) && (t==null || t.isEmpty())){
			return true;
		}
		
		if(s==null || s.isEmpty()){
			return false;
		}
		
		if(t==null || t.isEmpty()){
			return false;
		}
		
		int[] sArray = new int[26];
		int[] tArray = new int[26];
		
		for(char c:s.toCharArray()){
			sArray[c-'a']++;
		}
		for(char c:t.toCharArray()){
			tArray[c-'a']++;
		}
		
		for(int i=0;i<26;i++){
			if(tArray[i]!=sArray[i]){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
