package InterviewPrograms;

import java.util.Scanner;

public class SearchElementArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = { 12, 23, 34, 4, 43, 432 };
		int a = scn.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				System.out.println(a + " number is present in Array");

			} else {
				count++;
			}
			if (count == arr.length) {
				System.out.println("GN number is not present");
			}
		}
	}
}
