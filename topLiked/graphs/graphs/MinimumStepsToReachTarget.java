package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumStepsToReachTarget {

	class Cell{
		
		int x;
		int y;
		int d;
		
		Cell(int x, int y){
			this.x = x;
			this.y = y;
			this.d = 0;
		}
	}
	
	public int minimumStepsToReachTarget(int[] position, int target[],int n){
		
		boolean[][] visited = new boolean[n][n];
		
		Queue<Cell> queue = new LinkedList<Cell>();
		
		Cell start = new Cell(position[0], position[1]);
		
		int[] xAxix = {-2,-2,-1,-1, 1,1,2, 2};
		int[] yAxis = {-1, 1,-2, 2,-2,2,1,-1};
		
		visited[start.x][start.y] = true;
		queue.add(start);
		while(!queue.isEmpty()){
			
			Cell temp = queue.poll();
			
			if(temp.x==target[0] && temp.y==target[1]){
				return temp.d;
			}
			for(int i=0;i<xAxix.length;i++){
				
				int newX = temp.x + xAxix[i];
				int newY = temp.y + yAxis[i];
				
				if(newX<0 || newX>n-1 || newY<0 || newY>n-1 || visited[newX][newY]){
					continue;
				}
				
				Cell newCell = new Cell(newX,newY);
				visited[newX][newY] = true;
				newCell.d = temp.d +1;
				queue.add(newCell);
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] position = {0,0};
		int[] target = {29,29};
		int n = 30;
		
		MinimumStepsToReachTarget obj = new MinimumStepsToReachTarget();
		
		System.out.println(obj.minimumStepsToReachTarget(position, target, n));
	}

}
