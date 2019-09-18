package amazonRealTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmazonDelivery {

	int result = 0;
	int max = Integer.MAX_VALUE ;
	public int minimumDistance(int numRows, int numColumns, List<List<Integer>> area) {

	

		if (numColumns == 0 || numColumns == 0) {
			return -1;
		}

		boolean[][] visited = new boolean[numRows][numColumns];
		dfsHelper(visited, area, 0, 0, numRows, numColumns);
		
		return max;
	}

	public void dfsHelper(boolean[][] visited, List<List<Integer>> area, int rowIndex, int columnIndex, int numRows,
			int numColumns) {

		if (rowIndex<0 || rowIndex >= numRows || columnIndex<0 || columnIndex >= numColumns
				|| visited[rowIndex][columnIndex] || (area.get(rowIndex).get(columnIndex) <= 0)) {
			
			return;
		}
		
		visited[rowIndex][columnIndex] = true;
		
		if(area.get(rowIndex).get(columnIndex)==9){
			max = Math.min(max, result);
			result--;
			return;
		}
		result = result + 1;
		
		
		
		dfsHelper(visited, area, rowIndex+1, columnIndex, numRows, numColumns);
		dfsHelper(visited, area, rowIndex-1, columnIndex, numRows, numColumns);
		dfsHelper(visited, area, rowIndex, columnIndex+1, numRows, numColumns);
		dfsHelper(visited, area, rowIndex, columnIndex-1, numRows, numColumns);
		
		visited[rowIndex][columnIndex] = false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> area = new ArrayList<List<Integer>>();
		
		List<Integer> temp = new ArrayList<>();
		temp.add(1);
		temp.add(1);
		temp.add(0);
		
		area.add(temp);
		List<Integer> temp1 = new ArrayList<>();
		temp1.add(1);
		temp1.add(1);
		temp1.add(1);
		area.add(temp1);
		List<Integer> temp2 = new ArrayList<>();
		temp2.add(0);
		temp2.add(1);
		temp2.add(9);
		
		area.add(temp2);
		
		AmazonDelivery obj = new AmazonDelivery();
		
		System.out.println(obj.minimumDistance(3, 3, area));
	}

}
