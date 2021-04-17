package day13_methods_1;

public class task64_AstericsPattern {

	public static void main(String[] args) {
		/*
		Write a program that accepts a number and print the star patterns according to that 
		number
		Sample Output:
		printPattern(5);
		*
		**
		***
		****
		*****
		 */
		
		printPattern(5);

	}
	
	public static void printPattern(int magnitude) {
		
		for(int i=1; i<=magnitude; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
