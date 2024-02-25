package InterviewPrograms;

public class FirstMaxLastMin {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int large = arr[0];
		int small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			} else if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println(large);
		System.out.println(small);
	}
}
