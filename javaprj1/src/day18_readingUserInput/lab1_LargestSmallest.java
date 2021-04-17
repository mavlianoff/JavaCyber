package day18_readingUserInput;

import java.util.Scanner;

public class lab1_LargestSmallest {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int firstNumber = scan.nextInt();
		System.out.print("Enter your next number: ");
		int nextNumber = scan.nextInt();
		
		do {
			System.out.print("Do you want to enter another number?: 0-No, 1-Yes");
			int confirmAnotherNumber=scan.nextInt();
			
			if(confirmAnotherNumber==1) {
				System.out.print("Enter your next number: ");
				int anotherNumber = scan.nextInt();	
			}else if(confirmAnotherNumber==0) {
				break;
			}else {
				System.out.println("Invalid input");
					break;
			}
			
		}while(true);
	
	}
}
