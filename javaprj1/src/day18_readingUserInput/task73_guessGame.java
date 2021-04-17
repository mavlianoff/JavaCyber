package day18_readingUserInput;

import java.util.Scanner;

public class task73_guessGame {
	
	public static void main(String[] args) {
		
		/*
		Write a guessing game where the user has to guess a secret numberbetween 1-20. 
		After every guess, the program tells the user whether their number was too large or too small. 
		The program will keep askingthe user to enter the number until he finds the correct number.
		When the correct answer is found, the program will display "Congrat,yougot it"
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.print("Please guess number between 1-20: ");
		int number=20;
		int guess;

		
		do {
			
			guess = input.nextInt();
			
			if(guess>number) {
				System.out.print("Enter smaller number: ");
			}else if(guess<number) {
				System.out.print("Enter bigger number: ");
			}else {
				System.out.println("Congrats, you got it!");
//				break; // it is not needed as we have while condition set below
			}
			
		}while(guess != number);
		
	}

}
