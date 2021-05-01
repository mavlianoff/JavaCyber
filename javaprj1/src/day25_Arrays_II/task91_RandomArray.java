package day25_Arrays_II;

import java.util.Random;

public class task91_RandomArray {

	public static void main(String[] args) {
		/*
		ØCreate an array with 10 elements
		ØInitialize each array element with random values between 0 and 100 but less than 100
		ØPrint each array element
		 */
		
		Random rn = new Random();
		int[] numbers = new int[10];
		numbers[0] = rn.nextInt(100);
		numbers[1] = rn.nextInt(100);
		numbers[2] = rn.nextInt(100);
		numbers[3] = rn.nextInt(100);
		numbers[4] = rn.nextInt(100);
		numbers[5] = rn.nextInt(100);
		numbers[6] = rn.nextInt(100);
		numbers[7] = rn.nextInt(100);
		numbers[8] = rn.nextInt(100);
		numbers[9] = rn.nextInt(100);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
