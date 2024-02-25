package InterviewPrograms;

import java.util.ArrayList;

public class CRUDoperationUsingArrayList {
	public static void main(String[] args) {

		// Create
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// Read
		System.out.println("Read " + list);

		// Update
		list.set(0, 111);
		System.out.println(list);

		// Delete
		list.remove(1);
		System.out.println(list);

	}

}
