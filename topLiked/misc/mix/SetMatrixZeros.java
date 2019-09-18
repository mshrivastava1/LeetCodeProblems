package mix;

public class SetMatrixZeros {

	public void setZeroes(int[][] matrix) {

		if (matrix == null || matrix.length == 0) {
			return;
		}

		int newVal = Integer.MIN_VALUE;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] != newVal) {
					if (matrix[i][j] == 0) {
						for (int k = 0; k < matrix.length; k++) {
							if (matrix[k][j] != 0) {
								matrix[k][j] = newVal;
							}

						}
						for (int k = 0; k < matrix[i].length; k++) {
							if (matrix[i][k] > 0) {
								matrix[i][k] = newVal;
							}

						}
					}
				}

			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == newVal) {
					matrix[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{0,1,2,0},
				  {3,4,5,2},
				  {1,3,1,5}};
		
		SetMatrixZeros obj = new SetMatrixZeros();
		
		obj.setZeroes(matrix);
	}

}
