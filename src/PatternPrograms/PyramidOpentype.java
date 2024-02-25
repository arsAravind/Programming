package PatternPrograms;

public class PyramidOpentype {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {
			for (int s = 0; s < n - i; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				if(j==0||i==j||i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}


