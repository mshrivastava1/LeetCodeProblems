package mix;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.shape.Path;

public class FlowerPlantingWithNoAdjacent {

	public int[] gardenNoAdj(int n, int[][] paths) {
		List<Integer>[] graph = buildGraph(n, paths);
		int[] flowers = new int[n];
		for (int garden = 0; garden < n; garden++) {
			boolean[] used = new boolean[5];
			for (int adj : graph[garden]) {
				used[flowers[adj]] = true;
			}
			flowers[garden] = pickFlower(used);
		}
		return flowers;
	}

	private int pickFlower(boolean[] used) {
		for (int flower = 1; flower <= 4; flower++) {
			if (!used[flower])
				return flower;
		}
		return -1;
	}

	private List<Integer>[] buildGraph(int n, int[][] edges) {
		List<Integer>[] graph = new List[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();
		}
		for (int[] edge : edges) {
			int u = edge[0] - 1;
			int v = edge[1] - 1;
			graph[u].add(v);
			graph[v].add(u);
		}
		return graph;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[][] paths = { { 1, 2 }, { 2, 3 }, { 3, 1 } };

		
		 int[][] paths = {{1,2}, {3,4}};
		 

		//int N = 3;
		 int N = 4;

		FlowerPlantingWithNoAdjacent obj = new FlowerPlantingWithNoAdjacent();

		System.out.println(obj.gardenNoAdj(N, paths));
	}

}
