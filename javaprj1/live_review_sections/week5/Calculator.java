package week5;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // \n\n
		
		while(true) {
			System.out.println("Please enter first number: ");
			int f = scan.nextInt(); // 10\n ==> \n goes to scanner memory
	
			System.out.println("Please enter second number: ");
			int s = scan.nextInt(); // 20\n ==> \n goes to scanner memory
			
			System.out.println("Sum: " + (f+s));
			
			scan.nextLine(); //  \n\n
			
			System.out.println("Do you want to continue?");
			String a = scan.nextLine().toLowerCase();
			
			while( !(a.equals("yes") || a.equals("no")) ) {
				System.out.println("Invalid entry, please re-enter");
				a = scan.nextLine().toLowerCase();
			}
			
			if(a.equals("no")) {
				System.out.println("Test completed!");
				break;
			}
		}
		
		scan.close();
		
		

	}

}
