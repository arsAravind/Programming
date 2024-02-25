package Programs;

public class ConvertBinaryToDecimal {

	public static void main(String[] args) {
		
		int decimal=9;
		String binary="";
		while(decimal>0)
		{
			int t=decimal%2;
			binary=t+binary;
			decimal=decimal/2;
		}
		System.out.println(binary);
	}

}
