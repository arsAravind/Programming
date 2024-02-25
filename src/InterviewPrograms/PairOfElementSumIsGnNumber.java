package InterviewPrograms;

import java.util.Scanner;

public class PairOfElementSumIsGnNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };
		int a = scn.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == a) {
					System.out.println(arr[i] + " , " + arr[j]);
				}
				 if(arr[i]==a)
				{
					System.out.println(arr[i]);
				}
					
			}
		}
	}
}
