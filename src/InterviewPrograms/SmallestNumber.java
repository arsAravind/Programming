package InterviewPrograms;

public class SmallestNumber {
	public static void main(String[] args) {
		int[] arr = { 12, 21, 32, 8, 4, 3, 67 };
		int small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println("smallest number is\n" + small);
	}

}
