package CheckedException;

public class InterruptedException {
	public static void main(String[] args) throws java.lang.InterruptedException {
//When we use sleep()
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
