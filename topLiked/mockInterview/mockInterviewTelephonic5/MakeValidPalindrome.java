package mockInterviewTelephonic5;

import java.util.Stack;

public class MakeValidPalindrome {

	public boolean validPalindrome(String s) {

		if(s==null || s.isEmpty()){
			return true;
		}
		
		int start = 0;
		int end = s.length()-1;
		
		while(start<end){
			
			if(s.charAt(start)!=s.charAt(end)){
				return checkValid(s, start+1,end) || checkValid(s, start, end-1);
			}
			
			start++;
			end--;
		}
		
		
		return true;
	}
	
	
	public boolean checkValid(String s, int start, int end){
		
		while(start<end){
			
			if(s.charAt(start)!=s.charAt(end)){
				return false;
			}
			
			start++;
			end--;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "abca";
		
		String s = "abcdcza";
		
		MakeValidPalindrome obj = new MakeValidPalindrome();
		
		System.out.println(obj.validPalindrome(s));
	}

}
