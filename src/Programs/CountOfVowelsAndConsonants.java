package Programs;

public class CountOfVowelsAndConsonants {
	public static void main(String[] args) {
		char alpha = 'A';
		char[] ch;
		ch = new char[26];
		int vowelsCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < ch.length; i++) {
			ch[i] = alpha++;
		}
		System.out.println("Vowels");
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				vowelsCount++;
				System.out.print(ch[i] + " ");
			} else {
//				System.out.println(ch[i]+" ");
			}
		}
		System.out.println();
//		System.out.println("Consonants");
//		for (int i = 0; i < ch.length; i++) {
//			if(ch[i]!='A'&&ch[i]!='E'&&ch[i]!='I'&&ch[i]!='O'&&ch[i]!='U')
//			{
//				consonantCount++;
//				System.out.print(ch[i]+" ");
//			}
//		}
		System.out.println();
		System.out.println("Count of vowels " + vowelsCount);
		System.out.println("Count of vowels " + consonantCount);
	}
}
