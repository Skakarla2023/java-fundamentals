package javaprograms;

import java.util.*;

class Hashmap3 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Satwika", "Kakarla");
		map.put("Sandeep", "Kakarla");
		map.put("Vaishnavi", "Kakarla");
		map.put("Kethana", "Kakarla");
		System.out.println(map.getOrDefault("Arwin", "Unknown"));
		System.out.println(map.getOrDefault("Satwika", "Unknown"));
	}
}
