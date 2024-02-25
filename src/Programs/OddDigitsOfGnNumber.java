package Programs;

public class OddDigitsOfGnNumber {
	public static void main(String[] args) {
		
		int n=1234567;
		while(n>0)
		{
			int remain=n%10;
			if(remain%2!=0)
			{
				System.out.println(remain);
			}
			n=n/10;
		}
		
		//2nd approach
		int n1=12345;
		String s=Integer.toString(n1);
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)%2!=0)
			{
				System.out.println(s.charAt(i));
			}
		}
	}
}
