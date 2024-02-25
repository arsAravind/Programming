package InterviewPrograms;

public class ArrayInsertion {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6 };
		int ind = 2;
		int value = 12;
		int[] b = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			b[i] = arr[i];
		}
		for (int i = 0; i <= ind; i++) {
			int t = b.length - 1; // {1,2}
			while (i >= ind && t > ind) {
				b[t] = b[t - 1];
				t--;
			}
		}
		b[ind] = value;
		for (int i : b) {
			System.out.print(i + " ");
		}
	}
}
