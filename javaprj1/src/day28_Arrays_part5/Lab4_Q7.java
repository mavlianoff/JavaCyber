package day28_Arrays_part5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab4_Q7 {
	
	public static void main(String[] args) {
		int[] x = {1,2,3};  
		int[] y = {};              // [1,3]
		int[] a = {7,4,6,2};
		int[] b = {};              // [7,2]
		
		printSecond(x, y);
		printSecond(a, b);
		
	}
	public static void printSecond(int[] array1, int[] array2) {
		array2 = new int[2];
		
		array2[0] = array1[0];
		array2[1] = array1[array1.length-1];
		
		System.out.println(Arrays.toString(array2));
		
	}

}
/*
Write a method that accepts 2 arrays and prints the second array containing the first and last elements from the first array.
int[] x = {1,2,3};  
int[] y = {};              = > [1,3]
int[] a = {7,4,6,2};
int[] b = {};               = > [7,2]
 */
