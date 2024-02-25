package Programs;

public class SPYNumber {
	//sum of gn number=product of gn number
	public static void main(String[] args) {	
		int n=123;
		int sum=0;
		int pro=1;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
			n=n/10;
		}
		if(sum==pro)
		{
			System.out.println("Gn number hg is spy number");
		}
		else
		{
			System.out.println("Gn no is not a spy number");
		}
		
	}
}
