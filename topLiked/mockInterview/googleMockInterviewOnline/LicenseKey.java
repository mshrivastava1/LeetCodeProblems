package googleMockInterviewOnline;

public class LicenseKey {

	public String licenseKeyFormatting(String S, int K) {

		if(S==null || S.isEmpty() || K<=0){
			return S;
		}
		
		StringBuilder sb = new StringBuilder();
		
		char[] chars = S.toCharArray();


		for(int i=chars.length-1;i>=0;i--){
			if(Character.isLetterOrDigit(chars[i])){
				sb.append(chars[i]);
			}
		}
		
		if(sb.toString().isEmpty()){
			return "";
		}
		if(sb.length()<K){
			return S;
		}
		int num = sb.length()/K;
		
		StringBuilder newSb = new StringBuilder();
		int start = 0;
		for(int i=0;i<num;i++){
			for(int j=0;j<K;j++){
				newSb.append(sb.charAt(start));
				start++;
			}
			newSb.append('-');
		}
		
		if(start<sb.length()){
			newSb.append(sb.toString().substring(start));
			return newSb.reverse().toString().toUpperCase();
		}else {
			String result = newSb.reverse().toString();
			return result.substring(1).toUpperCase();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		String S = "2-5g-3-j";
		
		int K =2;
		
		LicenseKey key = new LicenseKey();
		
		System.out.println(key.licenseKeyFormatting(S, K));

	}

}
