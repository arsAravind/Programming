package Programs;

public class CountGnNumber {

	public static void main(String[] args) {
		
		int n=1892;
		int count =0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println("Gn number count is "+count);

	}

}
