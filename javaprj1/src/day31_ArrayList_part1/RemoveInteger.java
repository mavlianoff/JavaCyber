package day31_ArrayList_part1;

import java.util.ArrayList;

public class RemoveInteger {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println(nums.size()); // 0 		//IMPORTANT: size and capacity() are different concepts
		System.out.println(nums.isEmpty());
		
		nums.add(5);
		nums.add(45);
		nums.add(56);
		nums.add(78);
		nums.add(43);
		nums.add(52);
		System.out.println(nums.toString());
		
		nums.remove(5);						// => removing indexed element
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(5);
		Integer n2 = Integer.valueOf(5);
		nums.remove(n1);					// => removing object
		nums.remove(new Integer(45));		// => removing objects
		System.out.println(nums);
		
		
		
	}

}
