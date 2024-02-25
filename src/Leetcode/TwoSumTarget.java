package Leetcode;

import java.util.Scanner;

public class TwoSumTarget {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = { 2, 7, 3, 9, 34, 5 };
		int t = scn.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == t) {
					System.out.print(i + "," + j);
				}
			}
		}
	}

}
