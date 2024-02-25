package Programs;

import java.util.Scanner;

public class SearchingElementFromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				System.out.println("Gn number is found");
			} else {
				count++;
			}
			if (count == arr.length) {
				System.out.println("Gn number is not found");
			}
		}
	}
}
