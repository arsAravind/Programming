package Programs;

public class ConvertUCAalphabetToLCCA {

	public static void main(String[] args) {
		
		char[] ucc;
		ucc=new char[26];
		char alpha='A';
		for(int i=0;i<ucc.length;i++)
		{
			ucc[i]=alpha++;
		}
		for (int i = 0; i < ucc.length; i++) {
			System.out.print(ucc[i]+" ");
		}
		ConvertUCAalphabetToLCCA c=new ConvertUCAalphabetToLCCA();
		c.call(ucc);
		
	}
	public  void call(char[] lcc) {
		lcc=new char[lcc.length];
		for (int i = 0; i < lcc.length; i++) {
			
		}
		
	}

}
