package assignment;

public class Fibonacci {
	public static void main(String[] args) {
		int f=1;
		int s=1;
		int sum;
		
		System.out.println(f);
		System.out.println(s);
		
		for(int i=3;i<=11;i++)
		{
			sum=f+s;
			System.out.println(sum);
			f=s;
			s=sum;
			
		}
	}

}
