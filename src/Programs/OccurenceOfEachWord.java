package Programs;

public class OccurenceOfEachWord {
	public static void main(String[] args) {
		
		String str="environment";
		char[] ch=str.toCharArray();
		int count=1;
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' '&&ch[i]=='0')
			{
				count=1;
				for (int j = i+1; j < ch.length; j++) {
					if(ch[i]==ch[j])
					{
						
						count++;
						ch[j]='0';
					}
					
					
			}
				System.out.println(ch[i]+"-"+count);
			
			}
		}
		
	}
}
