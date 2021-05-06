package day28_Arrays_part5;

public class Lab4_Q8 {
	
	public static void main(String[] args) {
		
		int[] x = {2,5};  // = > true
		int[] y = {4,3};  // = > true
		int[] z = {4,5};  // = > false
		
		System.out.println(isContain23(x));
		System.out.println(isContain23(y));
		System.out.println(isContain23(z));
		
	}
	public static boolean isContain23(int[] array) {
		for(int each: array) {
			if(each == 2 | each == 3) {
				return true;
			}
		}
		return false;
	}

}
/*
Write a method that accepts an array and prints true if it contains a 2 or a 3
int[] x = {2,5};  = > true
int[] y = {4,3};  = > true
int[] z = {4,5};  = > false
 */
