package day48_collection_part3;

import java.util.*;

public class MapExample {
	
	public static void main(String[] args) {
		
		List<Integer> items2 = new ArrayList<>();
		items2.add(10);									// add() method of collection doesnt exist in map as Map is not interfaced from collection
		System.out.println(items2.get(0));
		
//		Map<K, V> items = new HashMap<>();
		Map<String, Double> items = new HashMap<>();
		items.put("Apple", 3.49);						// same as add() method in collection
		items.put("Flower", 10.99);
		items.put("Eggs", 4.99);
		items.put("Milk", 6.0);
		items.put("Cherry", 5.99);
		items.put("Apple", 5.49);
		
		System.out.println(items.toString());

		System.out.println(items.size());
		
		System.out.println(items.isEmpty());
		
		System.out.println(items.get("Apple"));
		System.out.println(items.get("Flower"));
		
		items.remove("Apple");
		System.out.println(items.toString());
		
		System.out.println("Is Apple there? " + items.containsKey("Apple"));
		System.out.println("Is Flower there? " + items.containsKey("Flower"));
		
		items.replace("Eggs", 3.55);
		System.out.println("Price of Eggs: " + items.get("Eggs"));
		items.put("Milk", 5.99);
		System.out.println("Price of Milk: " + items.get("Milk"));
		
		//increase price of cherries by $2
		items.replace("Cherry", items.get("Cherry") + 2);
		System.out.println("Price of Cherry: " + items.get("Cherry"));
		
		
		
		
		
		
		
	}

}
