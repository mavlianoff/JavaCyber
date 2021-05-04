package day27_Arrays_part4;

import java.util.Arrays;

public class Lab4_Q2 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {1,2,3,1};
		int[] z = {1,2,1};
		int[] k = {1};
		
		firstLastLength(x);
		firstLastLength(y);
		firstLastLength(z);
		firstLastLength(k);
		
	}
	
	public static String firstLastLength(int[] array) {
		
		if(!(array.length>1)) {
			return "Not valid array";
		}
		

		if(array[0] == array[array.length-1]) {
			return "true"; 
		}else {
			return "false";
		}
		
	}

}
		/*
		Write a method that accepts an array and check the length of the array first.
		If the length is more than one, check if the first element and last elementare equal. 
		if it is print true, if not print false.
		If the length is not more than 1, print not valid an array
		
		int[] x = {1,2,3}; = > false
		int[] y = {1,2,3,1}; = > true
		int[] z = {1,2,1}; = > true
		int[] k = {1}; = > not a valid array 
		 */
