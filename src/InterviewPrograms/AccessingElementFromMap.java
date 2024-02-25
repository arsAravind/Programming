package InterviewPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

public class AccessingElementFromMap {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ananthan");
		map.put(2, "Jeeva");
		map.put(3, "KArthi");
		System.out.println(map.entrySet());
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if (entry.getValue().startsWith("A")) {
				System.out.println(entry.getKey() + "-" + entry.getValue());
			}
		}
		map.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});

	}
}
