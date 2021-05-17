package week8;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll( Arrays.asList( 1,1,1,1,3,4,5,7,5,3,3,5,3,2,2,2,2,2,2,1,1 ) );
		
		System.out.println(list);
		
		list.removeAll( Arrays.asList(1,2) ); 		//bulk operators accept ONLY collection therefore int 1 and 2 are converted to ArrayList
		
		System.out.println(list);
		
		System.out.println("------------------------------");
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.addAll( Arrays.asList( 1,1,1,1,3,4,5,7,5,3,3,5,3,7,8,2,2,2,2,1,1 ) );
		
		System.out.println(list2);
		
		list2.retainAll( Arrays.asList(1,2) );
		
		System.out.println(list2);
		
		System.out.println("----------------------------");
		
		ArrayList<String> employees = new ArrayList<>();
		employees.addAll( Arrays.asList("Ahmed", "John", "Daniel", "Ahmed", "Jimmy", "Ahmed", "Muhtar") );
		
		System.out.println(employees);
		
		employees.removeAll( Arrays.asList("Ahmed"));
		
		System.out.println(employees);
		
		System.out.println("----------------------------");
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.addAll( Arrays.asList( 1,1,1,1,3,4,5,7,5,3,3,5,3,7,8,2,2,2,2,1,1 ) );
		
		for(int i=0; i<nums.size(); i++) {
			if(nums.get(i) < 5) {
				nums.remove(i);		// DO NOT used the remove method for arraylist in the loop, INSTEAD use removeif - see next.
			}
		}
		System.out.println(nums); //Incorrect output: [1, 1, 4, 5, 7, 5, 3, 5, 7, 8, 2, 2, 1]
		
		System.out.println("------------------------------");
		
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.addAll( Arrays.asList( 1,1,1,1,3,4,5,7,5,3,3,5,3,7,8,2,2,2,2,1,1 ) );
		
		nums2.removeIf(p -> p<5);
		System.out.println(nums2); // Correct output. For conditional statement use removeif
		
		
		
	}

}
