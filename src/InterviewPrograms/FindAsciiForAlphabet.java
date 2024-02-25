package InterviewPrograms;

public class FindAsciiForAlphabet {

	public static void main(String[] args) {
		
		char[] ch;
		ch=new char[26];
		char data='a';
		for (int i = 0; i < ch.length; i++) {
			ch[i]=data++;
		}
		int[] a;
		a=new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			a[i]=ch[i];
		}	
		for (int i = 0; i < a.length; i++) {
			System.out.println(ch[i]+"-"+a[i]);
		}
		
//		ConvertAlphabetToAscii c1=new ConvertAlphabetToAscii();
//		c1.m1(ch);
//	}
//	
//	public void m1(char[] ch)
//	{
//		int[] a;
//		a=new int[ch.length];
//		for (int i = 0; i < a.length; i++) {
//			a[i]=ch[i];
//		}
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]+"-"+ch[i]);
//		}
	}
	
}
