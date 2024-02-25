package InterviewPrograms;

import java.util.Arrays;

public class PalidromeArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 1,6};//{6,1}
		for (int i = arr.length-1,j=0; i >=0; i--,j++) {
			arr[j]=arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		int[] copy = new int[arr.length];// {10,20}
//		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
//			copy[j] = arr[i];
//		}
//		for (int i : copy) {
//			System.out.println(i);
//		}
//		if (Arrays.equals(arr, copy)) {
//			System.out.println("Palindrome");
//		} else {
//			System.out.println("not palindrome");
//		}

	}

}
