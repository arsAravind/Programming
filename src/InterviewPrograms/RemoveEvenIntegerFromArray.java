package InterviewPrograms;

public class RemoveEvenIntegerFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(m1(arr));
	}

	public static int[] m1(int[] arr) {
		double d = System.currentTimeMillis();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i]);
			}
		}
		System.out.println(System.currentTimeMillis() - d);
		return arr;
	}

}
