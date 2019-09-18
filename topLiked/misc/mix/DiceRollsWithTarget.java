package mix;

public class DiceRollsWithTarget {

	public int numRollsToTarget(int d, int f, int target) {
		
		Integer[][] memo = new Integer[d+1][target+1];
		
		return dfHelper(d,f,target,memo);
		
	}

	private int dfHelper(int d, int f, int target, Integer[][] memo) {
		
		if(d==0 || target<=0){
			if(d==target){
				return 1;
			}else{
				return 0;
			}
		}
		
		if(memo[d][target]!=null){
			return memo[d][f];
		}
		
		memo[d][target] = 0;
		for(int i=1;i<=f;i++){
			
			memo[d][target] =(memo[d][target] + dfHelper(d-1,f,target-i,memo))% 1000000007; 
		}
		
		return memo[d][target];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d = 2;
		int f = 6;
		int target = 7;
		
		DiceRollsWithTarget obj = new DiceRollsWithTarget();
		
		System.out.println(obj.numRollsToTarget(d, f, target));
	}

}
