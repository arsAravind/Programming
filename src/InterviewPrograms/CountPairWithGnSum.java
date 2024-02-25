package InterviewPrograms;

import java.util.Scanner;

public class CountPairWithGnSum {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int count = 0;
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == a) {
                    count++;
                    System.out.println(arr[i] + " " + arr[j]);
                }
                if (arr[i] == a) {
                    count++;
                    System.out.println(arr[i]);
                }
            }
        }

        System.out.println(count);
		
		/*
		 * Scanner scn = new Scanner(System.in); int a = scn.nextInt(); int count = 0;
		 * int[] arr = { 1, 2, 3, 4, 5, 6 }; for (int i = 0; i < arr.length; i++) { for
		 * (int j = i + 1; j < arr.length; j++) { if (arr[i] + arr[j] == a) { count++;
		 * System.out.println(arr[i] + " " + arr[j]); if (arr[i] == a) { count++;
		 * System.out.println(arr[i]); } }
		 * 
		 * }
		 * 
		 * } System.out.println(count);
		 */
	}
//	{
//	Scanner scn = new Scanner(System.in);
//    int a = scn.nextInt();
//    int count = 0;
//    int[] arr = { 1, 2, 3, 4, 5, 6 };
//    
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = i + 1; j < arr.length; j++) {
//            if (arr[i] + arr[j] == a) {
//                count++;
//                System.out.println(arr[i] + " " + arr[j]);
//            }
//        }
//
//        // Check if the current element itself is equal to 'a'
//        if (arr[i] == a) {
//            count++;
//            System.out.println(arr[i]);
//        }
//    }
//    
//    System.out.println(count);

}
