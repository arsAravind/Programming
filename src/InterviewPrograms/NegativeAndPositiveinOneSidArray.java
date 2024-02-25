package InterviewPrograms;

public class NegativeAndPositiveinOneSidArray {
	public static void main(String[] args) {

		int[] arr = { 1, 4, -1, 2, -2, 3, -3, 9 };
		int[] array = call(arr);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	public static int[] call(int[] arr) {
		int[] b = new int[arr.length];
		int t = 0;
		for (int i = 0; i < b.length; i++) {
			if (arr[i] < 0) {
				b[t] = arr[i];
				t++;
			}
		}
		for (int j = 0; j < b.length; j++) {
			if (arr[j] > 0) {
				b[t] = arr[j];
				t++;
			}
		}
		arr = b;
		return arr;

	}

}
