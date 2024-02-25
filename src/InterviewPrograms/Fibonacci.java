package InterviewPrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scn.nextInt();
		int fib1 = 0;// 1,1,2
		int fib2 = 1;// 1,2,3
		int fib3 = fib1 + fib2;// 2,3,5
		while (n > 0) {
			System.out.print(fib1 + "\t");
			fib1 = fib2;
			fib2 = fib3;
			fib3 = fib1 + fib2;
			n--;
		}
	}
}
