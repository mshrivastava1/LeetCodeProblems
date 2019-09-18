package mix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalListIntersection {

	public int[][] intervalIntersection(int[][] A, int[][] B) {

		if((A==null && B==null)||(A.length==0 && B.length==0)){
			return A;
		}
		
		if(A.length==0){
			return A;
		}
		if(B.length==0){
			return B;
		}
		
		int i=0;
		int j=0;
		
		List<int[]> result = new ArrayList<int[]>();
		while(i<A.length && j<B.length){
			int[] a = A[i];
			int[] b = B[j];
			
			int startMax = Math.max(a[0], b[0]);
			int endMin = Math.min(a[1], b[1]);
			
			if(endMin>=startMax){
				result.add(new int[]{startMax,endMin});
			}
			
			if(a[1]==endMin){
				i++;
			}
			if(b[1]==endMin){
				j++;
			}
		}
		
		int[][] output = new int[result.size()][2];
		
		int k=0;
		for(int[] arr:result){
			output[k] = arr; 
			System.out.print("{"+arr[0]+","+arr[1]+"}"+" ");
			k++;
		}
		
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = {{0,2},{5,10},{13,23},{24,25}};
		int[][] B = {{1,5},{8,12},{15,24},{25,26}};
		
		IntervalListIntersection obj = new IntervalListIntersection();
		
		System.out.println(obj.intervalIntersection(A, B));
	}

}
