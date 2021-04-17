package day18_readingUserInput;

import java.util.Scanner;

public class task74_sumUntilNegative {
	
	public static void main(String[] args) {
		
		//Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
		
		int sum=0;
		int num=0;
		Scanner userInput=new Scanner(System.in);
			
		do {
			System.out.print("Please enter number: ");
			num = userInput.nextInt();
			if(num<0) {
				break;
			}else {
				sum=sum+num;
			}

		}while(true);
		
		System.out.println("Sum so far: " + sum);

	}

}
