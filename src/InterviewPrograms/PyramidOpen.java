package InterviewPrograms;

public class PyramidOpen
{
	public static void main(String[] args)
	{
//		int n=5;
//		int spc=n-1;
//		int str=1;
//
//		for (int i = 0; i < n; i++)
//		{
//			for (int j = 0; j < spc; j++)
//			{
//				System.out.print(" ");
//			}
//				for (int k = 0; k < str; k++) 
//				{
//					if(k==0 || k==i || k==n-1 )
//					{
//						System.out.print("* ");
//					
//					}
//					else
//					{
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//				str=str+2;
//				spc--;
//		}		
				int n = 5;
		int spc = n - 1;
		int str = 1;
		int a=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < spc; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < str; k++) {
				if (k <n/2) {
					System.out.print(a);
					a++;
				} else {
					a--;
					System.out.print(a);
				}
			}
		}
		System.out.println();
		a=1;
		str = str + 2;
		spc--;

	}
}
