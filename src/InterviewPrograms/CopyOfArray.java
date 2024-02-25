package InterviewPrograms;

public class CopyOfArray {

	public static void main(String[] args) {
		
		int[] arr = { 1, 23, 4, 546, 6 };
		int[] b = new int[arr.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = arr[i];
		}
		for (int i : b) {
			System.out.println(i);
		}
//		for(datatype variable : ArraysRefvariable)
//		{
//			
//		}
	}

}
