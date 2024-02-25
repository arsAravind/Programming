package Leetcode;

public class RomanToInteger {
	public static void main(String[] args) {

		String s = "LVIII";
		int sum = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'I') {
				sum = sum + 1;
			} else if (ch[i] == 'V') {
				sum = sum + 5;
			} else if (ch[i] == 'X') {
				sum = sum + 10;
			} else if (ch[i] == 'L') {
				sum = sum + 50;
			} else if (ch[i] == 'C') {
				sum = sum + 100;
			} else if (ch[i] == 'D') {
				sum = sum + 500;
			} else if (ch[i] == 'M') {
				sum = sum + 1000;
			}
		}
		System.out.println("Sum of Roman is " + sum);
	}

}
