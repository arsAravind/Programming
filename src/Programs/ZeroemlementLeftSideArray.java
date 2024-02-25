package Programs;

public class ZeroemlementLeftSideArray {
	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 0, 3, 4, 0 };
		int[] arr1 = new int[arr.length];
		int t = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr1[t] = arr[i];
				t++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr1[t] = arr[i];
				t++;
			}
		}
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

}
