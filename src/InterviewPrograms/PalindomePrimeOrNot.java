package InterviewPrograms;

public class PalindomePrimeOrNot {
	public static void main(String[] args) {

		int n = 1111;
		int rev = 0;
		int copy = n;
		while (n > 0) {
			int t = n % 10;
			rev = rev * 10 + t;
			n = n / 10;
		}
		if (copy == rev) {
			int a = 1;
			int count = 0;
			while (a <= copy / 2) {
				if (copy % a == 0) {

					count++;
					System.out.println(a);
				}
				a++;
			}
			if (count == 1) {
				System.out.println("Gn number is palindrome prime");
			} else {
				System.out.println("Gn no is not palindrome prime");
			}
		} else {
			System.out.println("Not a palindorme");
		}
	}

}
