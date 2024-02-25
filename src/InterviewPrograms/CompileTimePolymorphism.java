package InterviewPrograms;

public class CompileTimePolymorphism {
	public static void main(String[] args) {

		Main.add(1, 2);
		Main.add(12.2, 11.22);
	}

}

class Main {

	public static void add(int i, int j) {
		System.out.println(i + j);
	}

	public static void add(double d, double e) {
		System.out.println(d + e);

	}

}
