package utilities;

import java.util.Arrays;

public class ArraysUtility {
	
	//returns the maximum number for int data
	public static int max(int[] array) {
		
		int max = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
				
		}
		return max;
	}
	
	//returns the maximum number for double data
	public static double max(double[] array) {
		
		double max = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
				
		}
		return max;
	}	

	//returns the mimimum number for int data
	public static int min(int[] array) {
			
		int min = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
					
		}
		return min;
	}
		
	//returns the minimum number for double data
	public static double min(double[] array) {
			
		double min = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
					
		}
		return min;
			
	}
		
	//reverses any given integer array
	public static int[] reverse(int[] array) {
		int[] result = new int[array.length];
		for(int i = 0, j = array.length-1; i < result.length; i++, j--) {
			result[i] = array[j];
		}
		return result;
	} 
	
	//reverses any given double array
	public static double[] reverse(double[] array) {
		double[] result = new double[array.length];
		for(int i = 0, j = array.length-1; i < result.length; i++, j--) {
			result[i] = array[j];
		}
		return result;
	} 
	
	//reverses any given char array
	public static char[] reverse(char[] array) {
		char[] result = new char[array.length];
		for(int i = 0, j = array.length-1; i < result.length; i++, j--) {
			result[i] = array[j];
		}
		return result;
	} 
	
	//reverses any given String array
	public static String[] reverse(String[] array) {
		String[] result = new String[array.length];
		for(int i = 0, j = array.length-1; i < result.length; i++, j--) {
			result[i] = array[j];
		}
		return result;
	} 
	
	//merges two arrays of int[]
	public static int[] merge(int[] arr1, int[] arr2) {
		
		int[] arr3 = new int[arr1.length + arr2.length];
		
		int i=0;
		
		for(int each: arr1) {
			arr3[i++] = each;  //IMPORTANT: POST-INCREMENT
		}
		
		for(int each: arr2) {
			arr3[i++] = each;  //IMPORTANT: POST-INCREMENT
		}
		
		return arr3;
	}	
	
	//merges two arrays of double[]
	public static double[] merge(double[] arr1, double[] arr2) {
			
		double[] arr3 = new double[arr1.length + arr2.length];
			
		int i=0;
			
		for(double each: arr1) {
			arr3[i++] = each;  //IMPORTANT: POST-INCREMENT
		}
			
		for(double each: arr2) {
			arr3[i++] = each;  //IMPORTANT: POST-INCREMENT
		}
			
		return arr3;
		}
		
	//merges two arrays of char[]
	public static char[] merge(char[] arr1, char[] arr2) {
					
		char[] arr3 = new char[arr1.length + arr2.length];
					
		int i=0;
					
		for(char each: arr1) {
			arr3[i++] = each;  //IMPORTANT: POST-INCREMENT
		}
					
		for(char each: arr2) {
			arr3[i++] = each;  //IMPORTANT: POST-INCREMENT
		}
					
		return arr3;
	}
	
	//merges two arrays of String[]
	public static String[] merge(String[] arr1, String[] arr2) {
					
		String[] arr3 = new String[arr1.length + arr2.length];
					
		int i=0;
					
		for(String each: arr1) {
			arr3[i++] = each;  //IMPORTANT: POST-INCREMENT
		}
					
		for(String each: arr2) {
			arr3[i++] = each;  //IMPORTANT: POST-INCREMENT
		}
					
		return arr3;
	}	
		
	
}
