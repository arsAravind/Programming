package InterviewPrograms;

import java.util.Scanner;

public class FactorialGnNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scn.nextInt();
		int fact = 1;
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		System.out.println("Factorial of Gn Number is\n" + fact);
	}
}
