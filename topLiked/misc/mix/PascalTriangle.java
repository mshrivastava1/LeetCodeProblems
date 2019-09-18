package mix;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public List<Integer> getRow(int rowIndex) {

		List<Integer> result = new ArrayList<Integer>();
		
		
		for(int i=0;i<=rowIndex;i++){
			
			result.add(0,1);
			int size = result.size();
			for(int j=1;j<size-1;j++){
				result.set(j, result.get(j) + result.get(j+1));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		
		PascalTriangle obj = new PascalTriangle();
		
		System.out.println(obj.getRow(4));
	}

}
