package InterviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class OddAndEvenPositionString {
	public static void main(String[] args) {
		String s = "Consistency";
		ArrayList<Character> characters1 = new ArrayList<Character>();
		ArrayList<Character> characters2 = new ArrayList<Character>();

		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if ((i + 1) % 2 == 0) {
				characters1.add(ch[i]);
			} else {
				characters2.add(ch[i]);
			}
		}
		System.out.println("Even position " + characters1);
		System.out.println("Odd position " + characters2);
	}
}
