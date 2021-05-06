package day28_Arrays_part5;

import java.util.Arrays;

public class Lab4_Q5 {
	
	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {17,12,10,8};
		int[] a = {7,0,0};
		
		rotatedLeft(x);
		rotatedLeft(y);
		rotatedLeft(a);
		
	}
	
	public static void rotatedLeft(int[] array) {
		
		int[] rotatedArray = new int[array.length];
		for(int i=1; i<array.length; i++) {
			rotatedArray[i-1] = array[i];
			rotatedArray[array.length-1] = array[0];
		}
		rotatedArray[array.length-1] = array[0];
		System.out.println(Arrays.toString(rotatedArray));
		
	}

}
/*
Write a method that accepts an array and prints an array with the elements"rotated left”
int[] x = {1,2,3};  = > [2,3,1]
int[] y = {17,12,10,8}; = > [12,10,8,17]
int[] a = {7,0,0}; = > [0,0,7]
 */
