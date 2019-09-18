package cutoftrees;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.List;
import javafx.scene.layout.Priority;

class Tree{
	int height;
	int[] coordinate;
	
	Tree(int height, int x, int y){
		this.height = height;
		this.coordinate = new int[2];
		this.coordinate[0] = x;
		this.coordinate[1] = y;
	}
}
public class CutOfTrees {

	public int cutOffTree(List<List<Integer>> forest){
		
		int steps = 0;
		
		PriorityQueue<Tree> queue = new PriorityQueue<Tree>(new Comparator<Tree>() {
			@Override
			public int compare(Tree o1, Tree o2) {
				return o1.height - o2.height;
			}
			
			
		});
		
		
		for(int i=0;i<forest.size();i++){
			for(int j=0;j<forest.get(i).size();j++){
				queue.add(new Tree(forest.get(i).get(j), i, j));
			}
		}
		
		int[] start = {0,0};
		while(!queue.isEmpty()){
			
			Tree tree = queue.poll();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
