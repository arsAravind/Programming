package InterviewPrograms;
import java.util.Scanner;

public class PerfectNumber { //sum of divisor = gn number

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int a=1;
		int sum=0;
		while(a<=n/2)
		{
			if(n%a==0)
			{
				sum=sum+a;
			}
			a++;
		}
		if(sum==n)
		{
			System.out.println("Gn number is perfect number");
		}
		else
		{
			System.out.println("Gn number is not perfect number");
		}

	}

}
