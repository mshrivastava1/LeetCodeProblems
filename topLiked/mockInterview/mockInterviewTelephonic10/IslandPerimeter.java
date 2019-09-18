package mockInterviewTelephonic10;

public class IslandPerimeter {

	public int islandPerimeter(int[][] grid) {

		if(grid.length==0){
			return 0;
		}
		
		int perimeter = 0;
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				
				if(grid[i][j]==1){
					perimeter += getPerimeter(grid,i,j);
				}
			}
		}
		
		return perimeter;
	}

	private int getPerimeter(int[][] grid, int i, int j) {
		
		int perimeter = 4;
		
		if(i+1<grid.length && grid[i+1][j] == 1){
			perimeter--;
		}
		if(i-1>=0 && grid[i-1][j] == 1){
			perimeter--;
		}
		
		if(j-1>=0 && grid[i][j-1] == 1){
			perimeter--;
		}
		
		if(j+1<grid[0].length && grid[i][j+1] == 1){
			perimeter--;
		}
		
		return perimeter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
