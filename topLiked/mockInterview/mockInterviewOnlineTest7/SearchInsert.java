package mockInterviewOnlineTest7;

public class SearchInsert {

	public int searchInsert(int[] nums, int target) {

		if(nums==null || nums.length==0){
			return -1;
		}
		
		if(target == 0){
			return 0;
		}
		
		for(int i=0;i<nums.length;i++){
			if(target==nums[i]){
				return i;
			}else if(i>0 && (target>nums[i-1] && target<nums[i])){
				return i-1;
			}
		}
		
		return nums.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
