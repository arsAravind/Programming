package InterviewPrograms;
import java.util.Scanner;

public class PrimeNumberInMethods {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			m1(i);
		}
		

	}
	public static void m1(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("prime number is\t"+n);
		}
	}
	
}
