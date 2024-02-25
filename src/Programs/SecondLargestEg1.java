package Programs;

import java.util.Iterator;

public class SecondLargestEg1 {
	public static void main(String[] args) {
		
		int[] arr= {12,15,65,43,22,17};
		int large=arr[0];//12,15,65,
		int secLarge=arr[1];//15,15,65 //Wrong
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>large)
			{
				secLarge=large; //Important
				large=arr[i];
			}
			else if(arr[i]>secLarge)
			{
				secLarge=arr[i];
			}
		}
		System.out.println(secLarge);
	}
}
