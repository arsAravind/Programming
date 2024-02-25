package InterviewPrograms;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str = "Hi hello bye";
		// 1) replace() method approaching
		String str1 = str.replace(" ", "");
		System.out.println(str1);

		// 2)convert into char type array
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				System.out.print(ch[i]);
			}
		}
	}
}
