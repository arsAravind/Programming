package InterviewPrograms;

public class FirstDigitInArray {

	public static void main(String[] args) {

		int[] arr = { 113, 2343, 466, 7688, 68 };
		int sum = 0;
		int s = 0;
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i]; // 113
			while (n > 10) {
				n = n / 10;
			}
			s = n;
			System.out.print(s + " ");
			sum = sum + s;
		}
		System.out.println(sum);
	}
}
