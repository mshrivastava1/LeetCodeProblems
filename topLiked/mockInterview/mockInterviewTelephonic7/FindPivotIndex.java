package mockInterviewTelephonic7;

public class FindPivotIndex {

	public int pivotIndex(int[] nums) {

		if(nums==null || nums.length==0 ){
			return -1;
		}
		
		int[] leftArray = new int[nums.length];
		int[] rightArray = new int[nums.length];
		leftArray[0] = nums[0];
		for(int i=1;i<nums.length;i++){
			leftArray[i]= leftArray[i-1]+nums[i];
		}
		rightArray[nums.length-1] = nums[nums.length-1];
		for(int i=nums.length-2;i>=0;i--){
			rightArray[i] = rightArray[i+1] + nums[i];
		}
		
		if(leftArray[0]==rightArray[1]){
			return 0;
		}
		
		if(rightArray[nums.length-1]==leftArray[nums.length-2]){
			return nums.length-1;
		}
		for(int i=1;i<nums.length-1;i++){
			if(leftArray[i-1]==rightArray[i+1]){
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1, 7, 3, 6, 5, 6};
		
		FindPivotIndex obj = new FindPivotIndex();
		System.out.println(obj.pivotIndex(nums));
	}

}
