package InterviewPrograms;

public class Swap2StringUsingThirdVariable {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "123";
		String t = s1;
		s1 = s2;
		s2 = t;
		System.out.println(s1);
		System.out.println(s2);
	}

}
