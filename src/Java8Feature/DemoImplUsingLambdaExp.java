package Java8Feature;

public class DemoImplUsingLambdaExp {
	public static void main(String[] args) {

		Demo d1 = () -> {
			System.out.println("Hi how are you");
		};
		d1.m1();
	}
}
