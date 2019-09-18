package mix;

public class SearchIn2DMatrix {

public boolean searchMatrix(int[][] matrix, int target){
		
		if(matrix==null || matrix.length==0){
			return false;
		}
		
		return dfs(matrix,0,matrix[0].length-1,target);
	}

	private boolean dfs(int[][] matrix, int row, int column, int target) {
		
		if(row>=matrix.length || column<0){
			return false;
		}
		
		boolean result1 = false;
		boolean result2 = false;
		if(matrix[row][column]==target){
			return true;
		}else{
			if(matrix[row][column]<target){
				result1 = dfs(matrix, row+1,column,target);
			}else{
				result2 = dfs(matrix, row,column-1,target);
			}
		}
		return result1||result2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };

		// int[][] matrix = {{-5}};

		int target = 5;

		SearchIn2DMatrix obj = new SearchIn2DMatrix();

		System.out.println(obj.searchMatrix(matrix, target));
	}

}
