package mockInterviewTelephonic3;

public class ReverseStrings {

	public String reverseWords(String s) {

		if(s==null || s.isEmpty()){
			return s;
		}
		
		String[] arr = s.split("\\s+");
		
		StringBuilder strBuilder = new StringBuilder();
		
		for(int i=0;i<arr.length;i++){
			String str = arr[i];
			strBuilder.append(reverse(str.toCharArray()));
			strBuilder.append(" ");
		}
		
		String result = strBuilder.toString();
		return result.substring(0,result.length()-1);
	}
	
	public String reverse(char[] chars){
		
		int i =0;
		int j = chars.length -1;
		
		while(i<j){
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
			i++;
			j--;
		}
		
		return String.valueOf(chars);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Let's take LeetCode contest";
		
		ReverseStrings reverseSentence = new ReverseStrings();
		
		System.out.println(reverseSentence.reverseWords(s));
	}

}
