package mockInterviewOnlineTest11;

public class ReverseInteger {

	public int reverse(int x){
		
		if(x>=0 && x<10){
			return x;
		}
		
		long res = 0;
		 
		while(x!=0){
			res = res*10 + (x%10);
			x = x/10;
		}
		return (int)res == res ? (int)res : 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1534236469;
		
		ReverseInteger obj = new ReverseInteger();
		
		System.out.println(obj.reverse(num));
		
		
	}

}
