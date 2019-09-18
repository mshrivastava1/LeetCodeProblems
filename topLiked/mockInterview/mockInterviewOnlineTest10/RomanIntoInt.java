package mockInterviewOnlineTest10;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomanIntoInt {

	public int romanToInt(String s) {

		if(s==null || s.isEmpty()){
			return 0;
		}
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<s.length();i++){
			
			char c = s.charAt(i);
			
			if(i>0){
				char prev = s.charAt(i-1);
				if((c=='V'||c=='X') && prev=='I'){
					if(!stack.isEmpty()){
						stack.push(map.get(c)-stack.pop());
					}
				}else if((c=='L'||c=='C') && prev=='X'){
					if(!stack.isEmpty()){
						stack.push(map.get(c)-stack.pop());
					}
				}else if((c=='D'||c=='M') && prev=='C'){
					if(!stack.isEmpty()){
						stack.push(map.get(c)-stack.pop());
					}
				}else{
					stack.push(map.get(c));
				}
			}else{
				stack.push(map.get(c));
			}
		}
		
		int sum = 0;
		
		while(!stack.isEmpty()){
			sum=sum+stack.pop();
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "MCMXCIV";
		
		RomanIntoInt obj = new RomanIntoInt();
		
		System.out.println(obj.romanToInt(s));
	}

}
