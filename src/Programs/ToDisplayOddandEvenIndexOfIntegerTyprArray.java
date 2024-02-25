package Programs;

public class ToDisplayOddandEvenIndexOfIntegerTyprArray {

	public static void main(String[] args) {
		
		int[] a;
		a=new int[5];
		a[0]=12;
		a[1]=14;
		a[2]=13;
		a[3]=76;
		a[4]=22;
		System.out.println("WAJP to display the element at the EVEN index of Integer type Array");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("WAJP to display the element at the ODD index of Integer type Array");
		for (int i = 0; i < a.length; i++) {
			if(i%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
