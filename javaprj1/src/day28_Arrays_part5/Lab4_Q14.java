package day28_Arrays_part5;

import java.util.Arrays;

public class Lab4_Q14 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3};    
		int[] y={3,4,4};  
		//Result = > [1,2,3,4]
		mergeArrays(x,y);
		
		int[] xx = {4,4, 4};    
		int[] yy = {2,2};
		// Result = > [4,4,2,2]
		mergeArrays(xx,yy);
		
		int[] xxx = {9,2};    
		int[] yyy = {3,4,5};  
		//Result = > [9,2,3,4]
		mergeArrays(xxx,yyy);
	}
	public static void mergeArrays(int[] arr1, int[]arr2) {
		
		int[] newArray = new int[arr1.length + arr2.length];
		
		for(int i=0; i<arr1.length; i++) {
			newArray[i] = arr1[i];
		}
		int start=0;		
		for(int j=arr1.length; j<newArray.length; j++) {
			newArray[j] = arr2[start];
			start++;
		}
		
		System.out.println(Arrays.toString(newArray));
	}

}
/*
Write a method that accepts 2 arrays and prints a new array containing all their elements
int[] x = {1,2}    int[]y={3,4}  = > [1,2,3,4]
int[] x = {4,4}    int[] y = {2,2}  = > [4,4,2,2]
int[] x = {9,2}    int[] y = {3,4}  = > [9,2,3,4]
 */
