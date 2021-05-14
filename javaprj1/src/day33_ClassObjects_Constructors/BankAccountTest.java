package day33_ClassObjects_Constructors;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input;

		System.out.print("What is your starting balance: ");
		input = sc.next();
//		BankAccount account = new BankAccount(sc.next());
		BankAccount account = new BankAccount(input);

		System.out.print("How much were you paid this month: ");
		input = sc.next();
		account.deposit(input);
		
		System.out.print("Your pay is deposited. Your current balance is: " + account.getBalance());
		
		
		
		
		
	}
}
