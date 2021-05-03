package week6;

import java.util.Arrays;

public class ArrayPractice1 {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[4];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		
		System.out.println(numbers); 					// [I@182decdb
		System.out.println(Arrays.toString(numbers)); 	// [10, 20, 30, 40]
		
		numbers = new int[6]; // this is new set of assignment to 'numbers' leading to garbage collection of previous array set numbers[4]
		
		System.out.println(numbers);					// [I@7637f22
		System.out.println(Arrays.toString(numbers));	// [0, 0, 0, 0, 0, 0] ==> default values.
		
	}
}
