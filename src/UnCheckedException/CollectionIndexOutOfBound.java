package UnCheckedException;

import java.util.ArrayList;

public class CollectionIndexOutOfBound {
	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);

		System.out.println(a1.get(5));
	}
}
