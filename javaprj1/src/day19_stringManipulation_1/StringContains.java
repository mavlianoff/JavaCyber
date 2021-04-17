package day19_stringManipulation_1;

import java.util.Scanner;

public class StringContains {

	public static void main(String[] args) {
		// String.contain("sentence") return true if searched string is found
		
		String testEmail="test@gmail.com";
		System.out.println(testEmail.contains("@"));
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		String list="potatoes, tomatoes, eggs, milk, bread, cereal, meat, apples";
		if(list.contains("apples")) {
			System.out.println("Apples are in the list");
		}else {
			System.out.println("Apples are not in the list");
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		
//		boolean hasEggs=list.contains("Eggs"); //false
//		boolean hasEggs=list.contains("Egg"); //false
		boolean hasEggs=list.contains("eggs"); //true
//		boolean hasEggs=list.contains("egg"); //true
		System.out.println("Contain eggs: " + hasEggs);

		System.out.println("+++++++++++++++++++++++++++++++++");
		
//		String email="name@yahoo.com";
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your email address: ");
		String email=scan.nextLine();
		
		if(email.contains("@yahoo")) {
			System.out.println("Yahoo accoun");
		}else if(email.contains("@gmail")) {
			System.out.println("Gmail account");
		}else if(email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}else {
			System.out.println("invalid account");
		}
	}

}
