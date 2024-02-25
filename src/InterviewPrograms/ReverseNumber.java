package InterviewPrograms;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int rev=0;
		while(n>0)
		{
			int t=n%10;
			rev=rev*10+t;
			n=n/10;
		}
		System.out.println("gn number  is reversed\t"+rev);

	}

}
