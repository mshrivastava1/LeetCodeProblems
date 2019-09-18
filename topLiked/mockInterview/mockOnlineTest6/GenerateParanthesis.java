package mockOnlineTest6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParanthesis {

	public List<String> generateParenthesis(int n) {

		List<String> result = new ArrayList<String>();
		
		if(n==0){
			return result;
		}
		
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=0;i<n;i++){
			sb1.append('(');
			sb2.append(')');
		}
		
		createParanthesis(result,sb1.toString(),sb2.toString(),"");
		return result;
	}

	private void createParanthesis(List<String> result, String s1, String s2, String prefix) {

		if(s1.isEmpty() && s2.isEmpty()){
			if(checkValidParathesis(prefix)){
				result.add(prefix);
			}
			return;
		}
		if(!s1.isEmpty()){
			createParanthesis(result, s1.substring(1), s2, prefix+s1.charAt(0));
		}
		if(!s2.isEmpty()){
			createParanthesis(result, s1, s2.substring(1), prefix+s2.charAt(0));
		}
		
	}

	public boolean checkValidParathesis(String s){
		
		if(s==null || s.isEmpty()){
			return false;
		}
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char c:s.toCharArray()){
			
			if(c=='('){
				stack.push(c);
			}else{
				if(stack.isEmpty()){
					return false;
				}
				if(stack.peek()=='('){
					stack.pop();
				}
			}
		}
		
		if(stack.isEmpty()){
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
