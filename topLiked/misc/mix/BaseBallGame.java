package mix;

import java.util.Stack;

public class BaseBallGame {

	public int calPoints(String[] ops) {

		if(ops==null || ops.length==0){
			return 0;
		}
		
		int sum = 0;
		
		if(ops[0].equals("C") || ops[0].equals("D") || ops[0].equals("+")){
			return 0;
		}
		
	
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(String s:ops){
			
			if(s.equals("D")){
				sum += stack.peek()*2;
				stack.push(stack.peek()*2);
			}else if(s.equals("C")){
				sum = sum - stack.pop();
			}else if(s.equals("+")){
				int first = stack.pop();
				int second = stack.pop();
				int current = first + second;
				sum = sum + first + second;
				stack.push(second);
				stack.push(first);
				stack.push(current);
			}else{
				sum = sum + Integer.parseInt(s);
				stack.push(Integer.parseInt(s));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String[] ops = {"5","2","C","D","+"};
		
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		BaseBallGame obj = new BaseBallGame();
		
		System.out.println(obj.calPoints(ops));
	}

}
