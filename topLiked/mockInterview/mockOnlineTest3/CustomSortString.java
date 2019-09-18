package mockOnlineTest3;

import java.util.HashSet;
import java.util.Set;

public class CustomSortString {

	public String customSortString(String S, String T) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()){
            for (int i = 0; i < T.length(); i++){
                if (T.charAt(i) == c){
                    sb.append(c);
                }
            }
            set.add(c);
        }
        for (char c : T.toCharArray()){
            if (!set.contains(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "cba";
		String T = "abcd";
		
		CustomSortString obj = new CustomSortString();
		
		System.out.println(obj.customSortString(S, T));
	}

}
