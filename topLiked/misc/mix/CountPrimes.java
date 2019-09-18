package mix;

public class CountPrimes {

	public int countPrimes(int n) {

		boolean[] notPrime = new boolean[n];

		for(int i=2;i<n;i++){
			if(!notPrime[i]){
				for(int j=2;j*i<n;j++){
					notPrime[i*j] = true;
				}
			}
		}

		int count = 0;
		
		for(int i=2;i<n;i++){
			if(!notPrime[i]){
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		
		CountPrimes count = new CountPrimes();
		
		System.out.println(count.countPrimes(n));
	}

}
