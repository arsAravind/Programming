package MapPractice;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashmapPractices {

	public static void main(String[] args) {

		// In HashMap keys are getting sorted when we give key as a Integer but not in
		// String
		// But in TreeMap keys are getting sorted in both String and Integer

		HashMap<Integer, String> h1 = new HashMap<Integer, String>();

		h1.put(3, "Aravind");
		h1.put(2, "Ananth");
		h1.put(1, "Vikram");
		h1.put(7, "dsdd");
		h1.put(4, "dsdd");
		h1.put(9, "dsdd");
		h1.put(1, "dsdd");

		// Iterating over the entries to observe the order
		for (Map.Entry entry : h1.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
			System.out.print(entry+"  ");
		}
		System.out.println(h1.entrySet());

		TreeMap<String, String> t1 = new TreeMap<String, String>();

		t1.put("rtyu", "Aravind");
		t1.put("asd", "Ananth");
		t1.put("fgh", "Vikram");
		t1.put("cvb", "dsdd");
		t1.put("xcv", "hjijik");
		t1.put("dfghj", "rrtdtrrd");
		t1.put("yuio", "6yftyfy");

		System.out.println(t1.keySet() + "k");

		for (Map.Entry<String, String> entry : t1.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		TreeMap<String, String> m1 = new TreeMap<String, String>();

		m1.put("rtyu", "Aravind");
		m1.put("asd", "Ananth");
		m1.put("fgh", "Vikram");
		m1.put("cvb", "dsdd");
		m1.put("xcv", "hjijik");
		m1.put("dfghj", "rrtdtrrd");
		m1.put("yuio", "6yftyfy");

		// Iterating over the entries to observe the order
		for (Map.Entry<String, String> entry : m1.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println("--------------------------");
		Map<Integer, String> h2 = new LinkedHashMap<Integer, String>();
		h2.put(3, "Aravind");
		h2.put(2, "Ananth");
		h2.put(1, "Vikram");
		h2.put(7, "dsdd");

//		for (Entry<Integer, String> entry : h2.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		System.out.println(h2);
		System.out.println("--------------------------");

		TreeMap treeMap = new TreeMap<Integer, String>();
		treeMap.put(8, "lknksc");
		treeMap.put(2, "dsdsf");
		treeMap.put(7, "sfdf");
//		for (Entry<Integer, String> en : treeMap.entrySet()) {
//			System.out.println(en.getKey() + "-" + en.getValue());
//		}
		System.out.println(treeMap);
	}

}
