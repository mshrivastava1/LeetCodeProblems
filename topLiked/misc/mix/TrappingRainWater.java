package mix;

public class TrappingRainWater {

	public int trap(int[] height) {
		
		if(height==null || height.length<3){
			return 0;
		}
		
		int[] leftHeight = new int[height.length];
		int[] rightHeight = new int[height.length];
		
		leftHeight[0] = height[0];
		for(int i=1;i<height.length;i++){
			leftHeight[i] = Math.max(leftHeight[i-1], height[i]);
		}
		
		rightHeight[height.length-1] = height[height.length-1];
		
		for(int i=height.length-2;i>=0;i--){
			rightHeight[i] = Math.max(rightHeight[i+1], height[i]);
		}
		
		int maxWater = 0;
		for(int i=0;i<height.length;i++){
			
			maxWater+= Math.min(leftHeight[i], rightHeight[i]) - height[i];
		}
		
		return maxWater;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		TrappingRainWater water = new TrappingRainWater();
		
		System.out.println(water.trap(height));
	}

}
