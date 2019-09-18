package mockInterviewTelephonic8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.sun.xml.internal.ws.util.StringUtils;



public class CheckInclusionForStrings {

	public boolean checkInclusion(String s1, String s2) {

		if(s2==null || s2.isEmpty()){
			return false;
		}
		
		if(s1==null || s1.isEmpty()){
			return true;
		}
		
		int[] s1Array = new int[26];
		
		for(int i=0;i<s1.length();i++){
			s1Array[s1.charAt(i)-'a']++;
		}
		
		StringBuilder sb1 = new StringBuilder();
		
		for(int i=0;i<26;i++){
			sb1.append(s1Array[i]);
		}
		
		String str = sb1.toString();
		
		for(int i=0;i<=(s2.length()-s1.length());i++){
			
			String temp = s2.substring(i, (i+s1.length()));
			
			int[] s2Array = new int[26];
			
			for(char c:temp.toCharArray()){
				s2Array[c-'a']++;
			}
			
			StringBuilder sb2 = new StringBuilder();
			for(int k=0;k<26;k++){
				sb2.append(s2Array[k]);
			}
			if(str.equals(sb2.toString())){
				return true;
			}
		}
		
		return false;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ab";
		String s2 = "eidbaooo";
		CheckInclusionForStrings obj = new CheckInclusionForStrings();
		
		System.out.println(obj.checkInclusion(s1, s2));
		
		
	}

}
