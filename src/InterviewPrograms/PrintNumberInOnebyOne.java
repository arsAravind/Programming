package InterviewPrograms;

public class PrintNumberInOnebyOne {

	public static void main(String[] args) {
		
		int n=12345;//1234
		
		String s=Integer.toString(n);
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
//			if(s.charAt(i)%2==0)
//			{
//				System.out.println(s.charAt(i));
//			}
			
		}
	}

}
