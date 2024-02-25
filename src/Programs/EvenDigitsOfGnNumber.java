package Programs;

public class EvenDigitsOfGnNumber {

	public static void main(String[] args) {
		
		int n=12345678;
		while(n>0)
		{
			int remain=n%10;
			if(remain%2==0)
			{
				System.out.println(remain);
			}
			n=n/10;
		}
		int n1=123468;
		String s=Integer.toString(n1);
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)%2==0)
			{
				System.out.println(s.charAt(i));
			}
		}

	}

}
