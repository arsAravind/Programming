package Programs;

public class CountOfAllEvenDigitNumber {

	public static void main(String[] args) {
		//1.we have to extract each number and give condition
		//2.Then reduce it
		int n=123456;
		int count=0;
		while(n>0)
		{
			int re=n%10;
			if(re%2==0)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println("Count of all even digit of gn number "+count);

	}

}
