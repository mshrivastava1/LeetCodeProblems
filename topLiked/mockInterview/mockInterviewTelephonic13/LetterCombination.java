package mockInterviewTelephonic13;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {

	public List<String> letterCombinations(String digits) {

		List<String> result = new ArrayList<String>();
		
		if(digits==null || digits.isEmpty()){
			return result;
		}
		
		String[] numbers = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
		
		dfsHelper(digits,numbers,"",result);
		
		return result;
	}

	private void dfsHelper(String digits, String[] numbers, String prefix, List<String> result) {
		// TODO Auto-generated method stub
		
		if(prefix.length()==digits.length()){
			result.add(prefix);
			return;
		}
		
		int index = digits.charAt(prefix.length()) - '0';
		
		for(char c:numbers[index].toCharArray()){
			prefix = prefix + c;
			dfsHelper(digits, numbers, prefix, result);
			prefix = prefix.substring(0,prefix.length()-1);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
