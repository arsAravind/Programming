package InterviewPrograms;

public class InsertingElementArrayUsingForLoop {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5 };
		int index = 2;
		int val = 3;
		int[] b = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		for (int i = b.length - 1; i > index; i--) {
			b[i] = b[i - 1];
		}
		b[index] = val;
		for (int i : b) {
			System.out.print(i + " ");
		}
	}
}
