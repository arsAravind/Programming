package InterviewPrograms;

public class NullPointerExceptionProgram {
	public static void main(String[] args) {
		Sample s1 = null;
		try {
			System.out.println(s1.x);
			System.out.println(s1.y);
		} catch (NullPointerException exception) {
			System.out.println("Handled");
		}

	}
}
//String s=null;
//System.out.println(s.charAt(0));
class Sample {
	int x = 10;
	int y = 20;
}
