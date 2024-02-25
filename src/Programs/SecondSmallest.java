package Programs;

import java.util.Iterator;

public class SecondSmallest {
	public static void main(String[] args) {
		
		int[] arr= {12,23,34,21,43,8};
		int small=arr[0];
		int secSmall=arr[1];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<small)
			{
				secSmall=small;
				arr[i]=small;
			}
			else if(arr[i]<secSmall)
			{
				arr[i]=secSmall;
			}
		}
		System.out.println(secSmall);
	}
}
