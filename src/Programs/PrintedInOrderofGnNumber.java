package Programs;
public class PrintedInOrderofGnNumber {
	public static void main(String[] args) {	
		int n=12345;
		int rev=0;
		while(n>0)
		{
			int t=n%10;
			System.out.println(t);
			n=n/10;	
		}		
		//System.out.println(rev);
		//2nd approach
		int n1=12345;
		String s=Integer.toString(n1); //s={"1","2","3","4","5"}
		for(int i=0;i<s.length() ;i++)
		{
			System.out.println(s.charAt(i));
		}	
	}
}
