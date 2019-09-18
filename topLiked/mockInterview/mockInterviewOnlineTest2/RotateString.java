package mockInterviewOnlineTest2;

public class RotateString {

	public boolean rotateString(String A, String B) {

		if(A==null && B==null){
			return true;
		}
		
		if(A.isEmpty() && B.isEmpty()){
			return true;
		}
		
		if(A==null || B==null){
			return false;
		}
		
		if(A.isEmpty() || B.isEmpty()){
			return false;
		}
		
		if(A.length()!=B.length()){
			return false;
		}
		
		for(int k=0;k<A.length();k++){
			if(!A.equals(B)){
				
				char[] chars = A.toCharArray();
				
				char temp = chars[0];
				
				for(int i=0;i<chars.length-1;i++){
					chars[i]=chars[i+1];
				}
				chars[chars.length-1] = temp;
				
				A=String.valueOf(chars);
			}else{
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "abcde";
		String B = "cdeab";
		
		RotateString obj = new RotateString();
		
		System.out.println(obj.rotateString(A, B));
	}

}
