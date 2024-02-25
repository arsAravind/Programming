package InterviewPrograms;

public class JoinTheString {

	public static void main(String[] args) {
		
		String data1="HI";
		String data2="Hello";
		String data3="Bye";
		
		String join = String.join(" ",data1,data2,data3);
		System.out.print(join);
	}

}
