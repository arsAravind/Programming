package InterviewPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.TreeMap;
import java.util.function.Predicate;

public class AccessingElementFromCollectionPractice {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			a1.add(i);
		}

		a1.stream().filter((Integer a) -> a % 2 == 0).forEach((Integer s) -> {
			System.out.println(s);
		});

		System.out.println("By using refernece variable");
		System.out.println(a1);

		System.out.println("By using for loop");
		for (int i = 0; i < a1.size(); i++) {
			System.out.print(a1.get(i) + " ");
		}

		System.out.println();
		System.out.println("By using for-each loop");
		for (Integer i : a1) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("By using Iterator");
		Iterator<Integer> iterator = a1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println();
		System.out.println("By using ListIterator");
		ListIterator<Integer> listIterator = a1.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}

		System.out.println();
		System.out.println("By using spilterator");
		Spliterator<Integer> spliterator = a1.spliterator();
		spliterator.forEachRemaining(System.out::print);

		System.out.println();
		System.out.println("By using forEach()");
		a1.forEach(System.out::println);

		TreeMap map = new TreeMap<>();
		map.put("a", 12);
		map.put("b", 'a');
		// map.put(3, 'a'); java.lang.ClassCastException
		map.put("c", 12);
		System.out.println(map);
	}

}
