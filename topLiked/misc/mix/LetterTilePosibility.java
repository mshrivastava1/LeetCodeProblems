package mix;

import java.util.HashSet;
import java.util.Set;

public class LetterTilePosibility {

	public int numTilePossibilities(String tiles) {

		if(tiles==null || tiles.isEmpty()){
			return 0;
		}
		
		Set<String> set = new HashSet<String>();
		boolean[] visited = new boolean[tiles.length()];
		dfsHelper(tiles, new StringBuilder(), set, 0,visited);
		return set.size();
	}

	private void dfsHelper(String tiles, StringBuilder sb, Set<String> set, int startIndex,boolean[] visited) {
		
		
		if(sb.length()>0){
			set.add(sb.toString());
		}
		
		if(sb.length()==tiles.length()){
			return;
		}
		
		for(int i=0;i<tiles.length();i++){
			if(visited[i]){
				continue;
			}
			visited[i] = true;
			dfsHelper(tiles, sb.append(tiles.charAt(i)), set, i, visited);
			sb.setLength(sb.length()-1);
			visited[i] = false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tiles = "AAB";
		
		LetterTilePosibility obj = new LetterTilePosibility();
		
		System.out.println(obj.numTilePossibilities(tiles));
	}

}
