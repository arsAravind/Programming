package InterviewPrograms;

public class ResizeArray {
	public static void main(String[] args) {
		//we should return the resize of an array else unoccupy memory will get
		//removed from garbage collector
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = new int[a.length * 2];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println();
		a = b;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		int[] arr = { 1, 3, 4, 4, 5 };
		int[] brr = { 12, 32, 4, 424 ,88};
		arr = brr;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
