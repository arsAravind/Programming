package InterviewPrograms;

public class PrimeNumber1To100 {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			int n = i;
			int a = 1;
			int count = 0;
			while (a <= n / 2) {
				if (n % a == 0) {
					count++;
				}
				a++;
			}
			if (count == 1) {
				System.out.print(i + " ");
			}

		}
	}

}
