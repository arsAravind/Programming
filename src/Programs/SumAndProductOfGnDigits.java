package Programs;
public class SumAndProductOfGnDigits {
	public static void main(String[] args) {
		
		int number=1234;
		int sum=0;
		int product=1;
		while(number>0)
		{
			int remainder=number%10;
			//System.out.println(remainder);
			sum=sum+remainder;
			product=product*remainder;
			number=number/10;
		}
		System.out.println("Sum of given digits is "+sum);
		System.out.println("Product of given digits is "+product);
	}

}
