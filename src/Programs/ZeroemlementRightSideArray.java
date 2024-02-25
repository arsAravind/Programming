package Programs;

public class ZeroemlementRightSideArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 0, 2, 0, 1, 0, 2 };
		int t = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[t] = arr[i];
				t++;
			}
		}
		for (int i = t; i < arr.length; i++) {
			arr[i] = 0;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
