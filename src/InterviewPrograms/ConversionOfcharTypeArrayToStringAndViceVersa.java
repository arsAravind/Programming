package InterviewPrograms;

public class ConversionOfcharTypeArrayToStringAndViceVersa {

	public static void main(String[] args) {
		System.out.println("ConversionOfcharTypeArrayToString");
		char[] ch;
		ch = new char[8];
		ch[0] = 'a';
		ch[1] = 'n';
		ch[2] = 'a';
		ch[3] = 'n';
		ch[4] = 't';
		ch[5] = 'h';
		ch[6] = 'a';
		ch[7] = 'n';
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		String str = new String(ch);
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();

		System.out.println("ConversionOfStringToCharacterTypeArray");
		String str1 = "Amma";
		System.out.println(str1);
		char[] ch1 = str1.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i] + " ");
		}
	}

}
