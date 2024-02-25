package ProgramIn;

import java.util.Scanner;

public class SubarraySum {

	public static void main(String[] args) {

		System.out.println("Enter size of an array");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of subarray " + sum);

	}

}
