package InterviewPrograms;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		String s = "environment";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = 0;
				}
			}

		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != 0) {
				System.out.print(ch[i]);
			}
		}
	}
}
