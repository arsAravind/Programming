package InterviewPrograms;

import java.util.Arrays;

public class TwoArraysEquality {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 6 };
		int[] b = { 1, 2, 3 };
		int count = 0;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Gn 2 array is not equal");
			} else {
				System.out.println("Gn 2 array is equal");
			}
		} else {
			System.out.println("Gn 2 array is not equal");
		}
		
		System.out.println(Arrays.equals(a, b));

	}

}
