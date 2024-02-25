package Java8Feature;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class AccessingElementFromListUsingStreamApi {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ram");
		a1.add("Raj");
		a1.add("Nagesh");

		for (String a : a1) {
			System.out.println(a);
		}

		a1.stream().filter((String s) -> s.startsWith("N")).forEach((s) -> {
			System.out.println(s);
		});

		TreeMap<String, Integer> t1 = new TreeMap();
		t1.put("Arav", 781);
		t1.put("Ram", 8728);
		t1.put("Ananth", 8778);

		t1.forEach((String k, Integer v) -> {
			System.out.println(k + "-" + v);
		});
		System.out.println();
		for (Map.Entry<String, Integer> e : t1.entrySet()) {
			if (e.getKey().startsWith("A")) {
				System.out.println(e);
			}
		}
	}
}
