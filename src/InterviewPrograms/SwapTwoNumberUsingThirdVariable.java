package InterviewPrograms;

public class SwapTwoNumberUsingThirdVariable {

	public static void main(String[] args) {

		int a = 20;
		int b = 30;
		System.out.println("Before Swapping");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

	}

}
