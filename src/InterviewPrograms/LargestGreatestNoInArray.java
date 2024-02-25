package InterviewPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LargestGreatestNoInArray {
	public static void main(String[] args) {
		int[] arr = { 12, 334, 45, 56, 1, 2, };
		int large = arr[0];
		int secLarge = arr[1];
		int small = arr[0];
		int secSmall = arr[1];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {

				secLarge = large;
				large = arr[i];
			} else if (arr[i] > secSmall) {
				secLarge = arr[i];
			} else if (arr[i] < small) {
				secSmall = small;
				small = arr[i];
			} else if (arr[i] < secSmall) {
				secSmall = arr[i];
			}

		}
		System.out.println("Largest " + large);
		System.out.println("Second Largest " + secLarge);
		System.out.println("Small " + small);
		System.out.println("Second small " + secSmall);

		
		
		HashMap map =new HashMap();
		map.put(1, "Ara");
		map.put(2, 'a');
		map.put(2, 22);
		map.put(3, "Ara");
		System.out.println(map);
	}
}
