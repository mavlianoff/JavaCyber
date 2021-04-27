package assignments.assignment8;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		/*
		Create a method called next3 . This method gets an int argument and prints the next 3 numbers after that number. 
		Call the method from main method and pass num to it.

		enter number
		1
		next 3 are:
		2 3 4
		
		(put a space between numbers)
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num  = scan.nextInt();
		scan.close();
		
		System.out.println("next 3 are:");
		next3(num);

	}
	
	public static void next3(int num) {
		for(int i=1; i<=3;i++) {
			num++;
			System.out.print(num);
			System.out.print(" ");
		}
		
	}

}