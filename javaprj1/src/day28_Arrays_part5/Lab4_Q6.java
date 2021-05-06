package day28_Arrays_part5;

import java.util.Arrays;

public class Lab4_Q6 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {11,5,9};
		int[] a = {110,5,98,0,1200,11,-4};
		
		maxArraySet(x);
		maxArraySet(y);
		maxArraySet(a);
		
	}
	
	public static void maxArraySet(int[] array) {
		int max = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
//		int max = 0;
//		for(int each: array) {
//			if(each > max) {
//				max = each;
//			}
//		}
		
		for(int i=0; i<array.length; i++) {
			array[i] = max;
		}
		System.out.println(Arrays.toString(array));
	}

}
/*
Write a method that accepts an array and figure out which is greatest element in the array, 
and set all the other elements to be that value. 
Print the changed array.
int[] x = {1,2,3}; = > [3,3,3]
int[] y = {11,5,9}; = > [11,11,11]
int[] a = {110,5,98,0,1200,11,-4}; = > [1200,1200,1200,1200,1200,1200,1200]
 */
