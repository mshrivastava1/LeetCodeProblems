package mix;

import java.util.Queue;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FruitsIntoBasket {

	public int totalFruit(int[] tree) {

		if(tree.length==0){
			return 0;
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		queue.add(0);
		map.put(tree[0], 0);
		int result = 1;
		for(int i=1;i<tree.length;i++){
			
			
			if(map.size()<2 && !map.containsKey(tree[i])){
				queue.add(i);
				map.put(tree[i],i);
			}else if(map.containsKey(tree[i])){
				queue.add(i);
				map.put(tree[i], i);
			}else if(map.size()==2 && !map.containsKey(tree[i])){
				
				int minVal = Integer.MAX_VALUE;

				for(int value : map.values()){
					minVal=Math.min(value, minVal);
				}
				while(!queue.isEmpty()){
					int index = queue.poll();
					if(index==minVal){
						break;
					}
				}
				queue.add(i);
				map.remove(tree[minVal]);
				map.put(tree[i],i);
			}
			int currentLenght = queue.size();
			result = Math.max(currentLenght, result);
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] tree = {0,1,2,2};
		//int[] tree = {1,2,3,2,2};
		//int[] tree = {3,3,3,1,2,1,1,2,3,3,4};
		//int[] tree = {1,0,3,4,3};
		int[] tree = {1,1};
		FruitsIntoBasket obj = new FruitsIntoBasket();
		
		System.out.println(obj.totalFruit(tree));
	}

}
