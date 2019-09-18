package mockInterviewTelephonic3;

import java.util.ArrayList;
import java.util.List;

public class FindWordsIn2D {

	public List<String> findWords(char[][] board, String[] words) {

		List<String> result = new ArrayList<String>();

		if (words == null || words.length == 0 || board.length == 0) {
			return result;
		}

		for (int i = 0; i < words.length; i++) {
			boolean[][] visited = new boolean[board.length][board[0].length];
			char[] word = words[i].toCharArray();

			for (int k = 0; k < board.length; k++) {
				for (int l = 0; l < board[0].length; l++) {
					if (word[0] == board[k][l]) {
						if (containsWord(board, word, visited, k, l, 0)) {
							
						if(!result.contains(word))
							result.add(word.toString());
						}
					}

				}
			}
		}

		return result;
	}

	private boolean containsWord(char[][] board, char[] word, boolean[][] visited, int row, int column, int index) {

		if(row<0 || row>=board.length || column<0 || column>=board[0].length || visited[row][column] || index>=word.length){
			return false;
		}
		
		visited[row][column] = true;
		
		if(board[row][index]==word[index]){
			if(index==word.length-1){
				return true;
			}else if(containsWord(board, word, visited, row+1, column, index+1) || containsWord(board, word, visited, row-1, column, index+1) || containsWord(board, word, visited, row, column+1, index+1)|| containsWord(board, word, visited, row, column-1, index+1)){
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
