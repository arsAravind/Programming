package InterviewPrograms;
public class PatternHollowDiamond {
	public static void main(String[] args) {
		int n=4;
		int l;
		
		for (int i = -n; i <=n; i++) {
			if(i<0)
			{
				 l=-i;
			}
			else
			{
				l=i;
			}
			for (int s = 0; s <l; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n*2-l+1; j++)
			{
//				if(j==0||l+j==n)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
