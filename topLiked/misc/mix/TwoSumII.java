package mix;

public class TwoSumII {

	public int[] twoSum(int[] numbers, int target) {

		if(numbers==null || numbers.length==0){
			return new int[0];
		}
		
		int start =0;
		int end = numbers.length-1;
		
		int[] result = new int[2];
		while(start<end){
			
			if(numbers[start]+numbers[end]==target){
				result[0] = start+1;
				result[1] = end+1;
				break;
			}else if(numbers[start]+numbers[end]<target){
				start++;
			}else{
				end--;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
