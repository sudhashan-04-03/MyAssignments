package assignment;

public class IsPrime {

	public static void main(String[] args) {
		int n=14;
		
		boolean prime =true;
		
		for(int i=2; i<n; i=i+1)
		{
			if(n%i==0)
			{
				prime=false;
				
				break;
				
			}
		}
		System.out.println("n "+ "is not a prime number");
		//System.out.println(prime);
	}
}
