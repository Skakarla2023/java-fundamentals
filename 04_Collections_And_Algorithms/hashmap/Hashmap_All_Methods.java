package javaprograms;

import java.util.*;

public class Hashmap_All_Methods {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();

		// put() method
		map.put("Satwika", "Kakarla");
		map.put("Sandeep", "Kakarla");
		map.put("Vaishnavi", "Kakarla");
		map.put("Kethana", "Kakarla");
		System.out.println(map);

		// get() method
		System.out.println(map.get("Kethana"));

		// keySet() method
		for (String i : map.keySet()) {
			System.out.println("Key:" + i);
		}

		// values() method
		for (String i : map.values()) {
			System.out.println("Value:" + i);
		}

		// isEmpty()
		System.out.println(map.isEmpty());

		// containsKey()
		System.out.println(map.containsKey("Kethana"));

		// containsValue()
		System.out.println(map.containsValue("Kakarla"));

		// remove
		map.remove("Vaishnavi");
		System.out.println(map);

		// getOrDefault
		System.out.println(map.getOrDefault("Satwika", "None"));
		System.out.println(map.getOrDefault("Arwin", "None"));

		// clone()
		HashMap<String, String> map2 = (HashMap) map.clone();
		System.out.println(map2);

	}

}
