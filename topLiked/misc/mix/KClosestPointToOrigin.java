package mix;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {

	public int[][] kClosest(int[][] points, int K) {

		if(points==null || points.length==0 || points.length<K){
			
			return (new int[0][0]);
		}
		
		int[][] result = new int[K][2];
		
		PriorityQueue<int[]> pQueue = new PriorityQueue<int[]>(new Comparator<int[]>() {
			

			@Override
			public int compare(int[] p1, int[] p2) {
				double d1 = Math.sqrt((p1[0]*p1[0])+(p1[1]*p1[1]));
				double d2 = Math.sqrt((p2[0]*p2[0])+(p2[1]*p2[1]));
				
				return Double.compare(d1, d2);
			}
		});
		for(int[] arr : points){
			pQueue.offer(arr);
		}
		
		for(int i=0;i<K;i++){
			result[i] = pQueue.poll();
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
