package day19_stringManipulation_1;

import java.util.Scanner;

public class task75_numberOfCharacters {
	
	public static void main(String[] args) {
		
		// Write a program that ask user to enter his/her firstnameand lastname. Display in the console total number of characters.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter your first and last name: ");
		String fullName = scan.nextLine();
		
		System.out.print("Total number of characters is: " + fullName.length());
		
		
	}

}
