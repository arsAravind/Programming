package InterviewPrograms;

public class OccurenceArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 1, 56, 3, 90 };
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						arr[j] = 0;
					}
				}
				System.out.println(arr[i] + "-" + count);
			}
		}
	}
}
