package day18_readingUserInput;

import java.util.Scanner;

public class lab2_Q5_restaurantTaxTip {

	public static void main(String[] args) {
		
		/*
		Write a program that computes the tax and tip on a restaurant bill. 
		The program should ask the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge. 
		The tip should be 20 percent of the total after adding tax. 
		Display the meal charge, tax amount, tip amount, and total bill on the screen.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print
		("Please enter charge for the meal: ");
		double mealCharge = scan.nextDouble();
		
		double taxPercent = 6.75;
		double taxAmount = mealCharge * 6.75 / 100;
		double tipPercent = 20;
		double tipAmount = (mealCharge + taxAmount) * 20 / 100;
		
		double totalBill = mealCharge + taxAmount + tipAmount;
		
		System.out.println("===============================");
		System.out.println("Charge for meal: " 		+ mealCharge);
		System.out.println("Tax for meal: " 		+ taxAmount);
		System.out.println("Tip for meal: " 		+ tipAmount);
		System.out.println("===============================");
		System.out.println("Total bill to pay: " 	+ totalBill);
		System.out.println("===============================");
		

	}

}
