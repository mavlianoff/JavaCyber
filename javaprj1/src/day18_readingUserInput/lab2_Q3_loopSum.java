package day18_readingUserInput;

import java.util.Scanner;

public class lab2_Q3_loopSum {

	public static void main(String[] args) {
		
		/*
		Write a program that asks the user for a positive nonzero integer value. 
		The program should use a loop to get the sum of all the integers from 1 up to the number entered.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		int sum=0;
		
		do {
			System.out.print("Please enter positive nonzero integer: ");
			int userInput = scan.nextInt();
			
			if(userInput>0) {
				sum+=userInput;
			}else {
				break;
			}

			
		}while(true);
		
		System.out.println("Sum of all entered positive nonzero numbers is: " + sum);

	}

}
