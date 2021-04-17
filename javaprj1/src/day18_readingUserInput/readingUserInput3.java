package day18_readingUserInput;

import java.util.Scanner;

public class readingUserInput3 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=scan.nextInt();
		System.out.println("Enter second number: ");
		int num2=scan.nextInt();
		
		scan.nextLine(); 
		
		/* If you are using non-primitive data type(String in this case) after primitive data type, 
		 	you MUST create this line code!!!
		 	
		 * Reason: google it, it is due to Line (in nextLine())
		 
		 * Google: That's because the Scanner.nextInt method does not read the newline character in your input created by hitting "Enter," 
		 	and so the call to Scanner.nextLine returns after reading that newline.
		 */
		
		System.out.println("Enter a string: ");
		String str=scan.nextLine();
		
		System.out.println("Output: " + num1 +":" + num2 + ":" + str);
	}

}
