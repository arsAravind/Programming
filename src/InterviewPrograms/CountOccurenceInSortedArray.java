package InterviewPrograms;

public class CountOccurenceInSortedArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 1, 2, 3, 7, 4, 3, 3 };
		int count = 1; //
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			if (arr[i] != 0) {
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
