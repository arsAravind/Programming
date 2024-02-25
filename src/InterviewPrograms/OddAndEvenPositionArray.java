package InterviewPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class OddAndEvenPositionArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		LinkedHashSet<Integer> hashSet1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> hashSet2 = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			if ((i + 1) % 2 == 0) {
				hashSet1.add(a[i]);
			} else {
				hashSet2.add(a[i]);
			}
		}
		System.out.println("Even position " + hashSet1);
		System.out.println("Odd position " + hashSet2);
	}
}
