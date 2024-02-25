package InterviewPrograms;

public class AscendingOrderInArray {

	public static void main(String[] args) {
		int[] arr = { 12, 43, 11, 18, 7 };
		System.out.println("Before sorting");
		m1(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println("After sorting for ascending order");
		m1(arr);
		 
	}
	public static void m1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
