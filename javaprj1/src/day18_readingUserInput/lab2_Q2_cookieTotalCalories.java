package day18_readingUserInput;

import java.util.Scanner;

public class lab2_Q2_cookieTotalCalories {

	public static void main(String[] args) {
		/*
		A bag of cookies holds 40 cookies. 
		The calorie information on the bag claims that there are 10 serving in the bag and that a serving equals 300 calories. 
		Write a program that lets the user enter the number of cookies he or she actually ate and then reports the number of total calories consumed.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("My dear, how many cookies did you consume today? ");
		int numberOfCookies = scan.nextInt();
		
		int bagOfCookies = 40;
		int servingOfCookies=10;
		int caloriesPerServing=300;
		int caloriesPerCookie = caloriesPerServing / (bagOfCookies / servingOfCookies);
		int totalCaloriesperCookie = caloriesPerCookie * numberOfCookies;
		
		System.out.println("Total calories you consumed today is: " + totalCaloriesperCookie + " do me a favor, go park and run min 20 minutes:)");
		

	}

}
