//package InterviewPrograms;
//
//public class RemoveElementFromArray {
//	public static void main(String[] args) {
//
//		int[] arr = { 18, 52, 43, 94, 15 };
//		int rem = 52;
//		
//		int[] b = new int[arr.length - 1];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == rem) {
//				continue;
//			}
//			b[i] = arr[i];
//
//		}
//		for (int i : b) {
//			System.out.print(i + " ");
//		}
//	}
//
//}

package InterviewPrograms;

public class RemoveElementFromArray {
	public static void main(String[] args) {

		int[] arr = { 18, 52, 43, 94, 15 };
		int rem = 52;
		int ind = 0; // 1
		int[] b = new int[arr.length];
		// Variable to track the index in the new array

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == rem) {
				// If the element is to be removed, skip it and don't copy it to the new array
				continue;
			}
			// Copy the elements to the new array
			b[i] = arr[i];
		}

		 //Print the modified array
		for (int i : b) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != rem) {
				System.out.println(arr[i]);
				break;
			}
			System.out.println(arr[i]);
		}
	}
}
