package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistElementpalindromeOrNot {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(1);

		ArrayList l2 = new ArrayList(list);
		System.out.println(l2);

		Collections.reverse(list);
		System.out.println(list);

		if (list.equals(l2)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}

//		Object[] arr = list.toArray(); //
//		Object[] b = new Object[arr.length];
//		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
//			b[j] = arr[i];
//		}
//		if (Arrays.deepEquals(arr, b)) {
//			System.out.println("Palindrome");
//		} else {
//			System.out.println("Not palindrome");
//		}
	}
}
