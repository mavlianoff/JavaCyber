package day28_Arrays_part5;

import java.util.Arrays;

public class Lab4_Q15 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3,4}; 	// = > [4,2,3,1]
		int[] y = {1,2,3};	 	//  = > [3,2,1]
		int[] z= {8,6,7,9,5};	// = > [5,6,7,9,8]
		
		System.out.println(Arrays.toString(swapFirstLast(x)));
		System.out.println(Arrays.toString(swapFirstLast(y)));
		System.out.println(Arrays.toString(swapFirstLast(z)));
		
	}
	public static int[] swapFirstLast(int[] arr) {

		int temp = 0;
		temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		return arr;
		
//		int[] newArr = new int[arr.length];
//		newArr = arr;
//		newArr[0] = arr[arr.length-1];
//		newArr[newArr.length-1] = arr[0];
//		return newArr;
				
	}

}
/*
Write a method that accepts an array and swap the first and last element in the array.
Print the modified array
int[] x = {1,2,3,4} = > [4,2,3,1]
int[] y = {1,2,3}  = > [3,2,1]
int[] z= {8,6,7,9,5} = > [5,6,7,9,8]
 */
