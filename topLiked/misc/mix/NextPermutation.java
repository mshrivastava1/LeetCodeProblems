package mix;

import java.util.Arrays;

public class NextPermutation {

	public void nextPermutation(int[] nums) {
	      if(nums.length<=1){
	          return;
	      }
	      
	      int i= nums.length-1;
	      
	      for(;i>=1;i--){
	         
	         if(nums[i]>nums[i-1]){ //find first number which is smaller than it's after number
	             break;
	         }
	      }
	      
	      if(i!=0){
	          swap(nums,i-1); //if the number exist,which means that the nums not like{5,4,3,2,1}
	      }
	      
	      reverse(nums,i);    
	    }
	    
	    private void swap(int[] a,int i){
	        for(int j = a.length-1;j>i;j--){
	            if(a[j]>a[i]){
	                int t = a[j];
	                a[j] = a[i];
	                a[i] = t;
	                break;
	            }
	        }
	    }
	    
	    private void reverse(int[] a,int i){//reverse the number after the number we have found
	        int first = i;
	        int last = a.length-1;
	        while(first<last){
	            int t = a[first];
	            a[first] = a[last];
	            a[last] = t;
	            first ++;
	            last --;
	        }
	    }
	    
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int[] nums = { 1, 1, 5 };

		int[] nums = {3,2,1};
		NextPermutation obj = new NextPermutation();

		obj.nextPermutation(nums);
	}

}
