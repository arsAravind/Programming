package InterviewPrograms;

public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {

		int a = 12;
		int b = 21;
		System.out.println("Before swapping");
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		a = a + b;
		b = a - b;// 33-21=12
		a = a - b;// 33-12=21
		System.out.println("After swapping");
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}
}
