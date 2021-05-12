package day31_ArrayList;

import java.util.ArrayList;

public class Cities {
	
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());
		
		System.out.println("==================");
		//Print each city by each loop separated by space
		for(String each: cities) {
			System.out.println(each + " ");
		}
		
		System.out.println("==================");
		//Print each city by using for-iterator loop
		for(int i=0; i<cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		
		System.out.println("==================");
		cities.remove("Baku");
		cities.remove("New York");
		System.out.println(cities.toString());
		
		System.out.println("==================");
		cities.add(0, "Bishkek");
		cities.add(1, "Istanbul");
		cities.add(2, "Ankara");
		System.out.println(cities.toString());
		
		System.out.println("==================");
		int idx = cities.indexOf("Bishkek");
		System.out.println(idx);
		System.out.println(cities.indexOf("Almaty")); // -1
		
		System.out.println("==================");
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(empty);
		
		System.out.println("==================");
		
		
	}
}
