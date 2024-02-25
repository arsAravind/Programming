package InterviewPrograms;

public class MultiplicationTable {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 10; j++) {
				int c = i * j;
				System.out.println(i + "*" + j + "=" + c);
			}
		}
	}
}
