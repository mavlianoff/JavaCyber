package day31_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
	
	public static void main(String[] args) {
		
		//Creating ArrayList
		
		ArrayList<String> names = new ArrayList<>();
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		//Assigning values to arraylist
		
		names.add("Erika");
		names.add("Kinga");
		names.add("Sanz");
		names.add("Toli");
		names.add("Urbano");
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		nums.add(new Integer("100"));
		
		//Reading ArrayList
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Nums count: " + nums.size());
		
		
		
	}
	
}
