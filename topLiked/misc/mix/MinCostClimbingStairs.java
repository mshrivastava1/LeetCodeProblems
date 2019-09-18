package mix;

public class MinCostClimbingStairs {

	public int minCostClimbingStairs(int[] cost) {

		if(cost==null || cost.length==0){
			return 0;
		}
		
		for(int i=2;i<cost.length;i++){
			cost[i] = cost[i] + Math.min(cost[i-1], cost[i-2]);
		}
		
		return Math.min(cost[cost.length-1], cost[cost.length-2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] cost =  {10,15,20};
		
		//int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		MinCostClimbingStairs obj = new MinCostClimbingStairs();
		
		System.out.println(obj.minCostClimbingStairs(cost));
	}

}
