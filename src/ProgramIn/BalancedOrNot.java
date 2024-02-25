package ProgramIn;

public class BalancedOrNot {
	public static void main(String[] args) {

		String s = "()(){}))((";
		char[] ch = s.toCharArray();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ')') {
				count1++;
			} else if (ch[i] == '(') {
				count2++;
			} else if (ch[i] == '{') {
				count3++;
			} else {
				count4++;
			}
		}
		if (count1 == count2 && count3 == count4) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not balanced");
		}
	}
}
