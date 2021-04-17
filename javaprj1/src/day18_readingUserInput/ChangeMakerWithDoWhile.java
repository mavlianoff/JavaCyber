package day18_readingUserInput;

import java.util.Scanner;

public class ChangeMakerWithDoWhile {

	public static void main(String[] args) {
		//User can attempt three times to get changes
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter value from 1 to 99: ");
		int attempt=0;
		
		
		do {
			int userAmount=scan.nextInt();
			if(userAmount>=1 && userAmount<=99) {
				changeMaker(userAmount);
				break;
			}else {
				attempt++;
				if(attempt==3) {
					System.out.println("Sorry, no more attempt");
					break;
				}else {
					System.out.println("Try again: ");
				}
			}
		
		}while(true);
		

	}
	public static void changeMaker(int amount) {
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
