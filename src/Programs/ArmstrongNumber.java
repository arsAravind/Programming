package Programs;

public class ArmstrongNumber {
	public static void main(String[] args) {
		//Sum of the cube of each digit=Gn number
		
		int n=153;//15,1
		int sum=0;//27,152,153
		int copy=n;
		while(n>0)
		{
			int t=n%10; //3,5,1
			int c=t*t*t;
			sum=sum+c;//27+125+1
			n=n/10;
		}
		if(sum==n)
		{
		System.out.println("gn is Armstrong no");
		}
		else
		{
			System.out.println("Gn no is not a armstrong number");
		}
	}
}
