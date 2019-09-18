package mix;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LongestAbsoluteFilePath {

	public int lengthLongestPath(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}

		if (!input.contains(".")) {
			return 0;
		}

		Stack<Integer> stack = new Stack<Integer>();

		String[] strArray = input.split("\n");
		int maxLenght = 0;

		stack.push(0);
		for (String s : strArray) {

			System.out.println(s);
			int level = s.lastIndexOf("\t") + 1;
			System.out.println(level);
			while (level + 1 < stack.size()) {
				stack.pop();
			}
			int length = stack.peek() + s.length() - level + 1;
			stack.push(length);
			if (s.contains(".")) {
				maxLenght = Math.max(maxLenght, length - 1);
			}
		}

		return maxLenght;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";

		System.out.println("\t\tsubdir1".length());
		LongestAbsoluteFilePath obj = new LongestAbsoluteFilePath();
		System.out.println(obj.lengthLongestPath(input));
	}

}
