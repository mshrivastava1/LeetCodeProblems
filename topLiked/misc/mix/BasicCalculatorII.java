package mix;

import java.util.Stack;

public class BasicCalculatorII {

	public int calculate(String s) {
	
		if(s==null || s.isEmpty()){
			return 0;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		char sign = '+';
		int num = 0;
		for(int i=0;i<s.length();i++){
			
			if(Character.isDigit(s.charAt(i))){
				num = num*10+s.charAt(i)-'0';
			} 
			if((!Character.isDigit(s.charAt(i)) && ' '!=s.charAt(i)) || i==s.length()-1){
				if(sign=='+'){
					stack.push(num);
				}else if(sign=='-'){
					stack.push(-num);
				}else if(sign=='*'){
					stack.push(stack.pop()*num);
				}else if(sign=='/'){
					stack.push(stack.pop()/num);
				}
				
				sign = s.charAt(i);
				num = 0;
			}
		}
		int result = 0;
		while(!stack.isEmpty()){
			result+=stack.pop();
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "3*5/2";

		BasicCalculatorII obj = new BasicCalculatorII();

		System.out.println(obj.calculate(s));
	}

}
