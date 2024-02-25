package Programs;

public class SearchingElementArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int find = 2;
		int count = 0; // 1,2,3,4,5,6
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				System.out.println("Element found");
				break;
			}
			count++;
		}
		if (count == arr.length) {
			System.out.println("Not found");
		}
	}

}
