package InterviewPrograms;

public class ArraysDoubts {
	public static void main(String[] args) {

//		int[] arr= {1,2,3,45,6};
//		int t=arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			//
//			arr[i-1]=arr[i];
//		}
//		arr[arr.length-1]=t;
//		for(int i:arr)
//		{
//			System.out.println(i);
//		}

//		int[] arr = { 1, 2, 3, 4, 5 };
//
//		for (int j = 0; j < 3; j++) {
//			int t = arr[arr.length - 1];
//			for (int i = arr.length - 1; i > 0; i--) {
//				arr[i] = arr[i - 1];
//			}
//			arr[0] = t;
//		}
//		for (int i : arr) {
//			System.out.println(i);
//		}

		String[] str = { "Ram", "Rahul", "Raj" };
		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			for (int i1 = s.length() - 1; i1 >= 0; i1--) {
				System.out.print(s.charAt(i1));
			}
			System.out.print(" ");

		}

	}

}
