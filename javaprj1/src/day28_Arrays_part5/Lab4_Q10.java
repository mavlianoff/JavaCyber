package day28_Arrays_part5;

public class Lab4_Q10 {
	
	public static void main(String[] args) {
		int[] x = {2,2}; 		// = > true
		int[] y = {3,3}; 		// = > true
		int[] a = {2,3}; 		// = > false
		int[] b = {12,20,42}; 	// = > false
		int[] c = {2,2,2}; 		// = > false
		
		isContain2233(x);
		System.out.println(isContain2233(x));
		System.out.println(isContain2233(y));
		System.out.println(isContain2233(a));
		System.out.println(isContain2233(b));
		System.out.println(isContain2233(c));
		
	}
	public static boolean isContain2233(int[] array) {
		
		int counter2=0;
		int counter3=0;
		
		for(int each: array) {
			if(each == 2 ) {
				counter2++;
			}
			
			if(each ==3 ) {
				counter3++;
			}
		}
		if(counter2==2 || counter3==3) {
			return true;
		}else {
			return false;
		}
	
	}

}
/*
Write a method that accepts an array and prints true if the array contains 2 twice or 3 twice.
int[] x = {2,2}; = > true
int[] y = {3,3}; = > true
int[] a = {2,3}; = > false
int[] b = {12,20,42}; = > false
int[] c = {2,2,2}; = > false
 */
