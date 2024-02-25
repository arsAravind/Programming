package InterviewPrograms;

public class pattern2 {
	
	public static void main(String[] args) {
		
		int n=3;int l;
		for (int i = -n; i <=n; i++) {
			if(i<0)
			{
				l=-i;
			}
			else
			{
				l=i;
			}
			for (int s = 0; s < n-l; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < l+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
