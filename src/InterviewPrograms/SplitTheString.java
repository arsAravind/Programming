package InterviewPrograms;

public class SplitTheString {

	public static void main(String[] args) {
		
		String str="Chennai is the capital of TamilNadu";
		String[] str1=str.split(" ");//{"Chennai","is","the","Capital","of","TamilNadu"}
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
		
		String str2="Chennai is the capital of TamilNadu";
		String[] str3=str.split("");// *
		for (int i = 0; i < str3.length; i++) {
			System.out.println(str3[i]);	
		}
	}	

}
