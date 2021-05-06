package day29_Arrays_part6;

public class Lab4_Q17 {
	
	public static void main(String[] args) {
		
		int[] x = {10,3,5,6}; 	// = > 7
		int[] y = {7,2,10,9};  	// = > 8
		int[] z= {2,10,7,2}; 	// = > 8 
		
		System.out.println(arrayDifference(x));
		System.out.println(arrayDifference(y));
		System.out.println(arrayDifference(z));
		
	}
	public static int arrayDifference(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		
		for(int each: arr) {
			if(each>max) {
				max=each;
			}else if(each<min) {
				min=each;
			}
		}
		int difference = max-min;
		return difference;
		
		
	}

}
/*
Write a method that accepts an array and print the difference between the largest and smallest values in the array.
int[] x = {10,3,5,6} = > 7
int[] y = {7,2,10,9}  = > 8
int[] z= {2,10,7,2} = > 8 
 */
