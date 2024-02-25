package InterviewPrograms;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 7, 4, 9 };
		for (int i = 0; i < arr.length - 1; i++) {
			int small = i;// 0 1
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[small]) {
					small = j;
				}
			}
			int t = arr[small];
			arr[small] = arr[i];
			arr[i] = t;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
