package InterviewPrograms;

public class MissingNumber {
	  
 public static void main(String[] args) {
//		 
//		int[] arr= {1,3,4,5,6,7,8};xx
//		int n=arr.length+1;
//		int consecSxum=n*(n+1)/2;
//		int sum=0;
//		for (int i = 0; i < arr.length; i++) {
//			sum=sum+arr[i];
//		}
//		int missingNumber=consecSum-sum;
//		System.out.println(missingNumber);	
		
		int[] arr= {1,2,3,4,5,7,8};
		
		int total=arr.length+1; //8
		int conSum=total*(total+1)/2;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		int missing=conSum-sum;
		System.out.println("Missing number is "+missing);
	}
}
