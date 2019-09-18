package amazonMockInterviewOnline;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

public class CutOffTree {

	int count = 0;
	public int cutOffTree(List<List<Integer>> forest) {

		if(forest==null || forest.isEmpty()){
			return -1;
		}
		
		int[][] temp = new int[forest.size()][forest.get(0).size()];
		
		for(int i=0;i<forest.size();i++){
			for(int j=0;j<forest.get(0).size();j++){
				temp[i][j] = forest.get(i).get(j);
			}
		}
		
		boolean[][] visited = new boolean[forest.size()][forest.get(0).size()];
		dfsHelper(forest,0,0,visited,0,temp);
		
		for(int i=0;i<forest.size();i++){
			for(int j=0;j<forest.get(0).size();j++){
				if(temp[i][j]>1){
					return -1;
				}
			}
		}
		return count-1;
	}
	
	public void dfsHelper(List<List<Integer>> forest, int row, int column, boolean[][] visited,int steps, int[][] temp){
		
		if(row<0 || row>=forest.size() || column<0 || column >= forest.get(0).size() || visited[row][column] || forest.get(row).get(column)==0){
			return;
		}

		visited[row][column] = true;
		temp[row][column] = 1;
		count++;
		if((row+1<forest.size() && forest.get(row).get(column)<forest.get(row+1).get(column))|| visited[row][column]){
			steps++;
			dfsHelper(forest,row+1,column,visited,steps,temp);
		}
		if((row-1>0 && forest.get(row).get(column)<forest.get(row-1).get(column)) || visited[row][column]){
			steps++;
			dfsHelper(forest,row-1,column,visited,steps,temp);
		}
		if((column+1<forest.get(0).size() && forest.get(row).get(column)<forest.get(row).get(column+1))|| visited[row][column]){
			steps++;
			dfsHelper(forest,row,column+1,visited,steps,temp);
		}
		if((column-1>0 && forest.get(row).get(column)<forest.get(row).get(column-1))|| visited[row][column]){
			steps++;
			dfsHelper(forest,row,column-1,visited,steps,temp);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> forest = new ArrayList<List<Integer>>();
		
		forest.add(new ArrayList<Integer>());
		forest.add(new ArrayList<Integer>());
		forest.add(new ArrayList<Integer>());
		forest.get(0).add(1);
		forest.get(0).add(2);
		forest.get(0).add(3);
		
		forest.get(1).add(0);
		forest.get(1).add(0);
		forest.get(1).add(4);
		
		forest.get(2).add(7);
		forest.get(2).add(5);
		forest.get(2).add(6);
		
		
		CutOffTree obj = new CutOffTree();
		
		System.out.println(obj.cutOffTree(forest));
	}

}
