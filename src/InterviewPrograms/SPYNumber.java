package InterviewPrograms;

public class SPYNumber {
//	Sum of all digits=Product of all digits
	public static void main(String[] args) {
		int n=123;
		int sum=0;
		int pro=1;
		while(n>0)
		{
			int t=n%10;
			sum=sum+t;
			pro=pro*t;
			n=n/10;
		}
		if(sum==pro)
		{
			System.out.println("Gn number is SPY number");
		}
		else
		{
			System.out.println("Gn no is not a spy number");
		}
	}
}
