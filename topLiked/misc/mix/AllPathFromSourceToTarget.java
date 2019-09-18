package mix;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllPathFromSourceToTarget {

	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
					
        path.add(0);
        dfsSearch(graph, 0, res, path);
					
        return res;
    }

    private void dfsSearch(int[][] graph, int node, List<List<Integer>> res, List<Integer> path) {
        if (node == graph.length - 1) {
            res.add(new ArrayList<Integer>(path));
            return;
        }

        for (int nextNode : graph[node]) {
            path.add(nextNode);
            dfsSearch(graph, nextNode, res, path);
            path.remove(path.size() - 1);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] graph = {{1,2}, {3}, {3}, {}};
		
		AllPathFromSourceToTarget obj = new AllPathFromSourceToTarget();
		
		obj.allPathsSourceTarget(graph);
	}

}
