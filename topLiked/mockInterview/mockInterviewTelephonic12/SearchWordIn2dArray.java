package mockInterviewTelephonic12;

public class SearchWordIn2dArray {

	public boolean exist(char[][] board, String word) {

		if(board==null || board.length==0){
			return false;
		}
		
		if(word==null || word.isEmpty()){
			return false;
		}
		
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				
				if(board[i][j]==word.charAt(0)){
					if(dfsHelplerMethod(board,0,i,j,word)){
						return true;
					}
				}
			}
		}
		
		return false;
	}

	private boolean dfsHelplerMethod(char[][] board, int index, int i, int j, String word) {

		if(i<0||i>=board.length || j<0 || j>=board[0].length || board[i][j]=='#'){
			return false;
		}
		
		if(board[i][j]==word.charAt(index)){
			char temp = word.charAt(index);
			board[i][j] = '#';
			if(index==word.length()-1){
				return true;
			}else if(dfsHelplerMethod(board, index+1, i+1, j, word) || dfsHelplerMethod(board, index+1, i-1, j, word) || dfsHelplerMethod(board, index+1, i, j+1, word) ||dfsHelplerMethod(board, index+1, i, j-1, word)  ){
				return true;
			}
			
			board[i][j] = temp;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
