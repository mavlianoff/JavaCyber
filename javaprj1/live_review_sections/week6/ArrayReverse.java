package week6;

import java.util.Arrays;

import utilities.ArraysUtility;

public class ArrayReverse {
	
	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40}; //Result: {40, 30, 20, 10}
		int[] result = new int[array.length]; // {0, 0, 0, 0}
		
		//manual solution: getting array element and assigning to result
		result[0] = array[3];
		result[1] = array[2];
		result[2] = array[1];
		result[3] = array[0];
		System.out.println("Manual array reversal:    " + Arrays.toString(result));
		
		//loop solution-1
		for(int i = 0, j = array.length-1; i < result.length; i++, j--) {
			result[i] = array[j];
		}
		System.out.println("Loop reversal solution-1: " + Arrays.toString(result));
		
		//loop solution-2
		for(int i=0; i< result.length; i++) {
			result[i] = array[(array.length-1) - i];
		}
		
		System.out.println("Loop resersal solution-2: " + Arrays.toString(result));
		

		
		//Reverse Array practice
		int[] array1 = {50, 75, 90, 95};
		      array1 = ArraysUtility.reverse(array1);
		System.out.println("Reverse utility solution: " + Arrays.toString(array1));
		
		double[] array2 = {11.2, 4.5, 3.7};
		         array2 = ArraysUtility.reverse(array2);
		System.out.println("Reverse utility solution: " + Arrays.toString(array2));
		
	}

}
