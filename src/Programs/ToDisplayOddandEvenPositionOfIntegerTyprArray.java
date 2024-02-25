package Programs;

public class ToDisplayOddandEvenPositionOfIntegerTyprArray {

	public static void main(String[] args) {
		
		int[] a;
		a=new int[5];
		a[0]=12;//1
		a[1]=13;//2
		a[2]=14;//3
		a[3]=15;//4
		a[4]=16;//5
		System.out.println("elements  present in EVEN position");
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("elements  present in ODD position");
		for (int i = 0; i < a.length; i++) {
			if((i+1)%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
