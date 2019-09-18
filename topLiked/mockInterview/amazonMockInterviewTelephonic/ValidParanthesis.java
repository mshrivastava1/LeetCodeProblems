package amazonMockInterviewTelephonic;

import java.util.Stack;

public class ValidParanthesis {

	public boolean isValid(String s) {

		if(s==null || s.isEmpty()){
			return false;
		}
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char c: s.toCharArray()){
			
			if(c=='('||c=='{'||c=='['){
				stack.push(c);
			}else{
				if(stack.isEmpty()){
					return false;
				}
				if(c==')' && stack.peek()=='('){
					stack.pop();
				}else if(c=='}' && stack.peek()=='{'){
					stack.pop();
				}else if(c==']' && stack.peek()=='['){
					stack.pop();
				}else{
					return false;
				}
			}
		}
		
		if(!stack.isEmpty()){
			return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "()";
		
		ValidParanthesis obj = new ValidParanthesis();
		
		System.out.println(obj.isValid(s));
	}

}
