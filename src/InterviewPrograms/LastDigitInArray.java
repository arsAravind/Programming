package InterviewPrograms;

public class LastDigitInArray {

	public static void main(String[] args) {

		int[] arr = { 123, 334, 546, 767, 677 };
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int t = n % 10;
			System.out.print(t + " ");
		}
	}

}
