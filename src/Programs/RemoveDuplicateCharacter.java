package Programs;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		String str = "Consistency";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '0';
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != '0') {
				System.out.print(ch[i]);
			}
		}
	}
}
