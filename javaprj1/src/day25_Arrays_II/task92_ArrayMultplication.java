package day25_Arrays_II;

import java.util.Arrays;

public class task92_ArrayMultplication {

	public static void main(String[] args) {
		/*
		ØWrite a Java program to store numbers 1 to 10 in an array using data instantiation. 
		
		Then write a for loop to multiply each member of above array by 19, this way you will get table of 19 stored in the above array. 
		Finally write another for loop to print all the array elements. 
		
		ØYou should get the following output:1938577695114133152171190Task-92
		 */
		
		int[] myArray = new int[10];
//		myArray[0] = 1;
//		myArray[1] = 2;
//		myArray[2] = 3;
//		myArray[3] = 4;
//		myArray[4] = 5;
//		myArray[5] = 6;
//		myArray[6] = 7;
//		myArray[7] = 8;
//		myArray[8] = 9;
//		myArray[9] = 10;
		
		
		for(int j = 0; j < myArray.length; j++) {
			myArray[j] = j+1;
		}

		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i] * 19);
		}
		
		System.out.println(Arrays.toString(myArray));

	}

}
