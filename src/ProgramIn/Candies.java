package ProgramIn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candies {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Size of candies");
		int size = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int large = arr[0];
		System.out.println("Extra candies");
		int extra = scn.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		List<Boolean> list = new ArrayList<Boolean>();
		for (int i = 0; i < arr.length; i++) {

			list.add((arr[i] + extra) >= large);
		}

		System.out.println(list);
	}
}
