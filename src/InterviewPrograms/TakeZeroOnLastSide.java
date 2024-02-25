package InterviewPrograms;

public class TakeZeroOnLastSide {
	public static void main(String[] args) {

		int[] arr = { 1, 0, 3, 0 };
		int t = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[t] = arr[i];
				t++;
			}
		}
//		while (t < arr.length) {
//			arr[t] = 0;
//			t++;
//		}
		for (int i = t; i < arr.length; i++) {
			arr[t] = 0;
			t++;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
