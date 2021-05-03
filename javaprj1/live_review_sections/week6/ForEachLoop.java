package week6;

import utilities.MathUtility;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40};
		
		System.out.println("=========FOR LOOP========");
		//FOR LOOP
		for(int i=0; i<array.length; i++) {				// Control over many componets of for loop: initialization - bound - iteration
			System.out.println(array[i]);				
		}
		
		System.out.println("======FOR EACH LOOP======");
		//FOR EACH LOOP
		for(int each: array) {							// access to element only, not index
			System.out.println(each);
		}
		
		
		System.out.println("==FOR EACH LOOP: MAX-MIN==");
		int[] numbers = {10, 20, 30, 40};
		int max = numbers[0];
		int min = numbers[0];
		
		for(int each: numbers) {
			max = MathUtility.max(each, max);
			min = MathUtility.min(each, min);
		}
		System.out.println("Max number is: " + max);
		System.out.println("Min number is: " + min);
		
		System.out.println("=FOR EACH LOOP: SUM-AVERAGE=");
		int[] nums = {10, 20, 30, 40, 50, 60, 70, 80};
		
		int sum = 0;
		int average = 0;
		
		for(int each: nums) {
			sum += each;
			average = sum/nums.length;
		}
		System.out.println("Sum of all integers: " + sum);
		System.out.println("Avg of all integers: " + average);
		
		
		
		
		
	}

}
