package Programs;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="Ram";
		String str2="ram";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[] ch1=str1.toCharArray();//{'r','a','m'}
		char[] ch2=str2.toCharArray();//{'a','m','r'}
		
		Arrays.sort(ch1);//amr
		Arrays.sort(ch2);//amr
		
		if(Arrays.equals(ch1, ch2)==true)
		{
			System.out.println("Gn string is annagram");
		}
		else
		{
			System.out.println("String not anagram");
		}
		
	}
}
