package InterviewPrograms;

public class PrintEvenPositionOfGnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5};
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
