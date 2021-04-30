package day24_Arrays_I;

import java.util.Random;

public class task91_RandomArray {

	public static void main(String[] args) {
		/*
		ØCreate an array with 10 elements
		ØInitialize each array element with random values between 0 and 100 but less than 100
		ØPrint each array element
		 */
		
		Random rn = new Random();
		int n1 = rn.nextInt(100);
		int n2 = rn.nextInt(100);
		int n3 = rn.nextInt(100);
		int n4 = rn.nextInt(100);
		int n5 = rn.nextInt(100);
		int n6 = rn.nextInt(100);
		int n7 = rn.nextInt(100);
		int n8 = rn.nextInt(100);
		int n9 = rn.nextInt(100);
		int n10 = rn.nextInt(100);
		
		int[] myArray = {n1, n2, n3, n4, n5, n6, n7, n8, n9, n10};
		for(int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}

	}

}
