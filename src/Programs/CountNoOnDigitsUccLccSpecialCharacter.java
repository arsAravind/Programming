package Programs;

public class CountNoOnDigitsUccLccSpecialCharacter {

	public static void main(String[] args) {
		
		String[] s;
		s=new String[22];
		int countLcc=0;
		int countUcc=0;
		int countDigit=0;
		int countSpecial=0;
		s[0]="J";
		s[1]="a";
		s[2]="v";
		s[3]="a";
		s[4]="r";
		s[5]="a";
		s[6]="n";
		s[7]="i";
		s[8]="@";
		s[9]="J";
		s[10]="S";
		s[11]="i";
		s[12]="d";
		s[13]="e";
		s[14]="r";
		s[15]="s";
		s[16]="#";
		s[17]="1";
		s[18]=".";
		s[19]="4";
		s[20]=".";
		s[21]="3";
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
		
		for (int i = 0; i < s.length; i++) {
			if(s[i]=="a"||s[i]=="e"||s[i]=="i"||s[i]=="o"||s[i]=="u")
			{
				countLcc++;
	
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i]!="a"&&s[i]!="e"&&s[i]!="i"&&s[i]!="o"&s[i]!="u")
			{
				countUcc++;
	
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i]=="1"||s[i]=="2"||s[i]=="3"||s[i]=="4"||s[i]=="5"||s[i]=="6"||s[i]=="7"||s[i]=="8"||s[i]=="9"||s[i]=="0")
			{
				countDigit++;
	
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i]=="@"||s[i]=="#"||s[i]=="&"||s[i]=="*")
			{
				countSpecial++;
	
			}
		}
		
		System.out.println("COunt of the lowercase "+countLcc);
		System.out.println("COunt of the Uppercase "+countLcc);
		System.out.println("COunt of the digits "+countLcc);
		System.out.println("COunt of the specialcase "+countLcc);
		
		
	}
}
