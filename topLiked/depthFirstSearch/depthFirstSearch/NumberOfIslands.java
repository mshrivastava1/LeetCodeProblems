package depthFirstSearch;

public class NumberOfIslands {

	public int numIslands(char[][] grid) {
    
		if(grid.length == 0){
			return -1;
		}
		int[][] visited = new int[grid.length][grid[0].length];
		
		int numOfIslands = 0;
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				
				if(grid[i][j] == '1' && visited[i][j]!=1){
					
					checkNeighbours(grid, visited, i,j);
					numOfIslands +=1; 
				}
			}
		}
		
		return numOfIslands;
    }
	public void checkNeighbours(char[][] grid, int[][] visited, int rowIndex, int columnIndex) {
		if (rowIndex < 0 || rowIndex >= grid.length || columnIndex < 0 || columnIndex >= grid[0].length
				|| visited[rowIndex][columnIndex] == 1 || grid[rowIndex][columnIndex] == 0) {
			return;
		}
		
		visited[rowIndex][columnIndex] = 1;
		
		checkNeighbours(grid, visited, rowIndex+1, columnIndex);
		checkNeighbours(grid, visited, rowIndex-1, columnIndex);
		checkNeighbours(grid, visited, rowIndex, columnIndex+1);
		checkNeighbours(grid, visited, rowIndex, columnIndex-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] grid =  new char[][]	{{'1', '1', '1', '1', '0'},
			{'1', '1', '0', '1', '0'},
			{'0', '1', '1', '1', '0'},
			{'1', '1', '0', '0', '0'},
			{'0', '0', '0', '0', '0'}};
			
			NumberOfIslands obj = new NumberOfIslands();
			
			System.out.println(obj.numIslands(grid));
			
	}

}
