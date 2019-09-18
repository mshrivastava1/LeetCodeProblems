package mockInterviewTelephonic5;

import java.util.Stack;

public class CheckPalindromeString {

	public boolean isPalindrome(String s) {

		if(s==null || s.isEmpty()){
			return true;
		}
		
		Stack<Character> stack = new Stack<Character>();
		
		s = s.replaceAll("\\s","");
		s=s.toLowerCase();
		for(char c:s.toCharArray()){
			if(isLetterOrDigit(c)){
				stack.push(c);
			}
		}
		
		for(char c :s.toCharArray()){
			
			if(isLetterOrDigit(c)){
				char temp = stack.pop();
				if(temp!=c){
					return false;
				}
			}
		}
		
		return true;
	}
	
	private static boolean isLetterOrDigit(char c) {
	    return (c >= 'a' && c <= 'z') ||
	           (c >= 'A' && c <= 'Z') ||
	           (c >= '0' && c <= '9');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "A man, a plan, a canal: Panama";
		
		CheckPalindromeString obj = new CheckPalindromeString();
		
		System.out.println(obj.isPalindrome(s));
	}

}
