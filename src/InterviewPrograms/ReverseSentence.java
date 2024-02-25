package InterviewPrograms;

public class ReverseSentence {
	public static void main(String[] args) {

		String str = "Java is a programming language";
		String[] s = str.split(" "); //{"Java","is","a","programming","language"}
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i] + " ");
		}
	}

}
