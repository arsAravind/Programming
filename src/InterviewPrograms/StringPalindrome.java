package InterviewPrograms;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "Appa";
		
		String rev = "";

		for (int i = str.length() - 1; i >=0; i--) {
			rev = str.charAt(i)+ rev ;
		}

		if (rev.equalsIgnoreCase(str)) {
			System.out.println("Gn String is Palindrome");
		} else {
			System.out.println("Gn string is not a palindrome");
		}
	}

}
