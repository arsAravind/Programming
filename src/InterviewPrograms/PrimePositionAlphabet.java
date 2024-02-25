package InterviewPrograms;

public class PrimePositionAlphabet {
	public static void main(String[] args) {

		char[] ch;
		ch = new char[26];
		char c = 'a';
		for (int i = 0; i < ch.length; i++) {
			ch[i] = c;
			c++;
		}
//		for (char c1 : ch) {
//			System.out.print(c1 + " ");
//		}

		for (int i = 1; i <= 26; i++) {
			int a = 1;
			int count = 0;
			while (a <= i / 2) {
				if (i % a == 0) {
					count++;
				}
				a++;
			}
			if (count == 1) {
				System.out.println(i + "-" + ch[i - 1]);

			}

		}

//		for (int i = 0; i < ch.length; i++) {	
//			int a = 1;
//			int count = 0;
//			while (a < (i + 1) / 2) {
//				if ((i+1) % 2 == 0) {
//					count++;
//				}
//				a++;
//			}
//			if (count == 1) {
//				System.out.println(ch[i]);
//			}

	}

}
