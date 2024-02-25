//package InterviewPrograms;
//
//public class BinarySearchToFindElement {
//	public static void main(String[] args) {
//
//		int[] arr = { 1, 2, 3, 4, 5, 6 };
//		int key = 1;
//		int low = 0;
//		int high = arr.length - 1;
//		int mid = 0;
//		int t = 1;
//		while (low <= high) {
//			mid = (low + high) / 2;
//			if (key == arr[mid]) {
//				t++;
//				
//
//			} else if (key < arr[mid]) {
//				high = mid - 1;
//			} else {
//				low = mid + 1;
//			}
//
//		}
//		if (t > 1) {
//			System.out.println("found" + t);
//
//		} else {
//			System.out.println("Not found");
//		}
//
//	}
//
//}
package InterviewPrograms;

public class BinarySearchToFindElement {
    public static void main(String[] args) {

        int[] arr = {1,1, 2, 3, 4, 5, 6};
        int key = 1;
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int t = 0;  // Initialize counter outside the loop

        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                t++;  // Increment the counter when the key is found
            }

            // Update the search space based on comparison
            if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (t > 0) {
            System.out.println("Found " + t + " occurrences");
        } else {
            System.out.println("Not found");
        }
    }
}
