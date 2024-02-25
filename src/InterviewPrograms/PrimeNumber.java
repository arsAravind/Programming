package InterviewPrograms;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int a=1;
		int count=0;
		while(a<=n/2)
		{
			if(n%a==0)
			{
				count++;
			}
			a++;
		}
	if(count==1)
	{
		System.out.println("Gn number is Prime number");
	}
	
	else
	{
		System.out.println("Gn number is not Prime number");
	}
	}

}
