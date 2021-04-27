package assignments.assignment8;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		/*
		Create a method called "plus", its return is void and it gets no arguments.
		It asks the user to input two numbers, then it will add them and print the result.
		Create a scanner within the plus method.
		
		Example:
		
		enter first number: 1
		enter second number: 2
		result: 3
		 */
		
		plus();		

	}
	public static void plus() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter first number:");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = scan.nextInt();
		
		int total = num1+num2;
		
		System.out.println("result: "+total);
	}

}

