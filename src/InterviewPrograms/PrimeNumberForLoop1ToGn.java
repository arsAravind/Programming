package InterviewPrograms;
import java.util.Scanner;

public class PrimeNumberForLoop1ToGn {

	public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			System.out.println("enter the number");
			int n=scn.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				int count=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println(i+"prime number");
				}
			}
			
	}

}
