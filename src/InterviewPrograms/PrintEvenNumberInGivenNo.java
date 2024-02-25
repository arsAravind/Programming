package InterviewPrograms;

public class PrintEvenNumberInGivenNo {
	public static void main(String[] args) {
		//Sum of Even number
		int n=123456;
		int sum=0;
		while(n>0)
		{
			int t=n%10;
			
			if(t%2==0)
			{
				sum=sum+t;
			}
			n=n/10;
		}
		System.out.print(sum);
	
//		int n=12345;
//		String s=Integer.toString(n);
//		for (int i = 0; i < s.length(); i++) {
//			if(s.charAt(i)%2==0)
//			{
//				System.out.print(s.charAt(i));
//			}
//		}
		
	}
}
