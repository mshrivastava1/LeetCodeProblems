package googleMockInterviewOnline;

import java.util.Stack;

public class FilePath {

	 public int lengthLongestPath(String input){
		 
		 if(input==null || input.isEmpty()){
			 return 0;
		 }
		 
		 if(!input.contains(".")){
			 return 0;
		 }
		 
		 String[] strArray = input.split("\n");
		 
		 Stack<Integer> stack = new Stack<Integer>();
		 
		 stack.push(0);
		 
		 int maxLength =0;
		 for(String str : strArray){
			 
			 int level = str.lastIndexOf("\t")+1;
			 
			 if(level+1<stack.size()){
				 stack.pop();
			 }
			 
			 int currentLength = stack.peek() + str.length() - level +1;
			 stack.push(currentLength);
			 
			 if(str.contains(".")){
				 maxLength = Math.max(maxLength, currentLength-1);
			 }
		 }
		 
		 return maxLength;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "dir\\n\\tsubdir1\\n\\t\\tfile1.ext\\n\\t\\tsubsubdir1\\n\\tsubdir2\\n\\t\\tsubsubdir2\\n\\t\\t\\tfile2.ext";
	}

}
