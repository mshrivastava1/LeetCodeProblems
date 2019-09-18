package mockInterviewOnlineTest8;

public class OverLappingRactangle {

	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

		if(rec1.length==0 && rec2.length==0){
			return false;
		}
		
		if(rec1.length<4 || rec2.length<4){
			return false;
		}
		
		if(rec2[0]>rec1[2] || rec1[0]>rec2[2]){
			return true;
		}
		
		if(rec2[1]<rec1[3] || rec1[1]<rec2[3]){
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] rec1 = {0,0,1,1 };
		int[] rec2 = {1,1,3,3};
		//int[] rec2 = {1,0,2,1};
		OverLappingRactangle obj = new OverLappingRactangle();
		
		System.out.println(obj.isRectangleOverlap(rec1, rec2));
	}

}
