package InterviewPrograms;
import java.util.Scanner;
public class PalindromeNo {//if we reverse the number also we get same number

	public static void main(String[] args) {
		
		int n=1221;
		int copy=n;
		int rev=0;
		
		while(n>0)
		{
			int t=n%10;
			rev=rev*10+t;
			n=n/10;
		}
		
		if(copy==rev)
		{
			System.out.println("Gn no is palindrome");
		}
		else
		{
			System.out.println("Gn no is not a paindrome");
		}
		
	}

}
