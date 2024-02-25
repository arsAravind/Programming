package InterviewPrograms;

import java.util.Scanner;

public class Rotationleft {
	public static void main(String[] args) {
		//1 time left rotation   {11,22,34,65,12}
//		int[] arr= {12,11,22,34,65};  
//		int t=arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			arr[i-1]=arr[i]; //{22,11,34,65}
//		}
//		arr[arr.length-1]=t;
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		//n time left rotation
		int[] arr= {12,22,33,44,45,65};
		System.out.println("Enter the number");
		Scanner scn=new Scanner(System.in);
		int k=scn.nextInt();
		for (int i = 1; i <=k; i++) {
			
			int t=arr[0];
			for (int j = 1; j < arr.length; j++) {
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=t;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
