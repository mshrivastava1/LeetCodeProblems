package mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {

	public List<Integer> partitionLabels(String S) {

		List<Integer> result = new ArrayList<Integer>();
		
		if(S==null || S.isEmpty()){
			return result;
		}
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<S.length();i++){
			map.put(S.charAt(i), i);
		}
		
		int last = 0;
		int start = 0;
		
		for(int i=0;i<S.length();i++){
			last = Math.max(map.get(S.charAt(i)), last);
			if(last==i){
				result.add(last-start+1);
				start= last +1 ;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "ababcbacadefegdehijhklij";
		
		PartitionLabels obj = new PartitionLabels();
		
		System.out.println(obj.partitionLabels(S));
	}

}
