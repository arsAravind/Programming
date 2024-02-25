package Programs;

public class CountOfAlphabet {

	public static void main(String[] args) {
		
		char ch='A';
		char[] c;
		c=new char[26];
		int count =0;
		for(int i=0;i<c.length;i++)
		{
			count++;
			c[i]=ch++;
		}
		for(int i=0;i<c.length;i++)
		{
			//count++;
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println("Count of the alphabet is "+count);
	}

}
