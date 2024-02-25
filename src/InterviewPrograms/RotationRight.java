package InterviewPrograms;

import java.util.Scanner;

public class RotationRight {
	public static void main(String[] args) {
		// 1 time right rotation
//		int[] arr= {12,13,14,17,19};
//		
//		int t=arr[arr.length-1];
//		for (int i = arr.length-1; i >0; i--) {
//			arr[i]=arr[i-1];
//			System.out.println(arr[i]);
//		}
//		arr[0]=t;
//		
//		for(int a:arr)
//		{
//			System.out.print(a+" ");
//		}

//		int[] arr= {1,2,3,4,5};
//		
//		for (int k = 0; k < 2; k++) {
//			int t=arr[arr.length-1];
//			for (int i = arr.length-1; i >0; i--) {
//				arr[i]=arr[i-1];
//			}
//			arr[0]=t;
//			
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}	

//		 int[] arr = {1, 2, 3, 4, 5, 6, 7};
//
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.println("Enter the number of right rotations:");
//	        int k = scanner.nextInt();
//
//	        for (int rotation = 1; rotation <= k; rotation++) {
//	            int t = arr[arr.length - 1];
//
//	            for (int j = arr.length - 1; j > 0; j--) {
//	                arr[j] = arr[j - 1];
//	            }
//	            arr[0] = t;
//	        }
//
//	        // Print the rotated array
//	        for (int element : arr) {
//	            System.out.print(element + " ");
//	        }
		
		
		int[] a= {12,21,22,33,44};
		int t=a[a.length-1];
		for (int i = a.length-1; i >0; i--) {
			a[i]=a[i-1];
		}
		a[0]=t;
		for (int  i : a) {
			System.out.println(i);
		}
	}

}
