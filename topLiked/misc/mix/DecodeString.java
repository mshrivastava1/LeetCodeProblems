package mix;

import java.util.Stack;

public class DecodeString {

	public String decodeString(String s) {

		if (s == null || s.isEmpty()) {
			return s;
		}

		String res = "";
		Stack<Integer> countStack = new Stack<>();
		Stack<String> resStack = new Stack<>();
		int idx = 0;
		while (idx < s.length()) {
			if (Character.isDigit(s.charAt(idx))) {
				int count = 0;
				while (Character.isDigit(s.charAt(idx))) {
					count = 10 * count + (s.charAt(idx) - '0');
					idx++;
				}
				countStack.push(count);
			} else if (s.charAt(idx) == '[') {
				resStack.push(res);
				res = "";
				idx++;
			} else if (s.charAt(idx) == ']') {
				StringBuilder temp = new StringBuilder(resStack.pop());
				int repeatTimes = countStack.pop();
				for (int i = 0; i < repeatTimes; i++) {
					temp.append(res);
				}
				res = temp.toString();
				idx++;
			} else {
				res += s.charAt(idx++);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String s = "3[a]2[bc]";

		String s = "2[abc]3[cd]ef";
		DecodeString str = new DecodeString();

		System.out.println(str.decodeString(s));

	}

}
