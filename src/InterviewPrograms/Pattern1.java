package InterviewPrograms;

public class Pattern1 {

	public static void main(String[] args) {
		
	int n=4;int l;
	for (int i = -n; i <=n; i++) {
		if(i<0)
		{
			l=-i;
		}
		else
		{
			l=i;
		}
		for (int j = 0; j < l+1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
			
		
	}

}
