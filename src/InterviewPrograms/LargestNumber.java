package InterviewPrograms;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int[] arr= {12,32,11,54,62,23};
		Arrays.sort(arr);
		for (int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println("Second largest number is "+arr[arr.length-2]);
	/*	int large=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		System.out.println("From the gn number large number is\n"+large);*/
	}

}
