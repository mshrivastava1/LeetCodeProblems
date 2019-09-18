package mockInterviewOnlineTest7;

public class FriendCircle {

	 public int findCircleNum(int[][] M) {
	        
	        if(M.length == 0){
				return -1;
			}
			int[][] visited = new int[M.length][M[0].length];
			
			int circle = 0;
			for(int i=0;i<M.length;i++){
				for(int j=0;j<M[0].length;j++){
					
					if(M[i][j] == 1 && visited[i][j]!=1){
						
						checkNeighbours(M, visited, i,j);
						circle +=1; 
					}
				}
			}
			
			return circle;
	    }
	    
	    	public void checkNeighbours(int[][] M, int[][] visited, int rowIndex, int columnIndex) {
			if (rowIndex < 0 || rowIndex >= M.length || columnIndex < 0 || columnIndex >= M[0].length
					|| visited[rowIndex][columnIndex] == 1 || M[rowIndex][columnIndex] == 0) {
				return;
			}
			
			visited[rowIndex][columnIndex] = 1;
			
			checkNeighbours(M, visited, rowIndex+1, columnIndex);
			checkNeighbours(M, visited, rowIndex-1, columnIndex);
			checkNeighbours(M, visited, rowIndex, columnIndex+1);
			checkNeighbours(M, visited, rowIndex, columnIndex-1);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
