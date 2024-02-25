package Leetcode;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		 
		String[] s = { "guig", "guig", "guig" };
		for (int i = 0; i < s.length - 2; i++) {

			String s1 = s[i];
			String s2 = s[i + 1];
			String s3 = s[i + 2];

			for (int j = 0; j < s.length; j++) {
				if (s1.charAt(j) == s2.charAt(j) && s1.charAt(j) == s3.charAt(j)) {
					System.out.print(s1.charAt(j));
				} else {
					System.out.println("" + "");
				}
			}

		}
	}
}
