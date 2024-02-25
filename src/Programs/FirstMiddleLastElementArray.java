package Programs;

public class FirstMiddleLastElementArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("First " + arr[0]);
		System.out.println("End " + arr[arr.length - 1]);
		System.out.println("Middle " + arr[(arr.length / 2) - 1]);
	}
}
