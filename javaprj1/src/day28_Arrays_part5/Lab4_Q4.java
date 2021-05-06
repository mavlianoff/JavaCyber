package day28_Arrays_part5;

public class Lab4_Q4 {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3}; 		// = > 6
		int[] y = {5,11,2}; 	// = > 18
		int[] z = {7,0,0}; 		// = > 7
		int[] a = {3,-2,10,4}; 	// = > 15
		
		
		sumArray(x);						// holding the returned value
		sumArray(y);
		sumArray(z);
		sumArray(a);
		System.out.println(sumArray(a));	// printing the returned value
		
	}
	
	public static int sumArray(int[] array) {
		int sum=0;
		for(int each: array) {
			sum+=each;
		}
		
//		for(int i=0; i<array.length; i++) {
//			sum+=array[i];
//		}
		return sum;
//		System.out.println(sum);
	}

}

/*
Write a method that accepts an array and prints the sum of all elements in the array
int[] x = {1,2,3}; = > 6
int[] y = {5,11,2}; = > 18
int[] z = {7,0,0}; = > 7
int[] a = {3,-2,10,4}; = > 15
 */
