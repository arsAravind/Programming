package PatternPrograms;

public class Rhombus {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {

			for (int s = 0; s < n - i - 1; s++) {
				System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
