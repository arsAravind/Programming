package InterviewPrograms;

public class PrintDuplicateCharacterInString {

	public static void main(String[] args) {
		
		String str="aravind";	
		//Can use Directly the String by using charAt() to access the character present in string
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i+1; j < str.length(); j++) {
//				if(str.charAt(i)==str.charAt(j))
//				{
//					System.out.println(str.charAt(i));
//				}
//			}
//		}	
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
				}
			}
		}	
	}
}
