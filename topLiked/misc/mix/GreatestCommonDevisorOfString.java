package mix;

public class GreatestCommonDevisorOfString {

	public String gcdOfString(String str1, String str2) {

		if (str1.length() < str2.length()) {
			return gcdOfString(str2, str1);
		}

		if (str2.length() == 0) {
			return str1;
		}

		if (str1.startsWith(str2)) {
			while (str1.startsWith(str2)) {
				str1 = str1.substring(str2.length());
			}
			return gcdOfString(str2, str1);
		} else {
			return "";
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "ABCABC";
		String str2 = "ABC";
		
		GreatestCommonDevisorOfString obj = new GreatestCommonDevisorOfString();
		
		System.out.println(obj.gcdOfString(str1, str2));
	}

}

