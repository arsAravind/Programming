package Programs;

public class ProductOfAllOddDigitOfGnNumber {
	public static void main(String[] args) {
		
		int n=123456;
		int pro=1;
		while(n>0)
		{
			int remain=n%10;
			if(remain%2!=0)
			{
				pro=pro*remain;
			}
			n=n/10;
		}
		System.out.println("Product of all the odd didgit of gn number "+pro);	
	}
}
