package Programs;

public class CountOfAllOddDigitNumber {
	public static void main(String[] args) {
		
		int n=123456;
		int count=0;
		while(n>0)
		{
			int remain=n%10;
			if(remain%2!=0)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println("Count of all odd digit of gn number "+count);
		
	}
}
