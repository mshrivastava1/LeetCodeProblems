package mockInterviewOnlineTest6;

public class UpdateMatrix {

	public int[][] updateMatrix(int[][] matrix) {

		if(matrix==null || matrix.length==0){
			return matrix;
		}
		
		int[][] result = new int[matrix.length][matrix[0].length];
		
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j]!=0){
					dfsHelper(matrix,result,i,j,0);
				}
			}
		}
		
		return result;
	}
	
	public void dfsHelper(int[][] matrix, int[][] result, int row, int column,int distance){
		
		if(row<0 || row>=matrix.length || column<0 || column>=matrix[0].length){
			return;
		}
		
		if(matrix[row][column]==0){
			result[row][column] = distance;
			return;
		}
		dfsHelper(matrix, result, row+1, column, distance+1);
		dfsHelper(matrix, result, row-1, column, distance+1);
	
		dfsHelper(matrix, result, row, column+1, distance+1);

		dfsHelper(matrix, result, row, column-1, distance+1);
		
		
	
	}
	
	
	public static void main(String[] arg){
		
		int[][] matrix = {{0,0,0},
		                  {0,1,0},
		                  {1,1,1}};
		
		UpdateMatrix obj = new UpdateMatrix();
		
		System.out.println(obj.updateMatrix(matrix));
	}
}
