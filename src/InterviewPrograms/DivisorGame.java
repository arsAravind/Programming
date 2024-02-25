package InterviewPrograms;
import java.util.Scanner;

public class DivisorGame {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int a=1;
		
		while(a<=n)
		{
			if(n%a==0)
			{	
				System.out.println("Divisor for number is\t"+a);
			
			}
			a++;
		}

	}

}
