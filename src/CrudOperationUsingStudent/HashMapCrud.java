package CrudOperationUsingStudent;

import java.util.HashMap;
import java.util.Set;

public class HashMapCrud {

	public static void main(String[] args) {

		HashMap h1 = new HashMap();
		h1.put(1, "Ram");
		h1.put(2, "Raj");
		h1.put(3, "Krishna");
		h1.put(4, "Ananth");
		h1.put(5, "Jeeva");

		Set entrySet = h1.entrySet();
		System.out.println(entrySet);

		h1.remove(3);
		System.out.println(h1);

		h1.put(3, "Amir");
		System.out.println(h1);
	}

}
