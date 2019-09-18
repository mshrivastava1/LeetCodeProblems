package mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.beans.editors.IntegerEditor;

public class MinimumAreaRactangle {

	/*The idea is to find the tow diagonal of a ractangle and then calculate the area*/
	
	public int minAreaRect(int[][] points) {

		if(points==null){
			return 0;
		}
		
		
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		
		int minArea = Integer.MAX_VALUE;
		for(int[] point:points){
			
			if(!map.containsKey(point[0])){
				map.put(point[0], (new ArrayList<Integer>()));
			}
			map.get(point[0]).add(point[1]);
		}
		
		for(int[] point1:points){
			for(int[] point2:points){
				
				//check two points of diagonal
				if(point1[0]==point2[0]||point1[1]==point2[1]){
					continue;
				}
				//find the parallel points
				if(map.get(point1[0]).contains(point2[1]) && map.get(point2[0]).contains(point1[1])){
					minArea = Math.min(minArea, Math.abs((point1[0]-point2[0])*(point1[1]-point2[1])));
				}
			}
		}
		
		return minArea==Integer.MAX_VALUE?0:minArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] points = {{1,1},{1,3},{3,1},{3,3},{2,2}};
		
		MinimumAreaRactangle minArea = new MinimumAreaRactangle();
		
		System.out.println(minArea.minAreaRect(points));
	}

}
