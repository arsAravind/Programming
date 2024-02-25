package InterviewPrograms;

public class SecondSmallestNumber {
	public static void main(String[] args) {
		int[] arr = { 12, 23, 43, 21, 54 };
		int small = arr[0];
		int secSmall = arr[1];// 23,21

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				secSmall = small;
				small = arr[i];
			} else if (arr[i] < secSmall) {
				secSmall = arr[i];
			}
		}
		System.out.println(secSmall);
	}
}
