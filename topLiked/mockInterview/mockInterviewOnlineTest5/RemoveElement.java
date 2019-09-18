package mockInterviewOnlineTest5;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {

		int result = 0;
		
		if(nums==null || nums.length==0){
			return result;
		}
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]==val || nums[i]%val==0){
				result++;
			}
		}
		
		return nums.length-result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
