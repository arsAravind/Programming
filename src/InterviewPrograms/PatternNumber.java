package InterviewPrograms;

public class PatternNumber {
	public static void main(String[] args) {
		int a = 1; // 2,3,6
		int n = 4;
		int l = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j) {

					System.out.print(a + " ");
					a = a + (i + 1);
				}
			}
			a = i + 2;
			System.out.println();

		}
	}
}
