package Programs;

import java.util.Iterator;

public class Pattern {
	
	public static void main(String[] args) {
		
//	int n=4;
//	for (int i = 0; i < n; i++) {
//		
//		for (int s = 0; s < n-i-1; s++) {
//			System.out.print(" ");
//			
//		}
//		for (int j = 0; j < i+1; j++) {
//			if(j==0||i==n-1||i==j)
//			{
//				System.out.print("*");
//			}
//			else
//			{
//				System.out.print(" ");
//			}
//			
//		}
//		System.out.println();
//		
//	}
		
//		int n=2;
//		int l ;
//		for (int i = -n; i <=n; i++) {
//			
//			if(i<0)
//			{
//				l=-i;
//			}
//			else
//			{
//				l=i;
//			}
//			for (int s = 0; s < l; s++) {
//				System.out.print("  ");
//				
//			}
//			for (int j = 0; j <2*n-l+1; j++) {
//				System.out.print("*  ");
//				
//			}
//			System.out.println();
//			
//		}
		
//		int n=4;
//		for (int i = 0; i < n; i++) {
//			for (int s = 0; s < n-i-1; s++) {
//				System.out.print(" ");
//				
//			}
//			for (int j = 0; j < n; j++) {
//				if(i==0||j==0||i==n-1||j+1==n)
//				System.out.print("*");
//				else
//				{
//					System.out.print(" ");	
//				}
//			}
//			System.out.println();
//			
//		}
//		
		
//		int n=3;int l;
//		for (int i = -n; i <=n; i++) {
//			if(i<0)
//			{
//				l=-i;
//			}
//			else
//			{
//				l=i;
//			}
//			for (int s = 0; s < l; s++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < n-l+1; j++) {
//				if(j==0||l+j==n)
//				{
//				System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//			
//		}
		
		int n=2;int l;
		for (int i = -n; i <=n; i++) {
			if(i<0)
			{
				l=-i;
			}
			else
			{
				l=i;
			}
			for (int s = 0; s < n-l; s++) {
				System.out.print(" ");
				
			}
			for (int j = 0; j < n+l+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
