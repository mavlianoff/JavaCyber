package day31_ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		
		// Languages
		// Print size arraylist
		// read couple of elements
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("ENGLISH");
		languages.add("Turkish");
		languages.add("Russian");
		languages.add("German");
		languages.add("French");

		
		System.out.println("Number of values: " + languages.size());
		System.out.println(languages.toString());
		
		languages.add("KYRGYZ");
		System.out.println(languages.toString());
		
		languages.remove(0);
		System.out.println(languages.toString());
		
		System.out.println(languages.get(0));
		System.out.println(languages.get(2));
		System.out.println(languages.get(4));
		
		
	}
}
