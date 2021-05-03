package week6;

import java.util.Scanner;

public class UserLogin {
	
	public static void main(String[] args) {
		
		String UN = "Cybertek";
		String UP = "Cybertek123";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your username: ");
		String username = scan.next();
		
		System.out.println("Please enter our password: ");
		String password = scan.next();
		
		if(username.equals(UN) && password.equals(UP)) {
			System.out.println("You are logged in!");
		}else {
			for(int i=1; i<=3; i++) {
				
//				if(i==3) { 											// IMPORTANT: SEE SAMLE CODE BLOCK BELOW
//					System.err.println("Your account is logged");
//					System.exit(0);
//				}
				
				System.out.println("Either username or password is not correct!");
				System.out.println("Please re-enter your username: ");
				username = scan.next();
				System.out.println("Please re-enter your username: ");
				password = scan.next();
				
				if(username.equals(UN) && password.equals(UP)) {
					System.out.println("You are logged in!");
					break;
				}
				
				//IMPORTANT: if below if block is cut and pasted right after above for loop, user will have 3 attempts in total!
				if(i==3) { 											// if attempt already is 3 and U&P are still incorrect
					System.err.println("Your account is logged. Please reach to customer care to re-activet your account!");
					System.exit(0);
				}
				
			}
			
		}
		
		scan.close();
		
	}
	
}

/*
 * String expectedUserName = "Cybertek"; String expectedPassWord =
 * "Cybertek123";
 * 
 * 1. Ask user to enter Cybertek username
 * 
 * 2. Ask user to enter Cybertek password
 * 
 * 3. if username & password both matches with the expected username and
 * passwords output: logged in 4. if username || password is not matched, ask
 * the user to re-enter USER WILL ONLY HAVE 3 chances, after 3rd attempt if the
 * username || password still invalid: account should be locked
 * 
 */