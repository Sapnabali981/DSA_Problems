
public class Count_of_Factors {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		//count of factors
		
		/*
		 * factors : numbers which can divide the actual numbers are called as factors.
		 * in order to reduce the time complexity prefer root N iterations instead of N 
		 * for traversal purpose we use for loop.
		 * minimum factor is 1,maximum factor is number itself.
		 * count the factors in pairs instead of counting them separately.
		 * in perfect square number count of factors will be 1.
		 */
		
		int n=10;
//		if(n==1) {
//			count=1;
//		}
		int count=0;
		for(int i=1;i*i<=n;i++){
			if(n%i==0) {
				if(i!=n/i) {
					count=count+2;
				}
				else {
					count=count+1;
				}
			}
		}
		System.out.println(count);
	}
}
