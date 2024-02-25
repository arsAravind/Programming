package InterviewPrograms;

import java.util.Scanner;

public class OccurenceOfSentence {
	public static void main(String[] args) {
		System.out.println("Enter the sentence");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
//		String s = "All the best best of luck All";
		String[] s1 = s.split(" ");
		int count = 1;
		for (int i = 0; i < s1.length; i++) {
			String str = s1[i];
			if (s1[i] != " " && s1[i] != "0" && s1[i].endsWith("t")) {
				count = 1;
				for (int j = i + 1; j < s1.length; j++) {
					if (s1[i].equals(s1[j])) {
						count++;
						s1[j] = "0";
					}
				}
				System.out.println(s1[i] + " " + count);
			}
		}
	}
}
