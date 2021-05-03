package week6;

import utilities.ArraysUtility;

public class FindingMaxMinNumber {
	
	public static void main(String[] args) {
		//Find max number in array:
		int[] numbers = {23,45,34,67,6,34};
		
		//SOLUTION-1
		int max = 0;
		
		for(int each: numbers) {
			if(each > max) {
				max = each;
			}
		}
		System.out.println("Solution-1 answer: " + max);
		
		
		//SOLUTION-2
		int max1 = numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] > max1) {
				max1 = numbers[i];
			}
				
		}
		System.out.println("Solution-2 answer: " + max1);
		
		
		//SOLUTION-3
		int max2 = ArraysUtility.max(numbers);
		System.out.println("Solution-2 answer: " + max2);
		
		//MINIMUM NUMBER with numbers[]
		
		int min = ArraysUtility.min(numbers);
		System.out.println("Minimum of numbers: " + min);
		
		//MINIMUM Numbers with double data
		double[] decimals = {2.3, 5.6, 3.4, 6.7, 2.3};
		double min1 = ArraysUtility.min(decimals);
		System.out.println("Minimum of double: " + min1);
		
	}

}
