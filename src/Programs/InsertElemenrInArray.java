package Programs;

public class InsertElemenrInArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6 };
		int[] b = new int[arr.length + 1];
		int index = 2;
		int val = 3;
		for (int i = 0; i <= arr.length; i++) {
			if (i == index) {
				b[i] = val;
			} else if (i > index) {
				b[i] = arr[i - 1];
			} else {
				b[i] = arr[i];
			}
		}
		// b[index]=val;
		for (int i : b) {
			System.out.print(i + " ");
		}
	}

}
