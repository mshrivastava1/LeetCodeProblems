package mockOnlineTest3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedSquareArray {

	public int[] sortedSquares(int[] A) {

		if(A==null || A.length==0){
			return A;
		}
		
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<A.length;i++){
			
			result.add(A[i]*A[i]);
		}
		
		int i = 0;
		int[] resultList = new int[result.size()];
		for(int num:result){
			resultList[i]=num;
			i++;
		}
		
		Arrays.sort(resultList);
		
		return resultList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-4,-1,0,3,10};
	}

}
