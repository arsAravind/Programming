package InterviewPrograms;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// Sum of the cube of each digit=Gn number
		int n = 153;// 15,1
		int sum = 0;// 27,152
		int copy = n;// 153
		while (n > 0)// 153>0,15>0,1>0,0>0
		{
			int t = n % 10; // 3,5,1
			int cube = t * t * t;// 27,125,1
			sum = sum + cube;// 0+9=27,125+27=152,152+1=153
			n = n / 10; // 1/10=0
		}
		if (copy == sum) {
			System.out.println("Gn no is Armstrong number");
		} else {
			System.out.println("Gn no is not a armstrong number");
		}
	}
}
