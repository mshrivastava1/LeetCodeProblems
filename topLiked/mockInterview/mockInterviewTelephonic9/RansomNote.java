package mockInterviewTelephonic9;

public class RansomNote {

	public boolean canConstruct(String ransomNote, String magazine) {

		if(ransomNote==null || ransomNote.isEmpty()){
			return true;
		}
		
		if(magazine==null || magazine.isEmpty()){
			return false;
		}
		
		int[] ransomArray = new int[26];
		int[] magazineArray = new int[26];
		
		for(char c: ransomNote.toCharArray()){
			ransomArray[c-'a']++;
		}
		
		for(char c: magazine.toCharArray()){
			magazineArray[c-'a']++;
		}
		
		for(int i=0;i<26;i++){
			if(ransomArray[i]>magazineArray[i]){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ransomNote = "aa";
		String magazine = "aab";
		
		RansomNote obj = new RansomNote();
		
		System.out.println(obj.canConstruct(ransomNote, magazine));
	}

}
