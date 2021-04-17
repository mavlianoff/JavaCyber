package day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker {
	
	public static void main(String[] args) {
		
		//Enter w whole number between 1-99, and i will find a combination of coins that equals that amount of change
		//quarter(25); dimes(10); nickles(5); pennies(1)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter value from 1 to 99: ");
		int amount=scan.nextInt();
		
		
		int originalAmount=amount;
		
		int quarters=amount/25;
		amount=amount%25;
		int dimes=amount/10;
		amount=amount%10;
		int nickles=amount/5;
		amount=amount%5;
		int pennies=amount/1;
		
		System.out.println(originalAmount + " cents in coins can be given as: ");
		System.out.println(quarters + " quarters, " + dimes + " dimes, " + nickles + " nickles, and " + pennies + " pennies.");
		
		
	}

}
