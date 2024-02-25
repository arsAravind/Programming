package InterviewPrograms;

public class MergeTwoArray {

	public static void main(String[] args) {

		int[] a = { 16, 11, 34, 22 };
		int[] b = { 11, 16 };
		int a1 = a.length;
		int c1 = a.length + b.length;

		int[] c = new int[c1]; // {0,0,0,0,0,0,0}
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		// {16,12,34,22,0,0}

		for (int i = 0; i < b.length; i++) {
			c[a.length+i] = b[i];
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
//			for (int j = i + 1; j < c.length; j++) {
//				if (c[i] == c[j]) {
//					c[j] = '0';
//				}
			}
		}
//		for (int i = 0; i < c.length; i++) {
//			if (c[i] != '0') {
//				// System.out.println(c[i]);
//			}
//
//		}
		
//		  int a[] = { 30, 25, 40 }; 
//	        // second array 
//	        int b[] = { 45, 50, 55, 60, 65 }; 
//	  
//	        // determining length of first array 
//	        int a1 = a.length; 
//	        // determining length of second array 
//	        int b1 = b.length; 
//	  
//	        // resultant array size 
//	        int c1 = a1 + b1; 
//	  
//	        // Creating a new array 
//	        int[] c = new int[c1]; 
//	  
//	        // Loop to store the elements of first 
//	        // array into resultant array 
//	        for (int i = 0; i < a1; i = i + 1) { 
//	            // Storing the elements in  
//	            // the resultant array 
//	            c[i] = a[i]; 
//	        } 
//	  
//	        // Loop to concat the elements of second  
//	        // array into resultant array 
//	        for (int i = 0; i < b1; i = i + 1) { 
//	  
//	            // Storing the elements in the  
//	            // resultant array 
//	            c[a1 + i] = b[i]; 
//	        } 
//	  
//	        // Loop to print the elements of  
//	        // resultant array after merging 
//	        for (int i = 0; i < c1; i = i + 1) { 
//	              
//	            // print the element 
//	            System.out.println(c[i]); 
//	        } 

	}

