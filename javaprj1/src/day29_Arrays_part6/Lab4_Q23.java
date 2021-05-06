package day29_Arrays_part6;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4_Q23 {
	
	public static void main(String[] args) {
		
		fizzArray(4); 	//→[0, 1, 2, 3]
		fizzArray(1); 	//→[0]
		fizzArray(10); 	//→[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		
	}
	public static void fizzArray(int arraySize) {
		
		int[] array = new int[arraySize];
		for(int i=0; i<array.length; i++) {
			array[i]=i;
		}
		System.out.println(Arrays.toString(array));
	}

}
/*
Write a method that accepts a number and create and prints a new array of length 
number, containing the numbers 0,1,2,...number-1.
fizzArray(4) →[0, 1, 2, 3]
fizzArray(1) →[0]
fizzArray(10) →[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
