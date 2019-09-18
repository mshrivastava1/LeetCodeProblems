package graphs;

import java.util.Arrays;

public class DijkshtraAlgorithm {

	
	public int[] dijkshra(int[][] graph){
		
		int v = graph.length;
		int[] distance = new int[v];
		
		if(graph.length==0){
			return distance;
		}
		
		Arrays.fill(distance, Integer.MAX_VALUE);
		boolean[] visited = new boolean[v];
		
		distance[0] = 0;
		for(int i=0;i<v;i++){
			
			int u = findMinimumDistanceNode(distance, visited);
			
			visited[u] = true;
			
			
			for(int j=0;j<v;j++){
				
				if(!visited[j] && graph[u][j]!=0 && distance[u]!=Integer.MAX_VALUE && distance[j]>distance[u]+graph[u][j]){
					distance[j] = distance[u]+graph[u][j];
				}
			}
		}
		
		
		for(int i:distance){
			System.out.print(i+" ");
		}
		return distance;
	}
	private int findMinimumDistanceNode(int[] distance, boolean[] visited) {
		
		int minDistance = Integer.MAX_VALUE;
		int index = -1;
		
		for(int i=0;i<distance.length;i++){
			
			if(!visited[i] && minDistance>distance[i]){
				minDistance = distance[i];
				index = i;
			}
		}
		
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
           };
           
           
           DijkshtraAlgorithm obj = new DijkshtraAlgorithm();
           
           System.out.println(obj.dijkshra(graph));
	}

}
