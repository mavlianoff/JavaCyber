package day29_Arrays_part6;

public class Lab4_Q21 {
	
	public static void main(String[] args) {
		
		int[] x = {2, 3, 2, 2, 4, 2};  		// = > true
		int[] y = {2, 3, 2, 2, 4, 2, 2};  	// = > false
		int[] z = {1, 2, 3, 4};  			// = > false
		
		System.out.println(isSumOf2(x));
		System.out.println(isSumOf2(y));
		System.out.println(isSumOf2(z));
		
	}
	public static boolean isSumOf2(int[] array) {
		int sum2 = 0;
		for(int each: array) {
			if(each == 2) {
				sum2+=2;
			}
		}
		if(sum2 ==8) {
			return true;
		}else{
			return false;
		}
	}

}
/*
Write a method that accepts an array and prints true if the sum of all 2's in the arrayis exactly 8
int[] x = {2, 3, 2, 2, 4, 2}  = > true
int[] x = {2, 3, 2, 2, 4, 2, 2}  = > false
int[] x = {1, 2, 3, 4}  = > false
 */
