
public class PrimeNumbersChecking {

	public static void main(String[] args) {
		
		int countOfFactors=primeNumber(-1);
		if(countOfFactors==2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
	public static int primeNumber(int n) {
		int count=0;
		if(n==1) {
			return -1;
		}
		for(int i=1;i*i<n;i++) {
			if(n%i==0) {
				if(i!=n/i) {
					count=count+2;
				}
				else {
					count=count+1;
				}
			}
		}
		return count;
	}
}
