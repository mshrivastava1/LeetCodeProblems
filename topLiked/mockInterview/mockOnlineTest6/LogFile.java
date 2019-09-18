package mockOnlineTest6;

import java.util.Arrays;
import java.util.Comparator;


import dynamicProgramming.RegularExpressionMatching;

public class LogFile {

	public String[] reorderLogFiles(String[] logs) {

		Comparator<String> myComp = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String[] split1 = s1.split(" ", 2);
				String[] split2 = s2.split(" ", 2);
				boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
				boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
				if (!isDigit1 && !isDigit2) {
					int comp = split1[1].compareTo(split2[1]);
					if (comp != 0)
						return comp;
					return split1[0].compareTo(split2[0]);
				}
				return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
			}
		};
		Arrays.sort(logs, myComp);
		return logs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] logs = { "a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo" };

		LogFile obj = new LogFile();

		String[] result = obj.reorderLogFiles(logs);

		for (String s : result) {
			System.out.println(s);
		}

	}

}
