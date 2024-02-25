package InterviewPrograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "ate";
		String s2 = "tea";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		/*
		 * if(s1.length()!=s2.length()) { System.out.println("Both are not anagram"); }
		 * else {
		 */
		// have to convert into Arrays(toCharArray) so we can use sort() and
		// Arrays.equals(c1,c2)
		char[] c1 = s1.toCharArray();
		char[] c2 = s2 .toCharArray();
		Arrays.sort(c1); // eat
		Arrays.sort(c2); // eat
		int count = 0; // 2
		for (int i = 0; i < c2.length; i++) {
			if (c1[i] == c2[i]) {
				count++;
			}
		}
		if (count == c1.length) {
			System.out.println("Both the strings are anagram");
		} else {
			System.out.println("Both are not anagram");
		}
	}

}
