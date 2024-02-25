package InterviewPrograms;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] arr = { 12, 7, 45, 65, 77, 40 };
		int large = arr[0];// 45,65,77
		int secLarge = arr[1];// 12,45,65
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				secLarge = large;
				large = arr[i];
			} else if (arr[i] > secLarge) {
				secLarge = arr[i];
			}
		}
		System.out.println(secLarge);
	}

}
