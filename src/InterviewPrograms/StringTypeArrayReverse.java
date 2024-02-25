package InterviewPrograms;

public class StringTypeArrayReverse {
	public static void main(String[] args) {
		String[] s = { "eat", "toy", "dog" };
		for (int i = 0; i < s.length; i++) {
			String str = s[i];
			//String rev = "";
			for (int i1 = str.length()-1; i1 >=0; i1--) {
//				rev = rev + str.charAt(i1);
				System.out.print(str.charAt(i1));
				
			}
			System.out.println();

			//System.out.println(rev);
		}
	}
}
