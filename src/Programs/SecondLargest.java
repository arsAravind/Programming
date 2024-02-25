package Programs;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 5, 7 };
		int large = arr[0]; // 5,8
		int secLarge = arr[1]; // 2,5

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				secLarge = large;
				large = arr[i];

			} else if ((arr[i] > secLarge)) {
				secLarge = arr[i];
			}
		}
		System.out.println(secLarge);
	}
}
