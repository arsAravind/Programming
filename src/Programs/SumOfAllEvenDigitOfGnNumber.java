package Programs;

public class SumOfAllEvenDigitOfGnNumber {

	public static void main(String[] args) {
		int n=1234566;
		int sum=0;
		while(n>0)
		{
			int remain=n%10;
			if(remain%2==0)
			{
				sum=sum+remain;
			}
			n=n/10;
		}
		System.out.println("Sum of all gn even number is "+sum);
	}
}
