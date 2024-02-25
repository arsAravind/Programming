package ProgramIn;

import java.util.Arrays;
import java.util.Scanner;

public class IceCreamBars {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the coins");
		int coins = scn.nextInt(); // 20
		System.out.println("Ice cost price size");
		int size = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (coins >= arr[i]) {
				coins = coins - arr[i];
				count++;
			}
		}
		System.out.println(count);

	}
}