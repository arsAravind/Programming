package InterviewPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class AccessingElementsFromCollection {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		// adding the data into collection or object
		for (int i = 1; i < 6; i++) {
			a1.add(i);
		}
		System.out.println("Using ref variable toString()");
		// It'll automatically call toString();
		System.out.println(a1);

		System.out.println("Using for loop");
		// for loop-using size() and get()
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		// for-each loop
		System.out.println("Using foreach loop");
		for (Integer integer : a1) {
			System.out.print(integer + " ");
		}
		System.out.println();
		System.out.println("Using Iterator");
		// By using Iterataor-iterator(),hasNext(),next() method
	Iterator<Integer> iter = a1.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next());
		}
		System.out.println();
		System.out.println("Using ListIterator");
		// By using ListIterator-listIterataor(),hasNext(),Next()
		ListIterator lit = a1.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		System.out.println("Using Spliterator");
		// by using Spliterator-spliterator(),forEachRemaining
		Spliterator sp = a1.spliterator();
		sp.forEachRemaining(System.out::println);

		System.out.println("Using forEach()");
		// by using foreach() method
		a1.forEach(System.out::println);
	}
}
