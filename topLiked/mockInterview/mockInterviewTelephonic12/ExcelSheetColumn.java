package mockInterviewTelephonic12;

public class ExcelSheetColumn {

	public int titleToNumber(String s) {

		if(s==null || s.isEmpty()){
			return 0;
		}
		
		int result = 0;
		
		s = s.toLowerCase();
		char[] c = s.toCharArray();
		
		if(c.length==1){
			return (c[0]-'a')+1;
		}
		
		for(int i=0;i<s.length();i++){
			result = result*26 + ((c[i]-'a')+1);
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
