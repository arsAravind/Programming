package InterviewPrograms;

class Demo implements Runnable {
	@Override
	public void run() {

		char c = 'A';
		char[] ch = new char[26];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = c;
			c++;
		}
		for (char c2 : ch) {
			System.out.print(c2 + " ");
		}
	}
}
public class MultithreadingProgramAlphabet {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Thread thread = new Thread(d1);
		thread.run();
	}
}
