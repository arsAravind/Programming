package Programs;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		
		String str=" ASUS ROG PHONE ";
		char[] ch=str.toCharArray(); //{' ','A','S','U','S',' ','R'}
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ')
			{
				System.out.print(ch[i]);
			}
		}
	}
}
