package InterviewPrograms;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 3, 3, 4, 5, 6, 2 };

		for (int i = 0; i < arr.length; i++) {
			for (int i1 = i + 1; i1 < arr.length; i1++) {
				if (arr[i] == arr[i1]) {
					arr[i1] = -1;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}
