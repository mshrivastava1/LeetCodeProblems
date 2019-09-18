package mockInterviewTelephonic2;

public class ValidMountain {

	public boolean validMountainArray(int[] A) {

		if(A==null || A.length<3){
			return false;
		}
		
		
		int j =1;
		
		int i=0;
		for(;i<A.length-1;i++){
			if(A[i]==A[i+1]){
				return false;
			}else if(A[i]>A[i+1]){
				break;
			}
		}
		
		if(i==0 || (i==A.length-1)){
			return false;
		}
		i=i+1;
		for(;i<A.length-1;i++){
			if(A[i]==A[i+1]){
				return false;
			}else if(A[i]<A[i+1]){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] A = {0,3,2,1};
		int[] A = {3,5,5};
		//int[] A = {9,8,7,6,5,4,3,2,1,0};
		
		ValidMountain mountain = new ValidMountain();
		
		System.out.println(mountain.validMountainArray(A));
	}

}
