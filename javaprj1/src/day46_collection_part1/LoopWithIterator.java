package day46_collection_part1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopWithIterator {
	
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(50);
		nums.add(543);
		nums.add(1150);
		nums.add(550);
		nums.add(570);
		nums.add(93);
		nums.add(5000);
		nums.add(950);
		
		//create Iterator object
		Iterator<Integer> it = nums.iterator();			//whenever creating object, we are putting pointer therefore re-running any loop requires new object creation
		
		//call hasNext method
		//hasNext return true if there is still next value
		//returns false when it reaches the end or empty
		
		System.out.println("it.hasNext() : " + it.hasNext());
		System.out.println("it.next() : " + it.next()); 		//pointer is here: 50
		System.out.println("it.next() : " + it.next());			//pointer is here: 543
		System.out.println("it.next() : " + it.next());			//pointer is here: 1150
		
		while(it.hasNext()) {
			System.out.println(it.next());						//pointer starts from 550
		}
		
		System.out.println("it.hasNext() : " + it.hasNext());
//		System.out.println("it.next() : " + it.next());				//NoSuchElementException
		
		//to re-run loop, we must create new object again
		Iterator<Integer> it2 = nums.iterator();
		
		//what is the difference between for each loop and iterator?
		// we can remove objects while looping
		
		while(it2.hasNext()) {
			int val = it2.next();
			if(val>1000) {
				it2.remove();
			}
		}
		
		System.out.println(nums.toString());
	
		
		List<String> cities = new ArrayList<>();
		cities.add("NY");
		cities.add("BS");
		cities.add("VR");
		cities.add("DC");
		
		//Below loop outputs ConcurrentModificationException proving that we cannot remove object while looping with for each
		for(String city: cities) {
			if(city.equals("BS")) {
				cities.remove(city);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
