package day28_Arrays_part5;

import java.util.Arrays;

public class Lab4_Q11 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3};  		//= > [1,2,0]
		int[] y = {2,3,5};  		//= > [2,0,5]
		int[] z = {1,2,1};  		//= > [1,2,1]
		int[] a = {11,2,13,3,2}; 	//= > [11,2,13,3,2]
		
		System.out.println(Arrays.toString(setFollow23(x)));
		System.out.println(Arrays.toString(setFollow23(y)));
		System.out.println(Arrays.toString(setFollow23(z)));
		System.out.println(Arrays.toString(setFollow23(a)));
		
	}
	
	public static int[] setFollow23(int[] array) {
		
//		int[] newArray = new int[array.length];
		
		for(int i=0; i<array.length-1; i++) {
			if(array[i]==2 && array[i+1]==3) {
				array[i+1]=0;
			}
		}
		return array;
	}

}
/*
Write a method that accepts an array, and if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. 
Print the changed Array
int[] x = {1,2,3}  = > [1,2,0]
int[] x = {2,3,5}  = > [2,0,5]
int[] x = {1,2,1}  = > [1,2,1]
int[] x = {11,2,13,3,2}  = > [11,2,13,3,2]
 */
