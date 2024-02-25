package InterviewPrograms;

public class DecimalToBinary {

	public static void main(String[] args) {

		int n = 10;
		String binary = "";
		while (n > 0) {
			int temp = n % 2;
			binary = temp + binary;
			n = n / 2;

			
		}
		System.out.println(binary);

		System.out.println(Integer.toBinaryString(10));

		// Convert binary to decimal

		String binary1 = "1010";
		System.out.println(Integer.parseInt(binary1, 2));

	}
}
