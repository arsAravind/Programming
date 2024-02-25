package Programs;

public class MissingNumber {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,5,6,7,8,9};
		int n=arr.length+1;//arr total +1 bcoz we have to find 1 missing number
		int consSum=n*(n+1)/2; //total sum along with missing no
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i]; //sum of element present  in array
		}
		int missing=consSum-sum;
		System.out.println(missing);
	}
}
