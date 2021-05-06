package day28_Arrays_part5;

import java.util.Arrays;

public class Lab4_Q9 {
	
	public static void main(String[] args) {
		
		int[] x = {4,5,6};  //= > [0,0,0,0,0,6]
		System.out.println(Arrays.toString(doubleLengthArray(x)));
		
		int[] y = {4,5,6,7,8,9};  //= > [0,0,0,0,0,0,0,0,9]
		System.out.println(Arrays.toString(doubleLengthArray(y)));
		
	}
	public static int[] doubleLengthArray(int[] array) {
		int[] newArray = new int[2*array.length];
		newArray[newArray.length-1] = array[array.length-1];
		return newArray;
	}

}
/*
Write a method that accepts an array and prints a new array with double the length 
where its last element is the same as the original array,
int[] x = {4,5,6};  = > [0,0,0,0,0,6]
 */
