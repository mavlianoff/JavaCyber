package day29_Arrays_part6;

public class Lab4_Q16 {
	
	public static void main(String[] args) {
		
		int[] x = {2,1,2,3,4}; 	// = > 3
		int[] y = {2,2,0};  	// = > 3
		int[] z= {1,3,5}; 		// = > 0
		
		System.out.println(countEvens(x));
		System.out.println(countEvens(y));
		System.out.println(countEvens(z));
		
	}
	public static int countEvens(int[] arr) {
		int counter=0;
		for(int each: arr) {
			if(each%2==0) {
				counter++;
			}
		}
		return counter;
	}

}
/*
Write a method that accepts an array and prints the number of even numbers in the array.
int[] x = {2,1,2,3,4} = > 3
int[] y = {2,2,0}  = > 3
int[] z= {1,3,5} = > 0
*/