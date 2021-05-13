package day32_ArrayList_part2;

import java.util.ArrayList;

public class EqualMethod {
	
	public static void main(String[] args) {
		
		ArrayList<String> bff1 = new ArrayList<>();
		ArrayList<String> bff2 = new ArrayList<>();
		
		bff1.add("Asan");
		bff1.add("Uson");
		bff1.add("Altyn");
		bff1.add("Kumush");
		
		bff2.add("Asan");
		bff2.add("Uson");
		bff2.add("Altyn");
		bff2.add("Kumush");
		
		System.out.println(bff1);
		System.out.println(bff2);
		
		if(bff1.equals(bff2)) {
			System.out.println("Same friends!");
		}else {
			System.out.println("Different friends!");
		}
		
		System.out.println(bff1 == bff2); //FALSE: reason is we are comparing reference of object which gives two different object
		
		
	}
}
