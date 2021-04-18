package day18_readingUserInput;

import java.util.Scanner;

public class lab2_Q6_salesTax {

	public static void main(String[] args) {
		/*
		Write a program that will ask the user to enter the amount of a purchase. 
		The program should then compute the state and county tax sales tax. 
		Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
		The program should display 
			the amount of the purchase , 
			the state sales tax, 
			the county sales tax, 
			the total sales tax, and 
			the total of the sale (which is the sum of the amount of purchase plus the total sales tax)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter purchase price: ");
		double purchasePrice = scan.nextDouble();
		
		double stateTax = 4.0;
		double stateTaxAmount = purchasePrice * stateTax / 100;
		double countyTax = 2.0;
		double countyTaxAmount = purchasePrice * countyTax / 100;
		double totalTax = stateTaxAmount + countyTaxAmount;
		
		double totalPurchasePrice = purchasePrice + totalTax;
		
		System.out.println("=================================");
		System.out.println("Purchase Price: " + purchasePrice);
		System.out.println("State Sales Tax amount: " + stateTaxAmount);
		System.out.println("County Sales Tax amount: " + countyTaxAmount);
		System.out.println("Total Tax amount: " + totalTax);
		System.out.println("=================================");
		System.out.println("Final Purchase Price: " + totalPurchasePrice);
		System.out.println("=================================");
		
		
		
		
	}

}
