package day18_readingUserInput;

import java.util.Scanner;

public class lab2_Q1_LargestSmallest {
	
	public static void main(String[] args) {
		
		/*
		Write a program with a loop that lets the user enter a series of integer numbers. 
		After all the numbers have been entered, the program should display the largest and smallest numbers entered.
		 */
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("Enter your first number:");
		int num=sc.nextInt();
		int small=num, largest=num;
		//boolean i=true;
		while (true) {
			System.out.print("Enter your next number:");
			int num1=sc.nextInt();
			
			if(small>num1) {
				small=num1;
				
			}else if (largest<num1){
				largest=num1;
			}
			
			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			int num2=sc.nextInt();
			
			
			if (num2==0)
				//i=false;
				break;
			if (num2!=0&&num2!=1) {
				System.out.println("Invalid Input, please select 0 or 1");
				//continue;	
				
				System.out.println("Do you want to enter another number: 0-No, 1-Yes");
				//int num2=sc.nextInt();
				continue;
			}
		}

		System.out.println("Smallest number is:" + small);
		
	    System.out.println("Largest number is:" + largest);
	
	}
}
