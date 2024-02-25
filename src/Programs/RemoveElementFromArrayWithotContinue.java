package Programs;

public class RemoveElementFromArrayWithotContinue {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int rem = 2;
		int t = 0;
		int[] b = new int[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != rem) {
				b[t] = arr[i];
				t++;
			}
		}
		for (int i : b) {
			System.out.print(i + " ");
		}
	}

}
