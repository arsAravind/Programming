package InterviewPrograms;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scn.nextInt();
		int sum = 0;
		int copy = n;
		while (n > 0) {
			int t = n % 10;
			int fact = 1;
			while (t > 0) {
				fact = fact * t;
				t--;
			}
			sum = sum + fact;
			n = n / 10;
		}
		if (sum == copy) {
			System.out.println("Strong number");
		} else {
			System.out.println("not a Strong number");
		}
	}
}
