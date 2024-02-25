package InterviewPrograms;

public class PrintSameNoEndsWith6GnArray {
	public static void main(String[] args) {
		int[] arr = { 12, 21, 46, 27, 46, 21, 90, 56, 56 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && (arr[i] % 10) == 6) {
				count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						arr[j] = 0;
					}
				}
				System.out.println(arr[i] + " " + count);
			}
		}
	}
}
