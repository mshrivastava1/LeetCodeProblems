package mockInterviewOnlineTest1;

public class BuySellStock {

	
	public int maxProfit(int[] prices){
		
		if(prices==null || prices.length==0){
			return 0;
		}
		
		int soFarMin = prices[0];
		int maxProfit = 0;
		
		
		for(int i=1;i<prices.length;i++){
			if(soFarMin<prices[i]){
				maxProfit = Math.max(maxProfit, prices[i]-soFarMin);
			}else{
				soFarMin = prices[i];
			}
		}
		return maxProfit;
	}
	public static void main(String[] arg){
		
		int[] prices = {7,1,5,3,6,4};
		
		BuySellStock obj = new BuySellStock();
		
		System.out.println(obj.maxProfit(prices));
	}
}
