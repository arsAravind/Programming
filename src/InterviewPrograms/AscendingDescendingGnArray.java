package InterviewPrograms;

public class AscendingDescendingGnArray {
	public static void main(String[] args) {
		int[] a = { 12, 23, 11, 76, 65, 7, 18 };

		int[] arr = new int[a.length];
		int[] arr1 = new int[a.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a[i];
		}
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = a[i];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] < arr1[j]) {
					int t = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = t;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}
}
