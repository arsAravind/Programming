package Programs;

public class SumOfAllOddDigitOfGnNumber {
	public static void main(String[] args) {
		int n=12345;
		int sum=0;
		while(n>0)
		{
			int remain=n%10;
			if(remain%2!=0)
			{
				sum=sum+remain;
			}
			n=n/10;
		}
		System.out.println("Sum of all odd digit of gn no is "+sum);
	}
}
