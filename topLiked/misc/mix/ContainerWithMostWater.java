package mix;

public class ContainerWithMostWater {

	public int maxArea(int[] height){
		
		if(height==null || height.length==0){
			return 0;
		}
		
		int maxArea = Integer.MIN_VALUE;
		
		int start = 0;
		int end = height.length-1;
		
		while(start<end){
			
			int width = end - start;
			if(height[start]>height[end]){
				int area = height[end]*width;
				maxArea = Math.max(maxArea, area);
				end--;
			}else{
				int area = height[start]*width;
				maxArea = Math.max(maxArea, area);
				start++;
			}
		}
		
		return maxArea;
	}
	public static void main(String[] args) {
		
		int[] height = {1,8,6,2,5,4,8,3,7};
		ContainerWithMostWater obj = new ContainerWithMostWater();
		
		System.out.println(obj.maxArea(height));
	}

}
