package week8;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice3 {
	
	public static void main(String[] args) {
		//Task: remove duplicates and print non-duplicate elements: [10,20]
		int[] numbers = {10,20, 20, 10, 10, 10, 20};
		//Question: do we know how many elements will be non-duplicate, i.e. what is array size?
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//METHOD 1:
		for(int each: numbers) {
			if(list.contains(each)) {
				continue;
			}
			list.add(each);
		}
		
		//METHOD 2:
		for(int each: numbers) {
			if( !(list.contains(each)) ) {
				list.add(each);
			}
		}
		
		System.out.println(list);
		
		System.out.println("=========================");
		
//		bulk operations: only accepts collection type
//			addAll()
//			removeAll
//			retainAll
//			containsAll
		
//		Arrays.asList(): converts array(non-primitive) to collection type
		
		ArrayList<String> names = new ArrayList<>();
		names.addAll( Arrays.asList("Zeziha", "Akhtam", "Ahmet") );
		
		names.set(1, "Yasin");
		names.add(1, "Zina");
		System.out.println(names);
		System.out.println(names.get(1));
		
	}

}
