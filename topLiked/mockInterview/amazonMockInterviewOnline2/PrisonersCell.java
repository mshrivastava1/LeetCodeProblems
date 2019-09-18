package amazonMockInterviewOnline2;

public class PrisonersCell {

	public int[] prisonAfterNDays(int[] cells, int N) {

		if(cells==null || cells.length==0 || N<=0){
			return cells;
		}
		
		//int[] temp = new int[cells.length];
		
		for(int i=0;i<N;i++){
			int[] temp = new int[cells.length];
			for(int j=1;j<cells.length-1;j++){
				
				if((cells[j-1]==1 && cells[j+1]==1) || (cells[j-1]==0 && cells[j+1]==0)){
					temp[j] = 1;
				}else{
					temp[j] = 0;
				}
			}
			
			/*for(int k=0;k<cells.length;k++){
				cells[k] = temp[k];
			}*/
		}
		
		for(int i=0;i<cells.length;i++){
			System.out.print(cells[i]+" ");
		}
		return cells;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] cells = {0,1,0,1,1,0,0,1};
		int N =7;
		PrisonersCell obj = new PrisonersCell();
		
		System.out.println(obj.prisonAfterNDays(cells, N));
	}

}
