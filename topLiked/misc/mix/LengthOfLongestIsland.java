package mix;

public class LengthOfLongestIsland {
	int maxLength = 0;
	public int findLenght(int[][] matrix){
		
		if(matrix==null || matrix.length==0){
			return 0;
		}
		
		boolean[][] dp = new boolean[matrix.length][matrix[0].length];
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				int count = 0;
				if(matrix[i][j]==1 && !dp[i][j]){
					dfsHelper(matrix,dp,i,j,count);
					
				}
			}
		}
		
		return maxLength;
	}
	
	
	public void dfsHelper(int[][] matrix, boolean[][] dp, int row, int column,int count){
		
		/*if(row<0 || row>=matrix.length || column<0 || column>=matrix.length){
			return;
		}
		*/
		
		dp[row][column] = true;
		count++;
		
		maxLength = Math.max(count, maxLength);
	
		if(row-1>=0 && matrix[row-1][column]==1 && !dp[row-1][column]){
			dfsHelper(matrix, dp, row-1, column, count);
		}
		
		if(row+1<matrix.length && matrix[row+1][column]==1 && !dp[row+1][column]){
			dfsHelper(matrix, dp, row+1, column, count);
		}
		if(column-1>=0 && matrix[row][column-1]==1 && !dp[row][column-1]){
			dfsHelper(matrix, dp, row, column-1, count);
		}
		
		if(column+1<matrix[0].length && matrix[row][column+1]==1 && !dp[row][column+1]){
			dfsHelper(matrix, dp, row, column+1, count);
		}
		
		return;
	}
	
	
	public static void main(String[] arg){
		
		int[][] matrix = {  {0, 0, 1, 1, 0},
                			{1, 0, 1, 1, 0},
                			{0, 1, 0, 0, 0},
                			{0, 0, 0, 0, 1}};
		
		
	LengthOfLongestIsland obj = new LengthOfLongestIsland();
	
	System.out.println(obj.findLenght(matrix));
	}
	
}
