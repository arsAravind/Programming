package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class InsertdataCollection {

	public static void main(String[] args) {
		
		String str="Chennai";
		char[] arr=str.toCharArray();
		ArrayList a1=new ArrayList();
		for(int i=0;i<str.length();i++)
		{
			a1.add(arr[i]);
		}
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
	}

}
