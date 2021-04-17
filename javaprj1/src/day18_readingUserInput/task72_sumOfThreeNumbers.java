package day18_readingUserInput;

import java.util.Scanner;

public class task72_sumOfThreeNumbers {
	
	public static void main(String[] args) {
		
		// Write a program that ask user to enter 3 numbers and shows the total of numbers.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Please enter second number: ");
		int num2 = input.nextInt();
		System.out.print("Please enter third number: ");
		int num3 = input.nextInt();
		
		sumNumbers(num1, num2, num3);
		
	}
	
	public static void sumNumbers(int i1, int i2, int i3) {
				
		int sum=i1+i2+i3;
		System.out.print("Sum of these three numbers is: " + sum);
	}

}
