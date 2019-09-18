package mix;

public class KthLargestElementInArray {

	public int findKthLargest(int[] nums, int k){
		
		if(nums==null || nums.length==0 || k<0){
			return Integer.MIN_VALUE;
		}
		
		return quickSortToFindKthElement(nums, 0, nums.length-1, k-1);
		
	}
	
	public int quickSortToFindKthElement(int[] nums, int start, int end, int k){
		
		if(start<end){
			int pivot = findPivot(nums, start, end);
			
			if(k==pivot){
				return nums[k];
			}else if(k<pivot){
				return quickSortToFindKthElement(nums, start, pivot, k);
			}else{
				return quickSortToFindKthElement(nums, pivot+1, end, k);
			}
		}
		
		return nums[k];
	}
	
	
	public int findPivot(int[] nums, int start, int end){
		
		int mid = (start+end)/2;
		
		swap(nums,mid, end);
		
		for(int i=start;i<end;i++){
			if(nums[i]>=nums[end]){
				swap(nums,start,i);
				start++;
			}
		}
		
		swap(nums,start,end);
		
		return start;
	}
	
	public void swap(int[] nums, int i , int j){
		
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] nums = {3,2,1,5,6,4};
		int[] nums = {3,2,3,1,2,4,5,5,6};
		int k =4;
		
		KthLargestElementInArray obj = new KthLargestElementInArray();
		
		System.out.println(obj.findKthLargest(nums, k));
	}

}
